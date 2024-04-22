import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int index;
        int[] array = randomArray();
        boolean continueLoop = true;

        do {
            System.out.println("Inserisci un numero intero per aggiornare un valore dell'array, \"Print\" per stampare l'array attuale, oppure 0 per terminare il programma:");
            String input = scanner.next();
            if (input.equalsIgnoreCase("print")) {
                printArray(array);
            } else {
                try {
                    number = Integer.parseInt(input);
                    if (number == 0) {
                        continueLoop = false;
                        System.out.println("Programma terminato.");
                    } else {
                        System.out.println("Hai scelto " + number + ". A quale indice dell'array vuoi assegnare questo numero?");
                        index = scanner.nextInt();
                        array[index] = number;
                        printArray(array);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input non valido. Inserisci un numero intero, \"print\" o 0.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Indice non valido!");
                }
            }
        } while (continueLoop);

        scanner.close();
    }

    public static int[] randomArray() {
        int[] array = new int[5];
        Random randomNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(10) + 1;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Contenuto dell'array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]);
        }
    }
}
