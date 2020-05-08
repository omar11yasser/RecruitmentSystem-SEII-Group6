package job.recruitment.system.seii.group.pkg6.Utils;
import java.sql.*;
import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.Vacancy;
/**
 * @author Omar
 */
public class VacancyTableDatabasUtils extends DatabaseConnection {
    
    
    public static void insertVacancyIntoDatabase(Vacancy vacancy) throws SQLException{
        //Establish connection to database
        Connection con = DatabaseConnection.connect();
        // SQL query
        String query = "insert vacancies (vacancy_id , vacancy_employer_id , vacancy_title , vacancy_job_requirements , vacancy_deadline_timestamp "
                + ", vacancy_creation_timestamp , vacancy_state) values(? , ? , ? ,?, ?,? , ?)";
        PreparedStatement preparedStatment = con.prepareStatement(query);
        //Set values to their respective place in the query.
        preparedStatment.setString(1 , vacancy.getVacancyID());
        preparedStatment.setString(2 , vacancy.getVacancyEmployerId());
        preparedStatment.setString(3, vacancy.getVacancyTitle());
        preparedStatment.setString(4 , vacancy.getVacancyJobRequirments());
        preparedStatment.setTimestamp(5, new Timestamp(vacancy.getDeadlineTimeStamp()));
        preparedStatment.setTimestamp(6, new Timestamp(vacancy.getCreationTimeStamp()));
        preparedStatment.setString(7 , vacancy.getVacancyState());
        //Excute statment
        preparedStatment.execute();
        con.close();
    }
    
    
    public static Vacancy retieveFromVacancyUsingVacancyId(String vacancyId) throws SQLException{
        //Start connection to database
        Connection con = DatabaseConnection.connect();
        //Select query
        String query = "SELECT * FROM vacancies WHERE vacancy_id = '" + vacancyId +"'";
        Statement stmt  = con.createStatement();
        // Excute the query and store the result into ResultSet
        ResultSet result = stmt.executeQuery(query);
        Vacancy vacancy = new Vacancy();
        
        // Navigate the result 
        while (result.next()){
        vacancy.setVacancyID(result.getString(1));
        vacancy.setVacancyEmployerId(result.getString(2));
        vacancy.setVacancyTitle(result.getString(3));
        vacancy.setVacancyJobRequirments(result.getString(4));
        vacancy.setDeadlineTimeStamp(result.getTimestamp(5).getTime());
        vacancy.setCreationTimeStamp(result.getTimestamp(6).getTime());
        vacancy.setVacancyState(result.getString(7));
        }
        con.close();
        return vacancy;
    }
    
    public static ResultSet retrieveAllVacanciesOfACertainEmployer(String EmployerId) throws SQLException{
        
        Connection con = DatabaseConnection.connect();
        String query = "SELECT * FROM vacancies WHERE vacancy_employer_id = '" + EmployerId +"'";
        Statement stmt  = con.createStatement();
        ResultSet result = stmt.executeQuery(query);
        return result;
    }
    
    public static void modifyAVacancy(Vacancy vacancy) throws SQLException{
    Connection con = DatabaseConnection.connect();
        String query = "UPDATE vacancies SET vacancy_title = ? , vacancy_job_requirements = ? , vacancy_deadline_timestamp = ? WHERE vacancy_id = '" + vacancy.getVacancyID() +"'";
        PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, vacancy.getVacancyTitle());
      preparedStmt.setString(2, vacancy.getVacancyJobRequirments());
      preparedStmt.setTimestamp(3 , new Timestamp(vacancy.getDeadlineTimeStamp()));
      preparedStmt.execute();
      con.close();
    }
    
}
