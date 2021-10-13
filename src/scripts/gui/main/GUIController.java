package scripts.gui.main;

import com.allatori.annotations.DoNotRename;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;
import scripts.gui.AbstractGUIController;

import java.net.URL;
import java.util.ResourceBundle;

@DoNotRename
public class GUIController extends AbstractGUIController {

    @FXML
    private Button btnStart;

    @FXML
    private Button btnUpdate;

    @FXML
    private CheckBox checkShuffle;

    @FXML
    private CheckBox checkStaminas;

    @FXML
    private ComboBox<?> cmbBuyMethod;

    @FXML
    private ComboBox<?> cmbTeleport;

    @FXML
    private MenuItem mnuLoad;

    @FXML
    private MenuItem mnuNew;

    @FXML
    private MenuItem mnuSave;

    @FXML
    private Text txtTitle;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
