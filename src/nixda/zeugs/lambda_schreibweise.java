package nixda.zeugs;

public class lambda_schreibweise {

    public void lampda_schreibweise() {
        Mathe addieren = (int a, int b) -> a + b; //nicht benutzt

        System.out.println(addieren.funktion(5,2)); //nicht benutzt
    }

    interface Mathe { //interface
        int funktion(int a, int b); //funktion hier drin
    }


    public int mach() {
        //Mathe addieren = (int a, int b) -> a + b;
        Mathe multiplizieren = (int a, int b) -> a * b;

        return (multiplizieren.funktion(5,2));
    }
}
