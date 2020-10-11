
package studentdatabasemanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

public class FXMLDocumentController implements Initializable {
    @FXML
    private VBox homePageContent;
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void addAllStudentBtnAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("addStudentPage.fxml"));
        homePageContent.getChildren().setAll(pane);
        
    }

    @FXML
    private void ViewAllStudentBtnAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("viewAllStudent.fxml"));
        homePageContent.getChildren().setAll(pane);
    }
    
}
