//https://github.com/nataliedeyonna/Polymorphism
public class Course {
    String name;
    int course_number;
    int credit;

    private String classroom;

    // Students
    // Instructor

    Course() {
        name = "";
        course_number = 0;
        credit = 0;
    }

    Course(int course_number, int credit, String name) {
        this.course_number = course_number;
        this.credit = credit;
        this.name = name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return this.name;
    }

    public void set_course_number(int course_number) {
        this.course_number = course_number;
    }

    public int get_course_number() {
        return this.course_number;
    }

    public void set_credit(int credit) {
        this.credit = credit;
    }

    public int get_credit() {
        return this.credit;
    }

    public void Set_Classroom(String classroom) {
        this.classroom = classroom;
    }

    public String get_classroom() {
        return this.classroom;
    }

    public void display_course_information() {
        System.out.println("Course Name: " + this.name
                + " Course number: " + this.course_number);
    }
}