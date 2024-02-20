import java.util.Scanner;
class Student
{
    String usn;
    String name;
    int[] credits;
    int[] marks;
    public void accept()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter usn");
        usn=s.next();
        System.out.println("enter name");
        name=s.next();
        System.out.println("enter no of subjects");
        int n=s.nextInt();
        credits=new int[n];
        marks=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter credits for each subject"+(i+1)+":");
            credits[i]=nextInt();
            System.out.println("enter amrks for subject"+(i+1)+":");
            marks[i]=nextInt();
        }
    }
    public void display()
    {
    System.out.println("USN"+usn);
    System.out.println("name"+name);
    System.out.println("makrs :");
    for(int i=0;i<marks.length;i++)
    {
        System.out.println("subject"+(i+1)+":"+marks[i]);
    }
    for(int i=0;i<credits.length;i++)
    {
        System.out.println("subject"+(i+1)+":"+credits[i]);
    }
    }
    private double grade(int marks)
    {
        if(marks>=90)
            return 10;
        else if(marks>=80)
            return 9;
        else if(marks>=70)
            return 8;
        else if(marks>=60)
            return 7;
        else if(marks>=50)
            return 6;
        else if(marks>=40)
            return 5;
        else
            return 0;
    }
    public double calcSGPA()
    {
        double totalGrade=0;
        int totalCredit=0;
        for(int i=0;i<credits.length;i++)
        {
            totalGrade+=grade(marks[i])*credits[i];
            totalCredit+=credits[i];
        }
        return totalGrade/totalCredit;
    }
    public static void main(String[] args) 
    {
     Student stud=new Student();
     stud.accept();
     stud.display();
     System.out.println("SGPA :"+stud.calcSGPA());   
    }
}

