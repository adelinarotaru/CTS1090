package validator_clase;

import adapterObiecte.Validator;
import metrou.ValidatorMetrou;

public class AdapterMetrou extends ValidatorMetrou implements Validator {

    @Override
    public void validareAbonament() {
        super.ValidareAbonament();

    }

    @Override
    public void validareBilet() {
        super.ValidareCalatorie();

    }
}
