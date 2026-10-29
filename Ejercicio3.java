class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    boolean reducirStock(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            return true;
        }
        System.out.println("Stock insuficiente.");
        return false;
    }

    void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

class Venta {
    int cantidad;

    Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.precio;
            System.out.println("Total a pagar: $" + total);
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Producto p = new Producto("Mouse", 12.5, 10);
        p.mostrarProducto();

        Venta v1 = new Venta(3);
        v1.aplicar(p);
        p.mostrarProducto();

        Venta v2 = new Venta(8);
        v2.aplicar(p);
        p.mostrarProducto();
    }
}