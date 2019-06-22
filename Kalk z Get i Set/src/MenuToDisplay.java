public class MenuToDisplay {


    public static void DisplayMainMenu() {
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

    public static void DisplayTriangularAverageCrossSection() {
        System.out.println("You have selected: Average cross - section method");
        System.out.println("Please set variables to calculate");
        System.out.println("----------------------------------------------------- ");
        System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
    }

    public static void DisplayTriangularMedialCrossSection() {
        System.out.println("You have selected: Medial cross - section method");
        System.out.println("Please set variables to calculate");
        System.out.println("----------------------------------------------------- ");
        System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
    }

    public static void DisplayTrapezoidalAverageCrossSection() {
        System.out.println("You have selected: Average cross - section method");
        System.out.println("Please set variables to calculate");
        System.out.println("----------------------------------------------------- ");
        System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
    }

    public static void DisplayTrapezoidalSimpson() {
        System.out.println("You have selected: Simpson method");
        System.out.println("Please set variables to calculate");
        System.out.println("----------------------------------------------------- ");
        System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
    }

    public static void DisplayTrapezoidalMedialCrossSection() {
        System.out.println("You have selected: Medial cross - section method");
        System.out.println("Please set variables to calculate");
        System.out.println("----------------------------------------------------- ");
        System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
    }
}


