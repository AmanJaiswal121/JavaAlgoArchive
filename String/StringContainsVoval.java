package String;

public class StringContainsVoval {
    public static boolean scv(String in){
        return in.toUpperCase().matches(".*[AEIOU].*");
    }

    // We can use this also
    // public static boolean scv(String in){
    //     return in.toLowerCase().matches(".*[aeiou].*");
    // }
    
    public static void main(String[] args) {
        System.out.println(scv("Hello"));  
        System.out.println(scv("XYZ"));   
    }
}
