package customComponent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root =new HBox();
        Scene scene = new Scene(root);
        CustomTextField customTextField = new CustomTextField();

        root.getChildren().add(customTextField);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
