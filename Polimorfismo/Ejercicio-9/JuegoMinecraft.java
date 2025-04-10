public class JuegoMinecraft {
    public static void main(String[] args) {
        // TODO code application logic here
        BloqueCofre cofre1 = new BloqueCofre(50, 10, "Hierro");
        BloqueCofre cofre2 = new BloqueCofre(30, 8, "Madera");

        BloqueTnT tnt1 = new BloqueTnT("Explosiva", 100);
        BloqueTnT tnt2 = new BloqueTnT("Mega", 200);

        BloqueHorno horno1 = new BloqueHorno("Gris", 3);
        BloqueHorno horno2 = new BloqueHorno("Negro", 5);

        System.out.println("--------------ACCIONES-------------");
        cofre1.accion();
        cofre2.accion();

        tnt1.accion();
        tnt2.accion();

        horno1.accion();
        horno2.accion();

        System.out.println("--------------COLOCACIONES--------------");
        cofre1.colocar();
        cofre2.colocar("pared");

        tnt1.colocar();
        tnt2.colocar("pared");

        horno1.colocar();
        horno2.colocar("pared");

        System.out.println("---------------ROMPERRRR----------------");
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
    }
    
}
public class BloqueTnT {
    String tipo;
    int daño;

    public BloqueTnT(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("La TNT esta activada y lista para explotar.");
    }

    public void colocar() {
        System.out.println("BloqueTNT colocado en el suelo.");
    }

    public void colocar(String lugar) {
        System.out.println("BloqueTNT colocado en la " + lugar + ".");
    }

    public void romper() {
        System.out.println("BOOM! La TNT exploto causando " + daño + " de daño.");
    }
}
public class BloqueHorno {
    String color;
    int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("El horno esta cocinando alimentos. Capacidad: " + capacidadComida);
    }

    public void colocar() {
        System.out.println("BloqueHorno colocado en el suelo.");
    }

    public void colocar(String lugar) {
        System.out.println("BloqueHorno colocado en la " + lugar + ".");
    }

    public void romper() {
        System.out.println("El horno se rompio y dejo caer carbon.");
    }
}
public class BloqueCofre {
    int capacidad, resistencia;
    String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Se abre el cofre de tipo " + tipo + " con capacidad " + capacidad + ".");
    }

    public void colocar() {
        System.out.println("BloqueCofre colocado en el suelo.");
    }

    public void colocar(String lugar) {
        System.out.println("BloqueCofre colocado en la " + lugar + ".");
    }

    public void romper() {
        System.out.println("El cofre se rompio y todos los objetos se esparcieron.");
    }
}