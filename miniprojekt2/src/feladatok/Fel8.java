package feladatok;

public class Fel8 {
  public static void main(String[] args) {
    int[] tomb = {9, 1, 2, 1, 3, 4, 4, 1, 5, 6, 0, 7, 8, 9, 0};
    int aux;

    for (int i = 0; i < tomb.length; i++) {
      for (int j = i + 1; j < tomb.length; j++) {
        if (tomb[i] > tomb[j]) {
          aux = tomb[i];
          tomb[i] = tomb[j];
          tomb[j] = aux;
        }
      }
    }

    for (int i : tomb) {
      System.out.print(i + " ");
    }
  }
}
