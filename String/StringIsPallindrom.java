package String;

// input = abcdcba
// output = Yes it is pallindrom
// input = abcdefa
// output = Not it is pallindrom

public class StringIsPallindrom {
    public static void main(String[] args) {
        String st = "abcdcba";
        int i = 0;
        int j = st.length() - 1;

        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) {
                System.out.println("Not pallindrom");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Pallindrom");
    }
}
