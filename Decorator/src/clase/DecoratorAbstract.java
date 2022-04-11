package clase;

public abstract class DecoratorAbstract implements Iimprimanta{
    private Iimprimanta iimprimanta;

    @Override
    public void printeazaBilet() {
        iimprimanta.printeazaBilet();;
    }

    public DecoratorAbstract(Iimprimanta iimprimanta) {
        this.iimprimanta = iimprimanta;
    }

    public abstract void printeazaVerso();
}
