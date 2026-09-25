// Parent class is Course.java
//Student class in COSC113

public class COSC113 extends Course {
    String syllabus;
    String coding_language;

    Instructor i1;

    Student[] students;

    COSC113() {
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
        this.course_number = 113;
        this.credit = 4;
        this.name = "COSC113";
    }

    COSC113(int course_number, int credit, String name) {
        super(course_number, credit, name);
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
    }

    // Setters and getters

    public void set_syllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String get_syllabus() {
        return this.syllabus;
    }

    public void set_coding_language(String coding_language) {
        this.coding_language = coding_language;
    }

    public String get_coding_language() {
        return this.coding_language;
    }

    public void set_i1(Instructor i1) {
        this.i1 = i1;
    }

    public Instructor get_i1() {
        return this.i1;
    }

    public void set_students(Student[] students) {
        this.students = students;
    }

    public Student[] get_students() {
        return this.students;
    }

    @Override
    public void display_course_information() {
        System.out.println("Course Name: " + super.name
                + " Course Number: " + super.course_number);
    }
}