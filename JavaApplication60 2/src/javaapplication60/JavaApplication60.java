/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;
import java.time.Duration;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.time.LocalTime;

/**
 *
 * @author Chidie17
 */
public class JavaApplication60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        final LocalTime twelveA = LocalTime.parse("00:00:00");
        final LocalTime twoA = LocalTime.parse("02:00:00");
        final LocalTime fourA = LocalTime.parse("04:00:00");
        final LocalTime sixA = LocalTime.parse("06:00:00");
        final LocalTime eigA = LocalTime.parse("08:00:00");
        final LocalTime tenA = LocalTime.parse("10:00:00");
        final LocalTime twelP = LocalTime.parse("12:00:00");
        final LocalTime twoP = LocalTime.parse("14:00:00");
        final LocalTime fourP = LocalTime.parse("16:00:00");
        final LocalTime sixP = LocalTime.parse("18:00:00");
        final LocalTime eigP = LocalTime.parse("20:00:00");
        final LocalTime tenP = LocalTime.parse("22:00:00");
        
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable runnable = new Runnable() {
            public void run() {                
                LocalTime curTime = LocalTime.now(); //Current time
                
                if(curTime.isAfter(twelveA) && curTime.isBefore(twoA)){
                    Duration timeElapsed = Duration.between(curTime, twoA);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + twoA + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(twoA) && curTime.isBefore(fourA)){
                    Duration timeElapsed = Duration.between(curTime, fourA);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + fourA + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(fourA) && curTime.isBefore(sixA)){
                    Duration timeElapsed = Duration.between(curTime, sixA);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + sixA + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(sixA) && curTime.isBefore(eigA)){
                    Duration timeElapsed = Duration.between(curTime, eigA);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + eigA + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(eigA) && curTime.isBefore(tenA)){
                    Duration timeElapsed = Duration.between(curTime, tenA);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + tenA + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(tenA) && curTime.isBefore(twelP)){
                    Duration timeElapsed = Duration.between(curTime, twelP);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + twelP + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(twelP) && curTime.isBefore(twoP)){
                    Duration timeElapsed = Duration.between(curTime, twoP);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + twoP + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(twoP) && curTime.isBefore(fourP)){
                    Duration timeElapsed = Duration.between(curTime, fourP);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + fourP + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(fourP) && curTime.isBefore(sixP)){
                    Duration timeElapsed = Duration.between(curTime, sixP);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + sixP + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(sixP) && curTime.isBefore(eigP)){
                    Duration timeElapsed = Duration.between(curTime, eigP);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + eigP + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(eigP) && curTime.isBefore(tenP)){
                    Duration timeElapsed = Duration.between(curTime, tenP);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + tenP + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
                if(curTime.isAfter(tenP) && curTime.isBefore(twelveA)){
                    Duration timeElapsed = Duration.between(curTime, twelveA);
                    long s = timeElapsed.getSeconds();
                    System.out.println(String.format("Time remaining until " + twelveA + 
                            " - %d:%02d:%02d", s / 3600, (s % 3600) / 60, (s % 60)));
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
  }
}    

