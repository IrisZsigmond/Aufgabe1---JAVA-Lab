import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println(ProfessorGradeRounding.roundGrade(84)); // Output: 85
        System.out.println(ProfessorGradeRounding.roundGrade(37)); // Output: 37
        System.out.println(ProfessorGradeRounding.roundGrade(38)); // Output: 40

        System.out.println("Not sufficient grades:" + new GradingSystem().notSufficientGrades(new ArrayList<Integer>(List.of(84, 37, 38, 29, 45))));
    }
}