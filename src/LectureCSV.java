
import java.io.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class LectureCSV {

public static void main(String[] arguments) {
	String tableau[] = new String[4];
	
	BufferedReader bufReader = null;
	try {
		bufReader = new BufferedReader(new FileReader("DATA.csv"));
		String rowData = "";
		bufReader.readLine(); // Enleve la premiere colonne dans DATA.csv
		String [] databyrow;
		while ((rowData = bufReader.readLine())!=null) {
			databyrow = rowData.split(";"); // Convertir String en Tableau
			
			for (int i = 0 ; i< databyrow.length; i++) {
			//for(String s: databyrow) {
				String s = databyrow[i];
				System.out.println(s);
				tableau[i]= s;
			}
			System.out.println("--- VOTRE REPONSE---");
			Scanner sc = new Scanner(System.in);
			String reponse = sc.next();
			if(reponse.equals(tableau[1]) ) {
				System.out.println("ok");
			}
			else{
				System.out.println("not ok");
			}
		}
	} catch  (Exception e) {
		// TODO: handle exception
	}
		

		
	
	
	
	
	}
}