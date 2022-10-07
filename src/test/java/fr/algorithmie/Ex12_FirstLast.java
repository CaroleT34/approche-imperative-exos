package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes. Utilisez
 * Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom = "FirstLast")
public class Ex12_FirstLast {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 1, 6 };
	int[] tab4 = { 1, 6, 1 };

	/**
	 * Ne pas modifier les informations portées par l'annotation.
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		// o elle vaut true si le tableau est de longueur supérieure ou égale à 1
		// et que le premier et le dernier élément du tableau ont la même valeur
		// o elle vaut false dans les autres cas

		// TODO LOGUEZ la valeur obtenue pour chacun des tableaux tab1 à tab4
		Resultat.log(resultBool(tab1));
		Resultat.log(resultBool(tab2));
		Resultat.log(resultBool(tab3));
		Resultat.log(resultBool(tab4));
	}

	public boolean resultBool(int[] tab) {
		boolean verifBool;

		if (tab.length >= 1 && (tab[0] == tab[tab.length - 1])) {
			verifBool = true;

		} else {
			verifBool = false;

		}

		return verifBool;
	}

}
