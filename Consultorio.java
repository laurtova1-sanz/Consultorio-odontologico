class Consultorio {
    private int numero;
    private boolean disponible;

    Consultorio() {
        this.numero = 0;
        this.disponible = true;
    }

    Consultorio(int numero_) {
        this.numero = numero_;
        this.disponible = true;
    }

    void setNumero(int numero_) { this.numero = numero_; }
    void setDisponible(boolean disponible_) { this.disponible = disponible_; }

    int getNumero() { return this.numero; }
    boolean isDisponible() { return this.disponible; }

    void ocupar() {
        this.disponible = false;
        System.out.println("Consultorio " + this.numero + " ocupado");
    }

    void liberar() {
        this.disponible = true;
        System.out.println("Consultorio " + this.numero + " disponible");
    }

    void show() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Disponible: " + (this.disponible ? "Si" : "No"));
    }
}
