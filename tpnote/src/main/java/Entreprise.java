import java.util.ArrayList;
import java.util.List;

public class Entreprise extends Emprunteur {
    private List<Agence> agences;
    private List<Employe> employes;
    private String nomEntreprise;

    public Entreprise(String leNom){
        super();
        this.nomEntreprise = leNom;
        this.agences = new ArrayList<Agence>();
        this.employes = new ArrayList<Employe>();
    }
}
