public class Main {
    public static void main(String[] args){
        System.out.println(ProfessorGradeRounding.roundGrade(84)); // Output: 85
        System.out.println(ProfessorGradeRounding.roundGrade(37)); // Output: 37
        System.out.println(ProfessorGradeRounding.roundGrade(38)); // Output: 40

        GradingSystem gradingSystem = new GradingSystem(new int[]{40, 32, 45, 27, 50, 11});
        System.out.println("Not sufficient grades" + gradingSystem.notSufficientGrades());
//        System.out.println("Average grade:" + new GradingSystem().averageGrade();
//        System.out.println("Rounded grades:" + new GradingSystem().roundedGrades();
//        System.out.println("Maximal rounded grade:" + new GradingSystem().maxRoundedGrade();
    }
}