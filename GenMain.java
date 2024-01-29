class Gener<G,T>
{
G ob;
T ob1;
Gener(G o,T o1)
{ob=o;ob1=o1;}
void showtype()
{
System.out.println(ob.getClass().getName());
System.out.println(ob1.getClass().getName());
}
G retobj()
{return ob;}
T retobj1()
{return ob1;}
}

class GenMain
{
public static void main(String xxx[])
{
Gener <Integer,Float> g1;
g1=new Gener<Integer,Float>(100,20.5f);
g1.showtype();
int x=g1.retobj();
System.out.println(x);
float f=g1.retobj1();
System.out.println(f);
Gener<Double,Double>g2 = new Gener<Double,Double>(253.95,596.42);
g2.showtype();
double d1=g2.retobj();
double d2=g2.retobj1();
System.out.println(d1+" "+d2);
}
}

