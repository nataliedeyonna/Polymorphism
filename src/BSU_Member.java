public class BSU_Member {
    int id;
    String name;
    char gender;
    int age;
    String status;
    //Lab work: Create default constructor and overloaded constructor, setter and getters
    BSU_Member() {
        this.id = 0;
        this.name = "";
        this.gender = ' ';
        this.age = 0;
        this.status = "";
    }

    BSU_Member(int id, String name, char gender, int age, String status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public int get_id() {
        return this.id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return this.name;
    }

    public void set_gender(char gender) {
        this.gender = gender;
    }

    public char get_gender() {
        return this.gender;
    }

    public void set_age(int age) {
        this.age = age;
    }

    public int get_age() {
        return this.age;
    }

    public void set_status(String status) {
        this.status = status;
    }

    public String get_status() {
        return this.status;
    }

    public void display_information() {
        System.out.println("Status: " + status);

    }
}
