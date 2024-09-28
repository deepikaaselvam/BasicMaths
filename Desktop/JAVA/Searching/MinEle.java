package Searching;

public class MinEle {
    public static int minimumELementInSortedArray(int[]a)
    {
        int mini=1;
        int l=0;
        int r=a.length-1;
        int minimumElement=Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid=(l+(r-l)/2);
            if(a[l]<=a[mid])
            {
                minimumElement=Math.min(minimumElement,a[l]);
                l=mid+1;
            }

            else if(a[mid]<=a[r]){
                minimumElement=Math.min(minimumElement,a[mid]);
                r=mid-1;
            }
        }
        return minimumElement;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,1,5};
        int answer=minimumELementInSortedArray(arr);
        System.out.println(answer);
    }
    
}
