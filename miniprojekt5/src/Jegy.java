public class Jegy {
  private final String TARGY;
  private final int JEGY;

  public Jegy(String targy, int jegy) {
    TARGY = targy;
    JEGY = jegy;
  }

  public String getTARGY() {
    return TARGY;
  }

  public int getJEGY() {
    return JEGY;
  }

  @Override
  public String toString() {
    return "Jegy [TARGY=" + TARGY + ", JEGY=" + JEGY + "]";
  }
}
