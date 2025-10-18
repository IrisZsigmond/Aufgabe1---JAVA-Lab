/*
1. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll.
 Als Rückgabewert soll die Methode ein Array mit nicht ausreichender Note liefern.

2. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll.
 Als Rückgabewert soll die Methode den Durchschnittswert liefern.

3. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll.
 Als Rückgabewert soll die Methode ein Array mit die abgerundeten Noten liefern.

4. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll.
 Als Rückgabewert soll die Methode die maximal abgerundete Note liefern.
 */

import java.util.ArrayList;

public class GradingSystem {
    public ArrayList<Integer> notSufficientGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> new_grades = new ArrayList<Integer>();

        for (int grade : grades)
            if (grade < 38)
                new_grades.add(grade);

        return new_grades;
    }

    public double averageGrade(ArrayList<Integer> grades) {
        if (grades.isEmpty())
            return 0.00;

        double sum = 0.00;
        for (int grade : grades)
            sum += grade;

        return sum / grades.size();
    }

    public ArrayList<Integer> roundedGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> new_grades = new ArrayList<Integer>();

        for (int grade : grades)
            new_grades.add(ProfessorGradeRounding.roundGrade(grade));

        return new_grades;
    }

    public int maxRoundedGrade(ArrayList<Integer> grades) {
        int max_grade = Integer.MIN_VALUE;

        for (int grade : grades) {
            int rounded_grade = ProfessorGradeRounding.roundGrade(grade);
            if (rounded_grade > max_grade)
                max_grade = rounded_grade;
        }

        return max_grade;
    }
}
