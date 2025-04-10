public class Universidad {
    public static void main(String[] args) {
        // TODO code application logic here
        Oficina oficina1 = new Oficina(4, 2, 3);
        Oficina oficina2 = new Oficina(5, 3, 2);

        Aula aula1 = new Aula("A101", 30, 30);
        Aula aula2 = new Aula("B202", 25, 25);

        Laboratorio lab = new Laboratorio("Lab Computacion", 20, 10, 20);

        System.out.println("-----------------OFICINAS----------------");
        System.out.println("Oficina tiene: " + oficina1.cantidadMuebles(4, 3, 2));

        oficina2.mostrar();
        System.out.println("Total muebles: " + oficina2.cantidadMuebles());

        System.out.println("--------------------AULAS----------------------");
        aula1.mostrar();
        System.out.println("Total muebles: " + aula1.cantidadMuebles());

        aula2.mostrar();
        System.out.println("Total muebles: " + aula2.cantidadMuebles());

        System.out.println("-----------------LABORATORIO-----------------");
        lab.mostrar();
        System.out.println("Total muebles: " + lab.cantidadMuebles());
    }
}
class Oficina {
    int nroSillas, nroEscritorios, nroEstanterias;

    public Oficina(int sillas, int escritorios, int estanterias) {
        this.nroSillas = sillas;
        this.nroEscritorios = escritorios;
        this.nroEstanterias = estanterias;
    }

    public void mostrar() {
        System.out.println("Sillas: " + nroSillas);
        System.out.println("Escritorios: " + nroEscritorios);
        System.out.println("Estanterias: " + nroEstanterias);
    }

    public int cantidadMuebles(int sillas, int escritorios, int estanterias) {
        return sillas + escritorios + estanterias;
    }

    public int cantidadMuebles() {
        return cantidadMuebles(nroSillas, nroEscritorios, nroEstanterias);
    }
}
class Aula {
    String nombre;
    int capacidad, nroPupitres;

    public Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }

    public void mostrar() {
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nroPupitres);
    }

    public int cantidadMuebles(int pupitres) {
        return pupitres;
    }

    public int cantidadMuebles() {
        return cantidadMuebles(nroPupitres);
    }
}
class Laboratorio {
    String nombre;
    int capacidad, nroMesas, nroSillas;

    public Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }

    public void mostrar() {
        System.out.println("Laboratorio: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Mesas: " + nroMesas);
        System.out.println("Sillas: " + nroSillas);
    }

    public int cantidadMuebles(int mesas, int sillas) {
        return mesas + sillas;
    }
    
    public int cantidadMuebles() {
        return cantidadMuebles(nroMesas, nroSillas);
    }
}