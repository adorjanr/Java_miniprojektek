package feladatok;

import java.util.Scanner;

public class Fel2 {
  public static void main(String[] args) {
    String szo = new String();
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
   
    System.out.print("szo: ");
    szo = sc.nextLine();
    sc.close();

    for (int i = 0; i < szo.length(); i++) {
      if (szo.charAt(i) != 'a') {
        sb.append(szo.charAt(i));
      }
      else {
        sb.append('*');
      }
    }

    System.out.println(sb);
  }
}
