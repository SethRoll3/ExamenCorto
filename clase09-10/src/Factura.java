import java.time.LocalDate;
import java.util.List;

public record Factura (

        int id,
        String cliente,
        LocalDate fecha,
        List<DetalleDeFactura> detalles
){

    public double total(){

        return detalles.stream()
                .mapToDouble(DetalleDeFactura::subtotal)
                .sum();

    }

}