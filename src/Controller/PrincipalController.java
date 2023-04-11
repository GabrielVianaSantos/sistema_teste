package Controller;

import Class.CadastrarDepartamentos;
import Class.CadastrarUsuarios;
import Class.Login;
import Class.Principal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class PrincipalController implements Initializable {

        @FXML
    void itmCadastrarDepartamentos(ActionEvent event) {
        abreCadastrarDepartamentos();
    }

    @FXML
    void itmCadastrarFuncionarios(ActionEvent event) {
        
    }

    @FXML
    void itmCadastrarUsuarios(ActionEvent event) {
        abreCadastrarUsuarios();
    }

    @FXML
    void itmSobre(ActionEvent event) {

    }
    
     @FXML
    void btnSair(ActionEvent event) {
        sair();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    

//MÉTODOS---------------------------------
    
    //Método para abrir a tela Cadastro de Departamentos
    public void abreCadastrarDepartamentos(){
        CadastrarDepartamentos departamentos = new CadastrarDepartamentos();
        fechaMenu();
        try { 
            departamentos.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para abrir a tela Cadastro de Usuários
    public void abreCadastrarUsuarios(){
        CadastrarUsuarios usuarios = new CadastrarUsuarios();
        fechaMenu();
        try { 
            usuarios.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para fechar a tela Principal (Menu)
    public void fechaMenu(){
        Principal.getStage().close();
    }
    
    //Faz LogOff de Usuário (Fecha a tela Principal), voltando para tela de Login 
    public void sair(){
        fechaMenu();
        Login sair = new Login();
            try {
                sair.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
