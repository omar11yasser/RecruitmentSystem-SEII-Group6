package job.recruitment.system.seii.group.pkg6.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Omar
 */

// I created this class to put any repeated text operations to minmize repition in our classes
public class TextUtils {
    // Checks if a specific is not null or empty.
    public static Boolean isEmpty(String string){
        if (string != null && !string.equals("")){
            return false;
        }
        return true;
    }   
    
    // Checks if the user entered the right date format to prepare it to be converted into a long.
    public static long transformDateIntoALongTimestamp(String dateValue) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = dateFormat.parse(dateValue);
        long timeLong = parsedDate.getTime();
        return timeLong;
    }
    
}
