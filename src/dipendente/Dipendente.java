package dipendente;

public abstract class Dipendente implements ITurni{
    private double matricola;
    private double stipendio;
    private String dipartimento;

    public Dipendente(double matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public double getMatricola() {
        return matricola;
    }
    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }
    public abstract double calculateSalary();
}
