import java.util.Scanner;
import java.util.HashMap;
public class UsingHashMaps {
    public static int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            int rem = target - num;
            if (map.containsKey(rem)) {
                int index = map.get(rem);

                if (index == i) {
                    return new int[]{index,i};
                    }
                }
        }
           return new int[]{ };
    }





   
}
