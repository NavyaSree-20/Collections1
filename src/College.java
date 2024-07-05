package src;
import java.util.ArrayList;
import java.util.LinkedList;

public class College {
    public static void main(String[] args) {
        ArrayList<String>students=new ArrayList<>();
        students.add("Navya");
        students.add("Priya");
        students.add(0,"Alekhya");
        students.add("Lasya");
        System.out.println(students);
        students.addFirst("Kavya");
        students.remove("Alekhya");
        System.out.println(students);
        LinkedList<String> names=new LinkedList<>();
        names.add("Lekha");
        names.add("Sathya");
        names.add("Rooshi");
        students.addAll(names);
        System.out.println(students);

    }
}
