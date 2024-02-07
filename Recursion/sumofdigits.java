package Recursion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(pro(1234));
    }   
    static int fun(int n){
        if(n == 0 ) return 0;
        return n % 10+ fun(n/10);
    }
    static int pro(int n){
        if(n%10 == n ) return n ;
        return n % 10 * fun(n/10);
    }
}
