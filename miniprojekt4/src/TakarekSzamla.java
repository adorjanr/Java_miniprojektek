public class TakarekSzamla extends RegularisSzamla {
  private double kamatRata;

  public TakarekSzamla(String tulNev, double kamat) {
    super(tulNev);
    kamatRata = kamat;  // ?
  }

  public void hozzaadKamat() {
    egyenleg += egyenleg * kamatRata / 100;
  }

  public double getKamatRata() {
    return kamatRata;
  }

  public void setKamatRata(double ujKamatRata) {
    kamatRata = ujKamatRata;
  }

  @Override
  public String toString() {
    return "Tulajdonos: " + tulNev + ", egyenleg: " + egyenleg + ", kamat ráta: " + kamatRata + "\nÖsszes tranzakció: " + tranzLista;
  }

  @Override  
  public boolean equals(Object obj) {
    TakarekSzamla t = (TakarekSzamla) obj;
    return tulNev.equals(t.tulNev) && szamlaSzam == t.szamlaSzam && kamatRata == t.kamatRata;
  }
}
