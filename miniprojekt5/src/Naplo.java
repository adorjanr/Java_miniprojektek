import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Naplo {
  public ArrayList<Hallgato> hallgatok = new ArrayList<>();

  public Naplo(String path) throws FileNotFoundException, IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        hallgatok.add(new Hallgato(values[0], values[1]));
      }
    }
  }

  public void listazNezek() {
    for (Hallgato hallgato : hallgatok) {
      System.out.println(hallgato.getID() + ". " + hallgato.getVEZETEKNEV() + " " + hallgato.getKERESZTNEV());
    }
  }

  public void ujJegy(int id, Jegy jegy) {
    for (Hallgato hallgato : hallgatok) {
      if (hallgato.getID() == id) {
        hallgato.ujBejegyzes(jegy);
        break;
      }
    }
  }

  public void listazHallgatoiAdatok() {
    for (Hallgato hallgato : hallgatok) {
      System.out.println(hallgato.getVEZETEKNEV() + " " + hallgato.getKERESZTNEV());
      ArrayList<String> targyak = hallgato.getTantargyak();
      for (int i = 0; i < targyak.size(); i++) {
        System.out.printf("\t%s: %.1f\n", targyak.get(i), hallgato.tantargyAtlag(targyak.get(i)));
    }
    }
  }
}
