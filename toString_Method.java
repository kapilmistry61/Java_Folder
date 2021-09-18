class A{
		int id;
		int rollno;
		String name;

		A(int id, int rollno, String name)
		{
			this.id=id;
			this.rollno=rollno;
			this.name=name;
		}
		public String toString()
		{
			return id+" "+rollno+" "+name;
		}
}
class Test{
	public static void main(String[] args) {
		A s1=new A(11,232,"urvi");
		System.out.println(s1);
	}
}
