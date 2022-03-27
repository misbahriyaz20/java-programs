import java.util.Scanner;
class Book{
    String name;
    String author;
    float price;
    int num_pages;

    Book(){
        name = "";
        author = "";
        price = 0.0f;
        num_pages = 0;
        System.out.println("<*******************>");
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of the Book");
        System.out.println("Name");
        name = sc.next();
        System.out.println("Author");
        author = sc.next();
        System.out.println("Price of the Book");
        price = sc.nextFloat();
        System.out.println("Number of pages :");
        num_pages = sc.nextInt();
    }


    public String toString(){
        return("Name of the Book: "+name+"\nAuthor of the Book: "+author+
                "\nPrice of the Book: Rs"+price+"\nTotal pages: "+num_pages+"\n<*******************>");
    }
}

public class Bookdemo{
    public static void main(String args[]){
        Scanner ab = new Scanner(System.in);
        int i;
        System.out.println("Total number of Books:::");
        int n= ab.nextInt();
        Book b[] = new Book[n];
        for(i=0;i<n;i++){
            b[i] = new Book();
            b[i].accept();
        }

        System.out.println("BOOK DETAILS::");
        for(i=0;i<n;i++){
            int j = i+1;
            System.out.println("\n<*******BOOK"+j+"*******>");
            System.out.println(b[i]);
        }
    }
}
