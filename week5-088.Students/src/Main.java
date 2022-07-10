
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        String name = " ";
        String studentnumber = "";
        while(!name.isEmpty())
        {
            System.out.print("name: ");
            name = reader.nextLine();
            if(!name.isEmpty())
            {
                System.out.print("studentnumber: ");
                studentnumber = reader.nextLine();
                students.add(new Student(name, studentnumber));
            }
        }
        for(Student x : students)
        {
            System.out.println(x);
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("result:");
        for(Student x : students)
        {
            if(x.getName().contains(searchTerm) || x.getStudentNumber().contains(searchTerm))
            {
                System.out.println(x);
            }
        }
    }
}
