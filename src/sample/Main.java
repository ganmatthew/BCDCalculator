package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    private GridPane grid;
    private TextField outputDensely;
    private TextField outputPacked;
    private TextField outputUnpacked;
    private TextField outputDecimal;

    private Text unpacked;
    private Text packed;
    private Text densely;

    private Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("BCD Calculator");

        grid = new GridPane();

        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        displayInputs();
        displayOutputs();
        displayTxtFile();

        primaryStage.setScene(new Scene(grid, 550, 650));

        primaryStage.show();
    }

    // display button to export to TXT file
    public void displayTxtFile(){
        Button txt = new Button("Export to Notepad");
        txt.setPrefWidth(150);
        txt.setPrefHeight(70);
        HBox hbBtn = new HBox(5);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(txt);
        grid.add(hbBtn, 1, 7);
    }

    public void displayInputs(){
        Text input = new Text("Inputs:");
        input.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(input, 0, 0, 2, 1);

        // text display for decimal
        Text enterdecimal = new Text("Enter Decimal:");
        enterdecimal.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(enterdecimal, 0, 1, 2, 1);

        // TEXTFIELD for decimal input
        TextField inputDecimal = new TextField();
        inputDecimal.setPrefSize(300, 100);
        grid.add(inputDecimal, 0, 2);

        // BUTTON for decimal input
        Button btn1 = new Button("CONVERT");
        btn1.setPrefWidth(150);
        btn1.setPrefHeight(70);
        HBox hbBtn = new HBox(5);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btn1);
        grid.add(hbBtn, 1, 2);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String dec = inputDecimal.getText();
                outputUnpacked.setText(controller.toUnpackedBCD(Integer.parseInt(dec)));
                outputDensely.setText(controller.toDenselyPackedBCD(Integer.parseInt(dec)));
                outputPacked.setText(controller.toPackedBCD(Integer.parseInt(dec)));
            }
        });

        Text enterdensely = new Text("Enter Densely-Packed BCD:");
        enterdensely.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(enterdensely, 0, 3, 2, 1);

        // text field for densely packed input
        TextField inputDensely = new TextField();
        inputDensely.setPrefSize(300, 100);
        grid.add(inputDensely, 0, 4);

        // BUTTON for densely packed input
        Button btn2 = new Button("CONVERT");
        btn2.setPrefWidth(150);
        btn2.setPrefHeight(70);
        HBox hbBtn2 = new HBox(5);
        hbBtn2.setAlignment(Pos.CENTER);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 1, 4);
    }

    public void displayOutputs(){
        Text output = new Text("Outputs:");
        output.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(output, 0, 5, 2, 1);

        // text field for densely packed out
        densely = new Text("Densely-Packed BCD:");
        densely.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(densely, 0, 6, 2, 1);

        // output field for densely packed input
        outputDensely = new TextField();
        outputDensely.setPrefSize(100, 100);
        //outputDensely.setAlignment(Pos.CENTER_LEFT);
        grid.add(outputDensely, 0, 7);

        // text field for packed out
        packed = new Text("Packed BCD:");
        packed.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(packed, 0, 8, 2, 1);

        // output field for packed input
        outputPacked = new TextField();
        outputPacked.setPrefSize(100, 100);
        //outputDensely.setAlignment(Pos.CENTER);
        grid.add(outputPacked, 0, 9);

        // text field for packed out
        unpacked = new Text("Unpacked BCD:");
        unpacked.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(unpacked, 0, 10, 2, 1);

        // output field for unpacked input
        outputUnpacked = new TextField();
        outputUnpacked.setPrefSize(100, 100);
        grid.add(outputUnpacked, 0, 11);

        // text field for decimal
        Text decimal = new Text("Decimal:");
        decimal.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(decimal, 0, 12, 2, 1);

        // output field for decimal input
        outputDecimal = new TextField();
        outputDecimal.setPrefSize(100, 100);
        grid.add(outputDecimal, 0, 13);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
