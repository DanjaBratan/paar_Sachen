package nixda.zeugs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams_beispiel {

    List<Integer> meineZahlen = Arrays.asList(1, 2, 3, 4, 5, 8, 10); //Liste (veränderbare Größe) von Zahlen
    Stream<Integer> ZahlenStream = meineZahlen.stream(); //Zahlen Stream (Fließbahn/Strom) erstellen

    String[] meineWorter = {"Shalom", "my", "friends"}; //Stringarray
    Stream<String> WorterStream = Stream.of(meineWorter); //Wörter Stream erstellen
    //oder: Stream<String> WorterStream = Arrays.stream(meineWorter);

    IntStream buchstaben = "Hallo Welt".chars(); //Intstream der Buchstaben

    List<String> zeilen = Arrays.asList("ich", "mache", "keinen", "Stress"); //Arrayliste
    List<String> ergebniszeilen = zeilen.stream() //konvertiert liste zu einem Stream
            .filter(line -> !"keinen".equals(line)) // das Wort rausfiltern
            .collect(Collectors.toList()); // nimmt ergebnisse raus und konvertiert zu einer Liste

}
