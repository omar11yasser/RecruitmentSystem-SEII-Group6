package job.recruitment.system.seii.group.pkg6.Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Omar
 */
public class DatabaseConnection {
    
    public static void main(String[] args){
    connect();
    }
  
public static Connection connect()
     {
         Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myrecruitmentsystem?","root","");
             JOptionPane.showMessageDialog(null, "connection success");   
 } catch (Exception e) {
     e.printStackTrace();
        System.out.println("inter.DBConnect.connect()");
    }
   return con;
}
}
