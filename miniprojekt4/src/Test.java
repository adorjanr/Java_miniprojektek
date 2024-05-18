public class Test {
  public static void main(String[] args) {
    FolyoSzamla f = new FolyoSzamla("Pista");
    TakarekSzamla t = new TakarekSzamla("Sanyi", 6);

    // FolyoSzamla teszt
    f.betesz(500);
      // f.kivesz(600);
    f.kivesz(100);
    f.betesz(100);
    f.kivesz(500);
    f.levonKoltseg();
    System.out.println(f);

    System.out.println("f DEPOSIT:");
    for (Tranzakcio tr : f.tranzLista) {
      if (tr.getTranzTipus() == Tranzakcio.TranzakcioTipus.DEPOSIT) {
        System.out.println(tr);
      }
    }

    FolyoSzamla f2 = new FolyoSzamla("Pista");
    
    /* 
    true, mert f.tranzakciokSzama nullazva lett a levonKoltseg() utan
    es minden mas osszehasonlitott adattagjuk megegyezik
    => valoszinuleg rosszul ertelmezem a szamlaSzam es kovSzamlaSzam adattagokat 
    */
    System.out.println(f.equals(f2));

    f2.betesz(10);
    System.out.println(f.equals(f2));  // false
    f2.betesz(10);
    f2.betesz(10);
    f2.betesz(10);
    f2.levonKoltseg();
    System.out.println(f.equals(f2));  // megint true, ugyanaz a hiba


    // TakarekSzamla teszt
    t.betesz(1000);
    t.hozzaadKamat();
    System.out.println(t);
      // .equals() => ugyanaz a hiba
  }
}
