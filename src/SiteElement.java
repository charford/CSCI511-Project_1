 /**
  * class for SiteElement
  * @author Casey Harford
  * @version 1.0
  * @param buildSpace   defines array for grid of objects
  * @param size_x       defines the size of x axis for buildSpace
  * @param size_y       defines the size of y axis for buildSpace
 */
public class SiteElement {
  static int buildSpace[][];
  int size_x = 50;
  int size_y = 50;
  
  public SiteElement () {
    /**
     *  Creating the build space. Size is based on parameters given
    */
    buildSpace = new int[size_x][size_y];
  }
  
   /**
    * method for createObject
    * @param type   gets the requested type of object to create
    * @param loc_x  gets the x coordinate to place object
    * @param loc_y  gets the y coordinate to place object
    * @param color  gets the color to be used for the object 
   */
  public void createObject(String type,int loc_x,int loc_y,String color) {
    if(type.equalsIgnoreCase("tree")) {
      buildSpace[loc_x][loc_y] = 1; //mark this location as used
      ElementTree.cloneMe(loc_x,loc_y,color);
    }
    else if(type.equalsIgnoreCase("bench")) {
      buildSpace[loc_x][loc_y] = 1; //mark this location as used
      ElementBench.cloneMe(loc_x,loc_y,color);
    }
    else if(type.equalsIgnoreCase("road")) {
      buildSpace[loc_x][loc_y] = 1; //mark this location as used
      ElementRoad.cloneMe(loc_x,loc_y,color);
    }
    else if(type.equalsIgnoreCase("house")) {
      buildSpace[loc_x][loc_y] = 1; //mark this location as used
      ElementHouse.cloneMe(loc_x,loc_y,color);
    }
    else if(type.equalsIgnoreCase("building")) {
      buildSpace[loc_x][loc_y] = 1; //mark this location as used
      ElementBuilding.cloneMe(loc_x,loc_y,color);
    }
    else if(type.equalsIgnoreCase("sidewalk")) {
      buildSpace[loc_x][loc_y] = 1; //mark this location as used
      ElementSidewalk.cloneMe(loc_x,loc_y,color);
    }
    else {
      System.out.println("Invalid object specified");
    }
  }
};
