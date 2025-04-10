public class Celular {
    private String[] aplicaciones; 
    private int espacioDisponible, bateria, cantidadAplicaciones; 

    public Celular() 
    {
        this.aplicaciones = new String[20];  
        this.espacioDisponible = 1024;  
        this.bateria = 100;  
        this.cantidadAplicaciones = 0;  
    }

    public boolean instalarAplicacion(String nombre, int tamaño) 
    {
        if (cantidadAplicaciones < 20 && espacioDisponible >= tamaño) 
        {
            aplicaciones[cantidadAplicaciones] = nombre;
            cantidadAplicaciones++;
            espacioDisponible -= tamaño;  
            System.out.println("Aplicacion " + nombre + " instalada con exito.");
            return true;
        } 
        else {
            System.out.println("No se puede instalar la aplicacion. Espacio insuficiente o ya tienes 20 aplicaciones.");
            return false;
        }
    }

    public void usarAplicacion(int minutosUso, int tamañoAplicacion) 
    {
        if (bateria <= 0) 
        {
            System.out.println("Celular apagado. No hay batería suficiente.");
            return;
        }
        double porcentajeBateria = 0;
        if (tamañoAplicacion > 250) 
        {
            porcentajeBateria = 5;  
        } 
        else
            if (tamañoAplicacion > 100) 
            {
            porcentajeBateria = 2;  
            } 
            else {
            porcentajeBateria = 1;  
            }
        int bloquesDe10Minutos = minutosUso / 10;
        double consumoTotal = porcentajeBateria * bloquesDe10Minutos;

        bateria -= consumoTotal;
        if (bateria < 0) 
        {
            bateria = 0; 
        }
        System.out.println("Has usado la aplicacion durante " + minutosUso + " minutos.");
    }

    public void mostrarBateria() {
        System.out.println("Bateria restante: " + bateria + "%");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Celular miCelular = new Celular();
        
        System.out.println("-------------INTALACION DE APLICACIONES------------");
        miCelular.instalarAplicacion("WhatsApp", 100); 
        miCelular.instalarAplicacion("Instagram", 200);
        miCelular.instalarAplicacion("Spotify", 300); 
        
        System.out.println("-------------USO DE APLICACIONES Y BATERIA----------");
        miCelular.usarAplicacion(30, 100); 
        miCelular.mostrarBateria();  

        miCelular.usarAplicacion(60, 200); 
        miCelular.mostrarBateria();  

        miCelular.usarAplicacion(10, 300); 
        miCelular.mostrarBateria();  
    }
}