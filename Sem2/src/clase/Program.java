package clase;

import readers.AngajatiReader;
import readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        IReader reader = new AngajatiReader();
        try {
            listaAngajati = reader.readAplicanti("angajati.txt");
            for (Aplicant angajat : listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
