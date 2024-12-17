//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//        The test cases are generated such that the answer is always unique.
//        You may return the output in any order.
//        Example 1:
//        Input: nums = [1,2,2,3,3,3], k = 2
//        Output: [2,3]

package src.Problems.HasMap;

import java.util.HashMap;
public class TopKElementsinList {


    public static void main(String[] args){
        int[] input= {1,2,2,3,3,3};
        int k=2;
     //   System.out.println(topKElement(input,k));
    }
    public static void topKElement(int[] input,int k){
        HashMap<Integer, Integer> mapInput= new HashMap<>();
        for(int i=0;i<input.length;i++){

            if(mapInput.containsKey(input[i])){
                mapInput.put(input[i],mapInput.get(input[i])+1);
            }
            else{
                mapInput.put(input[i],1);
            }
        }
     //   return mapInput;

    }

}





















