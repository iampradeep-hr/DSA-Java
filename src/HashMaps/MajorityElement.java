package HashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {


    //given an integer array of size n, find all elements that appear more than [n/3] times.
    public static void printMajorityElements(int[] nums){
        //create a new hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            if (map.containsKey(i)){
                //if it is present already, increment
                map.put(i,map.get(i)+1);
            }else{
                //else add it to hashmap
                map.put(i,1);
            }
        }
        for (int key:map.keySet()){
            //check the value greater than n/3 print it
            if (map.get(key)>nums.length/3){
                System.out.println(key);
            }
        }
    }


    public static void main(String[] args) {
        int[] nums={1,3,2,5,1,3,1,5,1};
        printMajorityElements(nums);
    }
}
