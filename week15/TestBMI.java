package p1;

public class TestBMI {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Irfan", 30, 75, 185);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Usman", 75, 175);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
