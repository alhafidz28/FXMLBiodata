/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sweet.Cakee
 */
public class FXMLBiodataController implements Initializable {

    @FXML
    Button hapus;
    @FXML
    Button proses;
    @FXML
    private TextField anama;
    @FXML
    private TextField aalamat;
    @FXML
    private TextField aabsen;
    @FXML
    private TextField atelepon;
    @FXML
    private TextArea hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ahapus(ActionEvent event) {
    anama.setText("");
    aalamat.setText("");
    aabsen.setText("");
    atelepon.setText("");
    hasil.setText("");
    }

    @FXML
    private void aproses(ActionEvent event) {
        String nama = anama.getText();
        String alamat = aalamat.getText();
        String absen = aabsen.getText();
        String telepon = atelepon.getText();
        hasil.setText("Nama : "+nama+"\n"+"Alamat : "+alamat+"\n"+"Absen : "+absen+"\n"+"Nomor Telepon : "+telepon+"\n");
        
    }

    @FXML
    private void nama(ActionEvent event) {
    }

    @FXML
    private void alamat(ActionEvent event) {
    }

    @FXML
    private void absen(ActionEvent event) {
    }

    @FXML
    private void telepon(ActionEvent event) {
    }

}
