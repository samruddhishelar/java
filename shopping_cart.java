import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class shopping_cart extends Application
{
    TextArea cart;
    Label total;

    int amount = 0;

    public void start(Stage stage)
    {
        Label title = new Label("Shopping Cart");

        // Item buttons
        Button b1 = new Button("Pen - ₹10");
        Button b2 = new Button("Notebook - ₹50");
        Button b3 = new Button("Bag - ₹500");
        Button b4 = new Button("Bottle - ₹100");

        // Cart display
        cart = new TextArea();
        cart.setEditable(false);

        total = new Label("Total: ₹0");

        // Button actions
        b1.setOnAction(e -> addItem("Pen", 10));
        b2.setOnAction(e -> addItem("Notebook", 50));
        b3.setOnAction(e -> addItem("Bag", 500));
        b4.setOnAction(e -> addItem("Bottle", 100));

        // Layout
        VBox items = new VBox(10);
        items.getChildren().addAll(
            b1, b2, b3, b4
        );

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
            title,
            items,
            new Label("Cart:"),
            cart,
            total
        );

        Scene scene = new Scene(layout, 350, 400);

        stage.setTitle("Shopping Cart");
        stage.setScene(scene);
        stage.show();
    }

    // Method to add item to cart
    void addItem(String item, int price)
    {
        cart.appendText(item + " - ₹" + price + "\n");

        amount = amount + price;

        total.setText("Total: ₹" + amount);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}