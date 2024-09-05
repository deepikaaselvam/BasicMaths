package MyApproaches;

public class TwoPointer {
    public static void main(String[] args) {
        int[]arr={1,-1,0,-3,3};
        int n=arr.length;int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {

                j++;
            }
        }
    }
}
