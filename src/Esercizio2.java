import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserire i kilometri percorsi: ");
            int km = scanner.nextInt();
            System.out.print("Inserire i litri di benzina consumati: ");
            float litri = scanner.nextFloat();
            double kmXLitro = km/litri;

            if (litri == 0.0) {
                throw new ArithmeticException("x / 0 Error");
            }

            System.out.println("Hai percorso " + km + " consumando " + litri + " litri di carburante, con un consumo medio di " + kmXLitro + " km/l.");


        } catch (ArithmeticException e) {
            System.out.println("Non posso dividere per 0 litri di carburante!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
