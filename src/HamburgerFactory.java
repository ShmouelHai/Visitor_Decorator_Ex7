public class HamburgerFactory {

    public static Hamburger createHamburger(String choice){
        switch (choice){
            case "cl":
                return new ClassicHamburger();
            case "sp":
                return new SpicyHamburger();
            case "la":
                return new LambHamburger();
            case "hm":
                return new HomemadeHamburger();
            default:
                throw new RuntimeException("wrong Hamburger");
        }
    }
}
