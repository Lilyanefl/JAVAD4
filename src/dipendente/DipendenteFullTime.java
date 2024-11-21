package dipendente;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(double matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

    @Override
    public void checkIn() {
        System.out.println("Orario di check in: 08:00");
    }
}
