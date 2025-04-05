

class Printer {

    public void print(int i) {
        System.out.println("Printing integer: " + i);
    }
    
    public void print(double d) {
        System.out.println("Printing double: " + d);
    }
    
    public void print(String s) {
        System.out.println("Printing string: " + s);
    }
    
    public void print(char[] c) {
        System.out.println("Printing character array: " + new String(c));
    }
    
    public void print(int[] arr) {
        System.out.print("Printing integer array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class PrintMethodOverloading {
    public static void main(String[] args) {
        Printer printer = new Printer();
        

        printer.print(100);
        printer.print(123.45);
        printer.print("Hello Java");
        printer.print(new char[] {'J', 'a', 'v', 'a'});
        printer.print(new int[] {1, 2, 3, 4, 5});
    }
}