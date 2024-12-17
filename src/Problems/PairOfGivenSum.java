//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

package src;

import java.util.HashMap;
import java.util.Map;

public class PairOfGivenSum {

    public static void main(String args[]){
        int data[]={2,7,11,15};
        int sum =9;
//        GetPairOfGivenSum(data, sum);
        System.out.println(GetPairOfGivenSumV1(data, sum));

    }

    private static void GetPairOfGivenSum(int[] data,int sum){
        int dataLength=data.length;
        if(!(dataLength>=1)){
            System.out.println("Provide correct data");
        }
        for(int i=0;i<dataLength-1;i++){
            for(int j=i+1;j<dataLength-1;j++){
                if((data[i]+data[j])==sum){
                    System.out.println("1st data is "+data[i]+ " and 2nd data is "+data[j]);
                }
            }
        }
    }

    public static int[] GetPairOfGivenSumV1(int[] nums, int target){

        if(nums.length<2){
            return null;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(map.containsKey(difference)){
                System.out.println(map.get(difference)+" "+i);
                return new int[]{map.get(difference),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
