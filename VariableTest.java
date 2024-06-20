class VariableTest
{
        int rollNo = 55;        
        String name = "Tanushree";

public void m1()
{
	System.out.println("---Local Variable---");
	String address = "Pune";
	int id = 100;
	System.out.println(address);
	System.out.println(id);
	VariableTest v1 = new VariableTest();
	v1.m2();
}

public void m2()
{
	System.out.println("---Local2 Variable---");
	String name = "Mrunal";
	int salary = 300000;
	System.out.println(name);
	System.out.println(salary);

}
public static void main(String[] args)
{
	System.out.println("----variabletest program----");
	VariableTest v= new VariableTest();
      	System.out.println(v.rollNo);
     	System.out.println(v.name);
	v.m1();
	
}
}