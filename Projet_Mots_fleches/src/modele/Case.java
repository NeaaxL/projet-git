package modele;

public class Case {

    private int x;
    private int y;
    private CaseLettre lettre;

    public  Case(int coordX,int coordY)
    {
       this.x = coordX;
       this.y = coordY;
    }


    public void ajouterCaseLettre(String lettre ){
        this.lettre = new CaseLettre(x,y);
        this.lettre.setLettre(lettre);
    }

    public void ajouterCaseDef(String lettre ){

    }

}
