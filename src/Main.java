import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println(ProfessorGradeRounding.roundGrade(84)); // Output: 85
        System.out.println(ProfessorGradeRounding.roundGrade(37)); // Output: 37
        System.out.println(ProfessorGradeRounding.roundGrade(38)); // Output: 40

        System.out.println("Not sufficient grades:" + new GradingSystem().notSufficientGrades(new ArrayList<>(List.of(84, 37, 38, 29, 45))));
        System.out.println("Average grade:" + new GradingSystem().averageGrade(new ArrayList<>(List.of(84, 37, 38, 29, 45))));
        System.out.println("Rounded grades:" + new GradingSystem().roundedGrades(new ArrayList<>(List.of(84, 37, 38, 29, 45))));
        System.out.println("Maximal rounded grade:" + new GradingSystem().maxRoundedGrade(new ArrayList<>(List.of(84, 37, 38, 29, 45, 90, 91))));
    }
}