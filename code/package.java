package CIE;
public class student
{
public String usn;
public String name;
public int sem;
public student(String u, String n, int s)
{
this.usn = u;
this.name = n;
this.sem = s;
}
}
package CIE;
public class internals extends student
{
public double imarks[] ;
public internals(String u, String n, int s ,double m[])
{
super(u,n,s);
this.imarks = m;
}
}
package SEE;
import CIE.student;
public class externals extends CIE.student{
public double smarks[];
public externals (String u, String n, int s ,double m[])
{
super(u,n,s);
this.smarks = m;
}
}
import CIE.student;
import CIE.internals;
import SEE.externals;
public class test
{
public static void main(String[] args)
{
double internal[] ={43, 45, 47, 44, 41};
double external[] = {90, 87, 65, 98, 43};
student s1 = new student("1BM22CS139", "Maanas", 3);
internals i1 = new internals("1BM22CS139", "Maanas", 3,internal);
externals e1 = new externals("1BM22CS139", "Maanas", 3 ,external);
System.out.println("usn:" + s1.usn + " name: " + s1.name + "sem: " +
s1.sem );
System.out.println("internal marks: ");
for(int i = 0; i<5 ; i++)
{
System.out.printf("internal marks %d : %f", i+1,i1.imarks[i]);
}
System.out.println();
System.out.println("external marks: ");
for(int i = 0; i<5 ; i++)
{
System.out.printf("external marks %d : %f", i+1,e1.smarks[i]);
}
}
}
