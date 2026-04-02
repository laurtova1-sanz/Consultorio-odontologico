class Odontologo extends Personal {
    private String especialidad;
    private int consultorio;
    private String historial;

    Odontologo() {
        super();
        this.especialidad = "None";
        this.consultorio = 0;
        this.historial = "";
    }

    Odontologo(String nombre_, int documento_, char genero_, long telefono_, int edad_,
               String especialidad_, int consultorio_) {
        super(nombre_, documento_, genero_, telefono_, edad_);
        this.especialidad = especialidad_;
        this.consultorio = consultorio_;
        this.historial = "";
    }

    void setEspecialidad(String especialidad_) { this.especialidad = especialidad_; }
    void setConsultorio(int consultorio_) { this.consultorio = consultorio_; }

    String getEspecialidad() { return this.especialidad; }
    int getConsultorio() { return this.consultorio; }

    void verHistorialPaciente() {
        System.out.println("Historial: " + this.historial);
    }

    void crearHistorial(String info_) {
        this.historial = info_;
        System.out.println("Historial creado correctamente");
    }

    void show() {
        super.show();
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Consultorio: " + this.consultorio);
    }
}
