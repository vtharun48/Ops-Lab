

class Employee {
    protected String name;
    protected String id;
    protected double baseSalary;
    
    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    
    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: $" + baseSalary);
    }
    
    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;
    private int teamSize;
    
    public Manager(String name, String id, double baseSalary, double bonus, int teamSize) {
        super(name, id, baseSalary);
        this.bonus = bonus;
        this.teamSize = teamSize;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    
    public void scheduleTeamMeeting() {
        System.out.println("Manager " + name + " is scheduling a team meeting for " + teamSize + " members.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    private String projectName;
    private int overtimeHours;
    private double hourlyRate;
    
    public Developer(String name, String id, double baseSalary, 
                    String programmingLanguage, String projectName, 
                    int overtimeHours, double hourlyRate) {
        super(name, id, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.projectName = projectName;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Developer Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Project: " + projectName);
        System.out.println("Overtime Hours: " + overtimeHours);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate);
    }
    
    public void writeCode() {
        System.out.println("Developer " + name + " is writing code in " + programmingLanguage + " for project " + projectName + ".");
    }
}

class SalesRepresentative extends Employee {
    private double commissionRate;
    private double salesAmount;
    
    public SalesRepresentative(String name, String id, double baseSalary, 
                              double commissionRate, double salesAmount) {
        super(name, id, baseSalary);
        this.commissionRate = commissionRate;
        this.salesAmount = salesAmount;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Sales Representative Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Sales Amount: $" + salesAmount);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + (salesAmount * commissionRate);
    }
    
    public void makeSale(double amount) {
        salesAmount += amount;
        System.out.println("Sales Representative " + name + " made a sale of $" + amount);
        System.out.println("Total sales amount: $" + salesAmount);
    }
}

public class EmployeeTypes {
    public static void main(String[] args) {
        // Creating objects of different employee types
        Employee baseEmployee = new Employee("John Smith", "E001", 50000);
        Manager manager = new Manager("Mary Johnson", "M001", 75000, 15000, 8);
        Developer developer = new Developer("David Lee", "D001", 65000, "Java", "Banking App", 20, 50);
        SalesRepresentative salesRep = new SalesRepresentative("Lisa Brown", "S001", 45000, 0.1, 100000);
        
        // Displaying information and calculations for each employee type
        System.out.println("------ Base Employee ------");
        baseEmployee.displayInfo();
        System.out.println("Total Salary: $" + baseEmployee.calculateSalary());
        
        System.out.println("\n------ Manager ------");
        manager.displayInfo();
        System.out.println("Total Salary: $" + manager.calculateSalary());
        manager.scheduleTeamMeeting();
        
        System.out.println("\n------ Developer ------");
        developer.displayInfo();
        System.out.println("Total Salary: $" + developer.calculateSalary());
        developer.writeCode();
        
        System.out.println("\n------ Sales Representative ------");
        salesRep.displayInfo();
        System.out.println("Total Salary: $" + salesRep.calculateSalary());
        salesRep.makeSale(25000);
        System.out.println("Updated Salary: $" + salesRep.calculateSalary());
    }
}