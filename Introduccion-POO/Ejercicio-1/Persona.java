public class Persona {
    private String nombre, cuidad;
    private int edad;

    public Persona(String nombre, String cuidad, int edad) {
        this.nombre = nombre;
        this.cuidad = cuidad;
        this.edad = edad;
    }
    
    public void Saludo()
    {
        System.out.println("Hola, soy "+nombre+" de "+cuidad);
    }
    
    public void Esmayor()
    {
        if(edad > 18)
        {
            System.out.println("Si es mayor y tiene "+edad+" anos");
        }
        else
            System.out.println("No es mayor de edad y tiene "+edad+" anos");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona("David", "Bogota", 32);        
        Persona p2=new Persona("Roxana", "Buenos Aires", 15);
        Persona p3=new Persona("Rai", "La Paz", 22);
        
        System.out.println("---------------Lista de Personas------------");
        p1.Saludo();
        p2.Saludo();
        p3.Saludo();
        
        System.out.println("--------------Quien es mayor?----------------");
        p1.Esmayor();
        p2.Esmayor();
        p3.Esmayor();
    }
    
}