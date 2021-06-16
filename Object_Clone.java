package mypack;
public class Emp implements Cloneable{
	int id;
	String name;
	Emp(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String args[])
	{
		try {
			Emp s1=new Emp(11,"kapil");
			Emp s2=(Emp)s1.clone();
			System.out.println(s1.id+" "+s1.name);
			System.out.println(s2.id+" "+s2.name);
		}catch (CloneNotSupportedException c){};
	}
}
