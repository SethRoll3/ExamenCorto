public record DetalleDeFactura (

        Producto producto,
        int cantidad,
        double precioUnitario

){

    public double subtotal(){
        return cantidad * precioUnitario;
    }

}