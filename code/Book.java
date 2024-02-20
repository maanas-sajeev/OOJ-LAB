import java.util.Scanner;
class Book
{
    String name;
    String author;
    double price;
    int pages;
    
    public Book(String name,String author,double price,int pages)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPages(int pages)
    {
        this.pages=pages;
    }
    public int getPages()
    {
        return pages;
    }
    public String toString()
    {
        return "Name :"+name+"\nAuthor :"+author"\nPrice :"+price+"\nPages :"+pages;
    }
    public static void main(String[] args)
    {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of books:");
            int n=sc.nextInt();
            Book[] books=new Book[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter details for book"+(i+1)+":");
                System.out.println("enter name");
                String name=sc.next();
                System.out.println("enter author");
                String author=sc.next();
                System.out.println("enter price");
                double price=sc.nextDouble();
                System.out.println("enter no of pages");
                int no_of_pages=sc.nextInt();
                books[i]=new Book(name, author, price, no_of_pages);

            }
            for(int i=0;i<n;i++)
            {
                System.out.println("Details of book"+(i+1));
                System.out.println(books[i].toString());
            }

        }
    }
}