package string.substring;

public class Concatter {

    public static void main(String[] args) {
        String s1 = "1abc";
        String s2 = null;
        String s3 = "X";


        String d = s1.concat(s2).concat(s3);

        System.out.println(d);
    }
}
