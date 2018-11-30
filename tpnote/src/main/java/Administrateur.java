import java.util.List;

public class Administrateur extends Employe {

    public Administrateur(Agence uneAgence, Entreprise uneEntreprise){
        super(uneAgence, uneEntreprise);
    }

    public Boolean attribuerMateriel(Empruntable empruntable, Emprunteur emprunteur){
        if(empruntable.isLimitationPretAuxAgences()){
            if(emprunteur.getClass().equals(Agence.class)){
                if(!empruntable.isDefectueux()){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            if(!empruntable.isDefectueux()){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public Boolean recupererMateriel(Empruntable empruntable, Emprunteur emprunteur){
        return emprunteur.perdreMateriel(empruntable);
    }

    public List<Empruntable> stockEntreprise(){

    }
}
