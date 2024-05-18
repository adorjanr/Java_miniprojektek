import java.util.Scanner;

public class Fel3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y, op;
    System.out.println("Add meg az elso szamot:");
    x = sc.nextInt();
    System.out.println("Add meg a masodik szamot:");
    y = sc.nextInt();
    do {
      System.out.println("Osszeadas: 1");
      System.out.println("Kivonas: 2");
      System.out.println("Szorzas: 3");
      System.out.println("Osztas: 4");
      System.out.println("Kilepes: 5");
      System.out.println("Valassz muveletet a fentiek kozul");
      op = sc.nextInt();

      switch (op) {
        case 1:
          System.out.println("Eredmeny: " + (x + y) + '\n');
          break;
        case 2:
          System.out.println("Eredmeny: " + (x - y) + '\n');
          break;
        case 3:
          System.out.println("Eredmeny: " + (x * y) + '\n');
          break;
        case 4:
          System.out.println("Eredmeny: " + ((float) x / y) + '\n');
          break;
        default:
          op = 5;
          break;
      }
    } while(op != 5);

    sc.close();
  }
}
