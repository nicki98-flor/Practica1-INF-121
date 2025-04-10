public class Animales {
    public static void main(String[] args) {
        // TODO code application logic here
         Perro perro = new Perro("Firulais", 5, "Labrador");
        Gato gato = new Gato("Misu", "Blanco");
        Pajaro pajaro = new Pajaro("Piolin", "Canario");

        System.out.println("-----------------SONIDOS-------------");
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();
        
        System.out.println("-----------------SONIDOS SOBRECARGA-------------");
        perro.hacerSonido("feliz");
        gato.hacerSonido("enojado");
        pajaro.hacerSonido("mañana");

        System.out.println("-----------------MOVIMIENTOS------------");
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
    
}
class Perro {
    String nombre, raza;
    int edad;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    public void hacerSonido(String estado) {
        if (estado.equalsIgnoreCase("enojado")) {
            System.out.println(nombre + " gruñe: Grrrr...");
        } 
        else 
            if (estado.equalsIgnoreCase("feliz")) {
                System.out.println(nombre + " ladra feliz: Guau guau guau!");
            } 
            else {
                hacerSonido();
        }
    }

    public void moverse() {
        System.out.println(nombre + " esta corriendo.");
    }
}
class Gato {
    String nombre, color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }

    public void hacerSonido(String estado) {
        if (estado.equalsIgnoreCase("enojado")) {
            System.out.println(nombre + " dice: Hssss!");
        } 
        else 
            if (estado.equalsIgnoreCase("contento")) {
                System.out.println(nombre + " ronronea: Purrr...");
            } 
            else {
                hacerSonido();
        }
    }

    public void moverse() {
        System.out.println(nombre + " esta saltando.");
    }
}
class Pajaro {
    String nombre, tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    public void hacerSonido(String momento) {
        if (momento.equalsIgnoreCase("mañana")) {
            System.out.println(nombre + " canta: Trino trinooo!");
        } 
        else {
            hacerSonido();
        }
    }

    public void moverse() {
        System.out.println(nombre + " esta volando.");
    }
}