import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        // 创建Scanner对象，用于从用户获取输入
        Scanner input = new Scanner(System.in);

        // 提示用户输入体重（磅）
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // 提示用户输入身高（英寸）
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        // 将磅转换为千克
        double weightInKilograms = weightInPounds * 0.45359237;

        // 将英寸转换为米
        double heightInMeters = heightInInches * 0.0254;

        // 计算BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // 显示BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // 关闭输入
        input.close();
    }
}