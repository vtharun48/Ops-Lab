
class Employee {
 
    private int empId;
    private String name;
    private double salary;
    private String department;
    

    public Employee(int empId, String name, double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    
    public int getEmpId() { return empId; }
    
    public String getName() { return name; }
    
    public double getSalary() { return salary; }
    
    public String getDepartment() { return department; }
    
    
    public void setName(String name) { this.name = name; }
    
    public void setSalary(double salary) {
        if(salary > 0)
            this.salary = salary;
        else
            System.out.println("Invalid salary amount");
    }
    
    public void setDepartment(String department) { this.department = department; }
    
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void giveRaise(double percentage) {
        if(percentage > 0 && percentage <= 100) {
            double raiseAmount = salary * (percentage / 100);
            salary += raiseAmount;
            System.out.println("Salary raised by " + percentage + "%. New salary: " + salary);
        } else {
            System.out.println("Invalid raise percentage");
        }
    }
}

public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Santhosh A", 50000.0, "Engineering");
        
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
        
        emp.setDepartment("Research & Development");
        emp.giveRaise(10);
        
        System.out.println("Updated Department: " + emp.getDepartment());
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}