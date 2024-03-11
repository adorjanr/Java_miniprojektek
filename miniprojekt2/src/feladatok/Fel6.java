package feladatok;

public class Fel6 {
  public static void main(String[] args) {
    int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int legk = tomb[0], legn = tomb[0];

    for (int i : tomb) {
      if (i < legk) legk = i;
      if (i > legn) legn = i;
    }

    System.out.println("legkisebb: " + legk + ", legnagyobb: " + legn);
  }
}
