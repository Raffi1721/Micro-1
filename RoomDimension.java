public class RoomDimension {
   double length, width;

   public static void main(double length, double width){
      this.length = length;
      this.width = width;
   }
   
   public double getArea() { 
      return (this.length * this.width);
   }

   public toString() {
      System.out.println("Length: " + length + "Width: " + width);
   }

}