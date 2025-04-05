// Demonstration of interface with constants

interface DatabaseConfig {
    // Constants
    String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
    String USERNAME = "admin";
    String PASSWORD = "password";
    int MAX_CONNECTIONS = 10;
    
    void connect();
    void disconnect();
    void executeQuery(String query);
}

class MySQLDatabase implements DatabaseConfig {
    private boolean connected;
    
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL at " + DATABASE_URL);
        System.out.println("Username: " + USERNAME);
        System.out.println("Max connections: " + MAX_CONNECTIONS);
        connected = true;
    }
    
    @Override
    public void disconnect() {
        if (connected) {
            System.out.println("Disconnecting from MySQL database");
            connected = false;
        } else {
            System.out.println("Not connected to any database");
        }
    }
    
    @Override
    public void executeQuery(String query) {
        if (connected) {
            System.out.println("Executing query: " + query);
        } else {
            System.out.println("Cannot execute query - not connected");
        }
    }
}

public class InterfaceConstants {
    public static void main(String[] args) {
        DatabaseConfig db = new MySQLDatabase();
        db.connect();
        db.executeQuery("SELECT * FROM users");
        db.disconnect();
        
        // Accessing interface constants directly
        System.out.println("\nDatabase Config Constants:");
        System.out.println("URL: " + DatabaseConfig.DATABASE_URL);
        System.out.println("Username: " + DatabaseConfig.USERNAME);
        System.out.println("Max Connections: " + DatabaseConfig.MAX_CONNECTIONS);
    }
}