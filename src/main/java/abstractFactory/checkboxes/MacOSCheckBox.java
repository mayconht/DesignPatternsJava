package abstractFactory.checkboxes;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("This is a Mac CheckBox");
    }
}
