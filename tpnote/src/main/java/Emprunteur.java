import java.util.ArrayList;
import java.util.List;

public class Emprunteur {
    private List<Empruntable> stock;

    public Emprunteur(){
        this.stock = new ArrayList<Empruntable>();
    }

    public void ajouterAuStock(Empruntable unEmprunt){
        this.stock.add(unEmprunt);
    }

    public List<Empruntable> listeMateriel(){
        return this.stock;
    }

    public Boolean perdreMateriel(Empruntable unEmprunt){
        this.stock.remove(unEmprunt);
        return true;

    }

    public void setStock(List<Empruntable> nouveauStock){
        this.stock = nouveauStock;
    }
}
