package Numbers;

import java.util.*;
public class LargestNo {
    public static void main(String[] args) {
        System.out.println("Num are");
        Scanner r=new Scanner(System.in);
        int arr[] = new int[3];
        for(int i=0;i<3;i++){
            arr[i]=r.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Value is"+arr[arr.length-1]);
    }
    
}
