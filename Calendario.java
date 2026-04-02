import java.util.ArrayList;

class Calendario {
    private ArrayList<Cita> citas;

    Calendario() {
        this.citas = new ArrayList<Cita>();
    }

    boolean programarCita(Cita cita_) {
        for (Cita c : citas) {
            if (c.getFecha().equals(cita_.getFecha()) &&
                c.getHora().equals(cita_.getHora()) &&
                c.getConsultorio().getNumero() == cita_.getConsultorio().getNumero() &&
                !c.getEstado().equals("Cancelada")) {
                System.out.println("Consultorio ocupado en esa fecha y hora");
                return false;
            }
        }
        citas.add(cita_);
        cita_.getConsultorio().ocupar();
        System.out.println("Cita programada correctamente");
        return true;
    }

    void verDisponibilidad() {
        int activas = 0;
        for (Cita c : citas) {
            if (!c.getEstado().equals("Cancelada")) {
                activas++;
            }
        }
        System.out.println("Citas activas: " + activas);
        System.out.println("Citas totales registradas: " + citas.size());
    }

    void obtenerHorarioPersonal() {
        for (Cita c : citas) {
            System.out.println(c.getFecha() + " " + c.getHora() + " - " + c.getPaciente().getNombre());
        }
    }

    void show() {
        for (Cita c : citas) {
            c.show();
            System.out.println("----------");
        }
    }
}
