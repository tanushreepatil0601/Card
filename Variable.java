class Variable
{
     int id = 45;
     String name = "dipti";

public void t1()
{
	System.out.println("Local variable");
	String address= "Pune";
	String salary = "50k";
	System.out.println(address);
	System.out.println(salary);
}
public static void main(String[] args)
{
	System.out.println("VariableCalled");
	Variable v= new Variable();
        System.out.println(v.id);
	System.out.println(v.name);
	v.t1();
}	
}
