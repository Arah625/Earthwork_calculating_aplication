public class MenuToDisplay {


    public static void displayMainMenu() {
        System.out.println("Select type of trench");
        System.out.println("1 - Triangular");
        System.out.println("2 - Trapezoidal");
        System.out.println("0 - Exit program");
    }

    public static void DisplayMenuWithCalculatingMethodsForTriangularTrench() {
        System.out.println("Select a method for calculating earthwork");
        System.out.println("1 - Average cross - section method");
        System.out.println("2 - Medial cross - section method");
        System.out.println("0 - Get back to main menu");
    }

    public static void DisplayMenuWithCalculatingMethodsForTrapezoidalTrench() {
        System.out.println("Select a method for calculating earthwork");
        System.out.println("1 - Average cross - section method");
        System.out.println("2 - Simpson method");
        System.out.println("3 - Medial cross - section method");
        System.out.println("0 - Get back to main menu");
    }
}
