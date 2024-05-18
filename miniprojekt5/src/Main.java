import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    Hallgato hallgato = new Hallgato("Nagy", "Elemer");
    hallgato.ujBejegyzes( new Jegy("Matek", 10));
    hallgato.ujBejegyzes( new Jegy("Matek", 8));
    hallgato.ujBejegyzes( new Jegy("Roman", 7));
    hallgato.ujBejegyzes( new Jegy("Roman", 8));
    hallgato.ujBejegyzes( new Jegy("Magyar", 9));
    hallgato.listazas();

    Naplo naplo = new Naplo("./src/hallgatok.csv");
    naplo.listazNezek();

    try (BufferedReader br = new BufferedReader(new FileReader("./src/jegyek.csv"))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        for (Hallgato h : naplo.hallgatok) {
          if (h.getID() == Integer.parseInt(values[0])) {
            h.ujBejegyzes(new Jegy(values[1], Integer.parseInt(values[2])));
          }
        }
      }
    }

    naplo.listazHallgatoiAdatok();
  }
}
