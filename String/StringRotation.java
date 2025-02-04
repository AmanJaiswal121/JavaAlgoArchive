package String;
// Check the cyclic rotation of the string is true or not

// input 1: "waterbottle"
// input 2: "tlewaterbot"
// output: true

// input 3: "waterbottle"
// input 4: "wabottleter"
// output: false
public class StringRotation {
    static boolean check(String s1, String s2) {
        String concat = s1 + s1;
        return concat.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "wabottleter";

        if(s1.length() == s2.length()){
            if (check(s1, s2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }else{
            System.out.println("No....");
        }
    }
}
