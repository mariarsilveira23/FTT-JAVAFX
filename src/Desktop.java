import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Desktop extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		
		btn.setText("Oi");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Tudo bem?");
			}
		});
		
		StackPane root = new StackPane();
		
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, 300,300);
		
		primaryStage.setTitle("timao eo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

}
