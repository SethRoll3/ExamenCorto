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


    productos.stream()
            .filter(p -> p.stock() > 0)
            .map(p -> p.nombre().toUpperCase())
            .forEach(System.out::println);
}

