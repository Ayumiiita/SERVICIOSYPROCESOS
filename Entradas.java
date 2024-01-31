import static java.lang.Thread.sleep;

class Entradas implements Runnable{

        private final RagnaRock club;
        public Entradas(RagnaRock club) {
            this.club = club;
        }

        @Override
        public synchronized void run() {
            while (true) {
                club.permitirEntrada();
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
class Salida implements Runnable {
        private final RagnaRock club;
        public Salida(RagnaRock club) {
            this.club = club;
        }

        @Override
        public synchronized void run() {
            while (true) {
                club.permitirSalida();
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

