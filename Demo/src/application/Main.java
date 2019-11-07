package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button ;

public class Main extends Application {

	Button button;
	public static void main(String[] args) {
		launch(args);
	}
  @Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	primaryStage.setTitle("the_of_the_window");
	button =new Button();
	button.setText("click me");
	 
  }
}

