import java.util.ArrayList;

public class Hallgato {
  private final int ID;
  private static int nextId = 0;
  private final String VEZETEKNEV;
  private final String KERESZTNEV;
  private ArrayList<Jegy> jegyek = new ArrayList<>();

  public Hallgato(String vNev, String kNev) {
    VEZETEKNEV = vNev;
    KERESZTNEV = kNev;
    ID = hozzarendelId();
  }

  private int hozzarendelId() {
    return nextId++;
  }

  public int getID() {
    return ID;
  }

  public String getVEZETEKNEV() {
    return VEZETEKNEV;
  }

  public String getKERESZTNEV() {
    return KERESZTNEV;
  }

  public void ujBejegyzes(Jegy j) {
    jegyek.add(j);
  }

  public double tantargyAtlag(String targy) {
    int db = 0, osszeg = 0;
    for (Jegy j : jegyek) {
      if (j.getTARGY().equals(targy)) {
        db++;
        osszeg += j.getJEGY();
      }
    }
    if (db == 0) return 0;
    return (double) osszeg / db;
  }

  public ArrayList<String> getTantargyak() {
    ArrayList<String> targyak = new ArrayList<>();
    for (Jegy j : jegyek) {
      if (targyak.contains(j.getTARGY()) == false) {
        targyak.add(j.getTARGY());
      }
    }
    return targyak;
  }

  public void listazas() {
    System.out.println(VEZETEKNEV + " " + KERESZTNEV);
    ArrayList<String> targyak = getTantargyak();
    for (int i = 0; i < targyak.size(); i++) {
      System.out.printf("\t%s: %.1f\n", targyak.get(i), tantargyAtlag(targyak.get(i)));
    }
  }
}
