public class Main {
    public static void main(String[] args) throws InterruptedException {

        RagnaRock club = new RagnaRock();
        Thread entrada1 = new Thread(new Entradas(club));
        Thread entrada2 = new Thread(new Entradas(club));
        Thread salida1 = new Thread(new Salida(club));
        Thread salida2 = new Thread(new Salida(club));


        entrada1.start();;
        entrada2.start();
        salida1.start();
        salida2.start();


    }
}
