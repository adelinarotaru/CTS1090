package main;

import clase.Autobuz;
import clase.LaCapatDeLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(99);

        autobuz.trimiteLaReparat();
        autobuz.pleacaInCursa();
        autobuz.iesireDinService();
        autobuz.pleacaInCursa();
        autobuz.trimiteLaReparat();
        // autobuz.setState(new LaCapatDeLinie()); // la state nu trebuie sa avem voie sa facem asta
        autobuz.ajungeLaCapatDeLinie();
    }
}
