package Java_learn.Grammar;

public class Method {
    public static void main(String[] args) {
        m();
        m2(2 );
        m3('3', 4);
        //实参
        m4(4, 6);
        int i = m4(4, 6);
        System.out.println(i);
    }

    private static void m() {
        System.out.println("ok");
        System.out.println("hello");
    }

    private static void m2(int i) {
        //形参
        if(i > 3)
            return;
        System.out.println(i);
    }
    private static void m3(int i, int j) {
        System.out.println(i + j);
    }

    private static int m4(int i, int j) {
        return i > j ? i : j;
    }
}
