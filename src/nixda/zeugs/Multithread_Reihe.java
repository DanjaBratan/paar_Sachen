package nixda.zeugs;

public class Multithread_Reihe extends Thread{

    public void run() {
        System.out.println("Thread läuft ha");
    }


    public void ThreadKollege() {
        Multithread_Reihe erschaffeObjekt = new Multithread_Reihe();

        Thread t1 = new Thread(erschaffeObjekt); //threads erschaffen
        Thread t2 = new Thread(erschaffeObjekt);

        //starte Thread 1
        t1.start(); //run Thread

        System.out.println(t1.isAlive()); //läuft true

        t1.interrupt(); //beende Thread

        //starte Thread 2
        t2.start(); //run thread

        System.out.println(t2.isAlive()); //läuft true

        t2.interrupt(); //beende Thread

    }

}
