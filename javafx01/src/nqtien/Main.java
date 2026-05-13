package nqtien;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
//		button
		Button btn = new Button();
		btn.setText("Hello");
		
//		pane
		StackPane stp = new StackPane();
		stp.getChildren().add(btn);
		
//		scene
		Scene scn = new Scene(stp, 500, 500);
		
		arg0.setTitle("Hello World!");
		arg0.setScene(scn);
		arg0.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
}