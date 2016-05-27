package customComponent;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Cursor;
import javafx.scene.control.Skin;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class CustomTextField extends TextField implements ChangeListener<String> {
    private CustomSkin customSkin;

    //private final ToggleButton toggleButton = new ToggleButton();

    public CustomTextField() {
        textProperty().addListener(this);
        //toggleButton.getStyleClass().add("toggle-eye");
        //toggleButton.setCursor(Cursor.DEFAULT);
        //toggleButton.setManaged(false);
        //toggleButton.setVisible(false);


        /*toggleButton.setOnAction(event -> {
            setText(textProperty().getValue());
            layoutChildren();
            end();
        });*/
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();
       /* if (toggleButton.getParent() != this) getChildren().add(toggleButton);
        toggleButton.resize(getHeight() / 1.2, getHeight() / 1.2);
        toggleButton.setLayoutX(getWidth() - (toggleButton.getWidth() * 1.1));
        toggleButton.setLayoutY(getHeight() / 2 - toggleButton.getHeight() / 2);*/
//        setStyle("-fx-padding: 0.25em " + getHeight() + "  0.333333em 0.416667em;");
    }


    @Override
    protected Skin<?> createDefaultSkin() {
        customSkin = new CustomSkin(this);
        //customSkin.getMaskProperty().bind(toggleButton.selectedProperty());
        return customSkin;
    }

    @Override
    public void changed(ObservableValue<? extends String> ov, String oldValue, String newValue) {
        //toggleButton.setVisible(newValue.length() > 0);
    }
}

