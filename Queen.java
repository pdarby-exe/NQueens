//Author: Padraic Darby

public class Queen{
   
   //Invariant of Class
   // 1. x the position along the x axis
   // 2. y the position along the y axis
   private int x;
   private int y;
   
   /**
   * Initialize a Queen object with the x coordinate and a y coordinate at 0.
   * @param - none
   **/
   public Queen(){
      this.x = 0;
      this.y = 0;
   }
   
   /**
   * Initialize a Queen object with the x coordinate and a y coordinate at user inputed coordinates.
   * @param - x
   *  the position along the board along the x axis.
   * @param - y
   *  the position along the board alond the y axis
   * @throws NumberFormatException
   *  Indicates that the string couldnot be converted to an Integer
   **/
   public Queen(int x, int y){
      this.x = x;
      this.y = y;
      
   }
   
   /**
   *creates a string to represent a Queen object
   * @param - none
   * @precondition the object is not null
   * @throws IllegalStateException
   * indicates that the object is null
   **/
   public String toString(){
      
      String str;
      
      if(this == null)
			throw new IllegalStateException("This Queen object is null!");
      
      str = new String("The Queen is at position (" + x + "," + y +").");
      
      return str;
   }
   
   /**
   * compares the initial queen to another queen to check if there is a conflict either vertically, horizontally, or diagonally.
   * @param q2
   *  a Queen object to compare to the Queen object its called on
   * @returns
   *  true or falsed based on the position of the two Queens
   * @throws NullPointerExeption
   *  inticates that either the original object or the object passed in are null
   **/
   public boolean conflict(Queen q2){
      
      if(!(q2 instanceof Queen))
			throw new IllegalStateException("This Object is not an UnboundedInt Object!");
         
      if((this == null) || (q2 == null))
         throw new IllegalStateException("Your comparing null UnboundedInt object(s)!");

      
      boolean conflict = false;
  
      //checks if the queens are in a horizontal 
      if(x == q2.x)
         conflict = true;

      //checks if the queens are in a vertical 
      if(y == q2.y)
         conflict = true;
      
      //checks if the queens are in a diagonal line 
      if(Math.abs(x-q2.x) == Math.abs(y-q2.y))
         conflict = true;
               
      return conflict;
   }
   
   /**
   * Accessor method to get the current x-coordinate of the queen object. 
   * @param - none
   * @return
   *  the current x-coordinate of the queen object
   **/
   public int getX(){
      return x;
   }
   
   /**
   * Accessor method to get the current y-coordinate of the queen object. 
   * @param - none
   * @return
   *  the current y-coordinate of the queen object
   **/   public int getY(){
      return y;
   }
   
   /**
   * set a new x-coordinate for the queen object
   * @param newx
   *   the new x-coordinate of the queen
   **/
   public void setX(int newx){
      x = newx;
   }
   
   /**
   * set a new y-coordinate for the queen object
   * @param newy
   *   the new y-coordinate of the queen
   **/
   public void setY(int newY){
      y = newY;
   }
   
}