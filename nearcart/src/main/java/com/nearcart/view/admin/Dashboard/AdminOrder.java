package com.nearcart.view.admin.Dashboard;

import java.util.ArrayList;

import java.util.List;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class AdminOrder {

    public ScrollPane getAdminOrderView() {
        //Page heading
        Label pageHeading = new Label("All Platform Orders Monitor");
        pageHeading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label pageSubHeading = new Label("Real-time oversight of customer purchases, merchant fulfillment, and courier dispatches");
        pageSubHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #64748B;");

        VBox pageHeader = new VBox(4, pageHeading, pageSubHeading);

        //Search TextField
        TextField searchField = new TextField();
        searchField.setPromptText("Search by user orderId, customer, or store");
        searchField.setPrefHeight(35);
        searchField.setStyle("-fx-background-color: white; -fx-border-color: #DCE1EA; -fx-border-radius: 6px; -fx-background-radius: 6px; -fx-font-size: 12px;");

        //Status filter Box
        ComboBox<String> statusFilter = new ComboBox<>();

        statusFilter.getItems().addAll("All Statuses", "Placed", "Accepted", "Preparing", "In Transist", "Deliverd","Cancelled");
        statusFilter.setValue("All Statuses");
        statusFilter.setPrefWidth(150);
        statusFilter.setPrefHeight(35);
        statusFilter.setStyle("-fx-background-color: white; -fx-border-color: #DCE1EA; -fx-font-size: 12px;");


        //Serach functionality
        HBox searchBox = new HBox(10, searchField, statusFilter);
        HBox.setHgrow(searchField, Priority.ALWAYS);
        

        //Table Header
        Label orderHeading= new Label("Order ID");
        orderHeading.setStyle("-fx-font-size: 13px; -fx-font-weight: bold; -fx-text-fill: #334155");
        orderHeading.setPrefWidth(140);

        Label storeHeading=new Label("Store");
        storeHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        storeHeading.setPrefWidth(190);

        Label customerHeading = new Label("Customer");
        customerHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        customerHeading.setPrefWidth(150);

        Label placeDateHeading = new Label("Placed Date");
        placeDateHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        placeDateHeading.setPrefWidth(120);

        Label amountHeading = new Label("Total Paid");
        amountHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        amountHeading.setPrefWidth(110);

        Label statusHeading = new Label("Live Status");
        statusHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        statusHeading.setPrefWidth(130);
       
        Label inspectionHeading = new Label("Inspection");
        inspectionHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        inspectionHeading.setPrefWidth(140);

        //Hbox for all column Headings
        HBox tableHeading =new HBox(orderHeading,storeHeading,customerHeading,placeDateHeading,amountHeading,statusHeading,inspectionHeading);
        tableHeading.setPadding(new Insets(12,14, 12, 14));
        tableHeading.setStyle("-fx-background-color: #F0F1F8");

        List<Order> orderList = new ArrayList<>();
         orderList.add(new Order(
            "#dis-001",
            "ORD-2406-004",
            "Rahul Sharma",
            "12-Jun-2026",
            "10000",
            "Dispatch"
        ));

        //Table Body
        VBox tableBody =new VBox();
        for(Order order:orderList){
            HBox orderRow = createOrderRow(order);
            tableBody.getChildren().add(orderRow);
        }

        
        //Main Order Card
        VBox orderCard = new VBox(0, tableHeading, tableBody);
        orderCard.setStyle("-fx-background-color: white; -fx-background-radius: 16; -fx-border-color: #E1E5F0; -fx-border-radius: 16;");

        //Main page container
        VBox orderPage = new VBox(15,pageHeader,searchBox,orderCard);
        orderPage.setPadding(new Insets(20));
        orderPage.setStyle("-fx-background-color: #F7F8FC;");

        //Scroll support
        ScrollPane scrollPane = new ScrollPane(orderPage);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: transparent; -fx-background: #F7F8FC;");
        return scrollPane;
    }

     private HBox createOrderRow(Order order) {
        //orderId
        Label orderId = new Label(order.getOrderId());
        orderId.setStyle("-fx-font-size:10px; -fx-font-weight: bold; -fx-text-fill: #111827; ");
        orderId.setPrefWidth(140);
        
        //store
        Label store=new Label(order.getStore());
        store.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        store.setPrefWidth(190);
      
        //customer
        Label customer = new Label(order.getCustomer());
        customer.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        customer.setPrefWidth(150);
     
        //Placed Date
        Label placedDate = new Label(order.getDate());
        placedDate.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        placedDate.setPrefWidth(120);
      
        //Amount
        Label amount = new Label(order.getAmount());
        amount.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        amount.setPrefWidth(110);
       
        //status
        Label status = new Label(order.getStatus());
        if (order.getStatus().equalsIgnoreCase("FAILED")) {
            status.setStyle("-fx-background-color: #FFF9E6; -fx-text-fill: #d60000; -fx-border-color: #FFE7A3; -fx-border-radius: 12; -fx-background-radius: 12; -fx-padding: 4 9 4 9; -fx-font-size: 9px;");
        } else if(order.getStatus().equalsIgnoreCase("DELIVERED")){
            status.setStyle("-fx-background-color: #E6FFF5; -fx-text-fill: #008F68; -fx-border-color: #8EF0CC; -fx-border-radius: 12; -fx-background-radius: 12; -fx-padding: 4 9 4 9; -fx-font-size: 9px;");
        }else{
            status.setStyle("-fx-background-color: #FFF9E6; -fx-text-fill: #d68b00; -fx-border-color: #FFE7A3; -fx-border-radius: 12; -fx-background-radius: 12; -fx-padding: 4 9 4 9; -fx-font-size: 9px;");
        }  

        HBox statusBox = new HBox(status);
        statusBox.setPrefWidth(130);
        statusBox.setAlignment(Pos.CENTER_LEFT);

        //Inspection Button
        Button inspectionButton = new Button("⊙ View Details");
        inspectionButton.setStyle("-fx-background-color: white; -fx-border-color: #CBD5E1; -fx-border-radius: 7; -fx-background-radius: 7; -fx-padding: 5 9 5 9; -fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #111827; -fx-cursor: hand;");
        
        HBox inspectionBox = new HBox(inspectionButton);
        inspectionBox.setPrefWidth(140);
        inspectionBox.setAlignment(Pos.CENTER_LEFT);


        HBox orderRow= new HBox(orderId,store,customer,placedDate,amount,statusBox,inspectionBox);
        orderRow.setStyle("-fx-background-color:white; -fx-border-color: transparent transparent #E1E5F0 transparent; -fx-border-width: 0 0 1 0;");
        orderRow.setAlignment(Pos.CENTER_LEFT);        
        orderRow.setPadding(new Insets(12, 14, 12, 14));
       
        return orderRow;
    }

     public static class Order {

        private String orderId;
        private String store;
        private String customer;
        private String placeDate;
        private String amount;
        private String status;

        public Order(String orderId, String store, String customer, String placeDate, String amount, String status) {
            this.orderId = orderId;
            this.store = store;
            this.customer = customer;
            this.placeDate = placeDate;
            this.amount = amount;
            this.status = status;
        }

        public String getOrderId() {
            return orderId;
        }

        public String getStore() {
            return store;
        }

        public String getCustomer() {
            return customer;
        }

        public String getDate() {
            return placeDate;
        }

        public String getAmount() {
            return amount;
        }

        public String getStatus() {
            return status;
        }
    }

}