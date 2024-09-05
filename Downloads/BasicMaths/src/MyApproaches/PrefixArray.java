package MyApproaches;

import java.util.Arrays;

public class PrefixArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};int n= nums.length;;
        int prefix[]=new int[nums.length];
        int postfix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]*nums[i];
        }
        System.out.println(Arrays.toString(prefix));
        postfix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            postfix[i]=postfix[i+1]*nums[i];
        }
        System.out.println(Arrays.toString(postfix));
        for(int i=1;i<=n;i++)
        {
            nums[i]=prefix[i-1]*postfix[i+1];
        }
    }
}
