import java.util.ArrayList;

public class GradingSystem {
    public ArrayList<Integer> notSufficientGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> new_grades = new ArrayList<Integer>();

        for (int grade : grades)
            if (grade < 38)
                new_grades.add(grade);

        return new_grades;
    }
}
