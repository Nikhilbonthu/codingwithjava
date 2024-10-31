import java.util.*;
public class Oops01 {
    public static void main(String[] args) {
        // just declaring
        // Student std;
        Student[] students = new Student[5];
        // every elements ins student class
        // System.out.println(Arrays.toString(students));
        // This is the most common way to create an object. When you use the new
        // keyword, it allocates memory for the new object and returns a reference to
        // it.
        Oops01 student = new Oops01();
        // inner class
        Student nikhil = student.new Student();
        nikhil.rollno = 13;
        // nikhil.changeNmae("Shoe lover");
        nikhil.greeting();
        // System.out.println(nikhil.rollno);
        // System.out.println(nikhil.name);
        // System.out.println(nikhil.marks);
        Student nikhil2 = student.new Student(15, "Student", 90.0f);
        // System.out.println(nikhil2.rollno);
        // System.out.println(nikhil2.name);
        // System.out.println(nikhil2.marks);

        Student othStudent = student.new Student(nikhil);
        System.out.println(othStudent.name);
        System.out.println(othStudent.marks);
        Student nikhil3 = student.new Student(16, "bonthu", 90.1f);
        // System.out.println(nikhil3.rollno);
        // System.out.println(nikhil3.name);
        // System.out.println(nikhil3.marks);
        Student defaultcon = student.new Student();
        // System.out.println(defaultcon.name);
Student  one  = student.new Student();
Student two = one;
one.name = "something something";
// System.out.println(two.name);

    }


    // create a class
    // data type for every single student
    // inner class mean oops01 outside student class
    class Student {
        // we need a way to add the values of the above
        // properties object by object
        // we need one word to access
        int rollno;
        String name;
        float marks;

        void greeting() {
            System.out.println("hello , my name is " + this.name);
        }

        void changeNmae(String newName) {
            name = newName;
        }

        public Student() {
            // TODO Auto-generated constructor stub
            // this is how you call a constructor from another constructor
        //    internally : new Student(13,"default person",100.0f)
        // this is replaced with  constructor name
            this(13,"default person",100.0f);
        }

        public Student(int i, String string, float f) {
            // TODO Auto-generated constructor stub
            this.rollno = i;
            this.name = string;
            this.marks = f;
        }

        Student(Student other) {
            this.name = other.name;
            this.rollno = other.rollno;
            this.marks = other.marks;
        }

    }
    }

