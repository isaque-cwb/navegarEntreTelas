package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class SegundaViewController implements Initializable {

	
	@FXML
	private Button btnTela;
	
	@FXML
	private Button btnVoltar;
	
	
	
	@FXML
	private void onBtnTelaAction() {
		Main.changeScreen("terceiraView");
	}
	
	@FXML
	private void onBtnVoltarAction() {
		Main.changeScreen("primeiraView");
	}
	
	
		





	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
