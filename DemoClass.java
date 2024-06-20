class DemoClass
{

DemoClass()
{
System.out.println("Default Constructor");
}

public void m1()
{
System.out.println("Calling 1st method ");
}

public void add()
{
System.out.println("Calling 2nd method");
}

public void sub()
{
System.out.println("Calling 3rd method");
}

public static void main(String[] args)
{
System.out.println("Hello Guys");
DemoClass d = new DemoClass();
d.m1();
d.add();
d.sub();
}

}
