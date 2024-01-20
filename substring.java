public class substring {
    public static String substring(String s, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += s.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        String s = "Helloworld";
        System.out.println(substring(s, 0, 5));
        System.out.println(s.substring(5));
    }

}
