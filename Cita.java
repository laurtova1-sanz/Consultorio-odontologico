class Cita {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Odontologo odontologo;
    private Asistente asistente;
    private Consultorio consultorio;
    private String estado;

    Cita() {
        this.fecha = "None";
        this.hora = "None";
        this.paciente = new Paciente();
        this.odontologo = new Odontologo();
        this.asistente = new Asistente();
        this.consultorio = new Consultorio();
        this.estado = "Sin confirmar";
    }

    Cita(String fecha_, String hora_, Paciente paciente_, Odontologo odontologo_,
         Asistente asistente_, Consultorio consultorio_) {
        this.fecha = fecha_;
        this.hora = hora_;
        this.paciente = paciente_;
        this.odontologo = odontologo_;
        this.asistente = asistente_;
        this.consultorio = consultorio_;
        this.estado = "Sin confirmar";
    }

    void setFecha(String fecha_) { this.fecha = fecha_; }
    void setHora(String hora_) { this.hora = hora_; }
    void setPaciente(Paciente paciente_) { this.paciente = paciente_; }
    void setOdontologo(Odontologo odontologo_) { this.odontologo = odontologo_; }
    void setAsistente(Asistente asistente_) { this.asistente = asistente_; }
    void setConsultorio(Consultorio consultorio_) { this.consultorio = consultorio_; }

    String getFecha() { return this.fecha; }
    String getHora() { return this.hora; }
    Paciente getPaciente() { return this.paciente; }
    Odontologo getOdontologo() { return this.odontologo; }
    Asistente getAsistente() { return this.asistente; }
    Consultorio getConsultorio() { return this.consultorio; }
    String getEstado() { return this.estado; }

    void confirmar() { this.estado = "Confirmada"; System.out.println("Cita confirmada"); }

    void cancelar() {
        this.estado = "Cancelada";
        this.consultorio.liberar();
        System.out.println("Cita cancelada");
    }

    void editar(String fecha_, String hora_) {
        this.fecha = fecha_;
        this.hora = hora_;
        System.out.println("Cita editada");
    }

    void agregar() { System.out.println("Cita agregada"); }
    void eliminar() { System.out.println("Cita eliminada"); }
    void actualizar() { System.out.println("Cita actualizada"); }

    void show() {
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
        System.out.println("Paciente: " + this.paciente.getNombre());
        System.out.println("Odontologo: " + this.odontologo.getNombre());
        System.out.println("Asistente: " + this.asistente.getNombre());
        System.out.println("Consultorio: " + this.consultorio.getNumero());
        System.out.println("Estado: " + this.estado);
    }
}
