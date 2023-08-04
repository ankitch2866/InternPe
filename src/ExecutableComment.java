public class ExecutableComment {
    public static void main(String[] args) {
        // This is a single-line comment.
        System.out.println("Hello, World!");
        
        // You can also use comments to disable code temporarily:
        // System.out.println("This line is commented out and won't be executed.");

        // Executable comment using conditional compilation:
        int DEBUG = 0;
        if (DEBUG == 0)
        System.out.println("Debug mode is enabled!");
        else
        System.out.println("Debug mode is disabled!");
        
    }
}
