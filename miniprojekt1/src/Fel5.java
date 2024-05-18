public class Fel5 {
  public static void main(String[] args) {
    String s = "asdASD";
    String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    boolean ok = true;
    for (int i = 0; i < s.length(); i++) {
      if (alphabet.indexOf(s.charAt(i)) == -1) {
        ok = false;
        break;
      }
    }
    System.out.println("A szoveg csak betukbol all: " + ok);
  }
}
