public class Coche {
    private String marca, modelo;
    private int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public void Acelerar()
    {
        this.velocidad=this.velocidad+10;
        System.out.println("La velocidad es: "+this.velocidad);
    }
    
    public void Frenar()
    {
        this.velocidad=this.velocidad-5;
        System.out.println("La velocidad es: "+this.velocidad);
    }
    
    public void mostrar()
    {
        System.out.println("El auto es: "+marca);
        System.out.println("El modelo es: "+modelo);
        System.out.println("Su velocidad es: "+velocidad);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Coche c1=new Coche("Hyundai", "Creta 2019", 190);
        Coche c2=new Coche("Toyota", "Toyota Hilux", 175);
        
        System.out.println("----------AUTOS ACELERADOS----------");
        c1.Acelerar();
        c2.Acelerar();
        
        System.out.println("----------AUTOS FRENADOS------------");
        c1.Frenar();
        c2.Frenar();
        
        System.out.println("---------LOS AUTOS SON--------------");
        c1.mostrar();
        c2.mostrar();
    }
    
}