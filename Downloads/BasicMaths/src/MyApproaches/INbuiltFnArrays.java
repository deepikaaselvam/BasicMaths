package MyApproaches;

import java.util.Arrays;

public class INbuiltFnArrays {
    public static void main(String[] args) {
        int[]binarysearch={12,23,4,5,67,78};
        int key =78;
        int ans= Arrays.binarySearch(binarysearch,key);
        if(ans>=0)
        {
            System.out.println("Element present @ index "+ans);
        }
        else
            System.out.println("Element not found @ the insertion point "+(-ans-1));
    }
}
