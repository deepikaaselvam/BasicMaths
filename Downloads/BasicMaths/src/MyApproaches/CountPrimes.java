package MyApproaches;

public class CountPrimes {
    public static int CountPrimes(int value)
    { int cnt=0;
       for(int i=1;i<=value;i++){
            if(value%i==0)
                cnt++;
       }
       if(cnt==2)
       {
           return 1;
       }
       return 0;
    }
    public static void main(String[] args) {
        int n=100;
        int counter=0;

        for( int i=2;i<n;i++){
            if( CountPrimes(i)==1)
            {
                counter++;
            }
        }
        System.out.print(counter+" ");

    }

}
