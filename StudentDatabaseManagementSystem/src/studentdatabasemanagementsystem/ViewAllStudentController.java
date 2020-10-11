
package studentdatabasemanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



public class ViewAllStudentController implements Initializable {
    @FXML
    private TableView<newStudentInfo> studentTable;
    @FXML
    private TableColumn<newStudentInfo, String> nameCol;
    @FXML
    private TableColumn<newStudentInfo, String> idCol;
    @FXML
    private TableColumn<newStudentInfo, String> emailCol;
    @FXML
    private TableColumn<newStudentInfo, String> depertmentCol;
    @FXML
    private TableColumn<newStudentInfo, String> addressCol;
    
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        AddStudentPageController.stdList.clear();
        //MySQL DataBase
        
        DataBaseAction dbAction=new DataBaseAction();
        try {
            AddStudentPageController.stdList=dbAction.getAllStudents();
        } catch (SQLException ex) {
            Logger.getLogger(ViewAllStudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        //txtDataBase
//        try {
//            File file=new File("StudentDataBase.txt");
//            if(!file.exists())file.createNewFile();
//            
//            Scanner sc=new Scanner(file);
//            while (sc.hasNext()) {
//                String str=sc.nextLine();
//                String part[]=str.split("#");
//                
//                newStudentInfo std=new newStudentInfo(part[0],part[1],part[2],part[3],part[4]);
//                AddStudentPageController.stdList.add(std);
//                
//            }
        
            nameCol.setCellValueFactory(new PropertyValueFactory<newStudentInfo,String>("name"));
            idCol.setCellValueFactory(new PropertyValueFactory<newStudentInfo,String>("id"));
            emailCol.setCellValueFactory(new PropertyValueFactory<newStudentInfo,String>("email"));
            depertmentCol.setCellValueFactory(new PropertyValueFactory<newStudentInfo,String>("depertment"));
            addressCol.setCellValueFactory(new PropertyValueFactory<newStudentInfo,String>("address"));
            studentTable.setItems(AddStudentPageController.stdList);
//        } catch (IOException ex) {
//            Logger.getLogger(ViewAllStudentController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
    }    

    @FXML
    private void deleteStudentBtnAction(ActionEvent event) throws IOException {
//        //txt DataBase
//        List<newStudentInfo>seleStudentInfos=studentTable.getSelectionModel().getSelectedItems();
//        AddStudentPageController.stdList.removeAll(seleStudentInfos);
//        
//        File file=new File("StudentDataBase.txt");
//        FileWriter fileWriter=new FileWriter(file);
//        
//        String str="";
//        for(newStudentInfo std:AddStudentPageController.stdList){
//            str+=std.getName()+"#"+std.getId()+"#"+std.getEmail()+"#"+std.getDepertment()+"#"+std.getAddress()+"\n";
//        }
//        fileWriter.write(str);
//        fileWriter.close();
        
        //MySQL Database
        
    }
    
}
