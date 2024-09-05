package MyApproaches;

public class SeiveOfEratosthenese {
    public static void main(String[] args) {
        int n=10;int cnt=0;

        int[]prime=new int[n+1];
        for(int i=2;i<=n;i++)
        {
            prime[i]=1;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==1)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=0;
                }
            }
        }
        for(int i=2;i<=n;i++)
        if(prime[i]==1)
        {
            System.out.print(i+" ");
            cnt++;

        }
        System.out.println();
        System.out.print(cnt+" ");

    }
}
