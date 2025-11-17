/**
 * 
 */
/**
 * 
 */
module ProjetoNotepad {
	
	requires javafx.controls;
	requires javafx.fxml;
	
	opens notepad.main to javafx.graphics, javafx.fxml;
	opens notepad.controller to javafx.fxml;
}