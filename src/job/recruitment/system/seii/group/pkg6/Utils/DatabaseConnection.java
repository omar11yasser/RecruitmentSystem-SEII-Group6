package job.recruitment.system.seii.group.pkg6.Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Omar
 */
public class DatabaseConnection {
  
public static Connection connect()
     {
         Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
            // con=DriverManager.getConnection();
             JOptionPane.showMessageDialog(null, "connection success");   
 } catch (Exception e) {
        System.out.println("inter.DBConnect.connect()");
    }
   return con;
}
}
