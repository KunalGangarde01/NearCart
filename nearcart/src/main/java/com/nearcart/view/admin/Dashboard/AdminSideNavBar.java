package com.nearcart.view.admin.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class AdminSideNavBar {

    //Selected Button Style
    String activeStyle = "-fx-background-color: #f0edff; -fx-text-fill: #7c3aed; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 8px 10px; -fx-background-radius: 8px; -fx-border-color: transparent transparent transparent #7c3aed; -fx-border-width: 0 0 0 3px;";

    //Normal Button Style
    String inactiveStyle = "-fx-background-color: transparent; -fx-text-fill: #475569; -fx-font-size: 14px; -fx-padding: 8px 13px; -fx-background-radius: 8px;";
    
    public Scene getSideBar(Runnable Obj){

        //Near Cart Logo
        Label logo = new Label("⚡");
        logo.setAlignment(Pos.CENTER);
        logo.setPrefSize(30, 30);
        logo.setStyle("-fx-background-color: white; -fx-background-radius: 20px; -fx-border-color: #e2e8f0; -fx-border-radius: 20px; -fx-font-size: 17px;");
        
        //Brand Name
        Label brandName = new Label("NearCart");
        brandName.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #0f172a;");

        Label brandSub = new Label("ADMIN PORTAL");
        brandSub.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #7c3aed;");

        VBox brandDetails = new VBox(1, brandName, brandSub);

        //logo and Brand name
        HBox brandLeft = new HBox(9, logo, brandDetails);
        brandLeft.setAlignment(Pos.CENTER_LEFT);

        //Active Badge
        Label activeBadge = new Label("• Active");
        activeBadge.setStyle("-fx-background-color: #ecfdf5; -fx-text-fill: #059669; -fx-font-size: 9px; -fx-padding: 4px 8px; -fx-background-radius: 15px; -fx-border-color: #a7f3d0; -fx-border-radius: 15px;");

        BorderPane brandRow = new BorderPane();
        brandRow.setLeft(brandLeft);
        brandRow.setRight(activeBadge);

        //Health Card
        Label healthIcon = new Label("⬡");
        healthIcon.setStyle("-fx-text-fill: #10b981; -fx-font-size: 16px;");

        // Give the icon a white circular background
        StackPane healthIconBox = new StackPane(healthIcon);
        healthIconBox.setPrefSize(25, 25);
        healthIconBox.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");

        Label healthTitle = new Label("SYSTEM HEALTH");
        healthTitle.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 12px; -fx-font-weight: bold;");

        Label uptime = new Label("Pune Hub · 99.9% Uptime");
        uptime.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 10px; -fx-font-weight: bold;");

        //Place both labels vertically
        VBox healthDetails = new VBox(2, healthTitle, uptime);
        healthDetails.setAlignment(Pos.CENTER_LEFT);

        //Combine
        HBox healthContent = new HBox(7, healthIconBox, healthDetails);
        healthContent.setAlignment(Pos.CENTER_LEFT);

        VBox healthCard = new VBox(healthContent);
        healthCard.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 14px; -fx-border-color: #e2e8f0; -fx-border-radius: 14px; -fx-padding: 9px 8px;");

        //--------------------TOP NAVIGATION Bar----------------------

        // Admin Title
        Label adminTitle = new Label("NearCart Admin Management");
        adminTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #0f172a;");

        //Location Badge
        Label location = new Label("Pune City Operations");
        location.setStyle("-fx-background-color: #f1f5f9; -fx-text-fill: #64748b; -fx-font-size: 10px; -fx-padding: 4px 8px; -fx-background-radius: 15px;");

        //Combine title and location
        HBox navLeft = new HBox(10, adminTitle, location);
        navLeft.setAlignment(Pos.CENTER_LEFT);

        //Telemetry Badge
        Label telemetry = new Label("⚡ Telemetry Active");
        telemetry.setStyle("-fx-background-color: #ecfdf5; -fx-text-fill: #059669; -fx-font-size: 10px; -fx-font-weight: bold; -fx-padding: 5px 10px; -fx-background-radius: 15px; -fx-border-color: #a7f3d0; -fx-border-radius: 15px;");

        //Notification
        Label notification = new Label("♧ 1");
        notification.setStyle("-fx-background-color: #f8fafc; -fx-text-fill: #e11d48; -fx-font-size: 12px; -fx-padding: 5px 10px; -fx-background-radius: 15px; -fx-border-color: #e2e8f0; -fx-border-radius: 15px;");

        //Dark Mode Button
        Button darkBtn = new Button("☾");
        darkBtn.setStyle("-fx-background-color: white; -fx-text-fill: #475569; -fx-font-size: 14px; -fx-background-radius: 20px; -fx-border-color: #e2e8f0; -fx-border-radius: 20px; -fx-cursor: hand;");

        //Combine right-side items
        HBox navRight = new HBox(10, telemetry, notification, darkBtn);
        navRight.setAlignment(Pos.CENTER_RIGHT);

        //Complete Top Navbar
        BorderPane navBar = new BorderPane();
        navBar.setLeft(navLeft);
        navBar.setRight(navRight);
        navBar.setStyle("-fx-background-color: white; -fx-border-color: #e2e8f0; -fx-border-width: 0 0 1px 0; -fx-padding: 12px 20px;"); 

        
        //-----------Navigation Menu-------------------
        //Dashboard Button
        Button btnDashboard = new Button("▦   Dashboard");
        btnDashboard.setMaxWidth(Double.MAX_VALUE);
        btnDashboard.setAlignment(Pos.CENTER_LEFT);
        btnDashboard.setStyle("-fx-background-color: #f0edff; -fx-text-fill: #7c3aed; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 8px 10px; -fx-background-radius: 8px; -fx-border-color: transparent transparent transparent #7c3aed; -fx-border-width: 0 0 0 3px;");

        //Approvals Button
        Button btnApprovals = new Button("☑   Approvals");
        btnApprovals.setMaxWidth(Double.MAX_VALUE);
        btnApprovals.setAlignment(Pos.CENTER_LEFT);
        btnApprovals.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-font-size: 14px; -fx-padding: 8px 13px; -fx-background-radius: 8px;");

        //Users Button
        Button btnUsers = new Button("♙   Users");
        btnUsers.setMaxWidth(Double.MAX_VALUE);
        btnUsers.setAlignment(Pos.CENTER_LEFT);
        btnUsers.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-font-size: 14px; -fx-padding: 8px 13px; -fx-background-radius: 8px;");

        //Orders Button
        Button btnOrders = new Button("▣   Orders");
        btnOrders.setMaxWidth(Double.MAX_VALUE);
        btnOrders.setAlignment(Pos.CENTER_LEFT);
        btnOrders.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-font-size: 14px; -fx-padding: 8px 13px; -fx-background-radius: 8px;");

        //Disputes Button
        Button btnDisputes = new Button("⚠   Disputes");
        btnDisputes.setMaxWidth(Double.MAX_VALUE);
        btnDisputes.setAlignment(Pos.CENTER_LEFT);
        btnDisputes.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-font-size: 14px; -fx-padding: 8px 13px; -fx-background-radius: 8px;");

        //Settings Button
        Button btnSettings = new Button("⚙   Settings");
        btnSettings.setMaxWidth(Double.MAX_VALUE);
        btnSettings.setAlignment(Pos.CENTER_LEFT);
        btnSettings.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-font-size: 14px; -fx-padding: 8px 13px; -fx-background-radius: 8px;");

        //Combine all buttons vertically
        VBox navMenu = new VBox(2, btnDashboard, btnApprovals, btnUsers, btnOrders, btnDisputes,btnSettings);


        //----------------ADMIN PROFILE SECTION--------------------      

        //Admin Profile Icon
        Label adminIcon = new Label("A");
        adminIcon.setAlignment(Pos.CENTER);
        adminIcon.setPrefSize(30, 30);
        adminIcon.setStyle("-fx-background-color: #7c3aed; -fx-text-fill: white; -fx-font-size: 13px; -fx-font-weight: bold; -fx-background-radius: 20px;");

        //Admin Name
        Label adminName = new Label("Admin User");
        adminName.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #0f172a;");

        //Admin Role
        Label adminRole = new Label("Admin");
        adminRole.setStyle("-fx-font-size: 9px; -fx-text-fill: #94a3b8;");

        //Combine Name and Role
        VBox adminDetails = new VBox(1, adminName, adminRole);
        adminDetails.setAlignment(Pos.CENTER_LEFT);

        //Logout Button
        Button logoutBtn = new Button("⇥");
        logoutBtn.setStyle("-fx-background-color: transparent; -fx-text-fill: #94a3b8; -fx-font-size: 15px; -fx-cursor: hand;");

        //Logout Action
        logoutBtn.setOnAction(e -> {
            Obj.run();
        });

        //Combine Profile Details
        HBox profileLeft = new HBox(8, adminIcon, adminDetails);
        profileLeft.setAlignment(Pos.CENTER_LEFT);

        //Complete Profile Card
        BorderPane profileCard = new BorderPane();
        profileCard.setLeft(profileLeft);
        profileCard.setRight(logoutBtn);
        profileCard.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 12px; -fx-border-color: #e2e8f0; -fx-border-radius: 12px; -fx-padding: 8px;");



        //-----------------------SIDEBAR FOOTER------------
        //Dark Mode Label
        Label darkMode = new Label("☾  Dark");
        darkMode.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10px;");

        //Version Label
        Label version = new Label("v2.4 Desktop");
        version.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 9px;");

        //Combine Footer Items
        HBox footer = new HBox(darkMode, version);
        footer.setAlignment(Pos.CENTER_LEFT);

        //Push Version to Right
        BorderPane footerRow = new BorderPane();
        footerRow.setLeft(darkMode);
        footerRow.setRight(version);

        Region emptySpace = new Region();

        //Allow Empty Space to Grow
        VBox.setVgrow(emptySpace, Priority.ALWAYS);

        VBox sidebar = new VBox(14, brandRow,healthCard,navMenu,emptySpace, profileCard, footerRow);
        sidebar.setStyle("-fx-background-color: white; -fx-border-color: #e2e8f0; -fx-border-width: 0 1px 0 0; -fx-padding: 14px 10px; -fx-min-width: 240px; -fx-pref-width: 240px; -fx-max-width: 240px;");
         
        BorderPane mainContent = new BorderPane();
        //----------------------- BUTTON ACTION--------------------
        //Dashboard button action
        btnDashboard.setOnAction(e -> {

            btnDashboard.setStyle(activeStyle);
            btnApprovals.setStyle(inactiveStyle);
            btnUsers.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnDisputes.setStyle(inactiveStyle);
            btnSettings.setStyle(inactiveStyle);

            AdminDashboard dashboard = new AdminDashboard();
            mainContent.setCenter(dashboard.getAdminDashboardView());
        });

        //approval button action
        btnApprovals.setOnAction(e -> {

            btnDashboard.setStyle(inactiveStyle);
            btnApprovals.setStyle(activeStyle);
            btnUsers.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnDisputes.setStyle(inactiveStyle);
            btnSettings.setStyle(inactiveStyle);

            AdminApproval approval = new AdminApproval();
            mainContent.setCenter(approval.getApprovalView());
        });

        //user button action
        btnUsers.setOnAction(e -> {

            btnDashboard.setStyle(inactiveStyle);
            btnApprovals.setStyle(inactiveStyle);
            btnUsers.setStyle(activeStyle);            
            btnOrders.setStyle(inactiveStyle);
            btnDisputes.setStyle(inactiveStyle);
            btnSettings.setStyle(inactiveStyle);

            UsersPage users = new UsersPage();
            mainContent.setCenter(users.getUserPageView());
        });

        //orders button action
        btnOrders.setOnAction(e -> {

            btnDashboard.setStyle(inactiveStyle);
            btnApprovals.setStyle(inactiveStyle);
            btnUsers.setStyle(inactiveStyle);
            btnOrders.setStyle(activeStyle);
            btnDisputes.setStyle(inactiveStyle);
            btnSettings.setStyle(inactiveStyle);

            AdminOrder orders = new AdminOrder();
            mainContent.setCenter(orders.getAdminOrderView());
        });

        //Disputes button action
        btnDisputes.setOnAction(e -> {

            btnDashboard.setStyle(inactiveStyle);
            btnApprovals.setStyle(inactiveStyle);
            btnUsers.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnDisputes.setStyle(activeStyle);
            btnSettings.setStyle(inactiveStyle);
    
            AdminDispute disputes = new AdminDispute();
            mainContent.setCenter(disputes.getDisputeView());
        });

        // SETTINGS BUTTON ACTION
        btnSettings.setOnAction(e -> {

            btnDashboard.setStyle(inactiveStyle);
            btnApprovals.setStyle(inactiveStyle);
            btnUsers.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnDisputes.setStyle(inactiveStyle);
            btnSettings.setStyle(activeStyle);

            AdminSetting settings = new AdminSetting();
            mainContent.setCenter(settings.getSettingView());
        });

        BorderPane root = new BorderPane(); 
        root.setLeft(sidebar);
        mainContent.setTop(navBar);

        // Display Existing Admin Dashboard in Center
        AdminDashboard dashboard = new AdminDashboard();
        mainContent.setCenter(dashboard.getAdminDashboardView());
        root.setCenter(mainContent);
   
        return  new Scene(root, 1050, 850);
    }

    
}
