import java.util.Scanner;

public class SiteDeveloper {

  public static void main( String [] args ) {
    System.out.println("Site Developer Application - Welcome!");
    Scanner sc = new Scanner(System.in);
    displayMenu();
    while(sc.hasNext()) {

      String user_input = sc.next();
      System.out.println(user_input);
      if(user_input=="1") {
          SiteElement.getTree();
          displayMenu();
      }
      else if(user_input=="2") {
          SiteElement.getHouse();
          displayMenu();
      }
      else if(user_input=="3") {
          SiteElement.getBench();
          displayMenu();
      }
      else {
          System.out.println("Invalid option specified.");
          displayMenu();
      }
    }
  }

  private static void displayMenu() {
    System.out.println("Choose your menu option below.\n");
    System.out.println("1. Build Tree\n2. Build House\n3. Build Bench\n");
    System.out.println("To quit, press q.");
  }
};
