package entities;

public class Student {
    public String name;
    public double grade_01;
    public double grade_02;
    public double average;

    public Student(String name, double grade_01, double grade_02, double average) {
        this.name = name;
        this.grade_01 = grade_01;
        this.grade_02 = grade_02;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade_01() {
        return grade_01;
    }

    public void setGrade_01(double grade_01) {
        this.grade_01 = grade_01;
    }

    public double getGrade_02() {
        return grade_02;
    }

    public void setGrade_02(double grade_02) {
        this.grade_02 = grade_02;
    }

    public double getAverage() {
        return average;
    }

    public double averageCalculator(){
        this.average = (grade_01 + grade_02) / 2;
        return average;
    }
}
