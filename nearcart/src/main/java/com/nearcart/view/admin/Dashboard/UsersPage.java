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

public class UsersPage {
    
    public ScrollPane getUserPageView(){


        //Page heading
        Label pageHeading = new Label("User & Account Management");
        pageHeading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label pageSubHeading = new Label("Manage customer, merchant, and delivery partner platform accounts and access states");
        pageSubHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #64748B;");

        VBox pageHeader = new VBox(4, pageHeading, pageSubHeading);

        //Search TextField
        TextField searchField = new TextField();
        searchField.setPromptText("Search by user name or email...");
        searchField.setPrefHeight(35);
        searchField.setStyle("-fx-background-color: white; -fx-border-color: #DCE1EA; -fx-border-radius: 6px; -fx-background-radius: 6px; -fx-font-size: 12px;");

        // Role filter Box
        ComboBox<String> roleFilter = new ComboBox<>();

        roleFilter.getItems().addAll("All Roles", "Customer", "Owner", "Delivery", "Admin");
        roleFilter.setValue("All Roles");
        roleFilter.setPrefWidth(150);
        roleFilter.setPrefHeight(35);
        roleFilter.setStyle("-fx-background-color: white; -fx-border-color: #DCE1EA; -fx-font-size: 12px;");


        //Serach functionality
        HBox search = new HBox(10, searchField, roleFilter);
        HBox.setHgrow(searchField, Priority.ALWAYS);
        
        //User Table
        Label nameHeading = new Label("Name");
        nameHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155");
        nameHeading.setPrefWidth(210);

        Label roleHeading=new Label("Role");
        roleHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #334155;");
        roleHeading.setPrefWidth(190);

        Label contactHeading=new Label("Contact");
        contactHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #334155;");
        contactHeading.setPrefWidth(190);

        Label createdHeading=new Label("Created");
        createdHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #334155;");
        createdHeading.setPrefWidth(190);

        Label statusHeading=new Label("Status");
        statusHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #334155;");
        statusHeading.setPrefWidth(170);

        Label actionHeading=new Label("Account Actions");
        actionHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #334155;");
        actionHeading.setPrefWidth(230);
        
        HBox tableHeading = new HBox(nameHeading,roleHeading, contactHeading, createdHeading,statusHeading,actionHeading);
        tableHeading.setPadding(new Insets(12,14, 12, 14));
        tableHeading.setStyle("-fx-background-color: #F0F1F8");

        //Sample Data
        List<User> userList = new ArrayList<>();
        userList.add(new User(
            "Priya Sharma", 
            "customer@gmail.com",
            "Customer", 
            "121738912748",
            "15 Jan 2024",
            "Active"
        ));

         userList.add(new User(
            "Priya Sharma", 
            "customer@gmail.com",
            "Customer", 
            "121738912748",
            "15 Jan 2024",
            "Suspend"
        ));

        //tableBody
        VBox tableBody = new VBox();
        for(User user:userList){
            HBox userRow= createUserRow(user);
            tableBody.getChildren().add(userRow);
        }

        //Main User Card
        VBox userCard = new VBox(0, tableHeading, tableBody);
        userCard.setStyle("-fx-background-color: white; -fx-background-radius: 16; -fx-border-color: #E1E5F0; -fx-border-radius: 16;");

        //Main page container
        VBox userPage = new VBox(15,pageHeader,search,userCard);
        userPage.setPadding(new Insets(20));
        userPage.setStyle("-fx-background-color: #F7F8FC;");

        //Scroll support
        ScrollPane scrollPane = new ScrollPane(userPage);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: transparent; -fx-background: #F7F8FC;");


        return scrollPane;
    }

    private HBox createUserRow(User user) {
        //User name
        Label name=new Label(user.getUserDetails());
        name.setStyle("-fx-font-size:11px; -fx-font-weight: bold; -fx-text-fill: #111827; ");
        name.setPrefWidth(210);

        Label role = new Label(user.getRole());
        role.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        role.setPrefWidth(190);

        Label contact = new Label(user.getPhone());
        contact.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        contact.setPrefWidth(190);

        Label created = new Label(user.getCreated());
        created.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        created.setPrefWidth(190);

        Label status = new Label(user.getStatus());
        if(user.getStatus().equalsIgnoreCase("Active")){
            status.setStyle("-fx-background-color: #E6FFF5; -fx-text-fill: #008F68; -fx-border-color: #8EF0CC; -fx-border-radius: 12; -fx-background-radius: 12; -fx-padding: 4 9 4 9; -fx-font-size: 10px;");
            status.setAlignment(Pos.CENTER);
        } else{
            status.setStyle("-fx-background-color: #FFF1F2; -fx-text-fill: #E11D48; -fx-border-color: #FECDD3; -fx-border-radius: 12; -fx-background-radius: 12; -fx-padding: 4 9 4 9; -fx-font-size: 10px;");
            status.setAlignment(Pos.CENTER);
        }   
        
        HBox statusBox = new HBox(status);
        statusBox.setPrefWidth(170);
        statusBox.setAlignment(Pos.CENTER_LEFT);

        //Action Button
        Button actionbtn= new Button();
        if(user.getStatus().equalsIgnoreCase("ACTIVE")){
            actionbtn.setText("Suspend Account");
            actionbtn.setStyle("-fx-background-color: #FFF1F2; -fx-text-fill: #E11D48; -fx-border-color: #FECDD3; -fx-border-radius: 8; -fx-background-radius: 8; -fx-padding: 7 13 7 13; -fx-font-size: 10px; -fx-cursor: hand;");
        } else {
            actionbtn.setText("Reactivate Account");
            actionbtn.setStyle("-fx-background-color: white; -fx-text-fill: #111827; -fx-border-color: #CBD5E1; -fx-border-radius: 8; -fx-background-radius: 8; -fx-padding: 7 13 7 13; -fx-font-size: 10px; -fx-cursor: hand;");
        }
    
        HBox actionBox = new HBox(actionbtn);
        actionBox.setPrefWidth(230);
        actionBox.setAlignment(Pos.CENTER_LEFT);

        HBox userRow= new HBox(name,role,contact,created,statusBox,actionBox);
        userRow.setStyle("-fx-background-color:white; -fx-border-color: transparent transparent #E1E5F0 transparent; -fx-border-width: 0 0 1 0;");
        userRow.setAlignment(Pos.CENTER_LEFT);        
        userRow.setPadding(new Insets(12, 14, 12, 14));

        return userRow;
    }


    // User class to store user information
    public static class User {

        private String name;
        private String email;
        private String role;
        private String phone;
        private String created;
        private String status;

        public User(String name, String email, String role, String phone, String created, String status) {

            this.name = name;
            this.email = email;
            this.role = role;
            this.phone = phone;
            this.created = created;
            this.status = status;
        }

        public String getUserDetails() {
            return name + "\n" + email;
        }

        public String getRole() {
            return role;
        }

        public String getPhone() {
            return phone;
        }

        public String getCreated() {
            return created;
        }

        public String getStatus() {
            return status;
        }

    }
}
