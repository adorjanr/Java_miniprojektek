public class Fel6 {
  public static boolean egyformaTombok(int[] tomb1, int[] tomb2) {
    if (tomb1.length != tomb2.length) return false;
    for (int i = 0; i < tomb1.length; i++) {
      if (tomb1[i] != tomb2[i]) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    int[] t1 = {1, 2, 3, 4};
    int[] t2 = {1, 2, 3, 5};
    System.out.println(egyformaTombok(t1, t2));
  }
}
