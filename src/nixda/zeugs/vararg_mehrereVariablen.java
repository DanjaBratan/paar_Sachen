package nixda.zeugs;

public class vararg_mehrereVariablen {

    public double durchschnitt(double... array) { //endlose argumenten zahl einfügbar als array von doubles

        double zahlende;
        double summe = 0;

        for (double v : array) {
            summe = v + summe; //aufsummieren
        }
        zahlende = summe/array.length; //summe durch anzahl ist durchschnitt

        return zahlende;
    }
}
