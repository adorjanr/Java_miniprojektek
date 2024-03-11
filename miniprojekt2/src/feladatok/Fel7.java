package feladatok;

public class Fel7 {
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

    int i = 0, egyforma;
    while (i < tomb.length - 1) {
      egyforma = 1;

      for (int j = i + 1; j < tomb.length; j++) {
        if (tomb[j] == tomb[i]) {
          egyforma++;
        }
        else break;
      }

      if (egyforma > 1) {
        System.out.print(tomb[i] + " ");
      }

      i += egyforma;
    }
  }
}
