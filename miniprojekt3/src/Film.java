public class Film {
  
  private String cim;
  private int ar;
  private int[] velemenyek;
  private int dbVelemeny = 0;

  public Film(String cim, int ar) {
    this.cim = cim;
    this.ar = ar;
    this.velemenyek = new int[20];
  }

  public String getCim() {
    return cim;
  }

  public int getAr() {
    return ar;
  }

  public void setAr(int ar) {
    this.ar = ar;
  }

  public void Velemenyezes(int velemeny) {
    velemenyek[dbVelemeny] = velemeny;
    dbVelemeny++;
  }

  public float Atlag() {
    if (dbVelemeny == 0) {
      System.out.println("A Film nem rendelkezik velemenyekkel.");
      return 0;
    }
    else {
      int ossz = 0;
      for (int i = 0; i < dbVelemeny; i++) {
        ossz += velemenyek[i];
      }
      return ossz / dbVelemeny;
    }
  }

  @Override
  public String toString() {
    return "Film cime: " + cim + ", Film ara: " + ar;
  }
}
