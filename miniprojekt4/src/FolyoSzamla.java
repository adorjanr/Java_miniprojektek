public class FolyoSzamla extends RegularisSzamla {
  private int tranzakciokSzama;
  private final static int INGYENES_TRANZ_SZAMA = 3;
  private final static double TRANZAKCIO_ARA = 2.0;
  
  public FolyoSzamla(String tulNev) {
    super(tulNev);
  }

  @Override
  public void betesz(double osszeg) {
    super.betesz(osszeg);
    tranzakciokSzama++;
  }

  @Override
  public void kivesz(double osszeg) {
    super.kivesz(osszeg);
    tranzakciokSzama++;
  }

  public void levonKoltseg() {
    if (tranzakciokSzama > INGYENES_TRANZ_SZAMA) {
      egyenleg -= TRANZAKCIO_ARA*(tranzakciokSzama - INGYENES_TRANZ_SZAMA);
      tranzakciokSzama = 0;
    }
  }

  @Override
  public String toString() {
    return "Tulajdonos: " + tulNev + ", egyenleg: " + egyenleg + ", tranzakciók száma: " + tranzakciokSzama + "\nÖsszes tranzakció: " + tranzLista;
  }

  @Override
  public boolean equals(Object obj) {
    FolyoSzamla r = (FolyoSzamla) obj;
    return tulNev.equals(r.tulNev) && szamlaSzam == r.szamlaSzam && tranzakciokSzama == r.tranzakciokSzama;
  }
}
