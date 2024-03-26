import java.util.ArrayList;
import java.util.Collections;

public class Teszter {

  public static int osszBuntetes(int kor, ArrayList<IKhorhataros> filmek) {
    int ossz = 0;
    for (IKhorhataros film : filmek) {
      ossz += film.Buntetes(kor);
    }
    return ossz;
  }

  public static void main(String[] args) {
    Film film1 = new Film("cim1", 10);
    Film film2 = new Film("cim2", 20);
    Film film3 = new Film("cim3", 15);
    Film film4 = new Film("cim4", 30);
    Film film5 = new Film("cim5", 20);
    Film film6 = new Film("cim6", 25);
    HorrorFilm hfilm1 = new HorrorFilm("hfcim1", 10, 18);
    HorrorFilm hfilm2 = new HorrorFilm("hfcim2", 30, 18);
    HorrorFilm hfilm3 = new HorrorFilm("hfcim3", 20, 16);
    HorrorFilm hfilm4 = new HorrorFilm("hfcim4", 15, 16);
    HorrorFilm hfilm5 = new HorrorFilm("hfcim5", 25, 18);
    HorrorFilm hfilm6 = new HorrorFilm("hfcim6", 35, 18);

    ArrayList<Film> filmek = new ArrayList<>();
    Collections.addAll(filmek, film1, film2, film3, film4, film5, film6, hfilm1, hfilm2, hfilm3, hfilm4, hfilm5, hfilm6);

    for (Film film : filmek) {
      System.out.println(film);
    }
    
    // rendezett kiiratas
    filmek.sort((f1, f2) -> Integer.compare(f1.getAr(), f2.getAr()));
    System.out.println("\nAr szerint rendezett:");
    for (Film film : filmek) {
      System.out.println(film);
    }

    // korhataros filmek kiiratasa
    ArrayList<IKhorhataros> khfilmek = new ArrayList<>(); 
    for (Film film : filmek) {
      if (film instanceof HorrorFilm) {
        khfilmek.add((IKhorhataros) film);
      }
    }
    System.out.println("\nKorhataros filmek: ");
    for (IKhorhataros film : khfilmek) {
      System.out.println(film);
    }

    int buntetes = osszBuntetes(17, khfilmek);
    System.out.println("\nOsszbuntetes: " + buntetes);
  }
}
