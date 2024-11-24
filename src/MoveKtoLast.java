package src;

public class MoveKtoLast {
    public static void main(String[] args){
        String input="abxixlxxv";
        char moveToLast ='x';
        System.out.println(moveK(input, moveToLast));
    }
    public static String moveK(String input, char moveToLast){
        int count=0;
         String Result = "";
         for(int i=0;i<input.length();i++){
            if(input.charAt(i)==moveToLast){
                count++;
            }
            else {
                Result=Result+(String.valueOf(input.charAt(i)));
                System.out.println(Result);
            }
        }
        while (count>0){
            Result=Result+(String.valueOf(moveToLast));
            count--;

        }
        return Result;
    }
}
