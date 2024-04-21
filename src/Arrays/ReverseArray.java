package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array={10,20,30,40,50};
        int i=0;
        int j=array.length-1;

        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(array));

    }
}
