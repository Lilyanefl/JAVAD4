package dipendente;

public class Dirigente extends Dipendente{
    private double bonusDirigente;
    public Dirigente(double matricola, double stipendio, String dipartimento, double bonusDirigente) {
        super(matricola, stipendio, dipartimento);
        this.bonusDirigente = bonusDirigente;
    }

    @Override
    public double calculateSalary() {
        return (getStipendio() + bonusDirigente);
    }

    @Override
    public void checkIn() {
        System.out.println("Orario di check in: 09:00");
    }
}
