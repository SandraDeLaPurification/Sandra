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

    public List<Agence> getAgences() {
        return agences;
    }

    public void setAgences(List<Agence> agences) {
        this.agences = agences;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
}
