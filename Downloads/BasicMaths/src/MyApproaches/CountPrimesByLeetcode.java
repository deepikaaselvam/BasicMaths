package MyApproaches;

import java.util.Scanner;
public class CountPrimesByLeetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=0;
        int n=sc.nextInt();
        if(n==0||n==1)
        {
            System.out.print(0);
        }
        for(int i=2;i<n;i++)
        {
            int cnt=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    cnt++;
                }
            }
            if(cnt==2)
            {
                counter++;
            }
        }
        System.out.print(counter+" ");

    }
}
