package Test;

public class Test7 {
    public static void main(String[] args) {
        String s = "asdfdsa";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            s1 = ch + s1;
        }
        if (s1.equalsIgnoreCase(s))
            System.out.println("Palindrom");
        else
            System.out.println("Not plindrom");
    }

}
