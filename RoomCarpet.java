public class RoomCarpet {
   double carpetCost;
   RoomDimension size;
   
   public RoomCarpet(RoomDimension dim, double cost) {
      this.size = dim;
      this.carpetCost = cost;
   }
   
   public double getTotalCost(RoomDimension size){
      return (size.getArea() * carpetCost);
   }
   
   public String toString(){
      return ("Total cost: $" + getTotalCost(size));
   }
}