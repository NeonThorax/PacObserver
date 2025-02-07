public class Main {
    public static void main(String[] args) {
        Edible pill = new Pill();
        Edible powerPill = new PowerPill();
        Edible fruit = new Fruit();

        Enemy ghost = new Ghost();

        pill.register(ghost);
        powerPill.register(ghost);
        fruit.register(ghost);

        pill.setState("Active");
        powerPill.setState("Super Active");
        fruit.setState("Eaten");
    }
}