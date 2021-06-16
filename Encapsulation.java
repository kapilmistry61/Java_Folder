package mypack;
public class Emp{
	private int id;
	private String name;
	private long account_no;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public long getAccountNo()
	{
		return account_no;
	}
	public void setAccountNo(long account_no)
	{
		this.account_no=account_no;
	}
}
class Test{
	public static void main(String args[]) {
		Emp s1=new Emp();
		s1.setId(121);
		s1.setName("kapil");
		s1.setAccountNo(987874787432l);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAccountNo());
	}
}
