
package studentdatabasemanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


public class AddStudentPageController implements Initializable {
    @FXML
    private TextField nameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField depertmentField;
    @FXML
    private TextField addressField;
    
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    static ObservableList<newStudentInfo> stdList=FXCollections.observableArrayList();

    @FXML
    private void adStudentButtonAction(ActionEvent event) throws IOException, SQLException {
        String name=nameField.getText();
        String id=idField.getText();
        String email=emailField.getText();
        String depertment=depertmentField.getText();
        String address=addressField.getText();
        
        if(name.equals("")&& id.equals("") && email.equals("") && depertment.equals("") && address.equals("")) return;
        
        newStudentInfo std=new newStudentInfo(name, id, email, depertment, address);
//        //createing txtDataBase
//        File file=new File("StudentDataBase.txt");
//        if(!file.exists()) file.createNewFile();
//        
//        FileWriter fileWriter=new FileWriter(file,true);
//        fileWriter.write(name+"#"+id+"#"+email+"#"+depertment+"#"+address+"\n");
//        fileWriter.close();
        
          //creating MySQL DataBase
        DataBaseAction dbAction=new DataBaseAction();
        dbAction.insertStudent(std);
        
        nameField.clear();
        idField.clear();
        emailField.clear();
        depertmentField.clear();
        addressField.clear();
    }
    
}
