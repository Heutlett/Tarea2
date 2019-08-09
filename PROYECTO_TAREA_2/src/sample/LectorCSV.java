/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorCSV {

    private static final ObservableList<Tabla> dataList = FXCollections.observableArrayList();

    public static void ImportarCSV(TableView tableView, String ruta) throws EmptyFileException{

        String CsvFile = ruta;
        String FieldDelimiter = ",";

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(CsvFile));

            if(br.readLine() == null){

                throw new EmptyFileException();


            }else{
                br = new BufferedReader(new FileReader(CsvFile));
            }

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(FieldDelimiter, -1);

                Tabla record = new Tabla();

                for(int i = 0; i < fields.length; i++){
                    record.setFNumber(i,fields[i]);
                }

                dataList.add(record);

            }

        } catch (FileNotFoundException ex) {

            new Alert(Alert.AlertType.ERROR, "El archivo no existe").showAndWait();


        } catch (IOException ex) {

        }

    }

    public static void iniciarTabla(TableView tableView){

        TableColumn columnF1 = new TableColumn("f1");
        columnF1.setCellValueFactory(
                new PropertyValueFactory<>("f1"));

        TableColumn columnF2 = new TableColumn("f2");
        columnF2.setCellValueFactory(
                new PropertyValueFactory<>("f2"));

        TableColumn columnF3 = new TableColumn("f3");
        columnF3.setCellValueFactory(
                new PropertyValueFactory<>("f3"));

        TableColumn columnF4 = new TableColumn("f4");
        columnF4.setCellValueFactory(
                new PropertyValueFactory<>("f4"));

        TableColumn columnF5 = new TableColumn("f5");
        columnF5.setCellValueFactory(
                new PropertyValueFactory<>("f5"));

        TableColumn columnF6 = new TableColumn("f6");
        columnF6.setCellValueFactory(
                new PropertyValueFactory<>("f6"));

        TableColumn columnF7 = new TableColumn("f7");
        columnF7.setCellValueFactory(
                new PropertyValueFactory<>("f7"));

        TableColumn columnF8 = new TableColumn("f8");
        columnF8.setCellValueFactory(
                new PropertyValueFactory<>("f8"));

        TableColumn columnF9 = new TableColumn("f9");
        columnF9.setCellValueFactory(
                new PropertyValueFactory<>("f9"));

        TableColumn columnF10 = new TableColumn("f10");
        columnF10.setCellValueFactory(
                new PropertyValueFactory<>("f10"));


        tableView.setItems(dataList);

        tableView.getColumns().addAll(
                columnF1, columnF2, columnF3, columnF4, columnF5, columnF6,columnF7,columnF8,columnF9,columnF10);

    }

}
