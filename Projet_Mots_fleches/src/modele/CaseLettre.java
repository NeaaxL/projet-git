package modele;

public class CaseLettre extends Case{


    private String Lettre;

    public CaseLettre(int coordX, int coordY) {
        super(coordX, coordY);

    }

    public void setLettre(String lettre){
        this.Lettre = lettre;
    }


    public String getLettre(){
        return this.Lettre;
    }
}
