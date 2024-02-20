import java.util.Scanner;
abstract class shape
{
    int a1=20;
    int a2=30;
    void printarea()
    {}
}
class triangle extends shape
{
    void printarea()
    {
        System.out.println("area of triangle is"+(a1*a2*0.5));
    }
}
class rectangle extends shape
{
    void printarea()
    {
        System.out.println("area of triangle is"+(a1*a2));
    }
}
class circle extends shape
{
    void printarea()
    {
        System.out.println("area of circle is"+(3.14*a1*a2));
    }
}
class abs
{
    public static void main(String[] args) {
        rectangle s1=new rectangle();
        triangle s2=new triangle();
        circle s3=new circle();

        s1.printarea();
        s2.printarea();
        s3.printarea();
    }
}
