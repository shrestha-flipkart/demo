class test {
    // Instance variables
    private String message;
    private int count;
    
    // Default constructor
    public test() {
        this.message = "Hello, World!";
        this.count = 0;
    }
    
    // Parameterized constructor
    public test(String message, int count) {
        this.message = message;
        this.count = count;
    }
    
    // Getter for message
    public String getMessage() {
        return this.message;
    }
    
    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }
    
    // Getter for count
    public int getCount() {
        return this.count;
    }
    
    // Setter for count
    public void setCount(int count) {
        this.count = count;
    }
    
    // Method to increment count
    public void incrementCount() {
        this.count++;
    }
    
    // Method to display information
    public void displayInfo() {
        System.out.println("Message: " + this.message);
        System.out.println("Count: " + this.count);
    }
    
    // Method to repeat the message
    public String repeatMessage(int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(this.message);
            if (i < times - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Create instance using default constructor
        test t1 = new test();
        System.out.println("Test object 1:");
        t1.displayInfo();
        
        // Create instance using parameterized constructor
        test t2 = new test("Java Demo", 5);
        System.out.println("\nTest object 2:");
        t2.displayInfo();
        
        // Use methods
        t1.setMessage("Updated message");
        t1.incrementCount();
        t1.incrementCount();
        
        System.out.println("\nAfter updates to Test object 1:");
        t1.displayInfo();
        
        // Demonstrate repeatMessage method
        System.out.println("\nRepeating message from Test object 2:");
        String repeated = t2.repeatMessage(3);
        System.out.println(repeated);
        
        // Current date and time
        System.out.println("\nCurrent date and time: " + new java.util.Date());
    }
}
