public abstract class HamburgerDecorator implements Hamburger{

    private Hamburger MyHamburger;

    public HamburgerDecorator(Hamburger hamburger) {
        this.MyHamburger = hamburger;
    }

    @Override
    public String serve() {
        return MyHamburger.serve();
    }
}