public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }

    public int cumplirAnos(int modificarEdad){
        this.edad+=modificarEdad;
        return edad;
    }

    public double engordar(double engordasMas){
        this.peso+=engordasMas;
        return peso;
    }

    public double adelgazar(double adelgazarMas){
        this.peso-=adelgazarMas;
        return peso;
    }

    public boolean enfermar(){
        return saludable;
    }

    public boolean recuperarSalud(){
        return saludable;
    }

    public String mostrarFicha(){
        return "--Nombre: "+nombre+" --Especie: "+especie+" --Edad: "+edad+" --Peso: "+peso+" --¿Está saludable?: "+saludable;

    }
}
