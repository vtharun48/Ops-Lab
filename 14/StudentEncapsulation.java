
class Student {

    private int rollNo;
    private String name;
    private int age;
    private String course;
    

    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { 
        if(age > 0 && age < 100) // Validation 
            this.age = age; 
        else
            System.out.println("Invalid age");
    }
    
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentEncapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        

        s1.setRollNo(24142);
        s1.setName("Santhosh A");
        s1.setAge(19);
        s1.setCourse("B.Tech CSE");
        

        System.out.println("Student Details:");
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Course: " + s1.getCourse());
        

        s1.setAge(120); // Will show error message
    }
}