class Asistente extends Personal {
    private String turno;

    Asistente() {
        super();
        this.turno = "None";
    }

    Asistente(String nombre_, int documento_, char genero_, long telefono_, int edad_, String turno_) {
        super(nombre_, documento_, genero_, telefono_, edad_);
        this.turno = turno_;
    }

    void setTurno(String turno_) { this.turno = turno_; }
    String getTurno() { return this.turno; }

    void registrarPaciente(Paciente paciente_) {
        System.out.println("Paciente registrado: " + paciente_.getNombre());
    }

    void gestionAgenda() {
        System.out.println("Agenda gestionada por: " + this.nombre);
    }

    void agendaCita(Cita cita_) {
        cita_.confirmar();
        System.out.println("Cita agendada por " + this.nombre + " para: " + cita_.getPaciente().getNombre());
    }

    void show() {
        super.show();
        System.out.println("Turno: " + this.turno);
    }
}
```

Nombre: `Asistente.java`
