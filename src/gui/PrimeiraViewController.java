package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class PrimeiraViewController implements Initializable {

	
	@FXML
	private Button btnTela;
	
	
	@FXML
	private void onBtnTelaAction() {
		Main.changeScreen("segundaView");
	}
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
