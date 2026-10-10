
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class calculator extends Application
{
    TextField display;

    double num1, num2, result;
    char operator;

    public void start(Stage stage)
    {
        display = new TextField();
        display.setEditable(false);

        // Create digit buttons
        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");

        // Create operator buttons
        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button equal = new Button("=");
        Button clear = new Button("C");

        // Digit button actions
        b0.setOnAction(e -> display.appendText("0"));
        b1.setOnAction(e -> display.appendText("1"));
        b2.setOnAction(e -> display.appendText("2"));
        b3.setOnAction(e -> display.appendText("3"));
        b4.setOnAction(e -> display.appendText("4"));
        b5.setOnAction(e -> display.appendText("5"));
        b6.setOnAction(e -> display.appendText("6"));
        b7.setOnAction(e -> display.appendText("7"));
        b8.setOnAction(e -> display.appendText("8"));
        b9.setOnAction(e -> display.appendText("9"));

        // Operator button actions
        add.setOnAction(e -> setOperator('+'));
        sub.setOnAction(e -> setOperator('-'));
        mul.setOnAction(e -> setOperator('*'));
        div.setOnAction(e -> setOperator('/'));

        // Equal button
        equal.setOnAction(e -> calculate());

        // Clear button
        clear.setOnAction(e -> {
            display.clear();
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = '\0';
        });

        // Create GridPane
        GridPane grid = new GridPane();

        grid.setHgap(10);
        grid.setVgap(10);

        // Row 0
        grid.add(b7, 0, 0);
        grid.add(b8, 1, 0);
        grid.add(b9, 2, 0);
        grid.add(div, 3, 0);

        // Row 1
        grid.add(b4, 0, 1);
        grid.add(b5, 1, 1);
        grid.add(b6, 2, 1);
        grid.add(mul, 3, 1);

        // Row 2
        grid.add(b1, 0, 2);
        grid.add(b2, 1, 2);
        grid.add(b3, 2, 2);
        grid.add(sub, 3, 2);

        // Row 3
        grid.add(b0, 0, 3);
        grid.add(equal, 1, 3);
        grid.add(clear, 2, 3);
        grid.add(add, 3, 3);

        // VBox
        VBox v = new VBox(10);
        v.getChildren().addAll(display, grid);

        Scene scene = new Scene(v, 160, 200);

        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }

    // Method to store number and operator
    void setOperator(char op)
    {
        num1 = Double.parseDouble(display.getText());

        operator = op;

        display.clear();
    }

    // Method to perform calculation
    void calculate()
    {
        num2 = Double.parseDouble(display.getText());

        switch(operator)
        {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;
        }

        display.setText(String.valueOf(result));
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
