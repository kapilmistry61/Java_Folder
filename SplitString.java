package mypack;
public class SplitString{
	public static void main(String[] args) {
		String s1="welcome to goa";
		String[] split=s1.split("\\s");
		for(String a:split)
		{
			System.out.println(a);
		}
	}
}
