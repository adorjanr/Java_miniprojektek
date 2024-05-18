import java.util.Scanner;

public class Fel1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    do {
      System.out.println("Adj meg egy szamot (1-10)");
      x = sc.nextInt();
      if (x < 0 || x > 10) System.out.println("Ujra!");
    } while (x < 0 || x > 10);
    sc.close();
    for (int i = 1; i <= 10; i++)
    System.out.println(x + " x " + i + " = " + x * i);
  }
}
