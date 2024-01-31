public class RagnaRock {
    private int aforo;

    public RagnaRock() {
        aforo = 0;
    }
    public synchronized void permitirEntrada() {
        int aforoMaximo = 10;
        if (aforo < aforoMaximo) {
            aforo++;
            System.out.println("Entró un cliente. Aforo actual: " + aforo);
        } else {
            System.out.println("Aforo máximo alcanzado. No se permite la entrada.");
        }
    }
    public synchronized void permitirSalida() {
        if (aforo > 0) {
            aforo--;
            System.out.println("Salió un cliente. Aforo actual: " + aforo);
        }
    }

}