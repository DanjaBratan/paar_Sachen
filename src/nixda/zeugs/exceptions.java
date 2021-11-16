package nixda.zeugs;

public class exceptions {

    public void methode1 (){
        try {
            //behinderter Aufruf
        }
        catch (NullPointerException n) { //runtime exception
            n.printStackTrace();
        }
        catch (RuntimeException r) {
            r.printStackTrace();
        }
        //catch (IOException i) {
        //    i.printStackTrace();
        //}
        catch (Exception e) { //subklasse von throwable
            e.printStackTrace();
        }
        catch (Throwable t) { //fehler und alles ähnliche
            t.printStackTrace();
        }
        finally {
            //auf jeden fall ausführen
        }
    }

    public void methode2 () {

        try {
            methode3();
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public void methode3 () throws RuntimeException { //bei exception geht wieder in methode2 zurück
        //if (a>b) throw new IllegalArgumentException("Ausgabe"); //eigene fehler
        //erledige das dies
    }



    //Hierarchie: Throwable ist King und darunter sind Error und Exception

}
