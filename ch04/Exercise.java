public class Exercise {
    
    /**
     * Calls baffle()
     * and then prints "You wugga "
     * then calls baffle() again.
     */
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    
    /**
     * prints "No, I "
     * calls zoop()
     * prints "I "
     * then calls baffle()
     */
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }
    
    /**
     * When baffle() is invoked, prints "wug"
     * and calls ping()
     */
    public static void baffle() {
        System.out.print("wug");
        ping();
    }
    
    /**
     * When ping() is invoked, prints "."
     */
    public static void ping() {
        System.out.println(".");
    }

}
