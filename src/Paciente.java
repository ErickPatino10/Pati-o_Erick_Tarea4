public class Paciente {
    public String nombre;
    public String id;
    private String tipoSeguro;
    private int edad;
    private double costoConsultas;
    private int numeroConsultas;
    private int prioridad;

    public Paciente(String nombre, String id, String tipoSeguro, int edad, double costoConsultas, int numeroConsultas, int prioridad) {
        this.nombre = nombre;
        this.id = id;
        this.setTipoSeguro(tipoSeguro);
        this.setEdad(edad);
        this.setCostoConsultas(costoConsultas);
        this.setNumeroConsultas(numeroConsultas);
        this.setPrioridad(prioridad);
    }

    public String getTipoSeguro() {
        return this.tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida");
        }

    }

    public double getCostoConsultas() {
        return this.costoConsultas;
    }

    public void setCostoConsultas(double costoConsultas) {
        if (costoConsultas > (double)0.0F) {
            this.costoConsultas = costoConsultas;
        } else {
            System.out.println("Costo invalido");
        }

    }

    public int getNumeroConsultas() {
        return this.numeroConsultas;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        } else {
            System.out.println("Numero de consultas invalido");
        }

    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad <= 5) {
            this.prioridad = prioridad;
        } else {
            System.out.println("Prioridad inválida");
        }

    }

    public double calcularCostoTotal() {
        return this.costoConsultas * (double)this.numeroConsultas;
    }

    public double calcularDescuento() {
        double total = this.calcularCostoTotal();
        if (this.tipoSeguro.equals("Basico")) {
            return total * 0.1;
        } else {
            return this.tipoSeguro.equals("Premium") ? total * 0.2 : (double)0.0F;
        }
    }

    public double costoFinal() {
        return this.calcularCostoTotal() - this.calcularDescuento();
    }

    public String clasificacion() {
        if (this.prioridad >= 4) {
            return "Alta prioridad";
        } else {
            return this.prioridad >= 2 ? "Prioridad media" : "Prioridad baja";
        }
    }

    public String mensaje() {
        if (this.prioridad >= 4) {
            return "Atención inmediata requerida";
        } else {
            return this.prioridad >= 2 ? "Seguimiento necesario" : "Control regular";
        }
    }

    public void mostrarReporte() {
        System.out.println("\n----- REPORTE PACIENTE -----");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.id);
        System.out.println("Seguro: " + this.tipoSeguro);
        System.out.println("Edad: " + this.edad);
        System.out.println("Consultas: " + this.numeroConsultas);
        System.out.println("Costo total: " + this.calcularCostoTotal());
        System.out.println("Descuento: " + this.calcularDescuento());
        System.out.println("Costo final: " + this.costoFinal());
        System.out.println("Clasificación: " + this.clasificacion());
        System.out.println("Mensaje: " + this.mensaje());
        System.out.println("========================================");
    }
}