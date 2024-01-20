import java.util.*;
public class stringpalindrom {
    public static boolean check(String pal){
        int n = pal.length();
        for(int i=0;i<n/2;i++){
            if(pal.charAt(i) != pal.charAt((n-1)-i)){
                // a palindrom
                return false;
            }
        }
        // not a palindrom
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        System.out.println(check(pal));
    }    
}
