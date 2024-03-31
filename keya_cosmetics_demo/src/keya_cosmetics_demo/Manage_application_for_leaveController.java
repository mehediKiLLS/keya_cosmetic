/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package keya_cosmetics_demo;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Manage_application_for_leaveController implements Initializable {

    @FXML
    private DatePicker dateOfLeaveFromDatePicker;
    @FXML
    private ComboBox<String> ReasonForLeaveComboBox;
    @FXML
    private ComboBox<Integer> numberOfDaysLeaveComboBox;
    @FXML
    private TextField CommentForApplyLeaveTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     numberOfDaysLeaveComboBox.getItems().addAll(
         1,2,3,4,5,6,7,8,9,10,11,12       
        );
        // TODO
        ReasonForLeaveComboBox.getItems().addAll(
                "Sick","Chest pressure or pain",
                "Conjunctivitis",
                "Diarrhea",
                "Discoloration of toes or fingers",
                "Headache",
                "Loss of voluntary movement",
                "speech",
                "Loss of sense of taste", "smell",
                "Shortness of breath",
                "Skin rash",
                "childbirth", "adoption", "caring for an ill family member", "serious health conditions", "military leave"
        );

        
    }
     

    @FXML
    private void SendRequestToApplyForLeaveButton(ActionEvent event) {
        
        LocalDate DateOfLeave=dateOfLeaveFromDatePicker.getValue(); 
                
        int NumberOfDays=numberOfDaysLeaveComboBox.getValue();
        
        String Reason =ReasonForLeaveComboBox.getValue();
                  
        String Comment=CommentForApplyLeaveTextField.getText();
        
  
        
        
        
        Boolean createStatus = HRUser.CreateNewLeaveApplication(DateOfLeave,NumberOfDays,Reason,Comment);
        
        if (createStatus == true){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);

        a.setHeaderText("Success!");
        a.setContentText("Submitted Successfully!");
        a.showAndWait(); 
        }
        else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
        a.setHeaderText("Failed to Submit");

        a.setContentText("Please try again!");
        a.showAndWait(); 
        }
        
    }
}
