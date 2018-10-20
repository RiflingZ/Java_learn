package Java_learn.Grammar;

public class Break1 {
    public static void main(String[] args) {
        int num = 0, i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
                num++;
            }
            if (num == 5) {
                break;
            }
            i++;
        }
    }
}
