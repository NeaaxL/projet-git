package modele;

public class CaseDef extends Case{


    private String Definition;
    private String Fleche;
    private int nbrMot;
    private Direction direction;

    public CaseDef(int coordX, int coordY) {
        super(coordX, coordY);
    }

    public enum Direction{
        HD,//Horizontale direct
        HI,//Horizontale indirect
        VD,//Verticale direct
        VI// Verticale indirect

    }

}
