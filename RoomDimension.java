public class RoomDimension {
   double length, width;

   public RoomDimension(double length, double width){
      this.length = length;
      this.width = width;
   }
   
   public double getArea() { 
      return (this.length * this.width);
   }

   public String toString() {
      return ("Length: " + length + " Width: " + width + " Area: " + getArea());
   }

}