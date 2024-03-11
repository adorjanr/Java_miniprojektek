package feladatok;

public class Fel5 {
  public static void main(String[] args) {
    int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int aux, meret = tomb.length;

    aux = tomb[0];
    tomb[0] = tomb[meret - 1];
    tomb[meret - 1] = aux;

    for (int i : tomb) {
      System.out.print(i + " ");
    }
  }
}
