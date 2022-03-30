package abstractFactory.buttons;

public class MacOSButton implements Button{

    /**
     * All products families have the same varieties (MacOS/Windows).
     *
     * This is a MacOS variant of a button.
     */
    @Override
    public void paint() {
        System.out.println("This is a macOsButton");
    }
}
