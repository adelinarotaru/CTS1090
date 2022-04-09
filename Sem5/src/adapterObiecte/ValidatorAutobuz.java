package adapterObiecte;

public class ValidatorAutobuz implements Validator {
    @Override
    public void validareAbonament() {
        System.out.println("Am verificat abonamentul!");
    }

    @Override
    public void validareBilet() {
        System.out.println("Am verificat biletul!");

    }
}