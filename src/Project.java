import java.util.Scanner;
public class Project {

		
		
			
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=-1;
		System.out.println("QCM (Cultures générales). \n");
		System.out.println("Ce QCM comporte 10 questions.");
		System.out.println("Sélectionnez 1 , 2 , 3 ou 4 en fonction de vos réponses.");
		System.out.println("Votre score apparaîtra une fois que vous aurez terminé le QCM. BON COURAGE ! \n");
		System.out.println("Question 1 : Quel est la capitale de la France ?\n" );
		System.out.println("Paris : 1");
		System.out.println("Madrid : 2");
		System.out.println("Washington DC : 3");
		System.out.println("Rio de Janeiro : 4");
		int user = scan.nextInt();
	
	
		if (user == 1) {
			x++;
			System.out.println("Question 2 : Qui a été le 44e président des Etat-Unis ? \n");
			
		 }else {
			 System.out.println("Question 2 : Qui a été le 44e président des Etat-Unis ? \n");
		 }
		System.out.println("Bill Clinton : 1");
		System.out.println("Barack Obama : 2");
		System.out.println("Georges W Bush : 3");
		System.out.println("Donald Trump : 4");
		
		int user1 = scan.nextInt();
		
		if (user1 == 2) {
			x++;
			System.out.println("Question 3 : Quel a été le dernier carré atteint par l'équipe de France lors de l'Euros 2016 ? \n");
			
		 }else {
			 System.out.println("Question 3 : Quel a été le dernier carré atteint par l'equipe de France lors de l'Euros 2016 ?\n");
		
		 }
		System.out.println("Finale : 1");
		System.out.println("Barrages : 2");
		System.out.println("Demi-finale : 3");
		System.out.println("Quarts de finale : 4");
		
int user2 = scan.nextInt();
		
		if (user2 == 1) {
			x++;
			System.out.println("Question 4 : Quels sont les os qui font partie de l’articulation de l’épaule ? (Plusieurs réponses possibles)  \n");
			
		 }else {
			 System.out.println("Question 4 : Quels sont les os qui font partie de l’articulation de l’épaule ? (Plusieurs réponses possibles) \n");
		
		 }
		System.out.println("Clavicule : 1");
		System.out.println("Omoplate : 2");
		System.out.println("Fémur : 3");
		System.out.println("Radius: 4");
		int user3 = scan.nextInt();
		int user4 =scan.nextInt();
		if (user3 == 1 || user4 == 2) {
			x++;
			System.out.println("Question 5 : Quel est la date de la chute du mur de Berlin ? ");
		}
		else if(user4 ==1 || user3 ==2) {
			x++;
			System.out.println("Question 5 : Quel est la date de la chute du mur de Berlin ? ");
			
		}
		else {
			System.out.println("Question 5 : Quel est la date de la chute du mur de berlin ? ");
		}
		System.out.println("1981 : 1");
		System.out.println("1945 : 2");
		System.out.println("1962 : 3");
		System.out.println("1989 : 4");
		int user5 = scan.nextInt();
		if (user5 == 4) {
			x++;
			System.out.println("Question 5 : Quels étaient les deux candidats à la 45ème présidence des Etats-Unis ? ");
		}
		else {
			System.out.println("Question 5 : Quels étaient les deux candidats à la 45ème présidence des Etats-Unis ? ");
		}
		System.out.println("Donald Trump : 1");
		System.out.println("Barack Obama : 2");
		System.out.println("Mitt Romney : 3");
		System.out.println("Hillary Clinton : 4");
		int user6 = scan.nextInt();
		int user7 = scan.nextInt();
		if (user6 == 1 || user7 == 4) {
			x++;
			System.out.println("Question 6 : Quelle est la signification de SIDA ?");
		}
		else if(user6 ==4 || user7 ==1) {
			x++;
			System.out.println("Question 6 : Quelle est la signification de SIDA ? ");
			
		}
		else {
			System.out.println("Question 5 : Quelle est la signification de SIDA ? ");
		}
		System.out.println("Syndrome d'immunodéficience acquise : 1");
		System.out.println("Syndrome d'intelligence déficiente aggravé : 2");
		System.out.println("Symptome immunitaire des artères : 3");
		System.out.println("Symptome d'immunodéficience acquise : 4");
		int user8 = scan.nextInt();
		if (user8 == 1 ) {
			x++;
			System.out.println("Votre avez obtenu " +x+ "/10");
		}
		else {
			System.out.println("Vous avez obtenu " +x+ "/10" );
		}
		
		}
	}

