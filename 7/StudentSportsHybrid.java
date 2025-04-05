

interface Person {
    void displayPersonInfo();
}

class Student implements Person {
    private String name;
    private String studentId;
    
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    @Override
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
    
    public void study() {
        System.out.println(name + " is studying");
    }
}

interface SportsPlayer {
    void play();
}

class SportsStudent extends Student implements SportsPlayer {
    private String sportName;
    
    public SportsStudent(String name, String studentId, String sportName) {
        super(name, studentId);
        this.sportName = sportName;
    }
    
    @Override
    public void play() {
        System.out.println("Playing " + sportName);
    }
    
    public void displayDetails() {
        displayPersonInfo();
        System.out.println("Sport: " + sportName);
    }
}

public class StudentSportsHybrid {
    public static void main(String[] args) {
        SportsStudent sportStudent = new SportsStudent("John", "S12345", "Cricket");
        sportStudent.displayDetails();
        sportStudent.study();
        sportStudent.play();
    }
}