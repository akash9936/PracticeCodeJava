package src;

public class BubbleSort {
    public static void main(String[] arg){
        int input[]={7,8,3,1,2};
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-1-i;j++){
                if(input[j]<input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
        printArray(input);

    }

    public static void printArray(int input[]){
        for (int i=0;i<input.length;i++) {
            System.out.println(input[i]);
        }
    }
}
