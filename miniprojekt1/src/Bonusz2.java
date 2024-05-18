import java.util.Random;
import java.util.Scanner;

public class Bonusz2 {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int cel = rand.nextInt(100) + 1;
    int talalat, n = 0;
    do {
      talalat = sc.nextInt();
      n++;
      if (talalat < cel) System.out.println("nagyobb");
      else if (talalat > cel) System.out.println("kisebb");
    } while (talalat != cel);
    System.out.println("Eltalaltad " + n + " probalkozas utan");
    sc.close();
  }
}
