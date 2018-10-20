package Java_learn.Grammar;

public class Continue1 {
    public static void main(String[] args) {
        for (int i = 101; i < 200; i += 2) {
            boolean f = true;
            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    f = false;// f在外面的循环已经被定义，所以这个改变的是外面的f的值
                    break;
                }
            }
            if (!f)
                continue;
            System.out.print(" " + i);
        }
    }
}
