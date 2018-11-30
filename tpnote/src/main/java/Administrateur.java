import java.util.List;

public class Administrateur extends Employe {

    public Administrateur(Agence uneAgence, Entreprise uneEntreprise){
        super(uneAgence, uneEntreprise);
    }

    public Boolean attribuerMateriel(Empruntable empruntable, Emprunteur emprunteur){
        if(empruntable.isLimitationPretAuxAgences()){
            if(emprunteur.getClass().equals(Agence.class)){
                transfererMateriel(this, empruntable, emprunteur);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            transfererMateriel(this, empruntable, emprunteur);
            return true;
        }
    }

    public Boolean recupererMateriel(Empruntable empruntable, Emprunteur emprunteur){
        return emprunteur.perdreMateriel(empruntable);
    }

    public List<Empruntable> stockEntreprise(){
        return super.entreprise.listeMateriel();
    }

    public List<Empruntable> stockAgence(){
        return super.agence.listeMateriel();
    }

    public void transfererMateriel(Emprunteur emprunteur1, Empruntable empruntable, Emprunteur emprunteur2){
        if(emprunteur1.listeMateriel().contains(empruntable)){
            if(!empruntable.isDefectueux()) {
                emprunteur1.perdreMateriel(empruntable);
                emprunteur2.ajouterAuStock(empruntable);
            }
        }
    }

    public void supprimerMateriel(Empruntable empruntable){
        this.perdreMateriel(empruntable);
    }

    public void supprimerMaterielDefectueuxEntreprise(){
        for(Agence uneAgence : super.entreprise.getAgences()){
            supprimerMaterielDefectueuxAgence(uneAgence);
        }
    }

    public void supprimerMaterielDefectueuxAgence(Agence uneAgence){
        for(Employe unEmploye : uneAgence.getEmployes()){
            supprimerMaterielDefectueuxDe(unEmploye);
        }
    }

    private void supprimerMaterielDefectueuxDe(Emprunteur emprunteur){
        for(Empruntable unEmprunt : emprunteur.listeMateriel()){
            if(unEmprunt.isDefectueux()){
                perdreMateriel(unEmprunt);
            }
        }
    }
}
