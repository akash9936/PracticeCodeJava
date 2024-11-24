// package src;

// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.PriorityQueue;

// public class TopKFreqNumber {
//     public static void main(String[] arg){
//         int data[]={1,2,2,3,3,3,3};
//         int k=2;
//         freqData(data,k);
//     }
//     public static HashMap<Integer, Integer> freqData(int[] data, int k){

//         HashMap<Integer, Integer> map=new HashMap<>();

//         for(int i=0;i<data.length;i++){
//             if(map.containsKey(data[i])){
//                 map.put(data[i],map.get(data[i])+1);
//             }
//             else {
//                 map.put(data[i],1);
//             }
//             System.out.println(map.values());
//             }
//         PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparing(Map.Entry :: getValue));

//         if(Map.Entry<Integer, Integer> entry : map.entrySet()){

//         }

//         return map;
//         }
//     }

