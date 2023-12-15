package lab9.FirstTask;

import java.io.FileReader;
import java.util.List;

public class StudentNotFoundException extends Exception{
   public StudentNotFoundException(String message){
       super (message);
   }
}
