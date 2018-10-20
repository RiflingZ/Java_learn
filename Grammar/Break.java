package Java_learn.Grammar;

public class Break {
    public static void main(String[] args) {
        int stop = 4;
        for (int i = 1; i<= 10; i++) {
            if (i == stop)
                break;
            System.out.println("i=" + i);
        }
    }
}
