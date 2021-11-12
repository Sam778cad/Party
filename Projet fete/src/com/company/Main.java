package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] tableaudesjoueurs = new String[10];
        char difficulte = 'a';
        String defi = "abc";
        char reponsejoueursupp = 'a';
        boolean replay = false;
        String joueurajouter = "abc";

        int i = 0;
        String utilisateur = "abc" ;

        replay = addjoueur(replay, tableaudesjoueurs, reponsejoueursupp, joueurajouter, i);
        defi = tableaudifficulte(difficulte, defi, tableaudesjoueurs, utilisateur);

    }

    public static boolean addjoueur(boolean replay, String[] tableaudesjoueurs, char reponsejoueursupp, String joueurajouter, int i) {
        Scanner scan = new Scanner(System.in);
        int nbutilisateur = 0;
        //le tableau va servir ajouter des joueurs dans un tableau de joueurs
        do {
            nbutilisateur++;
            System.out.println("Veuillez entrer les noms des joueurs : ");
            joueurajouter = scan.next();

            tableaudesjoueurs[i] = joueurajouter;

            System.out.println("Voulez-vous ajouter un joueur supplémentaire ? (o/n) : ");
            reponsejoueursupp = scan.next().charAt(0);
            if (reponsejoueursupp == 'o' || reponsejoueursupp == 'O') replay = true;
            else replay = false;
            i++;

        }

        while (replay == true);

        return replay;
    }

    public static String tableaudifficulte(char difficulte, String defi, String[] tableaudesjoueurs, String utilisateur) {
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Veuillez sélectionner une difficulté : ");
            difficulte = scan.next().charAt(0);

            if (difficulte == 'f' || difficulte == 'F') {
                System.out.println("La difficulté choisi est : Facile");
                defi = tableaufacile(defi, difficulte);
                System.out.println("Le joueur " + utilisateur + " doit :" + defi + "\n");
            } else if (difficulte == 'm' || difficulte == 'M') {

            } else System.out.println("fuck ça marche pas");
        }
        while (difficulte != 'a');

        return defi;

    }

    public static String tableaufacile(String defi, char difficulte) {

        Random r = new Random();
        String[] tabfacile = {"defi1", "defi2", "defi3", "defi4"};

        int defiselec = r.nextInt(4);
        defi = tabfacile[defiselec];

        return defi;
    }

}
