import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class mouse extends Application
{
    TextField position;

    public void start(Stage stage)
    {
        Label l1 = new Label("Move or Click the Mouse");
        
        position = new TextField();
        position.setEditable(false);

        VBox v = new VBox(10);
        v.getChildren().addAll(l1, position);

        Scene scene = new Scene(v, 500, 300);

        
        scene.setOnMouseMoved(e -> {
            position.setText(
                "Mouse Moved: X = " + e.getX() +
                "  Y = " + e.getY()
            );
        });

        
        scene.setOnMouseClicked(e -> {
            position.setText(
                "Mouse Clicked: X = " + e.getX() +
                "  Y = " + e.getY()
            );
        });

        stage.setTitle("Mouse Event Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}