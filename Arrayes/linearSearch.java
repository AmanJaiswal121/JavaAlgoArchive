package Arrayes;

// input String={ 3, 6, 1, 7, 8, 9, 4, 7 }, key=7
// output=3 or -1 (if not found)
// exp: trevarse the array and search the element which is equal to key value 
// if get it then print the index value of the element.
// and if you not find the match of key value then simply print -1.

public class linearSearch {
    static int linearSearchs(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 7, 8, 9, 4, 7 };
        System.out.println(linearSearchs(arr, 7));
    }
}
