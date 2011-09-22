public class SiteElement {
  int buildSpace[][];
  int size_x = 50;
  int size_y = 50;
  
  public SiteElement () {
    /*
     *  Creating the build space. Size is based on parameters given
    */
    buildSpace = new int[size_x][size_y];
  }

  public void createObject(String type,int loc_x,int loc_y,String color) {
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
    else if(type.equalsIgnoreCase("sidewalk")) {
      ElementSidewalk.cloneMe();
    }
    else {
      System.out.println("Invalid object specified");
    }
  }
};
