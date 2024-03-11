package feladatok;

import java.util.Scanner;

public class Fel3 {
  public static void main(String[] args) {
    String szo = new String();
    Scanner sc = new Scanner(System.in);
    StringBuffer hasznaltBetuk = new StringBuffer();
    StringBuffer ujSzo = new StringBuffer();
   
    System.out.print("szo: ");
    szo = sc.nextLine();
    sc.close();

    for (int i = 0; i < szo.length(); i++) {
      if (hasznaltBetuk.indexOf(String.valueOf(szo.charAt(i))) == -1) {
          ujSzo.append(szo.charAt(i));
          hasznaltBetuk.append(szo.charAt(i));
      }
    }

    System.out.println(ujSzo);
  }
}
