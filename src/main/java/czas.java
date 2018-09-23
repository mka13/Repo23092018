import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class czas {

   public static Date konswersjaWprowadzonejDaty(String input, String format) throws ParseException {
        SimpleDateFormat formater= new SimpleDateFormat(format);
        Date data= formater.parse(input);
        return data;
    }

}
