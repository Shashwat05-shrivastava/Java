package Arrays;

import java.util.HashMap;

public class KeyPair {
    public static void main(String[] args) {
        int [] arr={1, 4, 45, 6, 10, 8};
        int n=arr.length;
        int x=16;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(x-arr[i])){
                System.out.println("Yes");
                break;
            }else{
                map.put(arr[i],i);
            }
        }
    }
    
}
