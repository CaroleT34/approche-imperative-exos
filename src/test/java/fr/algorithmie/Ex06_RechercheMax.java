package fr.algorithmie;

import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="RechercheMax")
public class Ex06_RechercheMax {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void rechercherMax() {
		
		//TODO Grâce à un algorithme, recherchez le maximum du tableau et LOGUEZ le.
		int nombreMax = -100;
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || array[i] > nombreMax ) {
				 nombreMax = array[i];
			}
		}
		Resultat.log(nombreMax);
	}

}
