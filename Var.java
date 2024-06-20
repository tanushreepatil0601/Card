class Var
{
	String name = "Mrunal";
	String clgName = "D Y Patil";
	String std = "12th";
	
public void v1()
{
	System.out.println("----Personal Info----");
	int rollNo = 152;
	String division = "A";
	System.out.println("Roll no="+rollNo);
	System.out.println("Division="+division);
}
public static void main(String[] args)
{
	System.out.println("----Variable Called----");
	Var v = new Var();
	System.out.println("Name of the student="+v.name);
	System.out.println("Clg name="+v.clgName);
	System.out.println("standard="+v.std);
	v.v1();
}
}