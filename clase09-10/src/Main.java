void main() {
    List<Producto> productos = DatosPrueba.PRODUCTOS;
    /*productos.stream().forEach(System.out::println);
    productos.stream().forEach(p -> System.out.println(p.nombre()));
    productos.stream().filter(p -> p.precio()>300).forEach(System.out::println);
    productos.stream().filter(p -> p.stock()>0).filter(p -> p.precio()>300).forEach(System.out::println);
    //El map es para transformar
    productos.stream()
            .map(p -> p.nombre() + " - Q" + p.precio())
            .forEach(System.out::println);*/


    /*productos.stream()
            .filter(p -> p.stock() > 0)
            .map(p -> p.nombre().toUpperCase())
            .forEach(System.out::println);*/



    //Ejercicio 2
    //Ordenar los objectos de productos del precio más bajo al más alto
    //Metodo por referecia Producto :: precio
    /*productos.stream()
            .sorted(Comparator.comparing(Producto :: precio).reversed()).forEach(producto -> System.out.println("Precio: " + producto.precio()));*/


    // Ejercicio3: Ordenar por stock descendente. Si hay empate, por menor precio.
    productos.stream()
            .sorted(
                    Comparator.comparing(Producto::stock, Comparator.reverseOrder())
                            .thenComparing(Producto::precio)
            )
            .forEach(System.out::println);
    //Ejercicio4Arroz
    double totalInventario = DatosPrueba.PRODUCTOS.stream().mapToDouble(p -> p.precio()*p.stock()).sum();
    System.out.println("TOTAL INVENTARIO: " + totalInventario);

    //Ejercicio5Arroz
    DatosPrueba.FACTURAS.forEach
            (factura ->
            {double total = factura.detalles().stream()
                    .mapToDouble(DetalleDeFactura::subtotal).sum();
                System.out.println("TOTAL FACTURA Q: " + total);
    });

}




