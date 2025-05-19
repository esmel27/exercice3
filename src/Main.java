import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    String filePath = "fich.txt"; // Nom du fichier à lire
    int totalWords = 0;

    try {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim(); // Supprime les espaces début/fin
            if (!line.isEmpty()) {
                String[] words = line.split(" "); // Séparation par espace
                totalWords += words.length;
            }
        }

        scanner.close();
        System.out.println("Nombre total de mots : " + totalWords);

    } catch (FileNotFoundException e) {
        System.out.println("Fichier non trouvé : " + filePath);
    }
}

}
