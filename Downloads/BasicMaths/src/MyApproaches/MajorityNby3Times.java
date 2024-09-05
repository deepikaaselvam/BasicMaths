package MyApproaches;
public class MajorityNby3Times {
    public static void main(String[] args) {
        int nums[]={11,33,11,33,11,33};
        int n=nums.length;int cnt=0;

        for(int i=0;i<n;i++) {
            cnt = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == nums[i]) {
                    cnt++;
                }}
                if(cnt>n/3){
                    System.out.print(nums[i]+" ");
                   }
        }
    }
}

