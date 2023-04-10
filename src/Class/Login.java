package Class;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
    private static Stage stage;//Janela 1
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
       @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/Login.fxml"));//Carrega FXML
        Scene scene = new Scene (root);//Coloca o FXML em uma Cena
        stage.setTitle("Login de Usuário");
        stage.setScene(scene);// Coloca a Cena em uma Janela
        stage.show();//Abre a Janela2
        setStage(stage);//Colocando a Janela2 na Janela1
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Login.stage = stage;//Seta na Janela1 a Janela2
    }
        
    
}
