import java.util.Scanner;

public class Bonusz1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, ar = 0;

    System.out.println("Valasszon kavet:");
    System.out.println("1. Espresso (200 Ft)");
    System.out.println("2. Latte (300 Ft)");
    System.out.println("3. Cappuccino (300 Ft)");
    System.out.println("4. Flat White (400 Ft)");
    x = sc.nextInt();
    switch (x) {
      case 1:
        ar = 200;
        break;
      case 2, 3:
        ar = 300;
        break;
      case 4:
        ar = 400;
        break;
      default:
        break;
    }

    System.out.println("\nValaszthato opciok: (tobb eseten irja be az osszes szamot egymas utan - pl.: 23 => Habos kave pohar nelkul)");
    System.out.println("1. Dupla cukor (+20 Ft)");
    System.out.println("2. Habos kave (+50 Ft)");
    System.out.println("3. Pohar nelkul (-10 Ft)");
    x = sc.nextInt();
    switch (x) {
      case 1:
        ar += 20;
        break;
      case 2:
        ar += 50;
        break;
      case 3:
        ar -= 10;
        break;
      case 12:
        ar += 70;
        break;
      case 13:
        ar += 10;
        break;
      case 23:
        ar += 40;
        break;
      case 123:
        ar += 60;
        break;
      default:
        break;
    }

    System.out.println("A termek ara " + ar + " Ft.");
    sc.close();
  }
}
