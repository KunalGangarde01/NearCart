package com.nearcart.view.shopOwner;
import com.nearcart.view.SplashPage;
import com.nearcart.view.admin.AdminLoginPage;
import com.nearcart.view.rider.RiderLoginPage;
import com.nearcart.view.user.UserLoginPage;
import com.nearcart.view.user.UserSignUpPage;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class ShopLoginPage {
    public Scene shoplogScene;

    public Scene getShopLoginScene(Runnable backToSplash) {

        Label CartIcon = new Label("🛒");
        StackPane brandIconPane = new StackPane(CartIcon);
        brandIconPane.setPrefSize(36, 36);
        brandIconPane.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px;");

        Label brandTitle = new Label("NearCart");
        brandTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");

        Label brandSubtitle = new Label("Hyperlocal Network • Pune");
        brandSubtitle.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");

        VBox brandMeta = new VBox(2, brandTitle, brandSubtitle);

        Region brandSpacer = new Region();
        HBox.setHgrow(brandSpacer, Priority.ALWAYS);


        HBox brandRow = new HBox(10, brandIconPane, brandMeta, brandSpacer);
        brandRow.setAlignment(Pos.CENTER_LEFT);

     
        Text titlePart1 = new Text("Transform Your Physical Retail Store into a 24/7 Digital Hub. ");
        titlePart1.setStyle("-fx-fill: #0f172a; -fx-font-size: 34px; -fx-font-weight: bold; -fx-font-family: System;");

        Text titlePart2 = new Text("0% Commission Onboarding.");
        titlePart2.setStyle("-fx-fill: #059669; -fx-font-size: 40px; -fx-font-weight: bold; -fx-font-family: System;");

        TextFlow headline = new TextFlow(titlePart1, titlePart2);

        Label description = new Label("ake your local grocery, pharmacy, or specialty shop online. Expand \n your customer base across Your Area, receive instant orders, automate\n billing, and leverage on-demand delivery couriers.");
        description.setStyle("-fx-text-fill: #64748b; -fx-font-size: 16px; -fx-font-family: System;");

    
        // Feature  1
        StackPane f1Circle = new StackPane(new Label("📈"));
        f1Circle.setPrefSize(28, 28);
        f1Circle.setStyle("-fx-background-color: #fef3c7; -fx-background-radius: 14px;");
        Label f1Title = new Label("0% Platform Commission");
        f1Title.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        Label f1Sub = new Label("Keep 100% of your retail margins with zero hidden fees.");
        f1Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-family: System;");
        VBox f1Text = new VBox(1, f1Title, f1Sub);
        HBox f1Card = new HBox(10, f1Circle, f1Text);
        f1Card.setAlignment(Pos.CENTER_LEFT);
        f1Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 10px;");

        // Feature  2
        StackPane f2Circle = new StackPane(new Label("📦"));
        f2Circle.setPrefSize(28, 28);
        f2Circle.setStyle("-fx-background-color: #ede9fe; -fx-background-radius: 14px;");
        Label f2Title = new Label("Real-Time Inventory & Barcode POS");
        f2Title.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        Label f2Sub = new Label("Effortlessly update items, stock levels, and daily special offers.");
        f2Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-family: System;");
        VBox f2Text = new VBox(1, f2Title, f2Sub);
        HBox f2Card = new HBox(10, f2Circle, f2Text);
        f2Card.setAlignment(Pos.CENTER_LEFT);
        f2Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 10px;");

        // Feature 3
        StackPane f3Circle = new StackPane(new Label("🚴"));
        f3Circle.setPrefSize(28, 28);
        f3Circle.setStyle("-fx-background-color: #fee2e2; -fx-background-radius: 14px;");
        Label f3Title = new Label("Instant On-Demand Delivery Fleet");
        f3Title.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        Label f3Sub = new Label("Riders arrive at your store the moment orders are packed.");
        f3Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-family: System;");
        VBox f3Text = new VBox(1, f3Title, f3Sub);
        HBox f3Card = new HBox(10, f3Circle, f3Text);
        f3Card.setAlignment(Pos.CENTER_LEFT);
        f3Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 10px;");

        // Feature 4
        StackPane f4Circle = new StackPane(new Label("💳"));
        f4Circle.setPrefSize(28, 28);
        f4Circle.setStyle("-fx-background-color: #dbeafe; -fx-background-radius: 14px;");
        Label f4Title = new Label("Guaranteed Daily T+1 Bank Payouts");
        f4Title.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        Label f4Sub = new Label("Direct bank settlement with automated GST compliance invoices.");
        f4Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-family: System;");
        VBox f4Text = new VBox(1, f4Title, f4Sub);
        HBox f4Card = new HBox(10, f4Circle, f4Text);
        f4Card.setAlignment(Pos.CENTER_LEFT);
        f4Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 10px;");

        VBox featureList = new VBox(10, f1Card, f2Card, f3Card, f4Card);

        // info Card 1
        Label s1Val = new Label("3.2x");
        s1Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");
        Label s1Lbl = new Label("Average Revenue Boost");
        s1Lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10px; -fx-font-family: System;");
        VBox s1Card = new VBox(2, s1Val, s1Lbl);
        s1Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 12px;");
        HBox.setHgrow(s1Card, Priority.ALWAYS);

        // info Card 2
        Label s2Val = new Label("0%");
        s2Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");
        Label s2Lbl = new Label("Onboarding Fee");
        s2Lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10px; -fx-font-family: System;");
        VBox s2Card = new VBox(2, s2Val, s2Lbl);
        s2Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 12px;");
        HBox.setHgrow(s2Card, Priority.ALWAYS);

        // info  Card 3
        Label s3Val = new Label("10,000+");
        s3Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");
        Label s3Lbl = new Label("Active Neighborhood Buyers");
        s3Lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10px; -fx-font-family: System;");
        VBox s3Card = new VBox(2, s3Val, s3Lbl);
        s3Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 12px;");
        HBox.setHgrow(s3Card, Priority.ALWAYS);

        HBox metricsRow = new HBox(10, s1Card, s2Card, s3Card);
        metricsRow.setStyle("-fx-padding:30px 0px 0px 0px");

        // Footer 
        Label avatarMock = new Label("👥");
        Label proofText = new Label("Partnered with 500+ local retail stores & supermarkets across Pune");
        proofText.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        HBox leftFooter = new HBox(8, avatarMock, proofText);
        leftFooter.setAlignment(Pos.CENTER_LEFT);

        //LeftSide VBox
        VBox LeftSide = new VBox(35, brandRow, headline, description, featureList, metricsRow, leftFooter);
        LeftSide.setStyle("-fx-background-color: linear-gradient(to bottom right, #C9C9F9, #f7fbf9 45%, #FBE8C2 100%); -fx-padding: 32px 40px;-fx-min-width: 800px; -fx-pref-width: 800px; -fx-max-width: 800px;");


        //right side start 

        Button backBtn = new Button("← Back to Home");
        backBtn.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 15px; -fx-border-color: #e2e8f0; -fx-border-radius: 15px; -fx-text-fill: #475569; -fx-font-size: 11.5px; -fx-padding: 4px 12px; -fx-cursor: hand; -fx-font-family: System;");
        if (backToSplash != null) {
            backBtn.setOnAction(e -> backToSplash.run());
        }

        Button themeBtn = new Button("🌙");
        themeBtn.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 15px; -fx-border-color: #e2e8f0; -fx-border-radius: 15px; -fx-padding: 4px 8px; -fx-cursor: hand;");

        BorderPane navBar = new BorderPane();
        navBar.setLeft(backBtn);
        navBar.setRight(themeBtn);

        
        Button signInTab = new Button("Sign In");
        signInTab.setMaxWidth(Double.MAX_VALUE);
        signInTab.setStyle("-fx-border-width:0.5px;-fx-border-radius:16px;-fx-border-color:gray;-fx-background-color: #ffffff; -fx-background-radius: 16px; -fx-text-fill: #0f172a; -fx-font-size: 12px; -fx-font-weight: bold; -fx-padding: 6px 0; -fx-font-family: System;");
        HBox.setHgrow(signInTab, Priority.ALWAYS);

        Button createTab = new Button("Create Account");
        createTab.setMaxWidth(Double.MAX_VALUE);
        createTab.setStyle("-fx-background-color: transparent; -fx-text-fill: #64748b; -fx-font-size: 12px; -fx-padding: 6px 0; -fx-font-family: System;");
        HBox.setHgrow(createTab, Priority.ALWAYS);

        createTab.setOnAction(e ->{
            Runnable obj = new Runnable() {
                @Override 
                public void run(){
                    SplashPage.primaryStage.setScene(shoplogScene);
                }
            };
            ShopSignUpPage signupObj = new ShopSignUpPage();
            SplashPage.primaryStage.setScene(signupObj.getShopSignUpScene(obj));
        });

        HBox toggleBar = new HBox(4, signInTab, createTab);
        toggleBar.setStyle("-fx-background-color: #f1f5f9; -fx-background-radius: 20px; -fx-padding: 3px;");

        // Form Titles
        Label customerTag = new Label("🏷 Shop");
        customerTag.setStyle("-fx-background-color: #dcfce7; -fx-background-radius: 4px; -fx-text-fill: #15803d; -fx-font-size: 10px; -fx-font-weight: bold; -fx-padding: 2px 6px; -fx-font-family: System;");

        Label formTitle = new Label("Shop Owner Sign In");
        formTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 22px; -fx-font-weight: bold; -fx-font-family: System;");

        Label formSubtitle = new Label("Manage inventory, accept incoming orders, and track your daily revenue.");
        formSubtitle.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");

        VBox formHeaderBox = new VBox(4, customerTag, formTitle, formSubtitle);

        // Inputs
        Label emailLabel = new Label("Email Address");
        emailLabel.setStyle("-fx-text-fill: #334155; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        Label mailIcon = new Label("✉");
        mailIcon.setStyle("-fx-text-fill: #94a3b8;");
        TextField emailField = new TextField("customer@demo.com");
        emailField.setStyle("-fx-background-color: transparent; -fx-text-fill: #1e293b; -fx-font-size: 13px; -fx-font-family: System;");
        HBox.setHgrow(emailField, Priority.ALWAYS);
        HBox emailInput = new HBox(8, mailIcon, emailField);
        emailInput.setAlignment(Pos.CENTER_LEFT);
        emailInput.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 6px 12px;");
        VBox emailBox = new VBox(4, emailLabel, emailInput);

        Label passLabel = new Label("Password");
        passLabel.setStyle("-fx-text-fill: #334155; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        Label lockIcon = new Label("🔒");
        lockIcon.setStyle("-fx-text-fill: #94a3b8;");
        PasswordField passField = new PasswordField();
        passField.setText("password123");
        passField.setStyle("-fx-background-color: transparent; -fx-text-fill: #1e293b; -fx-font-size: 13px; -fx-font-family: System;");
        HBox.setHgrow(passField, Priority.ALWAYS);
        Label eyeIcon = new Label("👁");
        eyeIcon.setStyle("-fx-text-fill: #94a3b8; -fx-cursor: hand;");
        HBox passInput = new HBox(8, lockIcon, passField, eyeIcon);
        passInput.setAlignment(Pos.CENTER_LEFT);
        passInput.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 6px 12px;");
        VBox passBox = new VBox(4, passLabel, passInput);

        CheckBox rememberMe = new CheckBox("Remember this device");
        rememberMe.setSelected(true);
        rememberMe.setStyle("-fx-text-fill: #475569; -fx-font-size: 11.5px; -fx-font-family: System;");

        Hyperlink forgotPass = new Hyperlink("Forgot password?");
        forgotPass.setStyle("-fx-text-fill: #6366f1; -fx-border-color: transparent; -fx-font-size: 11.5px; -fx-font-family: System;");

        BorderPane optionsRow = new BorderPane();
        optionsRow.setLeft(rememberMe);
        optionsRow.setRight(forgotPass);

        VBox formGroup = new VBox(10, emailBox, passBox, optionsRow);

        // Buttons
        Button submitBtn = new Button("Sign In to Customer →");
        submitBtn.setMaxWidth(Double.MAX_VALUE);
        submitBtn.setStyle("-fx-background-color: linear-gradient(to right, #4f46e5, #6366f1); -fx-text-fill: #ffffff; -fx-font-weight: bold; -fx-font-size: 13px; -fx-background-radius: 10px; -fx-padding: 10px 0; -fx-cursor: hand; -fx-font-family: System;");
       
        // Role Selection
        Label roleLabel = new Label("SELECT YOUR ROLE / PORTAL");
        roleLabel.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 10px; -fx-font-weight: bold; -fx-font-family: System;");

        BorderPane roleHeader = new BorderPane();
        roleHeader.setLeft(roleLabel);

        // Role Card 1 (Customer - Active)
        Label r1Icon = new Label("🛒");
        Label r1Title = new Label("Customer");
        r1Title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label r1Sub = new Label("Order 15-min delivery");
        r1Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 9.5px; -fx-font-family: System;");
        VBox r1Card = new VBox(3, r1Icon, r1Title, r1Sub);
        r1Card.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 6px; -fx-border-color: #e2e8f0; -fx-border-width: 1px; -fx-border-radius: 6px; -fx-padding: 8px;");
        HBox.setHgrow(r1Card, Priority.ALWAYS);

        r1Card.setOnMouseClicked(e ->{
            UserLoginPage up = new UserLoginPage();
            Runnable obj = new Runnable() {
                @Override 
                public void run(){

                    SplashPage.primaryStage.setScene(up.userlogScene);
                }
            };
            
            SplashPage.primaryStage.setScene(up.getLoginScene(obj));
            
        });


        // Role Card 2 (Shop Owner)
        Label r2Icon = new Label("🏬");
        Label r2Title = new Label("Shop Owner");
        r2Title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label r2Sub = new Label("Manage retail store");
        r2Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 9.5px; -fx-font-family: System;");
        VBox r2Card = new VBox(3, r2Icon, r2Title, r2Sub);
        r2Card.setStyle("-fx-background-color: #f0fdf4; -fx-background-radius: 6px; -fx-border-color: #22c55e; -fx-border-radius: 6px; -fx-padding: 8px;");
        HBox.setHgrow(r2Card, Priority.ALWAYS);


        // Role Card 3 (Delivery Rider)
        Label r3Icon = new Label("🛵");
        Label r3Title = new Label("Delivery Rider");
        r3Title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label r3Sub = new Label("Deliver & earn daily");
        r3Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 9.5px; -fx-font-family: System;");
        VBox r3Card = new VBox(3, r3Icon, r3Title, r3Sub);
        r3Card.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 6px; -fx-border-color: #e2e8f0; -fx-border-radius: 6px; -fx-padding: 8px;");
        HBox.setHgrow(r3Card, Priority.ALWAYS);

        r3Card.setOnMouseClicked(e ->{
            RiderLoginPage RiderPageObj = new RiderLoginPage();
            Runnable obj = new Runnable() {
                @Override 
                public void run(){

                    SplashPage.primaryStage.setScene(shoplogScene);
                }
            };
            
            SplashPage.primaryStage.setScene(RiderPageObj.getRiderLoginScene(obj));
            
        });


        HBox roleCards = new HBox(8, r1Card, r2Card, r3Card);
        VBox roleSection = new VBox(6, roleHeader, roleCards);

        // Bottom Details
        Hyperlink adminLink = new Hyperlink("🔒 Platform Admin Access");
        adminLink.setStyle("-fx-text-fill: #94a3b8; -fx-border-color: transparent; -fx-font-size: 11px; -fx-font-family: System;");
        adminLink.setOnAction(e ->{
            Runnable obj = new Runnable() {
                @Override 
                public void run(){
                    SplashPage.primaryStage.setScene(shoplogScene);
                }
            };

            AdminLoginPage admin = new AdminLoginPage();
            SplashPage.primaryStage.setScene(admin.getAdminLoginScene(obj));
        });

        
        Label supportLabel = new Label("Pune 24/7 Support: 1800-NEAR-CART");
        supportLabel.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");

        BorderPane bottomBar = new BorderPane();
        bottomBar.setLeft(adminLink);
        bottomBar.setRight(supportLabel);

        
        VBox formVBox = new VBox(40, toggleBar, formHeaderBox, formGroup, submitBtn, roleSection, bottomBar);
        formVBox.setStyle("-fx-background-color: #ffffff; -fx-padding:30px 50px 0px 50px");

        VBox RightSide = new VBox(14, navBar,formVBox );
        RightSide.setStyle("-fx-background-color: #ffffff; -fx-padding: 28px 44px;-fx-min-width: 700px; -fx-pref-width: 700px; -fx-max-width: 700px;");



        HBox root = new HBox(LeftSide, RightSide);
        // root.setOrientation(Orientation.HORIZONTAL);
        // root.setDividerPositions(0.55);
        root.setStyle("-fx-box-border: transparent; -fx-background-color: transparent;");

        Scene ShopLoginScene = new Scene(root, 1550, 850);
        shoplogScene = ShopLoginScene;
        return ShopLoginScene;
    }
}