package dipendente;

public class Volontario implements ITurni{
    private String nome;
    private int eta;
    private String cv;

    public Volontario(int eta, String nome, String cv) {
        this.eta = eta;
        this.nome = nome;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Orario di check in: 10:00");
    }
}
