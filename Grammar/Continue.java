package Java_learn.Grammar;

public class Continue {
    public static void main(String[] args) {
        int skip = 4;
        for (int i = 1; i<= 10; i++) {
            if (i == skip)
                continue;
            System.out.println("i=" + i);
        }
    }
}
