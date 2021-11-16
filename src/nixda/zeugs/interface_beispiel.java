package nixda.zeugs;

public class interface_beispiel {


    public interface Inifa { //interface
        //Konstanten
        public int a = 1;
        public int b = 10;

        //Methodenkopf
        public abstract int addition();
    }


    //public interface_beispiel (){
        //InnereKlasse.add
    //}

    public static class InnereKlasse implements Inifa { //statistische Innere Klasse gliedert interface ein

        public int addition() {
            int c = a + b;
            return c;
        }

    }


}
