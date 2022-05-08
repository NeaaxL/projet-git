package modele;

import javax.swing.*;
import java.awt.*;

public class Grille {

    private int Hauteur;
    private int Largeur;
    public Case tabGrille[][];

    public Grille(int Hauteur, int Largeur) {
        this.Hauteur = Hauteur;
        this.Largeur = Largeur;

        tabGrille = new Case[Hauteur][Largeur];
        if (Hauteur <= 0 || Largeur <= 0 || Largeur >= 11 || Hauteur >= 11) {
            System.out.println("Grille Impossible");
        } else {

            for (int i = 0; i < Largeur; i++) {

                for (int j = 0; j < Hauteur; j++) {

                    tabGrille[j][i] = new Case(j, i);
                }

            }
        }


    }


    public void afficherGrille(){
        for (int i = 0; i < Largeur; i++) {

            for (int j = 0; j < Hauteur; j++) {
                System.out.print(tabGrille[j][i] + " ");
            }
            System.out.println();
        }


        GridLayout grid = new GridLayout(Largeur, Hauteur);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        panel.setLayout(grid);
        for (int i=0;i<Hauteur;i++) {
            for (int j=0;j<Largeur;j++)
            {
                panel.add(new JButton(""));
            }
        }

    }

    /**
     *getDispo viens retourner le nombre de case vide dans la direction souhaitée
     */

    public int getDispo(int x, int y, CaseDef.Direction direction) {
        int i = 0;
        int j=0;
        int dispo = 0;
        //Verifie cb de case son dispo
        switch (direction) {
            case HD:
                for (i = x; i < this.Largeur; i++) {
                    while (tabGrille[i][y].equals("")) {
                        dispo++;
                    }
                }
                break;

            case HI:
               j=y+1;
                for (i = x; i < this.Largeur; i++) {
                    while (tabGrille[i][j].equals("")) {
                        dispo++;
                    }
                }
                break;


                case VD:
                for (i = y; i < this.Hauteur; i++) {
                    while (tabGrille[x][i].equals("")) {
                        dispo++;
                    }
                }
                break;
            case VI:
                j=x+1;
                for (i = x; i < this.Largeur; i++) {
                    while (tabGrille[j][i].equals("")) {
                        dispo++;
                    }
                }
                break;

        }
        return dispo;
    }


    /**
     *Si la case est vide , viens remplir la case par la lettre chosie
     */
    public void ajouterLettre(int x,int y ,String lettre){
        if(tabGrille[x][y].equals("")){
            tabGrille[x][y].ajouterCaseLettre(lettre);
        }
    }

    /**
     *Si la case est vide , viens remplir la case par une def
     */
    public void ajouterDef(int x, int y , String Mot, CaseDef.Direction direction){



        }

    /**
     *Si la case est une def , viens supprimer la def
     */
        public void SupprimmerDef(int x, int y, CaseDef.Direction direction) {
           int i = x;

            switch (direction) {
                case HD:
                    for (int a= 0; i < Largeur; i++) {
                          tabGrille[i][y]= new Case(i,y);//tant que case lettre
                    }
                case HI:

                    for (int a = 0; i < Largeur; i++) {

                    }
                    break;
            }
        }




}

