
public class Main {
     public static void main (String[]args){
         Vendedor vendedor1 = new Vendedor("Mateo Viera", "Tecnologia", (double) 2850.75F, (double) 8.0F, (double) 92.0F);
         vendedor1.mostrarResumen();
         Paciente p = new Paciente("Carlos Pérez", "0102030405", "Premium", 45, (double)25.5F, 3, 4);
         p.mostrarReporte();
     }
}