package feladatok;

import java.util.Scanner;

public class Fel4 {
  public static void main(String[] args) {
    String szo = new String();
    Scanner sc = new Scanner(System.in);
    StringBuffer ujSzo = new StringBuffer();
   
    System.out.print("szo: ");
    szo = sc.nextLine();
    sc.close();

    int i = 0, egyforma;
    while (i < szo.length()) {
      ujSzo.append(szo.charAt(i));
      egyforma = 1;

      for (int j = i + 1; j < szo.length(); j++) {
        if (szo.charAt(j) == szo.charAt(i)) {
          egyforma++;
        }
        else break;
      }

      if (egyforma > 1) {
        ujSzo.append(egyforma);
      }

      i += egyforma;
    }

    System.out.println(ujSzo);
  }
}
