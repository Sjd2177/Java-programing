import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " 是闰年。");
        } else {
            System.out.println(year + " 不是闰年。");
        }

        scanner.close();
    }
}
