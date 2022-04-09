package main;

import adapterClase.AdapterMetrou;
import adapterObiecte.Validator;
import adapterObiecte.ValidatorAutobuz;
import adapterObiecte.ValidatorSubteranAdapter;
import metrou.ValidatorMetrou;

public class Program {
    public static void valideazaBilet(Validator validator){
        validator.validareBilet();

    }

    public static void valideazaAbonament(Validator validator){
        validator.validareAbonament();

    }


    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        ValidatorSubteranAdapter adapter = new ValidatorSubteranAdapter(validatorMetrou);
        valideazaBilet(adapter);

        valideazaAbonament(adapter);

        AdapterMetrou adapterMetrou = new AdapterMetrou();
        valideazaAbonament(adapterMetrou);



    }

}
