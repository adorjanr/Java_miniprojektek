import java.util.Scanner;

public class Fel4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("n = ");
    n = sc.nextInt();
    sc.close();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
