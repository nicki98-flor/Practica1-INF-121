public class Computadora {
    private String cpu, ram, discoDuro;
    private String sistemaOperativo;
    private boolean encendida;

    public Computadora() 
    {
        this.cpu = "Intel Core i7";
        this.ram = "16GB DDR4";
        this.discoDuro = "1TB SSD";
        this.sistemaOperativo = "Windows 10";
        this.encendida = false;  
    }

    public void encender() 
    {
        if (!encendida) 
        {
            encendida = true;
            System.out.println("La computadora ha sido encendida.");
        } 
        else
            System.out.println("La computadora ya esta encendida.");
    }

    public void apagar() 
    {
        if (encendida) 
        {
            encendida = false;
            System.out.println("La computadora ha sido apagada.");
        } 
        else
            System.out.println("La computadora ya está apagada.");
    }

    public void mostrarEstado() 
    {
        if (encendida) 
        {
            System.out.println("La computadora esta encendida.");
        } 
        else
            System.out.println("La computadora esta apagada.");
    }

    public void mostrarComponentes() {
        System.out.println("Componentes de la computadora:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Disco Duro: " + discoDuro);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora c1= new Computadora();

        System.out.println("------------COMPONENTES DE LA COMPUTADORA----------");
        c1.mostrarComponentes();

        System.out.println("------------ESTADO DE LA COMPUTADORA---------------");
        c1.mostrarEstado();

        System.out.println("------------ENCENDIDIO DE LA COMPUTADORA-----------");
        c1.encender();
        c1.mostrarEstado();  

        System.out.println("------------APAGADO DE LA COMPUTADORA--------------");
        c1.apagar();
        c1.mostrarEstado();  
    }
}