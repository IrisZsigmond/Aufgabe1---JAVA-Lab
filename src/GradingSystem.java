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

public class GradingSystem {
    private int[] grades;

    // C-TOR
    public GradingSystem(int[] grades) {
        this.grades = grades;
    }

    public GradingSystem notSufficientGrades() {
        if (grades == null) {
            return new GradingSystem(new int[0]);
        }

        int count = 0;
        for (int grade : grades)
            if (grade < 38) count++;

        int[] insufficientGrades = new int[count];

        int index = 0;
        for (int grade : grades)
            if (grade < 38)
                insufficientGrades[index++] = grade;

        return new GradingSystem(insufficientGrades);
    }


    public double averageGrade() {
        if (grades.length == 0)
            return 0.00;

        double sum = 0.00;
        for (int grade : grades)
            sum += grade;

        return (sum / grades.length);
    }
//
//    public ArrayList<Integer> roundedGrades(ArrayList<Integer> grades) {
//        ArrayList<Integer> new_grades = new ArrayList<Integer>();
//
//        for (int grade : grades)
//            new_grades.add(ProfessorGradeRounding.roundGrade(grade));
//
//        return new_grades;
//    }
//
//    public int maxRoundedGrade(ArrayList<Integer> grades) {
//        int max_grade = Integer.MIN_VALUE;
//
//        for (int grade : grades) {
//            int rounded_grade = ProfessorGradeRounding.roundGrade(grade);
//            if (rounded_grade > max_grade)
//                max_grade = rounded_grade;
//        }
//
//        return max_grade;
//    }

    @Override
    public String toString() {
            if (grades == null)
                return "null";

            int n = grades.length;
            if (n == 0)
                return "[]";

            StringBuilder sb = new StringBuilder(n * 3 + 2); // heuristic, rough estimate of size
            sb.append('[');
            for (int i = 0; i < n; i++) {
                if (i > 0)
                    sb.append(", ");
                sb.append(grades[i]);
            }
            sb.append(']');

            return sb.toString();
        }
}
