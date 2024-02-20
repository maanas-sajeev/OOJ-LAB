class MyException extends Exception
{
int detail;
public MyException(int age, String exe)
{
this.detail=age;
System.out.println(exe + " given age is: " + age + " please enter again");
}
public String getMessage()
{
return "Exception: " + detail;
}
}
class Father{
int age;
public Father(int age) throws MyException
{
if (age < 0) throw new MyException(age , "Age cannot be lesser than 0");
this.age = age ;
}
}
class Son extends Father
{
int age;
public Son(int fatherAge, int sonAge) throws MyException
{
super(fatherAge);
this.age = sonAge;
if (this.age > super.age) throw new MyException(age , "Age of son cannot
be more than father");
}
}
public class father_son
{
public static void main(String[] args)
{
try
{
Father f1 = new Father(-1);
Son s1 = new Son(30 , 31);
}
catch (MyException e)
{
System.out.println("Exception caught: " +e.getMessage());
}
}
}