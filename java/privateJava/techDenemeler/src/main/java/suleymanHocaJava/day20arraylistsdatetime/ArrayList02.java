package suleymanHoca.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    // exp 1: bir Integer listte birbirine en yakın 2 elemanı bulunuz.
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();

        nums.add(13);
        nums.add(23);
        nums.add(14);
        nums.add(10);
        //Collections.sort() netodu natural order yapar.
        Collections.sort(nums);
        System.out.println(nums); //[10, 13, 14, 23]

        int minDiff=nums.get(1)-nums.get(0);

        for (int i=1;i<nums.size();i++){
            minDiff=Math.min(minDiff, nums.get(i)- nums.get(i-1));

        }
        System.out.println(minDiff);

        for (int i=1;i<nums.size();i++){
           if(nums.get(i)-nums.get(i-1)==minDiff){
               System.out.println(nums.get(i)+" and " + nums.get(i-1) );
           }

        }

    }
}
