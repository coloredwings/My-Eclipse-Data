package FirstPackage;

public class encapsulation {
public int age;
public String name;
private String email;
private String address;
	public static void main(String[] args) {
encapsulation obj=new encapsulation();
System.out.println(obj.age);
System.out.println(obj.address);
System.out.println(obj.email);
System.out.println(obj.name);
	}
	public int getage()
	{
		return age;
	}
	public void setage(int AGE)
	{
		age=AGE;
	}
	public String getaddress()
	{
		return address;
	}
	public void setaddress(String ADD)
	{
		address=ADD;
	}
	

	}


