package feladatok;

import java.util.Random;

public class Fel9 {
  public static void main(String[] args) {
    int[][] tomb = new int[10][10];
    Random rand = new Random();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (i == j) {
          tomb[i][j] = rand.nextInt(8) + 1;  // 1-9 kozt, hogy ne csusszon el a kiiratas es kulonbozzon 0-tol
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(tomb[i][j] + " ");
      }
      System.out.println();
    }
  }
}
