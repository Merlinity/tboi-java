import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import je.NumberField;
import javafx.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.02.2022
 * @author 
 */

public class isaacitemslist extends Application {
  // Anfang Attribute
  private Label label1 = new Label();
  private NumberField numberField1 = new NumberField();
  private Button button1 = new Button();
  private TextField textField1 = new TextField("Hier Steht das Item");
  private Label label2 = new Label();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 268, 220);
    // Anfang Komponenten
    
    label1.setLayoutX(10);
    label1.setLayoutY(10);
    label1.setPrefHeight(20);
    label1.setPrefWidth(240);
    label1.setText("Isaac Item's Id");
    root.getChildren().add(label1);
    numberField1.setLayoutX(10);
    numberField1.setLayoutY(50);
    numberField1.setPrefHeight(20);
    numberField1.setPrefWidth(240);
    root.getChildren().add(numberField1);
    button1.setLayoutX(10);
    button1.setLayoutY(90);
    button1.setPrefHeight(20);
    button1.setPrefWidth(240);
    button1.setOnAction(
      (event) -> {button1_Action(event);} 
    );
    root.getChildren().add(button1);
    textField1.setLayoutX(10);
    textField1.setLayoutY(150);
    textField1.setPrefHeight(20);
    textField1.setPrefWidth(240);
    root.getChildren().add(textField1);
    label2.setLayoutX(10);
    label2.setLayoutY(130);
    label2.setPrefHeight(20);
    label2.setPrefWidth(240);
    label2.setText("Item");
    root.getChildren().add(label2);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("isaacitemslist");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public isaacitemslist
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void button1_Action(Event evt) {
    // TODO hier Quelltext einfügen
    int itemid = 0;
  
    itemid = numberField1.getInt();
    
      switch (itemid) {
      case  1: 
        textField1.setText ("the sad Onion");
        break;
      case  2: 
        textField1.setText ("the inner eye");
        break;
      case  3: 
        textField1.setText ("spoon bender");
        break;
      case  4: 
        textField1.setText ("guppys head");
        break;
      case  5: 
        textField1.setText ("my reflection");
        break;
      case  6: 
        textField1.setText ("number one");
        break;
      case  7: 
        textField1.setText ("blood of matyr");
        break;
      case  8: 
        textField1.setText ("brother bobby");
        break;
      case  9: 
        textField1.setText ("skatole");
        break;
      case  10: 
        textField1.setText ("halo flies");
        break;
      case  420: 
        textField1.setText ("https://youtu.be/_P4XSOe5fPc");
        break;
      case  69: 
        textField1.setText ("https://youtu.be/_P4XSOe5fPc");
        break;              
      default: textField1.setText ("guck selber https://platinumgod.co.uk/afterbirth-plus"); 
        
    } // end of switch 
    
  } // end of button1_Action

  // Ende Methoden
} // end of class isaacitemslist
