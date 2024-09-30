import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        // 创建Scanner对象，用于从用户获取输入
        Scanner input = new Scanner(System.in);

        // 提示用户输入一个小于 100 的数字
        System.out.print("Enter a number (0-99): ");
        int number = input.nextInt();

        // 检查数字是否在有效范围内
        if (number < 0 || number > 99) {
            System.out.println("Invalid input! Please enter a number between 0 and 99.");
        } else {
            // 使用printf格式化输出，始终显示两位数字
            System.out.printf("The two-digit number is: %02d%n", number);
        }

        // 关闭输入
        input.close();
    }
}
