import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class color_button extends Application
{
    public void start(Stage stage)
    {
        Button red = new Button("Red");
        Button green = new Button("Green");
        Button blue = new Button("Blue");
        Button pink = new Button("Pink");

        HBox h = new HBox(10);

        h.getChildren().addAll(red, green, blue,pink);

        Scene scene = new Scene(h, 400, 200);

        
        red.setOnAction(e -> {
            h.setStyle("-fx-background-color: red;");
        });

        
        green.setOnAction(e -> {
            h.setStyle("-fx-background-color: green;");
        });

        
        blue.setOnAction(e -> {
            h.setStyle("-fx-background-color: blue;");
        });
        
       
        pink.setOnAction(e -> {
            h.setStyle("-fx-background-color: pink;");
        });

        stage.setTitle("Color Buttons");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}