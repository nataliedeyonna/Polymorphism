public class Student extends BSU_Member {
    double gpa;

    Course[] enrolledCourses;


    Student() {
        this.gpa = 0;
        this.enrolledCourses = new Course[6];
        this.status = "Student";
    }
    Student(double gpa, Course[] enrolledCourses) {
        this.gpa = gpa;
        this.enrolledCourses = enrolledCourses;
    }
    // Lab work: create a getter method for enrolled_courses attribute
    public Course[] get_Enrolled_courses() {
        return this.enrolledCourses;
    }
    @Override
    public void display_information(){
        System.out.println("Status: " + status);
    }
}