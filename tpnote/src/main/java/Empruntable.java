public class Empruntable {
    private Boolean limitationPretAuxAgences;
    private Boolean defectueux;

    public Empruntable(){}
    
    public Empruntable(Boolean limitation, Boolean estDefectueux){
        this.limitationPretAuxAgences = limitation;
        this.defectueux = estDefectueux;
    }

    public void declarerDefectueux(){
        this.defectueux = true;
    }

    public Boolean isDefectueux(){
        return this.defectueux;
    }

    public Boolean isLimitationPretAuxAgences(){
        return this.limitationPretAuxAgences;
    }

    public void setLimitationPretAuxAgences(Boolean limitationPretAuxAgences) {
        this.limitationPretAuxAgences = limitationPretAuxAgences;
    }

}
