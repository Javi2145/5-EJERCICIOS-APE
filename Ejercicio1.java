class Autor {
    String nombre;
    String nacionalidad;

    Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
}

class Libro {
    String titulo;
    int anio;
    Autor autor;

    Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Autor: " + autor.nombre);
        System.out.println("-----------------");
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("Miguel de Cervantes", "Española");

        Libro l1 = new Libro("Cien años de soledad", 1967, a1);
        Libro l2 = new Libro("Don Quijote de la Mancha", 1605, a2);

        l1.mostrarInformacion();
        l2.mostrarInformacion();
    }
}