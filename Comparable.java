
import java.util.*;
Public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}	

	public int compareTo(Student a) {
		if(age==a.age)
		{
			return 0;
		}else if(age>a.age)
		{
			return 1;
		}else
		{
			return -1;
		}
	}

}
 class Test {
	public static void main(String args[])
	{
		ArrayList<Student> alist=new ArrayList<Student>();
		alist.add(new Student(111,"amenda",19));
		alist.add(new Student(131,"carry",39));
		alist.add(new Student(101,"elon",21));
		
		Collections.sort(alist);
		for(Student a:alist)
		{
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		}
	}
}
