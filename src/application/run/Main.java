package application.run;

import application.service.Logic;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	/**
	 * Method sets coordinates of elements on the stage.
	 * @param button
	 * @param bin
	 * @param dec
	 * @param result
	 * @param textField
	 */
	public static void setCoordinates(Button button, Label bin, Label dec, Label result, TextField textField, Label bsuir) {
		dec.setLayoutX(20);
		dec.setLayoutY(40);
		
		bin.setLayoutX(180);
		bin.setLayoutY(40);
		
		textField.setLayoutX(20);
		textField.setLayoutY(70);
		
		result.setLayoutX(180);
		result.setLayoutY(70);
		
		button.setLayoutX(20);
		button.setLayoutY(120);
		
		bsuir.setLayoutX(20);
		bsuir.setLayoutY(20);
	}
	
	@Override
	public void start(Stage stage) {
		stage.setTitle("Converter");
		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root, 300, 200);
		stage.setScene(scene);
		Button button = new Button("Convert");
		Label dec = new Label("Decimal");
		Label bin = new Label("Binary");
		Label result = new Label();
		Label bsuir = new Label("BSUIR is knowledge and style of life");
		TextField textField = new TextField();
		setCoordinates(button, bin, dec, result, textField, bsuir);
		root.getChildren().addAll(dec, bin, textField, result, button, bsuir);
		Logic logic = new Logic();
		button.setOnAction(value -> 
		result.setText(logic.convert(Integer.parseInt(textField.getText()))));
		stage.show();
	}
	
	/**
	 * Method converts decimal numbers into binary.
	 * @param num
	 * @return String
	 */
	public static String convert(int num) {
		StringBuilder res = new StringBuilder();
		while(num>0) {
			res.append(num%2);
			num/=2;
		}
		res.reverse();
		return res.toString();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
