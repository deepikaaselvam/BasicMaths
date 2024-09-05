package MyApproaches;
import java.util.Arrays;
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        int productarray[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {   product*=nums[j];

                }
                productarray[i]=product;
            }
            System.out.print((product+" "));
        }

    }
}
