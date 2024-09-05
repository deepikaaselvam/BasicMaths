package MyApproaches;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int a[]={0,1,2,2,3,0,4,2};int k=0;int value=2;
     int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]!=value)
            {
                a[k]=a[i];
                k++;
            }
        }
        System.out.print(k+" ");
        System.out.println();
        for(int i=0;i<k;i++)
        {
        System.out.print(a[i]+" ");}

    }
}
