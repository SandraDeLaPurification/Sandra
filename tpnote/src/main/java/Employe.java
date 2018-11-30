public class Employe extends Emprunteur {
    private Agence agence;
    private Entreprise entreprise;

    public Employe(Agence uneAgence, Entreprise uneEntreprise){
        super();
        this.agence = uneAgence;
        this.entreprise = uneEntreprise;
    }
}
