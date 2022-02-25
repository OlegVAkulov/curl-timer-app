package curl;


import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class StartCurlConnectionTimer extends TimerTask {
private String info ;

    @Override
    public void run() {

        try {
            new Curl(new URL("http://35.203.40.103:8080/mail/run?command=run"));
            new Curl(new URL("http://34.82.215.213:8080/telegram/run?command=run"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void runTimer() {

        Calendar startDataTime = Calendar.getInstance();
        Date date = startDataTime.getTime();
//        if (date.getHours() < 17 ){
//        startDataTime.set(2022, date.getMonth(), date.getDay(), 17, 29);}
//        else {}
        startDataTime.set(2022, date.getMonth(), 26, 17, 29);
        date = startDataTime.getTime();
        TimerTask timerTask = new StartCurlConnectionTimer();
        this.info = String.valueOf(startDataTime.getTime());


        Timer timer = new Timer();

        timer.scheduleAtFixedRate(timerTask, startDataTime.getTimeInMillis() - System.currentTimeMillis(), 24 * 60 * 60 * 1000);


    }

    public String getInfo() {
        return info;
    }
}




