package cse213.group7.papermillfinal.meher;

import cse213.group7.papermillfinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Goal1Controller
{
    @javafx.fxml.FXML
    private TextField distanceTextField;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private Label totalcost;
    @javafx.fxml.FXML
    private TextField supplierNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> transportComboBox;
    @javafx.fxml.FXML
    private TextArea invoiceTextArea;
    @javafx.fxml.FXML
    private TextField materialTextField;
    @javafx.fxml.FXML
    private DatePicker orderDatePicker;

    public ArrayList<Goal1> goal1List = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        transportComboBox.getItems().addAll("Truck","CargoShip","Rail","Van");

        File F = new File("Goal1.bin");
        if(!F.exists()){
            return;
        }

        FileInputStream fis = new FileInputStream(F);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true){
                Goal1 nessa = (Goal1) ois.readObject();
                goal1List.add(nessa);
            }
        }
        catch (EOFException eof) {
            System.out.println("Class not Found");
        } catch (ClassNotFoundException e) {throw new RuntimeException(e);
        }


    }


    @javafx.fxml.FXML
    public void handleCalculateButton (ActionEvent actionEvent) throws IOException {
        Goal1 co = new Goal1(

                materialTextField.getText(),
                supplierNameTextField.getText(),
                Integer.parseInt(quantityTextField.getText()),
                transportComboBox.getValue(),
                Integer.parseInt(distanceTextField.getText()),
                orderDatePicker.getValue());

        File N = new File("Goal1.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        if (N.exists()){
            fos = new FileOutputStream(N, true);//objectkreplacenakorte
            oos = new AppendalebObjectOutputStream(fos);
        }
        else {
            fos = new FileOutputStream(N, true);//objectkreplacenakorte
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(co);
       oos.close();


        int quantityNum = Integer.parseInt(quantityTextField.getText());
        int distanceNUm = Integer.parseInt(distanceTextField.getText());
        float resultNum =(float) quantityNum + distanceNUm * 8 ;

        totalcost.setText(Float.toString(resultNum));

        String invoice = "------------ TRANSPORT INVOICE ------------\n"
                + "Supplier Name : " + supplierNameTextField.getText() + "\n"
                + "Material      : " + materialTextField.getText() + "\n"
                + "Quantity      : " + quantityTextField.getText() + "\n"
                + "Transport     : " + transportComboBox.getValue() + "\n"
                + "Distance      : " + distanceTextField.getText() + " km\n"
                + "-------------------------------------------\n"
                + "Total Cost    : " + resultNum + " Tk\n"
                + "-------------------------------------------\n"
                + "Thank you for using our transport service!\n";

        // Display
        invoiceTextArea.setText(invoice);

        invoiceTextArea.setEditable(false);

        goal1List.add(co);

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/group7/papermillfinal/meher/user3dashboard-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}