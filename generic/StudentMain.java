package generic;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        Student nikhil = new Student(12, 90.0f);
        
        Student bonthu = new Student(14, 99.6f);
        Student Nani = new Student(2, 94.6f);
        Student sai = new Student(54, 77.6f);
        Student krishna = new Student(94, 89.6f);
        Student[] list = {nikhil, bonthu, Nani, sai, krishna};
        System.out.println(Arrays.toString(list));
        // we can implement the comparator in sort sectio
        Arrays.sort(list,new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
                // above show output in ascending ordeer
                // if - sign there it is in descending order
            }
            
        }
        );
        System.out.println(Arrays.toString(list));

//         if(nikhil.compareTo(bonthu )<0){
// System.out.println("bonthu has more marks");
// System.out.println(nikhil.compareTo(bonthu));
//         }

    }
}
