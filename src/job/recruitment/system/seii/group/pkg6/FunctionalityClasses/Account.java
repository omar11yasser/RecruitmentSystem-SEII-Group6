package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;

import job.recruitment.system.seii.group.pkg6.Utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amgad
 */
public class Account {
    String userId;
    String userName;
    String userMail;
    String userMobileNumber;
    String userAccountType;
    String userPassword;

    public Account Login(String email, String password){
        try {
            Connection con = DatabaseConnection.connect();
            String query = "SELECT * FROM accounts WHERE email = '" + email +"' & password = '" + password + "'";
            Statement stmt  = con.createStatement();
            ResultSet result = stmt.executeQuery(query);

            if(false/*ResultSet.Lentgh > 0*/) {
                Account AccountObject = new Account();
                // Get Account Details
                return AccountObject;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void Logout(){
        // TODO: Remove Session State Of Auth User
    }

    public void createAccount(Account Account){
        try {
            Connection con = DatabaseConnection.connect();
            String query = "INSERT INTO `accounts` (`id`, `name`, `email`, `mobile`, `password`, `active`, `type`) VALUES (NULL, '"+Account.userName+"', '"+Account.userMail+"', '"+Account.userMobileNumber+"', '"+Account.userPassword+"', '1', '"+Account.userAccountType+"')";
            Statement stmt  = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUserAccountType() {
        return userAccountType;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserAccountType(String userAccountType) {
        this.userAccountType = userAccountType;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
