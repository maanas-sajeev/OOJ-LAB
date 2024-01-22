import java.util.Scanner;
class Quad
{
	double Disc(double a, double b, double c)
	{
	return b*b-4*a*c;
	}
	void roots(double a,double b,double c)
	{
	double D=Disc(a,b,c);
	if(D<0)
	{
	double realPart=-b/(2*a);
	double imaginaryPart=Math.sqrt(Math.abs(D))/(2*a);
	System.out.printf("The Quadratic Eqn has Conjugate imaginary roots :");
	System.out.printf("Root 1 : %.5f + %.5fi%n",realPart,imaginaryPart);
	System.out.printf("Root 2 : %.5f - %.5fi%n",realPart,imaginaryPart);
	}
	else if(D>0)
	{
	System.out.println("The Quadratic eqn has 2 Distinct Real Roots :");
	double r1=(-b+Math.sqrt(D))/(2*a);
	double r2=(-b-Math.sqrt(D))/(2*a);
	System.out.printf("Root 1 : %.5f%n",r1);
	System.out.printf("Root 2 : %.5f%n",r2);
	}
	else
	{
	System.out.println("The Quadratic Eqn has Equal and Real Roots");
	double r1=(-b)/(2*a);
	System.out.printf("both root1 and root2 : %.5f%n",r1);
	}
	}
}

class QuadEqn
{
	public static void main(String sx[])
	{
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the coefficients of Quadratic Equation:");
	double a=S1.nextDouble();
	double b=S1.nextDouble();
	double c=S1.nextDouble();
	if(a==0)
	{
	System.out.println("since the coefficients of x^2 is zero,it is not a quadratic eqn");
	}
	else
	{
	Quad quadratic=new Quad();
	quadratic.Disc(a,b,c);
	quadratic.roots(a,b,c);
	}
	}
}