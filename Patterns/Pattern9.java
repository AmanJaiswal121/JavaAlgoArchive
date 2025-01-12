package Patterns;
// * * * * *
// * * * *
// * * * 
// * *
// *
//for:- i+j <= n+1, else:- one sapce
public class Pattern9 {
    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j <= n+1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
}
