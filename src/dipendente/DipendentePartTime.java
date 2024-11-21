package dipendente;

public class DipendentePartTime extends Dipendente{
    private double oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(double matricola, double stipendio, String dipartimento, double oreLavorate, double pagaOraria) {
        super(matricola, stipendio, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }


    @Override
    public double calculateSalary() {
        return (oreLavorate * pagaOraria)+ getStipendio();
    }

    @Override
    public void checkIn() {
        System.out.println("Orario di check in: 14:00");
    }
}
