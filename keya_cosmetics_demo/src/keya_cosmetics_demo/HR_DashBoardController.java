/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package keya_cosmetics_demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class HR_DashBoardController implements Initializable {
    
    /**
     * Initializes the controller class.
     */
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

        
         

    @FXML
    private void UpdatePoliciesOnClick(ActionEvent event)throws IOException {
          FXMLLoader loader = new FXMLLoader(getClass().getResource("update_policies_and_procedures.fxml"));
       root = loader.load();

       
       Stage stage = new Stage();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
        
          
        
    }

    @FXML
    private void ManageApplicationForLeaveButtonOnClick(ActionEvent event)throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("manage_application_for_leave.fxml"));
       root = loader.load();

       
       Stage stage = new Stage();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }

    @FXML
    private void viewAndUpdateEmployeeProfileButtonOnClick(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view_and_update_employee_profile.fxml"));
       root = loader.load();

       
       Stage stage = new Stage();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
        
        
    }

    @FXML
    private void AddNewEmployeeButtonOnClick(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Add_new_employee.fxml"));
       root = loader.load();

       
       Stage stage = new Stage();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
        
        
    }
    

    @FXML
    private void CreateReportOnEmployeesButtonOnClick(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("create_reports_on_employees.fxml"));
       root = loader.load();

       
       Stage stage = new Stage();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
        
        
    }
    
    
    
}





