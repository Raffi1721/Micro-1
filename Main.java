import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Length of the room: ");
      double len = input.nextDouble();
      System.out.print("Width of the room: ");
      double wid = input.nextDouble();
      RoomDimension d = new RoomDimension(len, wid);
      
      System.out.print("Cost of carpeting: ");
      double cost = input.nextDouble();
      RoomCarpet c = new RoomCarpet(d, cost);
      
      System.out.println(c.toString());

   }
   
}
