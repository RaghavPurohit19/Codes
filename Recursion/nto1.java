package Recursion;
class nto1{
    public static void main(String[] args) {
        funrev(5);
        concept(4);
    }
    static void concept(int n){
        if(n == 0) return;
        System.out.println(n);
        //concept(n--)
        concept(--n);
        //--n vs n--
    }

    static void fun(int n){
        if(n == 0) return;
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if(n == 0) return;
        funrev(n-1);
        System.out.println(n);
        
    }
}