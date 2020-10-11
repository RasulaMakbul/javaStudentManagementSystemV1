
package studentdatabasemanagementsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    static ObservableList<newStudentInfo> stdList=FXCollections.observableArrayList();

    @FXML
    private void adStudentButtonAction(ActionEvent event) throws IOException {
        String name=studentName.getText();
        String id=studentId.getText();
        String email=studentEmail.getText();
        String depertment=studentDepertment.getText();
        String address=studentAddress.getText();
        
        if(name.equals("")&& id.equals("") && email.equals("") && depertment.equals("") && address.equals("")) return;
        
        newStudentInfo std=new newStudentInfo(name, id, email, depertment, address);
        
        File file=new File("StudentDataBase.txt");
        if(!file.exists()) file.createNewFile();
        
        FileWriter fileWriter=new FileWriter(file,true);
        fileWriter.write(name+"#"+id+"#"+email+"#"+depertment+"#"+address+"\n");
        fileWriter.close();
        
        studentName.clear();
        studentId.clear();
        studentEmail.clear();
        studentDepertment.clear();
        studentAddress.clear();
    }
    
}
