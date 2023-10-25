package J_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<>();
        Students.add(new Student("Addwin", 7));
        Students.add(new Student("Samjai", 4));
        Students.add(new Student("Nerash", 5));

        System.out.println("----------Before Removing-----------");
        for (Student student : Students) {
            System.out.println(student.getName());
        }
        Students.remove(1);
        System.out.println("----------After Removing-----------");
        for (Student student : Students) {
            System.out.println(student.getName());
        }

        LinkedList <Student> StudentsList = new LinkedList<>();
        StudentsList.add(new Student("Addwin", 7));
        StudentsList.add(new Student("Samjai", 4));
        StudentsList.add(new Student("Nerash", 5));

        System.out.println("----------Before Removing Linked List-----------");
        for (Student student : StudentsList) {
            System.out.println(student.getName());
        }
        StudentsList.remove(1);
        System.out.println("----------After Removing Linked List-----------");
        for (Student student : StudentsList) {
            System.out.println(student.getName());
        }


        HashSet<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(2);

        for (Integer i:setInt){
            System.out.println(i);
        }
    }
}
