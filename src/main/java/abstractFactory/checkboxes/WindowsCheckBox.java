package abstractFactory.checkboxes;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("This is a Windows CheckBox");
    }
}
