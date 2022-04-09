package clase;

public class Autobuz {

    private static Autobuz autobuz = null;

    private Autobuz() {
    }

    public void deschideUsaFata() {
        System.out.println("Usa din fata e deschisa");
    }

    public void deschideUsaMijloc() {
        System.out.println("Usa din mijloc e deschisa");
    }

    public void deschideUsaSpate() {
        System.out.println("Usa din spate e deschisa");
    }

    public void puneLiberUsaFata() {
        System.out.println("A fost pusa pe liber usa din fata");
    }

    public void puneLiberUsaMijloc() {
        System.out.println("A fost pusa pe liber usa din mijloc");
    }

    public void puneLiberUsaSpate() {
        System.out.println("A fost pusa pe liber usa din spate");
    }

    public static Autobuz getInstance() {
        if (autobuz != null) {
            return autobuz;
        } else {
            autobuz = new Autobuz();
            return autobuz;
        }
    }
}