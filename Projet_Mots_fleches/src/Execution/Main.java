package Execution;

import modele.Dictionnaire;
import modele.Grille;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Veuillez saisir une Hauteur");
        int y = scanner.nextInt();
        System.out.println("Veuillez saisir une Largeur");
        int x = scanner.nextInt();


        //ajouter une case def
        //new CaseDef();

        new Grille(x,y).afficherGrille();
        //new Grille(x,y).ajouterLettre(x,y,"ok");
        new Dictionnaire().OuvrirFichier();

    }
}
