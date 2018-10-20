package Java_learn.Grammar;

public class Switch {
    public static void main(String[] args) {
        int i = 3;
        switch (i) {
            case 8:
                System.out.println("A");
                break;
            case 3:
            case 2:
                System.out.println("C");
                break;
            case 9:
                System.out.println("D");
                break;
            default:
                System.out.println("error");
        }
    }
}
