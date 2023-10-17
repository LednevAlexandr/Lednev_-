
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Sasha", "Ivanov", 25);
        Students student2 = new Students("Masha", "Logova",21 );
        Students student3 = new Students("Alex", "Dranikov",30 );


        List<Students> numberGroup = new ArrayList<>();
        numberGroup.add(student1);
        numberGroup.add(student2);
        numberGroup.add(student3);
//      System.out.println(numberGroup);

        student1.compareTo(student1);


//        for (Students student : numberGroup) {
//            System.out.println("Name: " + student.getName());
//            }
//
//        Iterator<Students> iterator = numberGroup.iterator();
//        while (iterator.hasNext()) {
//            Students students = iterator.next();
//            System.out.println("Name: " + students.getName());
//        }
        System.out.println(numberGroup);
//        Collections.sort(numberGroup);

        System.out.println(numberGroup);
//

    }
}