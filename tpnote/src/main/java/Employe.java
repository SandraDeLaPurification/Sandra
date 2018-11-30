public class Employe extends Emprunteur {
    protected Agence agence;
    protected Entreprise entreprise;

    public Employe(Agence uneAgence, Entreprise uneEntreprise){
        super();
        this.agence = uneAgence;
        this.entreprise = uneEntreprise;
    }
}
