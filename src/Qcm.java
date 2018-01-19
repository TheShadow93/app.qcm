import java.util.Scanner;
public class Qcm {

	public static void main(String[] args) {
	String file = "azerty.txt";
	Scanner scan = new Scanner(file);
	int user = scan.nextInt();
	if ( user == 1) {
		System.out.println("Bonne réponse");
	}else {
		System.out.println("Mauvaise réponse");
	}
	

	}

}
