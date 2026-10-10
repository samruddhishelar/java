import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class key_color extends Application
{
    public void start(Stage stage)
    {
        Pane pane = new Pane();

        Scene scene = new Scene(pane, 400, 300);

        scene.setOnKeyPressed(e -> {

            if (e.isControlDown() && e.isAltDown() && e.getCode() == KeyCode.O)
            {
                pane.setStyle("-fx-background-color: orange;");
            }

            if (e.isControlDown() && e.isAltDown() && e.getCode() == KeyCode.B)
            {
                pane.setStyle("-fx-background-color: blue;");
            }

            if (e.isControlDown() && e.isAltDown() && e.getCode() == KeyCode.G)
            {
                pane.setStyle("-fx-background-color: green;");
            }

        });

        stage.setTitle("Keyboard Color");
        stage.setScene(scene);
        stage.show();

        pane.requestFocus();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
