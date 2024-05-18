import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {
  private LocalDateTime idopont;
  private TranzakcioTipus tranzTipus;
  private double osszeg;

  public enum TranzakcioTipus { DEPOSIT, WITHDRAW }
  
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

  public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
    this.tranzTipus = tranzTipus;
    this.osszeg = osszeg;
    this.idopont = LocalDateTime.now();
  }

  public TranzakcioTipus getTranzTipus() {
    return tranzTipus;
  }

  @Override
  public String toString() {
    return tranzTipus + ": " + osszeg + "; " + idopont.format(formatter);
  }
}
