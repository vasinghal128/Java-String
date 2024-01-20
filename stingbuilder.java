public class stingbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a' ; ch<='z' ; ch++){
            sb.append(ch);
        }
        // time complaxcity 0(26)
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(18));
    }
}
