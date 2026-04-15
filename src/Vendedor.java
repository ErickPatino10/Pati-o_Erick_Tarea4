public class Vendedor {
    public String nombre;
    public String area;
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimientoMeta;

    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimientoMeta) {
        this.nombre = nombre;
        this.area = area;
        this.setMontoVendido(montoVendido);
        this.setPorcentajeComision(porcentajeComision);
        this.setCumplimientoMeta(cumplimientoMeta);
    }

    public double getMontoVendido() {
        return this.montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        if (montoVendido >= (double)0.0F) {
            this.montoVendido = montoVendido;
        } else {
            System.out.println("Monto invalido. No puede ser negativo");
        }

    }

    public double getPorcentajeComision() {
        return this.porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        if (porcentajeComision >= (double)0.0F && porcentajeComision <= (double)100.0F) {
            this.porcentajeComision = porcentajeComision;
        } else {
            System.out.println("Error: Comisión inválida");
        }

    }

    public double getCumplimientoMeta() {
        return this.cumplimientoMeta;
    }

    public void setCumplimientoMeta(double cumplimientoMeta) {
        if (cumplimientoMeta >= (double)0.0F && cumplimientoMeta <= (double)100.0F) {
            this.cumplimientoMeta = cumplimientoMeta;
        } else {
            System.out.println("Error: Cumplimiento inválido");
        }

    }

    public double calcularComision() {
        return this.montoVendido * (this.porcentajeComision / (double)100.0F);
    }

    public double calcularIngresoTotal() {
        return this.montoVendido + this.calcularComision();
    }

    public String obtenerEstadoCumplimiento() {
        if (this.cumplimientoMeta >= (double)90.0F) {
            return "Exelente";
        } else {
            return this.cumplimientoMeta >= (double)70.0F ? "Aceptable" : "Bajo";
        }
    }

    public String mensajeDesempenio() {
        if (this.cumplimientoMeta >= (double)90.0F) {
            return "Vendedor con cumplimiento sobresaliente";
        } else {
            return this.cumplimientoMeta >= (double)70.0F ? "Vendedor con cumplimiento aceptable" : "Se requiere seguimiento comercial";
        }
    }

    void mostrarResumen() {
        System.out.println("\n--- Reporte ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Area: " + this.area);
        System.out.println("Monto vendido: " + this.montoVendido);
        System.out.println("Comision: " + this.calcularComision());
        System.out.println("Ingreso Total: " + this.calcularIngresoTotal());
        System.out.println("Estado: " + this.obtenerEstadoCumplimiento());
        System.out.println("Mensaje: " + this.mensajeDesempenio());
        System.out.println("========================================");
    }
}
