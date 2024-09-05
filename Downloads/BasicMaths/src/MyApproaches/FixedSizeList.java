package MyApproaches;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args) {
        Integer []fixedsize={1,2,3,4};
        List<Integer> FixedArray= Arrays.asList(fixedsize);
//        FixedArray.add(90);
//        FixedArray.add(89);
        System.out.println(Arrays.toString(fixedsize));
        FixedArray.set(2,78);
        System.out.println(FixedArray.get(0));

//        FixedArray.remove(3);
        System.out.println(FixedArray);int key=4;
        int array[]={7,9,12,89};
        int ans=Arrays.binarySearch(array,key);//binarysearch(),we can use both primitive and wrapeper class of the array!!
        System.out.println(ans);

    }
}
