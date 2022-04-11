package main;

import clase.Decorator;
import clase.DecoratorAbstract;
import clase.Iimprimanta;
import clase.ImprimantaBilete;

public class Program {
    public static void main(String[] args) {
        Iimprimanta iimprimanta = new ImprimantaBilete(5);
        iimprimanta.printeazaBilet();

        DecoratorAbstract decorator = new Decorator(iimprimanta, "Paste fericit");
        decorator.printeazaBilet();
        decorator.printeazaVerso();
    }
}
