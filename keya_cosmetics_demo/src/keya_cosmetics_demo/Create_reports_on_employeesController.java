/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package keya_cosmetics_demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Create_reports_on_employeesController implements Initializable {

    @FXML
    private ComboBox<String> SelectTypeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                SelectTypeComboBox.getItems().addAll("Employee Performance",
                "Employee Attendance",
                "Quarter");
        // TODOEmployee Performance,Employee Attendance,Quarter//
    }    

    @FXML
    private void SelectEmployeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
