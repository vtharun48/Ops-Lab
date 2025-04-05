
import java.math.BigInteger;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class BuiltInPackageDemo2 {
    public static void main(String[] args) {
        try {
        
            System.out.println("Java.math.BigInteger Example:");
            BigInteger bigNum1 = new BigInteger("1234567890123456789");
            BigInteger bigNum2 = new BigInteger("9876543210987654321");
            System.out.println("Addition: " + bigNum1.add(bigNum2));
            System.out.println("Multiplication: " + bigNum1.multiply(bigNum2));
            System.out.println();
            
        
            System.out.println("Java.math.BigDecimal Example:");
            BigDecimal bd1 = new BigDecimal("123.456789");
            BigDecimal bd2 = new BigDecimal("23.456789");
            System.out.println("Addition: " + bd1.add(bd2));
            System.out.println("Division: " + bd1.divide(bd2, 5, BigDecimal.ROUND_HALF_UP));
            System.out.println();
            
           
            System.out.println("Java.net.InetAddress Example:");
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());
            System.out.println();
            
           
            System.out.println("Java.net.URL Example:");
            URL url = new URL("https://www.amrita.edu");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println();
            
          
            System.out.println("Java.time Package Examples:");
            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();
            System.out.println("Current date: " + date);
            System.out.println("Current time: " + time);
            

            LocalDate birthday = LocalDate.of(2005, 3, 15); // Example birth date
            Period age = Period.between(birthday, date);
            System.out.println("Age: " + age.getYears() + " years, " + 
                               age.getMonths() + " months, " + 
                               age.getDays() + " days");
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}