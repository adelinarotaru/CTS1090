package main;

import clase.SMS;
import clase.Validator;

public class Program {
    public static void main(String[] args) {
        Validator validator = new Validator(3);
        validator.valideazaCalatorie(); // primul calator
        // modificare la run time
        validator.setModPlata(new SMS());
        validator.valideazaCalatorie();
    }
}
