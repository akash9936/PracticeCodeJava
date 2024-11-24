package src.recursion;

public class MultiplyRecursion {
    private static int result=1;
    public static void main(String[] args){
        int no=5;
        int power=5;
        MultiplyValue(no, power);
    }

    public static void MultiplyValue(int no, int power){
        if(power==0){
            System.out.println(result);
            return;
        }
        result=result*no;
       MultiplyValue(no, power-1);
    }
}
