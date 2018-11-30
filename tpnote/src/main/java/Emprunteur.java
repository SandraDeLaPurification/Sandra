import java.util.List;

public class Emprunteur {
    private List<Empruntable> stock;

    public Emprunteur(){ }

    public void ajouterAuStock(Empruntable unEmprunt){
        this.stock.add(unEmprunt);
    }

    public List<Empruntable> listeMateriel(){
        return this.stock;
    }

    public Boolean perdreMateriel(Empruntable unEmprunt){
        if(this.stock.contains(unEmprunt)){
            this.stock.remove(unEmprunt);
            return true;
        }
        else{
            return false;
        }

    }
}
