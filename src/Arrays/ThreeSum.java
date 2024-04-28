package Arrays;
import java.util.*;
public class ThreeSum{
    public static ArrayList<List<Integer>> sum(int[] arr,int n,  int k){

        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr); //{-6,-2,0,2,4,7};

        for(int i=0;i<n-2;i++){

            int l=i+1;
            int r=n-1;

            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==k){
                    set.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    l++;
                    r--;
                }else if(sum<k){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr={0,-2,7,2,4,-6};
        int k=0;
        int n=arr.length;
        System.out.println(sum(arr,n,k));
    }
}