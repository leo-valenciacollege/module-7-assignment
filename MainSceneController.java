package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.ListView;

public class MainSceneController {
	@FXML
	private Button analyzeBtn;
	@FXML
	private Button clearBtn;
	@FXML
	private ListView resultView;

	// Event Listener on Button[#analyzeBtn].onAction
	@FXML
	public void analyzeWordsClick(ActionEvent event) {
		// TODO Autogenerated
		WordOccurrence obj = new WordOccurrence();
		resultView.getItems().addAll(obj.getList());
	}
	// Event Listener on Button[#clearBtn].onAction
	@FXML
	public void clearResult(ActionEvent event) {
		// TODO Autogenerated
		resultView.getItems().clear();
	}
}
