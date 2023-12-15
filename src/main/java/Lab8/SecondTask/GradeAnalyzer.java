package Lab8.SecondTask;

import java.util.List;

public class GradeAnalyzer extends Student{
    public GradeAnalyzer(List<Integer> grades) {
        super(grades);
    }
    public double calculateAverage(){
        if (grades.isEmpty()){
            return 0.0;
        }


        int sum=0;
        for(Integer grade : grades){
            sum+=grade;
        }
        return sum/grades.size();

    }
    public void printSummary(){
        System.out.println("Grades: "+ grades);
        System.out.println("Average: "+ calculateAverage());
    }
}
