package Class;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CadastrarDepartamentos extends Application {
    private static Stage stage;//Janela 1
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/CadastrarDepartamentos.fxml"));//Carrega FXML
        Scene scene = new Scene (root);//Coloca o FXML em uma Cena
        stage.setTitle("Cadastrar Departamento");
        stage.setScene(scene);// Coloca a Cena em uma Janela
        stage.show();//Abre a Janela2
        setStage(stage);//Colocando a Janela2 na Janela1
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        CadastrarDepartamentos.stage = stage;//Seta na Janela1 a Janela2
    }
        
    
}
