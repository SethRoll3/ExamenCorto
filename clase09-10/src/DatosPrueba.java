import java.time.LocalDate;
import java.util.List;

public class DatosPrueba {

    public static final Categoria ELECTRONICA = new Categoria(1, "ELECTRONICA");
    public static final Categoria ALIMENTOS = new Categoria(2, "ALIMENTOS");
    public static final Categoria ROPA = new Categoria(3, "ROPA");

    public static final List<Producto> PRODUCTOS = List.of(

            new Producto(1, "Laptop", 6500.00, 8, ELECTRONICA),
            new Producto(2, "Mouse", 150.00, 30, ELECTRONICA),
            new Producto(3, "Teclado", 350.00, 15, ELECTRONICA),
            new Producto(4, "Monitor", 1800.00, 5, ELECTRONICA),
            new Producto(5, "Arroz", 25.00, 100, ALIMENTOS),
            new Producto(6, "Frijoles", 12.00, 80, ALIMENTOS),
            new Producto(7, "Camisa", 120.00, 20, ROPA),
            new Producto(8, "Pantalón", 250.00, 12, ROPA),
            new Producto(9, "Audífonos", 450.00, 0, ELECTRONICA),
            new Producto(10, "Galletas", 8.00, 0, ALIMENTOS)

    );

    public static final List<Factura> FACTURAS = List.of(
            new Factura(
                    1,
                    "Ana López",
                    LocalDate.of(2026, 10, 1),
                    List.of(
                            new DetalleDeFactura(PRODUCTOS.get(0), 1, 6500.00),
                            new DetalleDeFactura(PRODUCTOS.get(1), 2, 150.00),
                            new DetalleDeFactura(PRODUCTOS.get(4), 5, 25.00)
                    )
            ),
            new Factura(
                    2,
                    "Carlos Pérez",
                    LocalDate.of(2026, 10, 2),
                    List.of(
                            new DetalleDeFactura(PRODUCTOS.get(2), 1, 350.00),
                            new DetalleDeFactura(PRODUCTOS.get(6), 2, 120.00),
                            new DetalleDeFactura(PRODUCTOS.get(5), 3, 12.00)
                    )
            ),
            new Factura(
                    3,
                    "María García",
                    LocalDate.of(2026, 10, 3),
                    List.of(
                            new DetalleDeFactura(PRODUCTOS.get(3), 2, 1800.00),
                            new DetalleDeFactura(PRODUCTOS.get(8), 1, 450.00),
                            new DetalleDeFactura(PRODUCTOS.get(1), 1, 150.00)
                    )
            ),
            new Factura(
                    4,
                    "Pedro Díaz",
                    LocalDate.of(2026, 10, 3),
                    List.of(
                            new DetalleDeFactura(PRODUCTOS.get(0), 1, 6400.00),
                            new DetalleDeFactura(PRODUCTOS.get(7), 2, 250.00)
                    )
            )
    );

}