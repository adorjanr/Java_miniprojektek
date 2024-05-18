import java.util.ArrayList;

public class RegularisSzamla implements Bankszamla {
  protected double egyenleg;
  protected String tulNev;
  protected int szamlaSzam;
  private static int kovSzamlaSzam = 1;
  protected ArrayList<Tranzakcio> tranzLista = new ArrayList<>();

  public RegularisSzamla(String tulNev) {
    this.tulNev = tulNev;
    ujSzamlaszam();
  }

  private void ujSzamlaszam() {
    szamlaSzam = kovSzamlaSzam++;
  }

  @Override
  public void betesz(double osszeg) {
    egyenleg += osszeg;
    Tranzakcio tr = new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT, osszeg);
    tranzLista.add(tr);
  }
  
  @Override
  public void kivesz(double osszeg) {
    try {
      if (egyenleg >= osszeg) {
        egyenleg -= osszeg;
        Tranzakcio tr = new Tranzakcio(Tranzakcio.TranzakcioTipus.WITHDRAW, osszeg);
        tranzLista.add(tr);
      }
      else {
        throw new Exception("Túl alacsony egyenleg.");
      }
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
    
  @Override
  public double getEgyenleg() {
    return egyenleg;
  }

  @Override
  public String toString() {
    return "Számlaszám: " + szamlaSzam + ", Tulajdonos: " + tulNev + ", egyenleg: " + egyenleg + "\nTranzakciók: " + tranzLista;
  }
}
