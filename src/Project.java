
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Project {

public static void main(String[] arguments) {
FileReader monFichier = null;
BufferedReader Read = null;

try {
monFichier = new FileReader("azerty.txt");
Read = new BufferedReader(monFichier);

while (true) {
// Lit une ligne de test.csv
String ligne = Read.readLine();
// Vérifie la fin de fichier
if (ligne == null)
break;
System.out.println(ligne);
} // Fin du while
} catch (IOException exception) {
exception.printStackTrace();
} finally {
try {
Read.close();
monFichier.close();
} catch(IOException exception1) {
exception1.printStackTrace();
			}
		}
	} 
}