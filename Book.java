public class Book {
    int id;
    String author;
    int copies_sold;

    public void setData(int id,String author,int copies_sold){
        this.id = id;
        this.author = author;
        this.copies_sold = copies_sold;
        
    }

    public void ShowData(){

        System.out.println("Book Info");


        System.out.println("Author : "+author);
        System.out.println("Copies Sold : "+copies_sold+"\n");

    }


    public static void main(String[] args) {
        
        Book b1 = new Book();
        b1.setData(21, "Sagar",21);
        b1.ShowData();

        Book b2 = new Book();
        b2.setData(101, "Tester",213);
        b2.ShowData();
    }

   
    
}
