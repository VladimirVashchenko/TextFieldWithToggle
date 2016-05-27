package customComponent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Cursor;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Skin;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class CustomTextField extends PasswordField {
    private CustomSkin customSkin;

    public CustomTextField() {

    }

    @Override
    protected Skin<?> createDefaultSkin() {
        customSkin = new CustomSkin(this);
        return customSkin;
    }


}

