package nixda.zeugs;

public class Runable_sache implements Runnable {

    int counter = 0;

    public void run() {

        do { //schleife

            System.out.println(Thread.currentThread().getName()); //ausgabe des jetzigen Threads
            Thread.yield(); //anderer Thread gestartet
            counter = counter + 1; //counter+1

        } while (counter != 5); //schleife beenden

    }

}
