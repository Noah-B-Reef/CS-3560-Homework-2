public class StudentDriver {
    
    public static void main(String[] args)
    {
        Student John = new Student("John", "CS", 3.5);
        Student Mary = new Student();
        Mary.setMajor("EE");

        System.out.println(John.toString());
        System.out.println(Mary.toString());
    }
}
