import java.util.Scanner;
class Quad;
{
    double disc(double a,double b,double c)
    {
    return b*b-4*a*c;
    }
    void roots(double a,double b,double c)
    {
        double D=disc(a,b,c);
        if(D<0)
        {
            double realPart= -b/(2*a);
            double imaginaryPart= Math.sqrt(Math.abs(D))/(2*a);
            System.out.println("The Quad Eqn has conjugate imaginary roots");
            System.out.println("root 1 : %.5f + %.5fi%n",realPart,imaginaryPart);
            System.out.println("root 2 %.5f - %.5fi%n",realPart,imaginaryPart);
        }
        else if(D>0)
        {
            System.out.println("Quad Eqn has 2 distinc real roots");
            double r1=(-b+Math.sqrt(D))/(2*a);
            double r2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("root 1 = %.5f%n",r1);
            System.out.println("root 2 = %.5f%n",r2);

        }
        else
        {
            System.out.println("Quad Eqn has Equal and real roots");
            double r1=(-b)/(2*a);
            System.out.println("root1 and root2 = %.5f%n",r1);

        }
    }
}
class QuadEqn
{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter coefficients of Eqn");
     double a=s.nextDouble();
     double b=s.nextDouble();
     double c=s.nextDouble();
     if(a==0)
     {
        System.out.println("Since coefficient of x^2 is 0,It is not a Quad Eqn");
     }   
     else
     {
        Quad quadratic=new Quad();
        quadratic.disc(a, b, c);
        quadratic.roots(a,b,c);
     }
    }
}

