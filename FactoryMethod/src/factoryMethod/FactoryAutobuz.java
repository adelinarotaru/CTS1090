package factoryMethod;

public class FactoryAutobuz implements FactoryMijlocTransport {

    public MijlocTransport getMijlocTransport(int nrInmatriculare) {

        return new Autobuz(nrInmatriculare);
    }
}
