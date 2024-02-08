package Recursion;

public class countoperations {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int ans = countOperations(2,3);
        System.out.println(ans);
    }
    static public int countOperations(int num1, int num2) {
        int c=0;
        while(num1 !=0 && num2 !=0){
            if(num1>=num2){
                num1=num1-num2;
                c++;
            }else if(num2>=num1){
                num2=num2-num1;
                c++;
            }
        }    
        return c;
    }
}
