package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	private static Scene mainScene;
	
	private static Stage stage;
	
	private static Scene primeiraScene;
	private static Scene segundaScene;
	private static Scene terceiraScene;
	
	
	@Override
	public void start(Stage primaryStage) {
		
		stage = primaryStage;
		
		try {
			
			Parent primeiraView = FXMLLoader.load(getClass().getResource("/gui/PrimeiraView.fxml"));
			primeiraScene = new Scene(primeiraView, 500, 500);
			
			Parent segundaView = FXMLLoader.load(getClass().getResource("/gui/SegundaView.fxml"));
			segundaScene = new Scene(segundaView, 500, 500);
			
			Parent terceiraView = FXMLLoader.load(getClass().getResource("/gui/TerceiraView.fxml"));
			terceiraScene = new Scene(terceiraView, 500, 500);
			
			stage.setScene(primeiraScene);
			stage.setTitle("Treino de navegação entre Telas");
			stage.setResizable(false);
			stage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void changeScreen(String newScreen) {
		switch(newScreen) {
		case "primeiraView":
			stage.setScene(primeiraScene);
			break;
		case "segundaView":
			stage.setScene(segundaScene);
			break;
		case "terceiraView":
			stage.setScene(terceiraScene);
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	public static Scene getMainScene() {
		return mainScene;
	}


}
