package fo.samgle;


import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeSprite {

    public Integer x = 0;
    public Integer y = 0;



    public String getCurrentTime(){

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String currentTimeFormatted = sdf.format(new Date());

    return currentTimeFormatted;
    }
}
