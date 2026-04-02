class Paciente {
    private String nombre;
    private int documento;
    private char genero;
    private long numeroTelefonico;
    private String historialMedico;

    Paciente() {
        this.nombre = "None";
        this.documento = 0;
        this.genero = ' ';
        this.numeroTelefonico = 0;
        this.historialMedico = "None";
    }

    Paciente(String nombre_, int documento_, char genero_, long numeroTelefonico_, int edad_,
             String historialMedico_) {
        this.nombre = nombre_;
        this.documento = documento_;
        this.genero = genero_;
        this.numeroTelefonico = numeroTelefonico_;
        this.historialMedico = historialMedico_;
    }

    void setNombre(String nombre_) { this.nombre = nombre_; }
    void setDocumento(int documento_) { this.documento = documento_; }
    void setGenero(char genero_) { this.genero = genero_; }
    void setNumeroTelefonico(long numeroTelefonico_) { this.numeroTelefonico = numeroTelefonico_; }
    void setHistorialMedico(String historialMedico_) { this.historialMedico = historialMedico_; }

    String getNombre() { return this.nombre; }
    int getDocumento() { return this.documento; }
    char getGenero() { return this.genero; }
    long getNumeroTelefonico() { return this.numeroTelefonico; }
    String getHistorialMedico() { return this.historialMedico; }

    void verCita(Cita cita_) {
        System.out.println("Paciente: " + this.nombre);
        System.out.println("Fecha: " + cita_.getFecha());
        System.out.println("Hora: " + cita_.getHora());
        System.out.println("Odontologo: " + cita_.getOdontologo().getNombre());
        System.out.println("Consultorio: " + cita_.getConsultorio().getNumero());
        System.out.println("Estado: " + cita_.getEstado());
    }

    void show() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Documento: " + this.documento);
        System.out.println("Genero: " + this.genero);
        System.out.println("Telefono: " + this.numeroTelefonico);
        System.out.println("Historial Medico: " + this.historialMedico);
    }
}
