import java.util.Scanner;
/*
Name: Rafael Sevilla
CptS 233: MicroAssignment #1
Date: 9.4.20
gitRepo url: https://github.com/Raffi1721/Micro-1.git
*/
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
