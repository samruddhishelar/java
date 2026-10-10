
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class javafx1 extends Application
{
    TextField input, output;
    Button process, clear;
    public void start(Stage stage)
    {
        Label l1 = new Label("Enter Number:");
        input = new TextField();

        Label l2 = new Label("Result:");
        output = new TextField();
        output.setEditable(false);

        process = new Button("Process");
        process.setOnAction(e -> checkPrime());
        
        clear = new Button("Clear");
        clear.setOnAction(e -> {
                          input.clear();
                          output.clear();
                          input.requestFocus();
                          }); 
      
        VBox v = new VBox(10);
        v.getChildren().addAll(l1, input, process, l2, output, clear);

        Scene s = new Scene(v, 300, 250);

        stage.setTitle("Prime Number");
        stage.setScene(s);
        stage.show();
    }

    void checkPrime()
    {
        int n = Integer.parseInt(input.getText());
        boolean prime = true;
        if (n <= 1)
        {
            prime = false;
        }
        else
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            output.setText(n + " is a Prime Number");
        else
            output.setText(n + " is Not a Prime Number");
    }

    public static void main(String args[])
    {
        launch(args);
    }
}