package MyApproaches;

public class Basic {
    public static boolean arraySort(int arr[], int n) {

    for(int i = 1; i<n;i++)
    {
        if (arr[i]>=arr[i - 1]  ) {

        }
        else {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        int[]arr={1,3,12,98,876};
        int n= arr.length;
        System.out.println(arraySort(arr,n));

    }
}
