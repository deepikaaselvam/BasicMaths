package MyApproaches;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=4;
        for( int i=0;i<n;i++)
        {
            int ans=1; int r=i-1;int j=0;
            for( j=0;j<=i;j++)
            { int c=j-1;int result=1;
                if(i==j){
                    System.out.print(1+" ");
                }
            if(i!=j){
                 result=(r);
                 ans=result/(c)*(r-c);
                System.out.print(ans+" ");}
            }
            System.out.println();
        }
    }
}
