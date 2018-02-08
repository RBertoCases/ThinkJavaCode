public class Exercise {
    
    
    /**
     * when zoop() invoked, calls baffle()
     * and then prints "You Wugga "
     * and calls baffle() again. 
     */
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    
    /**
     * @param args
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
        zool(11, "Mishu", "Sand Hollow");
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
    
    /**
     *
     * @param age
     * @param pet
     * @param street
     */
    public static void zool(int age, String pet, String street) {
        System.out.print ("\n" + age + pet + street);
    }

}
