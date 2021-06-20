package mypack;
public class String_Count{
    public static void main(String[] args)
    {
        String s="Welcome to goa";

        int wordLength=s.split("\\s").length;

        System.out.println(wordLength);
    }
}
//output: 3
