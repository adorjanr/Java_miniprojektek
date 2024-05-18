import java.util.Scanner;

public class Fel2 {
  public static boolean logIn(String helyes) {
    Scanner sc = new Scanner(System.in);
    int probaNr = 1;
    String probaPw;
    System.out.println("Add meg a jelszavad: ");
    while (probaNr <= 3) {
      probaPw = sc.nextLine();
      if (probaPw.equals(helyes)) {
        sc.close();
        System.out.println("Helyes jelszo.");
        return true;
      }
      probaNr++;
      if (probaNr <= 3)
        System.out.println("Helytelen jelszo! probald ujra:");
    }
    sc.close();
    System.out.println("3 helytelen probalkozas. Ki vagy zarva!");
    return false;
  }
  
  public static void main(String[] args) {
    String helyesPw = "valami1-asd";
    logIn(helyesPw);
  }
}
