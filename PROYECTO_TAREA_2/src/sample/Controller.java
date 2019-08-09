package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class Controller extends AnchorPane {

    @FXML private Label lbl1;
    @FXML private Stage primaryStage;
    @FXML private TableView tableView1;

    private String ruta;
    private boolean iniciarTabla = false;

    private void verificarExtension(File a) throws InvalidFileException{

        String extension;

        extension = ""+ a.getAbsolutePath().charAt(a.getAbsolutePath().length()-3);
        extension += a.getAbsolutePath().charAt(a.getAbsolutePath().length()-2);
        extension += a.getAbsolutePath().charAt(a.getAbsolutePath().length()-1);

        if (!extension.equals("csv")) {

            throw new InvalidFileException();
        }
    }

    private void iniciarTabla(){
        if(!iniciarTabla){
            LectorCSV.iniciarTabla(tableView1);
            iniciarTabla=true;
        }
    }

    private File iniciarFileChooser(){

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        //FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        //fileChooser.getExtensionFilters().add(extFilter);
        File a = fileChooser.showOpenDialog(primaryStage);
        return a;
    }

    private void actualizarLabels(String a){

        lbl1.setText(a);
        ruta = a;

        tableView1.getItems().clear();
    }

    public void seleccionarArchivo(MouseEvent event){

        iniciarTabla();

        File a = iniciarFileChooser();

        try{
            verificarExtension(a);
        }catch (InvalidFileException ex){
            new Alert(Alert.AlertType.ERROR, "Se ha lanzado la excepcion InvalidFileException debido a que el archivo seleccionado no es de tipo CSV!!").showAndWait();
        }

        actualizarLabels(a.getAbsolutePath());


        //Tarea 2

        try{

            LectorCSV.ImportarCSV(tableView1, ruta);

        }catch (EmptyFileException ex){

            new Alert(Alert.AlertType.ERROR, "Se ha lanzado la excepcion EmptyFileException debido a que el archivo seleccionado se encuentra vacio!!").showAndWait();

        }catch(SeparatorException ex){
            new Alert(Alert.AlertType.ERROR, "Se ha lanzado la excepcion SeparatorException debido a que el formato esta mal, debe separase con comas (,) !!").showAndWait();
        }

        //Tarea 2

    }

}
