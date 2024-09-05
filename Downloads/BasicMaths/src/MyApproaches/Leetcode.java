package MyApproaches;
import java.util.Arrays;
public class Leetcode {

    public static void main(String[] args) {
        int nums[] = {3, 5, 1, 2};
        int target[] = {4, 6, 2, 4};
//        int ans[]=minimumOperations(n,t);
//        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {

                if (nums[i] < target[i])
                    nums[i] = nums[i] + 1;
                else
                    nums[i] = nums[i] - 1;
//            cnt++;
            }
        System.out.println(Arrays.toString(nums));
    }
}

