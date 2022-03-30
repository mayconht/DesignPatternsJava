package abstractFactory.factory;

import abstractFactory.buttons.Button;
import abstractFactory.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
