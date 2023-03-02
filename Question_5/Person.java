package Question_5;

import java.util.List;

public class Person {
   private String name;
   private List<Watch> ratings;
   
    public Person(String name)
    {
         this.name = name;
    }

    public void watchMovie(Movie movie, int rating)
    {
        ratings.add(new Watch(this, movie, rating));  
    }
}
