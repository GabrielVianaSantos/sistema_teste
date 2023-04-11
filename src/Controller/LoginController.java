package Controller;

import Class.Login;
import Class.Principal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {
    
    @FXML private Button btnCancelar;
    @FXML private Button btnLogin;
    @FXML private PasswordField txtSenha;
    @FXML private TextField txtUsuario;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Logar Clicando com o Mouse no botão "Logar"
        btnLogin.setOnMouseClicked((MouseEvent e)->{
            logar();
        });
        
        //Logar usando o ENTER no botão "Logar"
        btnLogin.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                logar();
            }
        });
        
        //Logar usando o ENTER na txt da Senha (Campo Senha)
        txtSenha.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                logar();
            }
        });
        
        //Fechar o Programa no botão "Cancelar"
        btnCancelar.setOnMouseClicked((MouseEvent e)->{
            fecha();
        });
        
        //Fechar o Programa no botão "Cancelar" com o ENTER
        btnCancelar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                fecha();
            }
        });
    }
    
    //MÉTODOS--------------------------------
    
    //Método de Fechar o Programa
    public void fecha(){
        Login.getStage().close();
    }
    
    //Método de Logar (ir para a próxima janela)
    public void logar(){
        Principal p = new Principal();
        fecha();
            try { 
            p.start(new Stage());
        } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
