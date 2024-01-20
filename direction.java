import java.util.*;
public class direction{
    public static float dirshort(String dir){
        int x = 0;
        int y = 0;
        for(int i=0;i<dir.length();i++){
            char n = dir.charAt(i);
            if(n == 'W' || n == 'w'){
                x--;
            }
            else if(n == 'E' || n == 'e'){
                x++;
            }
            else if(n == 'S' || n == 's'){
                y--;
            }
            else{
                y++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your direction: ");
        String dir = sc.nextLine();     
    System.out.println(dirshort(dir));   
    }
}