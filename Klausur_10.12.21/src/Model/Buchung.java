package Model;

public class Buchung {
    String _zeitraum;
    int _gruppengroesse;
    String _gruppenleiter;
    String _raum;
    int _juengsterteilnehmer;



    public Buchung(String zeitraum, int gruppengroesse, String gruppenleiter, String raum, int juengsterteilnehmer){
        setGruppengroesse(gruppengroesse);
        setGruppenleiter(gruppenleiter);
        setJuengsterteilnehmer(juengsterteilnehmer);
        setRaum(raum);
        setZeitraum(zeitraum);
    }

    

    public void setRaum(String raum) {
        this._raum = raum;
    }
    public void setGruppengroesse(int gruppengroesse) {
        this._gruppengroesse = gruppengroesse;
    }
    public void setGruppenleiter(String gruppenleiter) {
        this._gruppenleiter = gruppenleiter;
    }
    public void setJuengsterteilnehmer(int juengsterteilnehmer) {
        this._juengsterteilnehmer = juengsterteilnehmer;
    }
    public void setZeitraum(String zeitraum) {
        this._zeitraum = zeitraum;
    }
    
    public String getRaum() {
        return _raum;
    }
    public int getGruppengroesse() {
        return _gruppengroesse;
    }
    public String getGruppenleiter() {
        return _gruppenleiter;
    }
    public int getJuengsterteilnehmer() {
        return _juengsterteilnehmer;
    }
    public String getZeitraum() {
        return _zeitraum;
    }

}
