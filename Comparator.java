import java.util.*;
 public class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}

class Age implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.age==s2.age)
		{
			return 0;
		}else if(s1.age>s2.age)
		{
			return 1;
		}else
		{
			return -1;
		}
	}
}

class Name implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

class Test{
	public static void main(String args[])
	{
		ArrayList<Student> alist=new ArrayList<Student>();
		alist.add(new Student(121,"amenda",34));
		alist.add(new Student(111,"carry",14));
		alist.add(new Student(141,"jack",21));

		System.out.println("sorting by age");
		Collections.sort(alist, new Age());
		for(Student a:alist)
		{
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		}

		System.out.println("sorting by name");
		Collections.sort(alist, new Name());
		for(Student n:alist)
		{
			System.out.println(n.rollno+" "+n.name+" "+n.age);
		}
	}
}

/* output:
sorting by age
111 carry 14
141 jack 21
121 amenda 34
sorting by name
121 amenda 34
111 carry 14
141 jack 21
*/
