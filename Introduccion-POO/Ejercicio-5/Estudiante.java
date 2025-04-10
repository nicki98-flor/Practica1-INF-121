public class Estudiante {
    private String nombre;
    private int nota1, nota2;

    public Estudiante(String nombre, int nota1, int nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public int Promedio()
    {
        int promedio=0;
        promedio=nota1+nota2/2;
        return promedio;
    }
    
    public void VerificarAprobacion()
    {
        if(this.Promedio()>=6)
        {
            System.out.println("El estudiante aprobo");
        }
        else
            System.out.println("El estudiante reprobo");
    }
    
    public void mostrar()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1=new Estudiante("Roxana", 0, 8);        
        Estudiante e2=new Estudiante("Erick", 3, 7);
        Estudiante e3=new Estudiante("Emanuel", 8, 6);
        
        e1.Promedio();
        e2.Promedio();
        e3.Promedio();
        
        System.out.println("-----------QUIEN APROBO?-----");
        e1.VerificarAprobacion();
        e2.VerificarAprobacion();
        e3.VerificarAprobacion();
        
        System.out.println("-----------ESTUDIANTES--------");
        e1.mostrar();
        e2.mostrar();
        e3.mostrar();
    }
    
}