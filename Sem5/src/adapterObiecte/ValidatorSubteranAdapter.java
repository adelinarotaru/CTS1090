package adapterObiecte;

import metrou.ValidatorMetrou;

public class ValidatorSubteranAdapter implements Validator {
    private ValidatorMetrou validatorMetrou;


    @Override
    public void validareAbonament() {

        validatorMetrou.ValidareAbonament();
    }

    @Override
    public void validareBilet() {
        validatorMetrou.ValidareCalatorie();

    }

    public ValidatorSubteranAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }
}
