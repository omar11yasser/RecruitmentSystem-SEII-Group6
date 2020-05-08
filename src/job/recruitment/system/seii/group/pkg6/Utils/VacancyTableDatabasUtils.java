package job.recruitment.system.seii.group.pkg6.Utils;
import java.sql.*;
import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.Vacancy;
/**
 * @author Omar
 */
public class VacancyTableDatabasUtils extends DatabaseConnection {
    
    public static void main(String[] args){
        
        try {
            retieveFromVacancyUsingVacancyId("vacancy1588947610778");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static void insertVacancyIntoDatabase(Vacancy vacancy) throws SQLException{
        Connection con = DatabaseConnection.connect();
        String query = "insert vacancies (vacancy_id , vacancy_employer_id , vacancy_title , vacancy_job_requirements , vacancy_deadline_timestamp "
                + ", vacancy_creation_timestamp , vacancy_state) values(? , ? , ? ,?, ?,? , ?)";
        PreparedStatement preparedStatment = con.prepareStatement(query);
        preparedStatment.setString(1 , vacancy.getVacancyID());
        preparedStatment.setString(2 , vacancy.getVacancyEmployerId());
        preparedStatment.setString(3, vacancy.getVacancyTitle());
        preparedStatment.setString(4 , vacancy.getVacancyJobRequirments());
        preparedStatment.setTimestamp(5, new Timestamp(vacancy.getDeadlineTimeStamp()));
        preparedStatment.setTimestamp(6, new Timestamp(vacancy.getCreationTimeStamp()));
        preparedStatment.setString(7 , vacancy.getVacancyState());
        
        preparedStatment.execute();
        con.close();


    }
    
    public static Vacancy retieveFromVacancyUsingVacancyId(String vacancyId) throws SQLException{
        Connection con = DatabaseConnection.connect();
        String query = "SELECT * FROM vacancies WHERE vacancy_id = '" + vacancyId +"'";
        Statement stmt  = con.createStatement();
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
    
}
