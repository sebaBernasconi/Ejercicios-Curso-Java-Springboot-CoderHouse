import com.coderhouse.ejercicioDiez.model.Circulo;

public class TestEjercicioDiez {

    public static void main(String[] args) {
        Circulo c = new Circulo(90);

        c.calcularArea();
        System.out.println();
        c.calcularCircunferencia();
    }
}
