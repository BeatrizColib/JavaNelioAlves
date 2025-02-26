package entities;

public class Student {
    public String name;
    public double grade01, grade02, grade03;
    public double finalGrade;

    public double calculateFinalGrade() {
        return finalGrade = (grade01 + grade02 + grade03);
    }

    public String checkStatus(){
        if (finalGrade >= 60) {
            return String.format("FINAL GRADE = %.2f \nSTATUS: PASS", finalGrade);
        }
        else {
            double missing = 60-finalGrade;
            return String.format("FINAL GRADE = %.2f \nSTATUS: FAILED \nMISSING %.2f POINTS", finalGrade, missing);
        }
    }
}
