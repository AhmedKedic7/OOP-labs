package Lab8.SecondTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class StartME {
    public static void main(String[] args) {
        List<Integer> listOfGrades=List.of(10,8,10,10,9,10);
        GradeAnalyzer gradeAnalyzer=new GradeAnalyzer(listOfGrades);
        printingInfoReflection(gradeAnalyzer);
        invokingMethodsReflection(gradeAnalyzer);

    }

    public static void printingInfoReflection(GradeAnalyzer gradeAnalyzer){
        System.out.println("Printing info: ");
        Field[] analyzerFields=gradeAnalyzer.getClass().getDeclaredFields();

        for (Field field:analyzerFields) {
            field.setAccessible(true);

            try{
                System.out.println(field.getName() +": "+ field.get(gradeAnalyzer));
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }

        }
    }
    public static void invokingMethodsReflection(GradeAnalyzer gradeAnalyzer){

        Method[] analyzerMethods=gradeAnalyzer.getClass().getDeclaredMethods();
        for (Method method:analyzerMethods) {
            String methodName= method.getName();

            if(methodName.startsWith("calculate") || methodName.startsWith("print")  ){
                try {
                    Object result = method.invoke(gradeAnalyzer);
                    System.out.println("Method: " + methodName);
                    if (result != null) {
                        System.out.println("Result: " + result);
                    }
                    System.out.println();
                }catch( IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();
                }

            }

        }
    }

}
