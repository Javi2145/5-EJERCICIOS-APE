class Usuario {
    String nombre;
    String cedula;

    Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}

class Libro {
    String titulo;
    boolean disponible;

    Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    void devolver() {
        disponible = true;
    }
}

class Prestamo {
    Usuario usuario;
    Libro libro;

    Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo exitoso: " + usuario.nombre
                    + " (CI " + usuario.cedula + ") se llevó \"" + libro.titulo + "\".");
        } else {
            System.out.println("No disponible: \"" + libro.titulo
                    + "\" ya está prestado. " + usuario.nombre + " no pudo realizar el préstamo.");
        }
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Libro libro = new Libro("Clean Code");
        Usuario u1 = new Usuario("Carlos", "1800000001");
        Usuario u2 = new Usuario("María", "1800000002");

        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);

        p1.registrar();  // exitoso
        p2.registrar();  // falla: el mismo libro ya está prestado
    }
}