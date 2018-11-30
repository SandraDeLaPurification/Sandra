import java.util.List;

public class Agence extends Emprunteur{
    private List<Employe> employes;
    private String nom;

    public Agence(String leNom){
        super();
        this.nom = leNom;
    }
}
