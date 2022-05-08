package modele;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Dictionnaire {

    private String fichier = "liste_mot.txt";
    List<String> listeDeMots = new ArrayList<String>();


    public Dictionnaire(){
        super();
        listeDeMots= new ArrayList<>();
        OuvrirFichier();
    }


    public void OuvrirFichier() {
        try {
            InputStream flux = Dictionnaire.class.getResourceAsStream(fichier);
            InputStreamReader lecture = new InputStreamReader(flux);
            BufferedReader buff = new BufferedReader(lecture);
            String ligne;
            while ((ligne = buff.readLine()) != null) {
                listeDeMots.add(ligne);
            }
            buff.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


}




