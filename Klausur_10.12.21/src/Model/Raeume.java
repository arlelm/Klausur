package Model;

public class Raeume {
    
    String _name;
    int _maxPers;
    int _schwierigkeitsgrad;
    String _lösung;
    int _dauer;
    int _mindesalter;



    public Raeume(String name, int maxPers, int schwierigkeitsgrad, String lösung, int dauer, int mindestalter){
        setdauer(dauer);
        setlösung(lösung);
        setmaxPers(maxPers);
        setmindesalter(mindestalter);
        setname(name);
        setschwierigkeitsgrad(schwierigkeitsgrad);
    }


    public void setdauer(int dauer) {
        this._dauer = dauer;
    }
    public void setmindesalter(int mindesalter) {
        this._mindesalter = mindesalter;
    }
    public void setlösung(String lösung) {
        this._lösung = lösung;
    }
    public void setmaxPers(int maxPers) {
        this._maxPers = maxPers;
    }
    public void setname(String name) {
        this._name = name;
    }
    public void setschwierigkeitsgrad(int schwierigkeitsgrad) {
        this._schwierigkeitsgrad = schwierigkeitsgrad;
    }
    
    public int getdauer() {
        return _dauer;
    }
    public String getlösung() {
        return _lösung;
    }
    public int getmaxPers() {
        return _maxPers;
    }
    public String getname() {
        return _name;
    }
    public int getschwierigkeitsgrad() {
        return _schwierigkeitsgrad;
    }
    public int get_mindesalter() {
        return _mindesalter;
    }

}
