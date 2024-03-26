public class HorrorFilm extends Film implements IKhorhataros {
  
  private int korh;

  public HorrorFilm(String cim, int ar, int korh) {
    super(cim, ar);
    this.korh = korh;
  }

  public int Korhatar() {
    return korh;
  }

  public int Buntetes(int korhatar) {
    if (korhatar - korh < 0) {
      return Math.abs(korhatar - korh) * getAr();
    }
    return 0;
  }

  @Override
  public String toString() {
    return "Film cime: " + getCim() + ", Film ara: " + getAr() + ", Korhatar: " + korh;
  }
}
