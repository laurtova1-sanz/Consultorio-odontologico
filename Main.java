import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Gestion de Citas Odontologicas ===");

        Odontologo odontologo1 = new Odontologo("Dr. Garcia", 123456, 'M', 3001234567L, 35, "Ortodoncia", 1);
        Odontologo odontologo2 = new Odontologo("Dra. Perez", 678901, 'F', 3007654321L, 40, "Periodoncia", 2);

        Asistente asistente1 = new Asistente("Maria Lopez", 111222, 'F', 3201112222L, 30, "Manana");
        Asistente asistente2 = new Asistente("Carlos Ruiz", 333444, 'M', 3203334444L, 25, "Tarde");

        Paciente paciente1 = new Paciente("Juan Torres", 987654, 'M', 3109876543L, 28, "Ninguno");
        Paciente paciente2 = new Paciente("Ana Rodríguez", 456789, 'F', 3154567890L, 22, "Diabetes");

        Consultorio consultorio1 = new Consultorio(1);
        Consultorio consultorio2 = new Consultorio(2);

        Calendario calendario = new Calendario();

        System.out.println("Agendando cita para Juan Torres");
        Cita cita1 = new Cita("2026-04-10", "10:00", paciente1, odontologo1, asistente1, consultorio1);
        boolean agendada = calendario.programarCita(cita1);
        if (agendada) {
            asistente1.agendaCita(cita1);
            cita1.show();
        }

        System.out.println("Ana Rodríguez solicita una cita");
        Cita cita2 = new Cita("2026-04-10", "10:00", paciente2, odontologo2, asistente2, consultorio1);
        boolean agendada2 = calendario.programarCita(cita2);
        if (!agendada2) {
            System.out.println("Consultorio no disponible en ese horario.");
            cita2.setConsultorio(consultorio2);
            calendario.programarCita(cita2);
            cita2.show();
        }

        System.out.println(" Historial ");
        odontologo1.crearHistorial("Juan Torres- Limpieza dental realizada");
        odontologo1.verHistorialPaciente();

        System.out.println("Cita del paciente");
        paciente1.verCita(cita1);

        System.out.println("Disponibilidad ");
        calendario.verDisponibilidad();

        System.out.println("Cancelando cita de Juan Torres");
        cita1.cancelar();
        calendario.verDisponibilidad();

        scanner.close();
    }
}
