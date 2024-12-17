package src;

public class SelectionSort {
    public static void main(String[] arg){
        int input[]={7,8,3,1,2};

        for(int i=0;i<input.length;i++){
            int minValue=input[i];
            int minPosition=i;
            for(int j=i;j<input.length;j++){
                if(minValue>input[j]){
                    minValue=input[j];
                    minPosition=j;
                }
            }
            int tempData=input[i];
            input[i]=minValue;
            input[minPosition]=tempData;

        }
        printArray(input);

    }
    public static void printArray(int input[]){
        for (int i=0;i<input.length;i++) {
            System.out.println(input[i]);
        }
    }
}
