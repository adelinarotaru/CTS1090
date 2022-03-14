package clase;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = an_studii;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + "Facultate=" + facultate + ", An_studii=" + anStudii;
    }

}
