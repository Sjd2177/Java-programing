public class task22 {
    public static void main(String[] args) {
        int x = 1;  // 初始值为1
        int a = 3;  // a的值为3

        // 使用switch语句替代if-else
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;  // 当a等于3时，执行这条语句
                break;
            case 4:
                x += 34;
                break;
            default:
                // 如果a不在上述值范围内，则什么也不做
                break;
        }

        // 输出x的值
        System.out.println("The value of x is: " + x);
    }
}
