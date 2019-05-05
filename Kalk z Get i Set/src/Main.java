import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programIsRunning = true;
        boolean triangularTypeChosen = true;
        boolean trapezoidalTypeChosen = true;
        TrianglePrism inputAndOutputTrianglePrism = new TrianglePrism();
        TrapeziumPrism inputAndOutputTrapeziumPrism = new TrapeziumPrism();


        while (programIsRunning) {
            MenuToDisplay.displayMainMenu();
            int choseTypeOfTrench = scanner.nextInt();

            switch (choseTypeOfTrench) {
                case 1:
                    System.out.println("You have selected triangular type of trench");
                    while (triangularTypeChosen) {
                        MenuToDisplay.DisplayMenuWithCalculatingMethodsForTriangularTrench();
                        int choseTriangularCalculatingMethods = scanner.nextInt();

                        switch (choseTriangularCalculatingMethods) {
                            case 1:
                                System.out.println("You have selected: Average cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrianglePrism.setTrianglePrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrianglePrism.setTrianglePrismClosingChainage(scanner.next());
                                System.out.println("Length of the trench from set chainage = " + inputAndOutputTrianglePrism.ConvertTrianglePrismStringChainageToFloatLength() + "m");
                                System.out.println("First triangular cross - section variables");
                                System.out.println("Bottom ordinate of first triangular cross - section");
                                inputAndOutputTrianglePrism.setFirstTriangleBottomOrdinate(scanner.nextFloat());
                                System.out.println("Top ordinate of first triangular cross - section (1)");
                                inputAndOutputTrianglePrism.setFirstTriangleTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of first triangular cross - section (2)");
                                inputAndOutputTrianglePrism.setFirstTriangleTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of first triangular cross - section");
                                inputAndOutputTrianglePrism.setFirstTriangleHeight(scanner.nextFloat());
                                System.out.println("Top width of first triangular cross - section");
                                inputAndOutputTrianglePrism.setFirstTriangleTopBase(scanner.nextFloat());
                                System.out.println("Area of the first triangle cross - section = " + inputAndOutputTrianglePrism.SolveForFirstTriangle() + "m" + '\u00B2');
                                System.out.println("Second triangular cross - section variables");
                                System.out.println("Bottom ordinate of second triangular cross - section");
                                inputAndOutputTrianglePrism.setSecondTriangleBottomOrdinate(scanner.nextFloat());
                                System.out.println("Top ordinate of second triangular cross - section (1)");
                                inputAndOutputTrianglePrism.setSecondTriangleTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of second triangular cross - section (2)");
                                inputAndOutputTrianglePrism.setSecondTriangleTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of second triangular cross - section");
                                inputAndOutputTrianglePrism.setSecondTriangleHeight(scanner.nextFloat());
                                System.out.println("Top width of second triangular cross - section");
                                inputAndOutputTrianglePrism.setSecondTriangleTopBase(scanner.nextFloat());
                                System.out.println("Area of the second triangle cross - section = " + inputAndOutputTrianglePrism.SolveForSecondTriangle() + "m" + '\u00B2');
                                System.out.println("Volume of the earthwork for set parameters = " + inputAndOutputTrianglePrism.AverageCrossSectionMethodForTrianglePrism() + "m" + '\u00B3');
                                break;
                            case 2:
                                System.out.println("You have selected: Average cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrianglePrism.setTrianglePrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrianglePrism.setTrianglePrismClosingChainage(scanner.next());
                                System.out.println("Length of the trench from set chainage = " + inputAndOutputTrianglePrism.ConvertTrianglePrismStringChainageToFloatLength() + "m");
                                System.out.println("Medial triangular cross - section variables");
                                System.out.println("Bottom ordinate of first triangular cross - section");
                                inputAndOutputTrianglePrism.setMedialTriangleBottomOrdinate(scanner.nextFloat());
                                System.out.println("Top ordinate of first triangular cross - section (1)");
                                inputAndOutputTrianglePrism.setMedialTriangleTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of first triangular cross - section (2)");
                                inputAndOutputTrianglePrism.setMedialTriangleTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of medial triangular cross - section");
                                inputAndOutputTrianglePrism.setMedialTriangleHeight(scanner.nextFloat());
                                System.out.println("Top width of medial triangular cross - section");
                                inputAndOutputTrianglePrism.setMedialTriangleTopBase(scanner.nextFloat());
                                System.out.println("Area of the medial triangle cross - section = " + inputAndOutputTrianglePrism.SolveForMedialTriangle() + "m" + '\u00B2');
                                System.out.println("Volume of the earthwork for set parameters = " + inputAndOutputTrianglePrism.MedialCrossSectionMethodForTrianglePrism() + "m" + '\u00B3');
                                break;
                            case 0:
                                System.out.println("You have selected: Get back to main menu");
                                triangularTypeChosen = false;
                                break;
                            default:
                                System.out.println("Wrong button! Please select method of calculation");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("You have selected trapezoidal type of trench");
                    while (trapezoidalTypeChosen) {
                        MenuToDisplay.DisplayMenuWithCalculatingMethodsForTrapezoidalTrench();
                        int radixTrapezoidalCalculatingMethods = scanner.nextInt();

                        switch (radixTrapezoidalCalculatingMethods) {
                            case 1:
                                System.out.println("You have selected: Average cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismClosingChainage(scanner.next());
                                System.out.println("Length of the trench from set chainage = " + inputAndOutputTrapeziumPrism.ConvertTrapeziumPrismStringChainageToFloatLength() + "m");
                                System.out.println("First trapezoidal cross - section variables");
                                System.out.println("Bottom ordinate of first trapezoidal cross - section (1)");
                                inputAndOutputTrapeziumPrism.setFirstTrapeziumBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Bottom ordinate of first trapezoidal cross - section (2)");
                                inputAndOutputTrapeziumPrism.setFirstTrapeziumBottomOrdinate2(scanner.nextFloat());
                                System.out.println("Top ordinate of first trapezoidal cross - section (1)");
                                inputAndOutputTrapeziumPrism.setFirstTrapeziumTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of first trapezoidal cross - section (2)");
                                inputAndOutputTrapeziumPrism.setFirstTrapeziumTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of first trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setFirstTrapeziumHeight(scanner.nextFloat());
                                System.out.println("Top width of first trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setFirstTrapeziumTopBase(scanner.nextFloat());
                                System.out.println("Bottom width of first trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setFirstTrapeziumBottomBase(scanner.nextFloat());
                                System.out.println("Second trapezoidal cross - section variables");
                                System.out.println("Bottom ordinate of second trapezoidal cross - section (1)");
                                inputAndOutputTrapeziumPrism.setSecondTrapeziumBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Bottom ordinate of second trapezoidal cross - section (2)");
                                inputAndOutputTrapeziumPrism.setSecondTrapeziumBottomOrdinate2(scanner.nextFloat());
                                System.out.println("Top ordinate of second trapezoidal cross - section (1)");
                                inputAndOutputTrapeziumPrism.setSecondTrapeziumTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of second trapezoidal cross - section (2)");
                                inputAndOutputTrapeziumPrism.setSecondTrapeziumTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of second trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setSecondTrapeziumHeight(scanner.nextFloat());
                                System.out.println("Top width of second trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setSecondTrapeziumTopBase(scanner.nextFloat());
                                System.out.println("Bottom width of second trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setSecondTrapeziumBottomBase(scanner.nextFloat());
                                System.out.println("Area of the second trapezoidal cross - section = " + inputAndOutputTrapeziumPrism.SolveForSecondTrapezium() + "m" + '\u00B2');
                                System.out.println("Volume of the earthwork for set parameters = " + inputAndOutputTrapeziumPrism.AverageCrossSectionMethodForTrapeziumPrism() + "m" + '\u00B3');
                                break;
                            case 2:
                                System.out.println("You have selected: Simpson method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismClosingChainage(scanner.next());
                                System.out.println("Height of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismHeightForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Top area variables");
                                System.out.println("First top ordinate of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismTopOrdinate1ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Second top ordinate of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismTopOrdinate2ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Top width of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Top length of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Top area of the trench = " + inputAndOutputTrapeziumPrism.SolveForTopTrapeziumArea() + "m" + '\u00B2');
                                System.out.println("Bottom area variables");
                                System.out.println("First bottom ordinate of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismBottomOrdinate1ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Second bottom ordinate of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismBottomOrdinate2ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Bottom width of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Bottom length of the trench");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Bottom area of the trench = " + inputAndOutputTrapeziumPrism.SolveForBottomTrapeziumArea() + "m" + '\u00B2');
                                System.out.println("Medial area of parallel cross - section to top area and bottom area of the trench = " + inputAndOutputTrapeziumPrism.SolveForMedialTrapeziumAreaParallelToTopAndBottom() + "m" + '\u00B2');
                                System.out.println("Volume of the earthwork for set parameters = " + inputAndOutputTrapeziumPrism.SimpsonMethodForTrapeziumPrism() + "m" + '\u00B3');
                                break;
                            case 3:
                                System.out.println("You have selected: Medial cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Medial trapezoidal cross - section variables");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                inputAndOutputTrapeziumPrism.setTrapeziumPrismClosingChainage(scanner.next());
                                System.out.println("Length of the trench from set chainage = " + inputAndOutputTrapeziumPrism.ConvertTrapeziumPrismStringChainageToFloatLength() + "m");
                                System.out.println("Bottom ordinate of medial trapezoidal cross - section (1)");
                                inputAndOutputTrapeziumPrism.setMedialTrapeziumBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Bottom ordinate of medial trapezoidal cross - section (2)");
                                inputAndOutputTrapeziumPrism.setMedialTrapeziumBottomOrdinate2(scanner.nextFloat());
                                System.out.println("Top ordinate of medial trapezoidal cross - section (1)");
                                inputAndOutputTrapeziumPrism.setMedialTrapeziumTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of medial trapezoidal cross - section (2)");
                                inputAndOutputTrapeziumPrism.setMedialTrapeziumTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of medial trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setMedialTrapeziumHeight(scanner.nextFloat());
                                System.out.println("Top width of medial trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setMedialTrapeziumTopBase(scanner.nextFloat());
                                System.out.println("Bottom width of medial trapezoidal cross - section");
                                inputAndOutputTrapeziumPrism.setMedialTrapeziumBottomBase(scanner.nextFloat());
                                System.out.println("Area of the second medial trapezoidal cross - section = " + inputAndOutputTrapeziumPrism.SolveForMedialTrapezium() + "m" + '\u00B2');
                                System.out.println("Volume of earthwork: " + inputAndOutputTrapeziumPrism.MedialCrossSectionMethodForTrapeziumPrism() + "m" + '\u00B3');
                                break;
                            case 0:
                                System.out.println("You have selected: Get back to main menu");
                                trapezoidalTypeChosen = false;
                            default:
                                System.out.println("You have selected: Get back to main menu");
                                break;
                        }
                    }
                case 0:
                    System.out.println("Program is closing");
                    programIsRunning = false;
                    break;
                default:
                    System.out.println("Wrong button! Please select 1 or 2.");
                    break;
            }
        }
    }
}