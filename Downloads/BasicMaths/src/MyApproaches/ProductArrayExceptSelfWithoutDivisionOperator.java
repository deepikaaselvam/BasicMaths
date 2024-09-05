package MyApproaches;

import javax.swing.*;

public class ProductArrayExceptSelfWithoutDivisionOperator {
    public static void main(String[] args) {
        int num[]={1,2,3,4};int j=0;int productarray=1;
        for( int i=0;i<num.length;i++)
        {
            productarray=productarray*num[i];

        }
        for(int i=0;i<num.length;i++)
        {
        if(i==j)
        {

            j++;
        }
        productarray=productarray/num[i];
            System.out.println(productarray);}

//        int product=1;
//            if(i==j)
//            {
//                product*=num[i];
//                j++;
//            }
//            System.out.println(product);

    }
}
