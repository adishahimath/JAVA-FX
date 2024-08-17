package org.icet.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class ViewCustomerFormController {

    @FXML
    private TableColumn colAddress;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colSalary;

    @FXML
    private TableView tblCustomer;


    @FXML
    void btnAReloadOnAction(ActionEvent event) {
        colId.setCellFactory(new PropertyValueFactory<>("Id"));
        colName.setCellFactory(new PropertyValueFactory<>("Name"));
        colAddress.setCellFactory(new PropertyValueFactory<>("Address"));
        colSalary.setCellFactory(new PropertyValueFactory<>("Salary"));

        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.add(new Customer("001","Adisha","Kesbawa",15000.0));
        customerObservableList.add(new Customer("001","Adisha","Kesbawa",15000.0));
        customerObservableList.add(new Customer("001","Adisha","Kesbawa",15000.0));
        tblCustomer.setItems(customerObservableList);
    }

}
