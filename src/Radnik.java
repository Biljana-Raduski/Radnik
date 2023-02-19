import javax.xml.xpath.XPathEvaluationResult;

public class Radnik {


    protected String ime;
    protected String prezime;
    protected int godine;
    protected int visinaPlate;
    protected String radnoMesto;

    public Radnik(String ime, String prezime, int godine, int visinaPlate, String radnoMesto) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.visinaPlate = visinaPlate;
        this.radnoMesto = radnoMesto;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", visinaPlate=" + visinaPlate +
                ", radnoMesto='" + radnoMesto + '\'' +
                '}';
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public int getVisinaPlate() {
        return visinaPlate;
    }

    public void setVisinaPlate(int visinaPlate) {
        this.visinaPlate = visinaPlate;
    }

    public String getRadnoMesto() {
        return radnoMesto;
    }

    public void setRadnoMesto(String radnoMesto) {
        this.radnoMesto = radnoMesto;

    }
}
