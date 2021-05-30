public class ToppingFactory {

    public static Hamburger addTopping(Hamburger hamburger, String choice) {
        switch (choice) {
            case "ch":
                return new Chips(hamburger);
            case "or":
                return new OnionRings(hamburger);
            case "sa":
                return new Salad(hamburger);
            case "fe":
                return new FriedEgg(hamburger);
            default:
                throw new RuntimeException("wrong Topping");
        }
    }
}
