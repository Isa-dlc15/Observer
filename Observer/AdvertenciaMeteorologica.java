package Observer;

public class AdvertenciaMeteorologica implements Observador {
    private static final int UMBRAL_ADVERTENCIA = 30;

    @Override
    public void actualizar(int temperatura) {
        if (temperatura > UMBRAL_ADVERTENCIA) {
            System.out.println("Advertencia la temperatura es mayor a " + UMBRAL_ADVERTENCIA + " grados");
        }
    }
}