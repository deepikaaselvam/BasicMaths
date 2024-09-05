package MyApproaches;

public class MajorityNby3 {
    public static void main(String[] args) {
        int[]nums={1,2,2,3,2};
        int n=nums.length;
        int j=0;
        int cnt=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[j])
            {

                cnt++;
            }
            j++;
        }
        System.out.println();
    }
}
