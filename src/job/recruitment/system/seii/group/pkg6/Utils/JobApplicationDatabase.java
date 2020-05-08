package job.recruitment.system.seii.group.pkg6.Utils;
import java.sql.*;
import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.JobApplication;
/**
 * @author Omar
 */
public class JobApplicationDatabase extends DatabaseConnection {
    
    public static void main(String[] args){
        
        try {
            retieveApplication("Application154858");
        } catch(Exception f){
            f.printStackTrace();
        }
    }
    
    
    public static void insertApplicationIntoDatabase(JobApplication Application) throws SQLException{
        Connection con = DatabaseConnection.connect();
        String query = "insert Application(Application_Id , Application_Authour_Id, User_Filled_Response,Vacancy_id,Employer_Response"+ ", Submission_timestamp) values(? , ? , ? ,?, ?,? , ?)";
        PreparedStatement preparedStatment = con.prepareStatement(query);
        preparedStatment.setString(1 , Application.getApplicationId());
        preparedStatment.setString(2 , Application.getApllicationAuthourID());
        preparedStatment.setString(3, Application.getUserFilledResponse());
        preparedStatment.setString(4, Application.getVacancyID());
        preparedStatment.setString(5, Application.getEmployerResponse());
        preparedStatment.setTimestamp(5, new Timestamp(Application.getSubmissionDataTimeStamp()));
        
        preparedStatment.execute();
        con.close();


    }
    
    
    public static JobApplication retieveApplication(String ApplicationId) throws SQLException{
        Connection con = DatabaseConnection.connect();
        String query = "SELECT * FROM  WHERE Application_Id = '" + ApplicationId +"'";
        Statement stmt  = con.createStatement();
        ResultSet result = stmt.executeQuery(query);
        JobApplication Application = new JobApplication();
        
        // Navigate the result 
        while (result.next()){
        Application.setApplicationId(result.getString(1));
        Application.setApllicationAuthourID(result.getString(2));
        Application.setUserFilledResponse(result.getString(3));
        Application.setVacancyID(result.getString(4));

       
      
        con.close();
        return Application;
    }

    
    
  

  
    
}

    