package String;

// input = "Microsoft"
// output:
// Volwals are: 3
// Consonents are: 6

public class Vowal_Consonents {
    public static void main(String[] args) {
        String str = "Microsoft";
        str = str.toLowerCase();
        int vovel = 0, con = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vovel++;
            } else if (str.charAt(i) == ' ') {

            } else {
                con++;
            }
        }
        System.out.println("number of vowels: " + vovel);
        System.out.println("number of consonents: " + con);
    }
}
