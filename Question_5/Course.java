package Question_5;

public class Course {
   private int code;
   private Book[] books = new Book[2];


    public Course(int code, Book[] books)
    {
         this.code = code;
         this.books = books;
    }
}
