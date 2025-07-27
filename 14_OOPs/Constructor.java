public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = new int[] { 90, 80, 70 };

        Student s2 = new Student("Jay Govind");
        Student s3 = new Student(20);
        Student s4 = new Student("Jay Govind", 20);

        System.out.println(s1.name + " " + s1.age); // null 0
        System.out.println(s2.name + " " + s2.age); // Jay Govind 0
        System.out.println(s3.name + " " + s3.age); // null 20
        System.out.println(s4.name + " " + s4.age); // Jay Govind 20

        Student s5 = new Student(s1);
        System.out.println(s5.name + " " + s5.age); // null 0
        System.out.println(s5.marks[0] + " " + s5.marks[1] + " " + s5.marks[2]); // 90 80 70

        s1.marks[2] = 100; // Modifying s1's marks
    }
}

class Student {
    String name;
    int age;
    int[] marks;

    // Constructor overloading
    Student() {
        System.out.println("Constructor is calling...");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    // Student(Student s) {
    // this.name = s.name;
    // this.age = s.age;
    // this.marks = s.marks; // Shallow copy
    // }

    // Copy constructor with deep copy
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.marks = s.marks.clone();
    }
}