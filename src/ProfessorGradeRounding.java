/*
Der Professor rundet die Note mit den folgenden Regeln ab:
● wenn die Differenz zwischen der Note und dem nächsten Vielfachen (Multipel) von 5 weniger als 3 ist,
 dann wird die Note zu dem nächsten Vielfachen (Multipel) von 5 aufgerundet.
● Wenn die Note weniger als 38 ist, wird die Note nicht aufgerundet.
z.B. 84 → 85
*/
public class ProfessorGradeRounding {
    public static int roundGrade(int grade) {
        if (grade < 38)
            return grade;

        int nextMultipleOf5 = ((grade / 5) + 1) * 5;
        if (nextMultipleOf5 - grade < 3)
            return nextMultipleOf5;

        return grade;
    }
}
