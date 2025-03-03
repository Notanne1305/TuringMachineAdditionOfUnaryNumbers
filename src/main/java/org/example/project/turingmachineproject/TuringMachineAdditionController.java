package org.example.project.turingmachineproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.scene.layout.Pane;

public class TuringMachineAdditionController {
    @FXML
    private HBox TapeCells;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private TextField inputField1;
    @FXML
    private TextField inputField2;

    @FXML
    private MFXButton startButton;

    @FXML
    private Label resultLabel;

    @FXML
    private Pane diagramPane;
    private TuringMachineLogic turingMachineLogic;
    private Diagram stateDiagram;

    @FXML
    public void initialize() {
        stateDiagram = new Diagram();
        turingMachineLogic = new TuringMachineLogic(TapeCells, scrollPane, diagramPane, stateDiagram, resultLabel);

    }

    @FXML
    public void generateTape() {
        turingMachineLogic.createInputTape(inputField1.getText(), inputField2.getText());
    }

    @FXML
    public void startAutomaticMovement() {
        turingMachineLogic.startAutomaticCursorMovement();
    }

    @FXML
    public void stopAutomaticMovement() {
        turingMachineLogic.stopAutomaticCursorMovement();
    }
}
