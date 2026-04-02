class Personal {
    protected String nombre;
    protected int documento;
    protected char genero;
    protected long telefono;
    protected int edad;

    Personal() {
        this.nombre = "None";
        this.documento = 0;
        this.genero = ' ';
        this.telefono = 0;
        this.edad = 0;
    }

    Personal(String nombre_, int documento_, char genero_, long telefono_, int edad_) {
        this.nombre = nombre_;
        this.documento = documento_;
        this.genero = genero_;
        this.telefono = telefono_;
        this.edad = edad_;
    }

    void setNombre(String nombre_) { this.nombre = nombre_; }
    void setDocumento(int documento_) { this.documento = documento_; }
    void setGenero(char genero_) { this.genero = genero_; }
    void setTelefono(long telefono_) { this.telefono = telefono_; }
    void setEdad(int edad_) { this.edad = edad_; }

    String getNombre() { return this.nombre; }
    int getDocumento() { return this.documento; }
    char getGenero() { return this.genero; }
    long getTelefono() { return this.telefono; }
    int getEdad() { return this.edad; }

    void show() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Documento: " + this.documento);
        System.out.println("Genero: " + this.genero);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Edad: " + this.edad);
    }
}
