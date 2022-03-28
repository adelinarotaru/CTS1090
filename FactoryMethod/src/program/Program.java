package program;

import factoryMethod.*;

public class Program {

    private static void afisareMijlocTransport(FactoryMijlocTransport fabrica, int nrInmatriculare) {
        MijlocTransport mijlocTransport = fabrica.getMijlocTransport(nrInmatriculare);
        System.out.println(mijlocTransport.toString());
    }

    public static void main(String[] args) {
        /*MijlocTransport autobuz = new FactoryAutobuz().getMijlocTransport(100);
        MijlocTransport tramvai = new FactoryTramvai().getMijlocTransport(200);
        MijlocTransport troleibuz = new FactoryTroleibuz().getMijlocTransport(300);
        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());*/

        afisareMijlocTransport(new FactoryAutobuz(), 100);
        afisareMijlocTransport(new FactoryTroleibuz(), 101);
    }
}
