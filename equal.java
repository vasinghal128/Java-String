public class equal {
    public static void main(String args[]){
        String s1 = "vaibhav";
        String s2 = "vaibhav";
        String s3 = new String("vaibhav");
        if(s1 == s2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        if(s1 == s3){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}
