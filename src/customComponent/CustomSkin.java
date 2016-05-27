package customComponent;

import com.sun.javafx.scene.control.skin.TextFieldSkin;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.shape.SVGPath;

class CustomSkin extends TextFieldSkin {

    protected TextField textField;
    final Group openEye;
    final Group closedEye;
    private static final ToggleButton toggleButton = new ToggleButton();

    public CustomSkin(final TextField textField) {
        super(textField);
        this.textField = textField;

        SVGPath path1 = new SVGPath();
        SVGPath path2 = new SVGPath();
        SVGPath path3 = new SVGPath();
        SVGPath path4 = new SVGPath();

        path1.setContent("M22.869,10.265c-0.202,0.346-3.907,6.429-11.142,6.576c-4.789,0.098-9.279-2.444-11.703-6.615\n" +
                "\t\tC0.291,9.76,0.622,9.245,1.032,8.71c0.394-0.516,0.789-0.956,1.155-1.325c-0.606-0.72-1.212-1.439-1.818-2.159\n" +
                "\t\tc-0.26-0.349-0.188-0.838,0.133-1.082c0.288-0.22,0.717-0.197,1,0.07C2.115,4.926,2.727,5.638,3.34,6.351\n" +
                "\t\tc0.312-0.225,0.647-0.453,1.005-0.68c0.33-0.21,0.651-0.401,0.962-0.576C4.809,4.119,4.31,3.143,3.812,2.167\n" +
                "\t\tC3.769,1.812,3.925,1.464,4.214,1.274c0.332-0.218,0.782-0.192,1.104,0.07c0.526,1.025,1.052,2.05,1.578,3.074\n" +
                "\t\tc0.348-0.122,0.731-0.241,1.148-0.346c0.47-0.118,0.911-0.202,1.314-0.261C9.116,2.809,8.873,1.808,8.63,0.806\n" +
                "\t\tc0.1-0.322,0.365-0.567,0.692-0.641c0.495-0.111,0.851,0.234,0.873,0.256c0.221,1.078,0.443,2.156,0.664,3.234\n" +
                "\t\tc0.348-0.045,0.779-0.07,1.271-0.033c0.407,0.031,0.764,0.099,1.061,0.174c0.299-1.026,0.598-2.051,0.897-3.077\n" +
                "\t\tc0.186-0.302,0.528-0.465,0.857-0.411c0.393,0.065,0.699,0.426,0.702,0.859c-0.292,0.97-0.583,1.94-0.875,2.91\n" +
                "\t\tc0.366,0.111,0.756,0.244,1.164,0.404c0.349,0.137,0.675,0.28,0.976,0.424c0.548-0.871,1.096-1.742,1.644-2.613\n" +
                "\t\tc0.259-0.312,0.703-0.393,1.043-0.201c0.316,0.178,0.478,0.556,0.389,0.919c-0.555,0.892-1.11,1.784-1.665,2.676\n" +
                "\t\tc0.262,0.144,0.562,0.336,0.871,0.59c0.209,0.171,0.387,0.343,0.538,0.504c0.644-0.676,1.288-1.352,1.931-2.028\n" +
                "\t\tc0.318-0.189,0.726-0.12,0.957,0.153c0.216,0.255,0.233,0.635,0.035,0.917c-0.581,0.656-1.162,1.311-1.743,1.967\n" +
                "\t\tC21.566,8.615,22.217,9.44,22.869,10.265z M2.243,10.218c0.153,0.256,3.217,5.163,9.109,5.173c5.939,0.009,9.02-4.966,9.163-5.205\n" +
                "\t\tc-0.2-0.321-3.235-5.015-8.989-5.088C5.573,5.022,2.4,9.965,2.243,10.218z");

        path2.setContent("M11.307,5.999c2.364-0.069,4.561,1.925,4.454,4.338c-0.098,2.217-2.105,3.94-4.275,3.954\n" +
                "\t\tc-2.26,0.016-4.377-1.823-4.357-4.183C7.149,7.829,9.155,6.062,11.307,5.999z");

        path3.setContent("M20.511,10.448c-0.233,0.365-3.253,4.905-8.891,5.016c-6.062,0.118-9.307-4.999-9.444-5.224\n" +
                "\t\tc-0.735,0.003-1.471,0.005-2.206,0.008c0.224,0.388,0.487,0.801,0.796,1.228c0.466,0.641,0.94,1.179,1.38,1.624\n" +
                "\t\tc-0.629,0.761-1.259,1.522-1.888,2.283c-0.187,0.327-0.105,0.746,0.189,0.978c0.296,0.234,0.724,0.216,1-0.043\n" +
                "\t\tc0.352-0.404,0.705-0.815,1.058-1.232c0.268-0.317,0.533-0.632,0.794-0.946c0.662,0.426,1.324,0.852,1.986,1.279\n" +
                "\t\tc-0.463,0.916-0.926,1.832-1.389,2.747c-0.113,0.362,0.026,0.754,0.335,0.957c0.33,0.215,0.779,0.165,1.062-0.126\n" +
                "\t\tc0.277-0.503,0.555-1.013,0.831-1.532c0.247-0.462,0.488-0.921,0.724-1.376c0.366,0.134,0.771,0.265,1.214,0.382\n" +
                "\t\tc0.431,0.114,0.838,0.199,1.214,0.262c-0.11,0.472-0.227,0.951-0.349,1.437c-0.132,0.52-0.266,1.03-0.404,1.531\n" +
                "\t\tc0.016,0.052,0.154,0.466,0.584,0.624c0.338,0.124,0.725,0.043,1-0.209c0.114-0.54,0.228-1.081,0.341-1.624\n" +
                "\t\tc0.112-0.536,0.222-1.07,0.332-1.603c0.347,0.025,0.731,0.035,1.147,0.02c0.451-0.016,0.863-0.059,1.231-0.114\n" +
                "\t\tc0.136,0.489,0.271,0.98,0.405,1.474c0.141,0.519,0.281,1.035,0.418,1.55c0.18,0.3,0.508,0.471,0.834,0.437\n" +
                "\t\tc0.402-0.042,0.735-0.391,0.77-0.834c-0.155-0.512-0.312-1.026-0.471-1.54c-0.144-0.469-0.289-0.937-0.434-1.403\n" +
                "\t\tc0.367-0.095,0.765-0.217,1.187-0.373c0.374-0.139,0.715-0.286,1.023-0.434c0.16,0.264,0.553,0.912,0.712,1.176\n" +
                "\t\tc0.227,0.375,0.649,1.071,0.877,1.446c0.276,0.337,0.76,0.411,1.104,0.186c0.311-0.202,0.448-0.607,0.322-0.976\n" +
                "\t\tc-0.281-0.466-0.573-0.937-0.877-1.414c-0.257-0.404-0.514-0.798-0.77-1.183c0.249-0.144,0.517-0.315,0.795-0.519\n" +
                "\t\tc0.237-0.174,0.449-0.348,0.636-0.516c0.613,0.641,1.226,1.283,1.838,1.924c0.3,0.257,0.751,0.235,1.021-0.043\n" +
                "\t\tc0.262-0.271,0.277-0.706,0.03-0.999c-0.564-0.655-1.129-1.311-1.693-1.966c0.377-0.365,0.785-0.811,1.188-1.344\n" +
                "\t\tc0.279-0.369,0.514-0.727,0.713-1.062C22.029,10.4,21.27,10.424,20.511,10.448z");

        path4.setContent("M0.031,5.761c0.87-0.468,1.797-0.91,2.781-1.312c7.496-3.063,14.81-2.399,19.719-1.344\n" +
                "\t\tc-0.899,1.286-1.834,1.692-2.344,1.844c-0.282,0.084-0.553,0.118-1.094,0.188c-1.341,0.171-2.374,0.158-2.531,0.156\n" +
                "\t\tc-2.361-0.02-6.424,1.019-6.594,1.063c-3.15,0.815-4.159,1.598-6.5,1.563c-1.181-0.018-2.186-0.256-2.844-1\n" +
                "\t\tC0.269,6.515,0.11,6.072,0.031,5.761z");
        toggleButton.setCursor(Cursor.DEFAULT);
        toggleButton.setManaged(false);
        toggleButton.setVisible(false);




        openEye = new Group();
        closedEye = new Group();

        openEye.getChildren().addAll(path1, path2);
        closedEye.getChildren().addAll(path3, path4);

        toggleButton.setGraphic(closedEye);
        toggleButton.setFocusTraversable(false);

        toggleButton.selectedProperty().addListener((observable1, oldValue, newValue) -> {
            textField.setText(textField.getText());
            textField.end();
            if (newValue) {
                toggleButton.setGraphic(openEye);
            } else {
                toggleButton.setGraphic(closedEye);
            }
        });

        textField.textProperty().addListener(observable -> {
            toggleButton.visibleProperty().set(!textField.textProperty().get().isEmpty());
        });
    }

    @Override
    protected String maskText(String txt) {
        if (getSkinnable() instanceof PasswordField && !toggleButton.selectedProperty().get()) {
            int n = txt.length();
            StringBuilder passwordBuilder = new StringBuilder(n);
            for (int i = 0; i < n; i++) {
                passwordBuilder.append(BULLET);
            }

            return passwordBuilder.toString();
        } else {
            return txt;
        }
    }

    @Override
    protected void layoutChildren(double x, double y, double w, double h) {
        super.layoutChildren(x, y, w, h);
        System.out.println("x-" + x + " y-" + y + " w-" + w + " h-" + h);
        if (toggleButton.getParent() != textField) {
            getChildren().add(toggleButton);
            toggleButton.resize(snapSize(openEye.prefWidth(-1)), h);
            textField.setStyle("-fx-padding: 0.25em " + (h + 10) + "  0.333333em 0.416667em;");
        }

        positionInArea(toggleButton, textField.getWidth() - toggleButton.getWidth(), y, snapSize(openEye.prefWidth(-1)), h, 0, HPos.CENTER, VPos.CENTER);
        System.out.println("\n" + textField.getWidth() + "\n");
    }

}
