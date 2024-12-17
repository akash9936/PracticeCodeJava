package src;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, … (considering 1 - indexing) -> F(n) = F(n - 1) + F(n - 2)

public class FibonacciSeries{
    private static int result;
    private static int noOfInt=11;
    public static void main(String[] args){
//        System.out.println(getFibonacciSeries(noOfInt));
        getFibonacciSeries(noOfInt);

    }
    public static void getFibonacciSeries(int noOfInt){
        int first=0;
        int second=1;
        int curr=0;
        if(noOfInt<=0){
            System.out.println("N can never be zero or negative");
            return;
        }
        if(noOfInt==1){
            System.out.println(first);
            return;
        }
        if(noOfInt==2){
            System.out.println(second);
        }
        else{
            for(int i=3; i<=noOfInt;i++){
              curr=first+second;
              first=second;
              second=curr;
        }
    }
        System.out.println("The " + noOfInt + "th Fibonacci number is: " + curr);          }

}