package Java_learn.Grammar;

public class FibPrint {
    // 使用递归方法
    private static long getFibo(int i) {
        if (i == 1 || i == 2)
            return 1;
        else
            return getFibo(i - 1) + getFibo(i - 2);
    }

    public static void main(String[] args) {
        for (int j = 1; j <= 50; j++) {
            System.out.print(getFibo(j) + "\t");
            if (j % 5 == 0)
                System.out.println();
        }
    }

}