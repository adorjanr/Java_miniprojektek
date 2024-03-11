package feladatok;

import java.util.Scanner;

public class Fel1 {
  public static void main(String[] args) {
    String szo = new String();
    Scanner sc = new Scanner(System.in);
    char elso, utolso;

    System.out.print("szo: ");
    szo = sc.nextLine();
    sc.close();

    if (szo.length() > 0) {
      elso = szo.charAt(0);
      utolso = szo.charAt(szo.length() - 1);
     
      System.out.println("elso: " + elso + ", utolso: " + utolso);
    }
  }
}
