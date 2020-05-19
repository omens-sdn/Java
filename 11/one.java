import java.util.Date;
public class one {
	public static void main(String[] args)
	{
		Person person=new Person("zhang","小区","0535","qq.com");
		System.out.println(person.toString());
		Student student=new Student(2);
		System.out.println(student.toString());
		Employee employee=new Employee("济南",3000,new Date(System.currentTimeMillis()));
		System.out.println(employee.toString());
		Faculty faculty=new Faculty(10,"干部");
		System.out.println(faculty.toString());
		Staff staff=new Staff("学生");
		System.out.println(staff.toString());
	}
}

class Person{
	private String name;
	private String address;
	private String number;
	private String email;
	public Person()
	{
		
	}
	public Person(String a,String b,String c,String d)
	{
		name=a;
		address=b;
		number=c;
		email=d;
	}
	public String toString()
	{
		return "name:"+name+",address:"+address+",number:"+number+",email:"+email;
	}
}

class Student extends Person{
	private int grade;
	private final int Fresh=1;
	private final int Sophomore=2;
	private final int Junior=3;
	private final int Senior=4;
	public Student()
	{
		
	}
	public Student(int a)
	{
		if(a==1)grade=Fresh;
		else if(a==2)grade=Sophomore;
		else if(a==3)grade=Junior;
		else grade=Senior;
	}
	public String toString()
	{
		return "grade:"+grade;
	}
}

class Employee extends Person{
	private String office;
	private double wage;
	private Date day;
	public Employee()
	{
		
	}
	public Employee(String a,double b,Date c)
	{
		office=a;
		wage=b;
		day=c;
	}
	public String toString()
	{
		return "office:"+office+",wage:"+wage+",day:"+day;
	}
}

class Faculty extends Employee{
	private int time;
	private String rank;
	public Faculty()
	{
		
	}
	public Faculty(int a,String b)
	{
		time=a;
		rank=b;
	}
	public String toString()
	{
		return "time:"+time+",rank:"+rank;
	}
}

class Staff extends Employee{
	private String position;
	public Staff()
	{
		
	}
	public Staff(String a)
	{
		position=a;
	}
	public String toString()
	{
		return "position:"+position;
	}
}