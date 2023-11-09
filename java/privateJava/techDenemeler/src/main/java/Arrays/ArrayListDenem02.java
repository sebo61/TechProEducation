package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDenem02 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(14);

        Collections.sort(nums);

        int minDiff=nums.get(2)-nums.get(1);

        for(int i=1;i<nums.size();i++){
            minDiff = Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }

        System.out.println(minDiff);
        for (int i=1;i<nums.size();i++) {
            if (nums.get(i) - nums.get(i - 1) == minDiff)
                System.out.println(nums.get(i) +" and "+nums.get(i-1));
        }
    }
}
