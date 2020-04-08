package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;

    String operacao = "";

    @FXML
    private Button zeroButton;
    @FXML
    private Button pontoButton;
    @FXML
    private Button igualButton;
    @FXML
    private TextField telaTextField;
    @FXML
    private Button umButton;
    @FXML
    private Button doisButton;
    @FXML
    private Button tresButton;
    @FXML
    private Button maisButton;
    @FXML
    private Button quatroButton;
    @FXML
    private Button cincoButton;
    @FXML
    private Button seisButton;
    @FXML
    private Button seteButton;
    @FXML
    private Button oitoButton;
    @FXML
    private Button noveButton;
    @FXML
    private Button menosButton;
    @FXML
    private Button zerarButton;
    @FXML
    private Button divButton;
    @FXML
    private Button multButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        umButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "1");
            }
        });
        doisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "2");
            }
        });
        tresButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "3");
            }
        });
        quatroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "4");
            }
        });
        cincoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "5");
            }
        });
        seisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "6");
            }
        });
        seteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "7");
            }
        });
        oitoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "8");
            }
        });
        noveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "9");
            }
        });
        zeroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "0");
            }
        });

        multButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "*";
            }
        });
        divButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "/";
            }
        });
        maisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "+";
            }
        });
        menosButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "-";
            }
        });
        zerarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText("");
                valor1 = 0;
                valor2 = 0;
                operacao = "";
            }
        });

        igualButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor2 = Double.parseDouble(telaTextField.getText());

                switch (operacao) {
                    case "+":
                        resultado = valor1 + valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "/":
                        resultado = valor1 / valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                }
                operacao = "";
                valor1 = 0;
                valor2 = 0;
            }
        });

    }

}
