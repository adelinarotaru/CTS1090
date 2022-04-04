package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Dorel").setOraIncepereProgram(12);

        Autobuz autobuz = autobuzBuilder.build();
        Autobuz autobuz1 = new AutobuzBuilder().
                setNumeSofer("Ion").
                setNrLinie(49).
                build();

        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());

        AutobuzBuilder autobuzBuilder1 = new AutobuzBuilder();
        autobuzBuilder1.setTextRulat("La multi ani").setOraIncepereProgram(9);

        Autobuz a1 = autobuzBuilder1.build();
//      Autobuz a2 = autobuzBuilder1.build(new AutobuzBuilder());

    }
}