import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //   Outlander outlander = new Outlander(36);
        //   outlander.steer(45);
        //   outlander.accelerate(30);
        //   outlander.accelerate(20);
        //   outlander.accelerate(-42);


        Scanner scanner = new Scanner(System.in);
        // Trapezium firstTrapezium = new Trapezium(0, 0, 0);
        // Trapezium secondTrapezium = new Trapezium(0, 0, 0);
        // Triangle firstTriangle = new Triangle(0, 0, 0);
//
//
        // System.out.println("Set trapezium top base");
        // firstTrapezium.setTopBase(scanner.nextInt());
        // System.out.println("Set trapezium bottom base");
        // firstTrapezium.setBottomBase(scanner.nextInt());
        // System.out.println("set trapezium height");
        // firstTrapezium.setHeight(scanner.nextInt());
        // System.out.println("Area = " + firstTrapezium.calculateArea());
        // System.out.println("Set trapezium top base");
        // secondTrapezium.setTopBase(scanner.nextInt());
        // System.out.println("Set trapezium bottom base");
        // secondTrapezium.setBottomBase(scanner.nextInt());
        // System.out.println("set trapezium height");
        // secondTrapezium.setHeight(scanner.nextInt());
        // System.out.println("Area = " + secondTrapezium.calculateArea());
        // System.out.println("Set length");
        // secondTrapezium.setLength(scanner.nextInt());
        // System.out.println("Volume = " + (0.5 * (firstTrapezium.calculateArea() + secondTrapezium.calculateArea() * secondTrapezium.getLength())));
//
        // System.out.println("Set triangle top base");
        // firstTriangle.setTopBase(scanner.nextInt());
        // System.out.println("Set triangle height");
        // firstTriangle.setHeight(scanner.nextInt());
        // System.out.println("Area = " + firstTriangle.calculateArea());
//

        do {
            MenuToDisplay.displayMainMenu();
            int mainMenuOption = scanner.nextInt();

            switch (mainMenuOption) {
                case 1:
                    System.out.println("You chose 1");
                    break;
                case 2:
                    System.out.println("You chose 2");
                    break;
                case 0:
                    System.out.println("You chose 0 end");
                default:
                    System.out.println("Wrong button!");
                    break;
            }
        } while (scanner.nextInt() == 0 );


    }


}
