public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz("model1", "Gigel", 20, 1999);
        ManagerAutobuz managerAutobuz = new ManagerAutobuz();

        managerAutobuz.adaugareMemento(autobuz.creareMemento());
        autobuz.setNumeSofer("Popescu");
        managerAutobuz.adaugareMemento(autobuz.creareMemento());

        autobuz.setConsumMediu(15);
        managerAutobuz.adaugareMemento(autobuz.creareMemento());
        System.out.println(autobuz.toString());

        autobuz.revenireInStareAnterioara(managerAutobuz.getMementoAutobuz(0));
        System.out.println(autobuz.toString());
    }
}
