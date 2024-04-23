package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,4,6,6};

        int rd=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[rd]){
                rd++;
                arr[rd]=arr[i];
            }
        }
            System.out.println(Arrays.toString(arr));
    }
}
