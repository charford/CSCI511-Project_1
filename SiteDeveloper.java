import java.util.Scanner;

public class SiteDeveloper {

  public static void main( String [] args ) {
    System.out.println("-------------------------------------");
    System.out.println("Site Developer Application - Welcome!");
    System.out.println("-------------------------------------");
    Scanner sc = new Scanner(System.in);
    displayMenu();
    String user_input, create, location;
    int loc_x, loc_y;
    while(sc.hasNext()) {

      user_input = sc.next();
      System.out.println("Your command: " + user_input);

      if(user_input.equalsIgnoreCase("create")) {
         System.out.println("Create command");
         if(sc.hasNext()) {
           create = sc.next();
           System.out.println("Create " + create);
           if(sc.hasNext()) {
             location = sc.next();
             if(location.equalsIgnoreCase("loc")) {
               if(sc.hasNextInt()) {
                 loc_x = sc.nextInt();
                 if(sc.hasNextInt()) {
                   loc_y = sc.nextInt();
                 }
                 else {
                   System.out.println("Error, invalid location (Y) given");
                 }
               }
               else {
                 System.out.println("Error, invalid location (X) given");
               }
             }
             else {
               System.out.println("Error, invalid argument for loc");
              //error goes here TODO
             }
           }
         }
         else {
           System.out.println("Error, invalid argument for create");
         }
      }

      if(user_input.equalsIgnoreCase("loc")) {
         System.out.println("Loc command");
      }

      if(user_input.equalsIgnoreCase("color")) {
         System.out.println("Color command");
      }

      if(user_input.equalsIgnoreCase("q")) {
        System.out.println("Quiting SiteDeveloper. Have a nice day!");
        break;
      }
    }
  }

  private static void displayMenu() {
    System.out.println("Enter a command to continue.\n");
    System.out.println("Example: create tree loc 3 4  color green\n");
    System.out.println("To quit, press q.");
  }
};
