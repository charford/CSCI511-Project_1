public class SiteElement {

  public static void createObject(String type,int loc_x,int loc_y,String color) {
    if(type.equalsIgnoreCase("tree")) {
      ElementTree.cloneMe();
    }
    else if(type.equalsIgnoreCase("bench")) {
      ElementBench.cloneMe();
    }
    else if(type.equalsIgnoreCase("road")) {
      ElementRoad.cloneMe();
    }
    else if(type.equalsIgnoreCase("house")) {
      ElementHouse.cloneMe();
    }
    else if(type.equalsIgnoreCase("building")) {
      ElementBuilding.cloneMe();
    }
    else {
      System.out.println("Invalid object specified");
    }
  }
};
