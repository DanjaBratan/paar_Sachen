package nixda.zeugs;

public class Main {

    public static void main(String[] args) {

        exceptions esache = new exceptions();
        esache.methode1(); //alle exceptions aufeinmal
        esache.methode2(); //exception ruft vorherige Methode auf


        //interface_beispiel isache = new interface_beispiel(); //objekt
        interface_beispiel.InnereKlasse iisache = new interface_beispiel.InnereKlasse(); //innere Klasse
        int c = iisache.addition(); //methodenauruf ausrechnen
        System.out.println(c); //ausgabe
        System.out.println(" ");


        lambda_schreibweise lsache = new lambda_schreibweise(); //objekt
        int a = lsache.mach(); //methodenauruf ausrechnen
        System.out.println(a); //ausgabe
        System.out.println(" ");


        System.out.println(Beispiel_Enumeration.Kaiser); //Enumeration Ausgabe
        System.out.println(Beispiel_Enumeration.King.name()); //Enumeration Ausgabe
        System.out.println(Beispiel_Enumeration.valueOf("Feldmarschall").name()); //Enumeration Ausgabe
        System.out.println(Beispiel_Enumeration.gibkaiser()); //methode der Enumeration
        System.out.println(" ");


        Multithread_Reihe msache = new Multithread_Reihe(); //objekt
        msache.ThreadKollege(); //fange mit Multithreading an
        System.out.println(" ");


        Runable_sache rsache = new Runable_sache(); //objekt (falsch geschrieben)
        rsache.run(); //threading beginnen
        System.out.println(" ");


        streams_beispiel ssache = new streams_beispiel(); //objekt
        ssache.buchstaben.forEach(d -> System.out.println("Mein INTBuchstabenstream: "+ d)); //gib den Wert des Buchstabens aus
        ssache.WorterStream.forEach(m -> System.out.println("Mein Wörterstream: "+ m)); //gibt die Wörter des Streams aus
        ssache.ZahlenStream.forEach(z -> System.out.println("Mein Zahlenstream: "+ z)); //gibt die Zahlen des Streams aus
        ssache.ergebniszeilen.forEach(System.out::println); //gibt die Wörter aus mit Filter
        System.out.println(" ");


        vararg_mehrereVariablen vsache = new vararg_mehrereVariablen(); //objekt
        System.out.println(vsache.durchschnitt(1,2,4,6,19)); //ausgabe des Durchschnittes
        System.out.println(" ");


        Tasche los = new Tasche("hey");
        System.out.println(los.value);
        los.value = "Danja";
        System.out.println(los.value);
        Tasche<String> stringTasche = new Tasche<String>("BRAAAA");
        System.out.println(stringTasche.value);

    }


}
