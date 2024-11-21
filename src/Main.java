import dipendente.*;

public class Main {
    public static void main(String[] args) {
//        Dipendente dipendente1 = new Dipendente(3802, 500, "Produzione");
//        Dipendente dipendente2 = new Dipendente(1081, 700, "Amministrazione");
//        Dipendente dipendente3 = new Dipendente(2807, 1000, "Vendite");
//        Dipendente[] dipendenteArry = new Dipendente[]{dipendente1, dipendente2, dipendente3};
//
//        for (int i = 0; i < dipendenteArry.length; i++) {
//            System.out.println(dipendenteArry[i].getMatricola());
//        }
        double totaleStipendi = 0;
        Dipendente dipendente1 = new DipendenteFullTime(2181, 1000, "Produzione");
        Dipendente dipendente2 = new DipendentePartTime(3201, 500, "Vendite", 5, 5 );
        Dipendente dipendente3 = new Dirigente(2500, 1500, "Amministrazione", 400);
        Volontario volontario1 = new Volontario(27, "Mario", "Bravo ragazzo");

//        System.out.println(dipendente1.calculateSalary());
//        System.out.println(dipendente2.calculateSalary());
//        System.out.println(dipendente3.calculateSalary());

//      Dipendente[] dipendenteArray = new Dipendente[]{dipendente1, dipendente2, dipendente3};
        ITurni[] dipendenteArray = new ITurni[]{dipendente1, dipendente2, dipendente3,volontario1};
//
//        for (int i = 0; i < dipendenteArray.length; i++) {
//            totaleStipendi = totaleStipendi + dipendenteArray[i].calculateSalary();
//        }
        for (int i = 0; i < dipendenteArray.length; i++) {
            dipendenteArray[i].checkIn();
        }

//        System.out.println("Il totale e " + totaleStipendi);
    }
}