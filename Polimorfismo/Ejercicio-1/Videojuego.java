public class Videojuego {
    private String nombre, plataforma;
    private int cantidadJugadores;
    
    public Videojuego(String nombre, String plataforma)
    {
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadJugadores=2;
    }
    
    public Videojuego(String nombre, String plataforma, int cantidadJugadores)
    {
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadJugadores=cantidadJugadores;
    }
    
    public void mostrar()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Jugadores: "+cantidadJugadores);
    }
    
    public void agregarJugador()
    {
        this.cantidadJugadores+=1;
    }
    
    public void agregarJugador(int cantidad)
    {
        this.cantidadJugadores+=cantidad;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Videojuego v1=new Videojuego("It takes two", "PC");
        Videojuego v2=new Videojuego("FIFA 24", "PS5", 5);
        
        System.out.println("----------ANTES DE AGREGAR JUGADORES----------");
        v1.mostrar();
        v2.mostrar();
        
        v1.agregarJugador();
        v2.agregarJugador(3);
        
        System.out.println("----------DESPUES DE AGREGAR JUGADORES--------");
        v1.mostrar();
        v2.mostrar();
    }  
}