import com.coderhouse.ejercicioCuatro.model.Rectangulo;

public class TestEjercicioCuatro {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(6,4); //instanciando el objeto

        r.calcularArea();
        System.out.println();
        r.calcularPerimetro();
    }
}
