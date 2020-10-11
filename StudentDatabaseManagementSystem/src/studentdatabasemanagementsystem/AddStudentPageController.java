
package studentdatabasemanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


public class AddStudentPageController implements Initializable {
    @FXML
    private TextField studentName;
    @FXML
    private TextField studentId;
    @FXML
    private TextField studentEmail;
    @FXML
    private TextField studentDepertment;
    @FXML
    private TextField studentAddress;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void adStudentButtonAction(ActionEvent event) {
    }
    
}
