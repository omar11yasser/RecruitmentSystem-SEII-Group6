package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;

import java.sql.*;

/**
 *
 * @author Amgad
 */

public class Admin {
    private int adminId;
    private String adminName;
    private String adminMail;
    private String adminPassword;

    public static Admin Register(String name, String email, String password){
        Connection con = DatabaseConnection.connect();
        String query = "INSERT INTO `admins` (`id`, `name`, `email`, `password`) VALUES (NULL, '"+name+"', '"+email+"', '"+password+"')";
        Statement stmt  = con.createStatement();
        ResultSet result = stmt.executeQuery(query);
        Admin AdminObject = new Admin;
        AdminObject.adminName = name;
        AdminObject.adminMail = email;
        AdminObject.adminPassword = password;
        return AdminObject;
    }

    public static Admin Login(String email, String password){
        Connection con = DatabaseConnection.connect();
        String query = "SELECT * FROM admins WHERE email = '" + email +"' & password = '" + password + "'";
        Statement stmt  = con.createStatement();
        ResultSet result = stmt.executeQuery(query);

        if(false/*ResultSet.Lentgh > 0*/) {
            Admin AdminObject = new Admin;
            AdminObject.adminName = "name";
            AdminObject.adminMail = email;
            AdminObject.adminPassword = password;
            return AdminObject;
        } else {
            return null;
        }

    }

    public void LogOut(){
        // TODO: Remove Session State Of Auth Admin
    }

    public Vacancy ViewVacancyDetails(String id){
        Vacancy VacancyObject = new Vacancy;
        return VacancyObject.retieveFromVacancyUsingVacancyId(id);
    }

    public void approveNewEmployers(){

    }



}
