public class SEI {
    public static int singleElement(int[]array)
    {
        for(int i=0;i<array.length;i++)
        {
            if(i==0 && array[i]!=array[i+1])
            {
               return array[i];
            } 
            else if(i==array.length-1 &&array[i-1]!=array[i])
            {
                return array[i];
            }
            else if(array[i]!=array[i+1]&&array[i-1]!=array[i])
            {
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]array={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(singleElement(array));
    }
    
}
