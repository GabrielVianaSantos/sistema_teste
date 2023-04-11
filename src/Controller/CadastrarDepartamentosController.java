package Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

public class CadastrarDepartamentosController implements Initializable {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//Conectando o Banco de Dados ao Projeto JavaFX
        btnSalvar.setOnMouseClicked((MouseEvent e)->{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection ("jdbc:mysql://localhost:3306/banco_teste", "root", "55122006");
                PreparedStatement st = conectado.prepareStatement("insert into departamentos values(?,?,?,?)");
                st.setInt(1, Integer.parseInt (txtCodigo.getText()));
                st.setString(2, txtNome.getText());
                st.setString(3, txtTelefone.getText());
                st.setString(4, txtCidade.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Departamento cadastrado com sucesso!");
                txtCodigo.setText("");
                txtNome.setText("");
                txtTelefone.setText("");
                txtCidade.setText("");
            
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        });
    }    
    
}
