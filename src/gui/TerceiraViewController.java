package gui;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class TerceiraViewController implements Initializable {

	
	@FXML
	private Button btnTela;
	
	@FXML
	private Button btnVoltar;
	
	
	
	@FXML
	private void onBtnTelaAction(ActionEvent e) throws InterruptedException {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("ATENÇÃO!!!");
		alert.setContentText("aqui poderia carregar um modal ou outra tela.");
		alert.setHeaderText("Botão precionado...");
		
		
		Optional<ButtonType> result = alert.showAndWait();
		ButtonType button = result.orElse(ButtonType.CANCEL);

		if (button == ButtonType.OK) {
			currentStage(e).close();
		} else {
			System.out.println("fechou o alert manualmente e voltou para Terceira Tela");
		}
	}
	
	@FXML
	private void onBtnVoltarAction() {
		Main.changeScreen("segundaView");
	}
	
	
		
	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}





	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
