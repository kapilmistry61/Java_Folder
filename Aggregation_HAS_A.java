class Address{
	String  city;
	String  state;
	String country;

	Address(String city, String state, String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
public class Emp{
	int id;
	String name;
	Address address; //refer Address class here 

	Emp(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address address=new Address("jaipur", "rajasthan", "india");
		Emp s2=new Emp(11, "kapil", address);
		s2.display();
	}
}
