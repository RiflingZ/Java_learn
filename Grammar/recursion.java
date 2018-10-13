package Java_learn.Grammar;

public class recursion {
    public static void main(String[] args){
        System.out.println(method(5));
    }
    private static int method(int n){
        if(n == 1)
            return 1;
        else
            return n * method(n - 1);
    }
}
