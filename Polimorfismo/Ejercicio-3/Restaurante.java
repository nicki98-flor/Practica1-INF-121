public class Restaurante {
    public static void main(String[] args) {
        // TODO code application logic here
        Cocinero c1 = new Cocinero("Carlos", 2500, 10, 15);
        Mesero m1 = new Mesero("Luis", 1800, 5, 12, 200);
        Mesero m2 = new Mesero("Ana", 1700, 8, 12, 150);
        Administrativo a1 = new Administrativo("Marta", 3000, "Gerente");
        Administrativo a2 = new Administrativo("Pedro", 2500, "Supervisor");

        System.out.println("----------------Calculo de sueldos totales--------------");
        c1.sueldoTotal();
        m1.sueldoTotal();
        m2.sueldoTotal();
        a1.sueldoTotal();
        a2.sueldoTotal();

        float x = 2500;
        System.out.println("--------------------------------------------------------");
        System.out.println("Empleados con sueldo igual a " + x + ":");
        if (c1.getSueldoMes() == x) c1.mostrar();
        if (m1.getSueldoMes() == x) m1.mostrar();
        if (m2.getSueldoMes() == x) m2.mostrar();
        if (a1.getSueldoMes() == x) a1.mostrar();
        if (a2.getSueldoMes() == x) a2.mostrar();
    }
}

class Cocinero {
    private String nombre;
    private float sueldoMes, sueldoHora;
    private int horasExtra;

    public Cocinero(String nombre, float sueldoMes, int horasExtra, float sueldoHora) 
    {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public void sueldoTotal() 
    {
        float total = sueldoMes + (horasExtra * sueldoHora);
        System.out.println(nombre+" es Cocinero y su "+"sueldo total es: " + total);
    }

    public float getSueldoMes() 
    {
        return sueldoMes;
    }

    public void mostrar() 
    {
        System.out.println("Nombre: " + nombre + ", Sueldo: " + sueldoMes);
    }
}

class Mesero {
    private String nombre;
    private float sueldoMes, sueldoHora, propina;
    private int horasExtra;
    
    public Mesero(String nombre, float sueldoMes, int horasExtra, float sueldoHora, float propina) 
    {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public void sueldoTotal() 
    {
        float total = sueldoMes + (horasExtra * sueldoHora) + propina;
        System.out.println(nombre+" es Mesero y su" + " sueldo total es: " + total);
    }

    public float getSueldoMes() 
    {
        return sueldoMes;
    }

    public void mostrar() 
    {
        System.out.println("Nombre: " + nombre + ", Sueldo: " + sueldoMes);
    }
}

class Administrativo {
    private String nombre, cargo;
    private float sueldoMes;

    public Administrativo(String nombre, float sueldoMes, String cargo) 
    {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public void sueldoTotal() 
    {
        System.out.println(nombre +" es Adiministrativo y su"+" sueldo total es: " + sueldoMes);
    }

    public float getSueldoMes() 
    {
        return sueldoMes;
    }

    public void mostrar() 
    {
        System.out.println("Nombre: " + nombre + ", Sueldo: " + sueldoMes + ", Cargo: " + cargo);
    }
}