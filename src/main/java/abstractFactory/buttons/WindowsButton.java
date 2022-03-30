package abstractFactory.buttons;

public class WindowsButton implements Button{
    /**
     * All products families have the same varieties (MacOS/Windows).
     *
     * This is another variant of a button.
     */

    @Override
    public void paint() {
        System.out.println("This is a Windows Button");
    }
}
