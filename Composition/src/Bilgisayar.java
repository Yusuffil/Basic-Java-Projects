
public class Bilgisayar {
    private Anakart anakart;
    
    private Monitor monitor;
    
    private kasa kasa;

    public Bilgisayar(Anakart anakart, Monitor monitor, kasa kasa) {
        this.anakart = anakart;
        this.monitor = monitor;
        this.kasa = kasa;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public kasa getKasa() {
        return kasa;
    }

    public void setKasa(kasa kasa) {
        this.kasa = kasa;
    }
    
    
}
