public class RoomCarpet () {
   double carpetCost;
   RoomDimension size;
   
   public static void main (RoomDimension dim, double cost) {
      RoomDimension.size = dim();
      double carpetCost = cost;
   }
   
   public double getTotalCost(RoomDimension size){
      return (send.getArea() * carpetCost);
   }
   
   public toString(){
      System.out.println("");
   }
}