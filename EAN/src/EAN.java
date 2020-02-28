import java.util.Scanner;

/**
 * 
 */

import java.util.Scanner;
/**
 * @author grellierhugo
 *
 */
public class EAN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			
			Scanner scanner = new Scanner(System.in);
			
			int somme = 0;
			boolean compteur = true;
			int tableau[] = new int[12];
			int reste=0;
			int cle=0;
	
	
			
			
			
	
		for(int j=0;j<=11;j++) {
			
			System.out.println("Saisissez la valeur de l'EAN n°"+j);
			tableau[j] = scanner.nextInt();
			
		}
			
			
		for(int i=0;i<=11;i++) {
				
				if(compteur == true) {
					
					somme += tableau[i];
					compteur = false;
				}
				else {
					somme += tableau[i]*3;
					compteur = true;
				}
				
			}//fin for
			System.out.println(somme);	
			int quotien = somme/10;
			reste=somme-quotien*10;
						
			if(reste == 0) {
				
				cle=0;
			}
			else {
				cle=10-reste;
			}
		System.out.println("La clé EAN est "+cle);
	}

}
