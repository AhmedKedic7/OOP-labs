package Lab8.ThirdTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.SimpleTimeZone;

public class Events {
    private static final String[] EVENT_TYPES={"Login", "Logout", "Purchase", "ViewPage", "Error"};

    public static void main(String[] args) {
        String fileName = "events.txt";
        int numberOfRecords=1000000;

        generateEventFile(fileName, numberOfRecords);
    }
    private static void generateEventFile(String fileName, int numberOfRecords){
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(fileName))){
            Random random = new Random();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (int i=0;i<numberOfRecords; i++){
                Date timestamp=new Date(System.currentTimeMillis() - random.nextInt(365 * 24 * 60 * 60 * 1000));

                String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
                int userId = random.nextInt(1000);

                String eventRecord = String.format("Timestamp: %s, Event Type: %s, User ID: %d%n",
                        dateFormat.format(timestamp), eventType, userId);
                bufferedWriter.write(eventRecord);
            }
            System.out.println("Event file generated successfully.");


        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
