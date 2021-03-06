package clase;

public class Autobuz {
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textRulat;

    public Autobuz(String numeSofer, int nrLinie, boolean pauzaSofer, boolean deschideUsile, int oraIncepereProgram, String textRulat) {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
        this.pauzaSofer = pauzaSofer;
        this.deschideUsile = deschideUsile;
        this.oraIncepereProgram = oraIncepereProgram;
        this.textRulat = textRulat;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrLinie=" + nrLinie +
                ", pauzaSofer=" + pauzaSofer +
                ", deschideUsile=" + deschideUsile +
                ", oraIncepereProgram=" + oraIncepereProgram +
                ", textRulat='" + textRulat + '\'' +
                '}';
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
    }

    void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    void setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
    }

    void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
    }

}
