package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ShopSidebarNavbar {

    BorderPane root = new BorderPane();

    private final String activeStyle = "-fx-background-color: #eef2ff; -fx-background-radius: 8px; -fx-text-fill: #4f46e5; -fx-font-size: 12.5px; -fx-font-weight: bold; -fx-padding: 8px 12px; -fx-cursor: hand; -fx-font-family: System;";
    private final String inactiveStyle = "-fx-background-color: transparent; -fx-text-fill: #475569; -fx-font-size: 12.5px; -fx-padding: 8px 12px; -fx-cursor: hand; -fx-font-family: System;";

    public Scene getShopShellScene(Runnable backToSplash) {

        // 1. TOP NAVBAR
        Label title = new Label("NearCart Owner Management");
        title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");

        Label locationBadge = new Label("Pune City Operations");
        locationBadge.setStyle("-fx-background-color: #f1f5f9; -fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 4px 10px; -fx-background-radius: 20px; -fx-font-family: System;");

        HBox leftNav = new HBox(12, title, locationBadge);
        leftNav.setAlignment(Pos.CENTER_LEFT);

        Label telemetryBadge = new Label("⚡ Telemetry Active");
        telemetryBadge.setStyle("-fx-background-color: #ecfdf5; -fx-text-fill: #059669; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-padding: 5px 12px; -fx-background-radius: 20px; -fx-border-color: #a7f3d0; -fx-border-radius: 20px; -fx-font-family: System;");

        Label bellIcon = new Label("🔔 1");
        bellIcon.setStyle("-fx-background-color: #f8fafc; -fx-text-fill: #ef4444; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-padding: 5px 10px; -fx-background-radius: 20px; -fx-border-color: #e2e8f0; -fx-border-radius: 20px;");

        Button themeBtn = new Button("🌙");
        themeBtn.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 15px; -fx-border-color: #e2e8f0; -fx-border-radius: 15px; -fx-padding: 4px 8px; -fx-cursor: hand;");

        HBox rightNav = new HBox(10, telemetryBadge, bellIcon, themeBtn);
        rightNav.setAlignment(Pos.CENTER_RIGHT);

        BorderPane navBar = new BorderPane();
        navBar.setLeft(leftNav);
        navBar.setRight(rightNav);
        navBar.setStyle("-fx-background-color: #ffffff; -fx-border-color: #f1f5f9; -fx-border-width: 0 0 1px 0; -fx-padding: 12px 24px;");

        // 2. LEFT SIDEBAR
        Label brandTitle = new Label("NearCart");
        brandTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");
        Label brandSub = new Label("OWNER PORTAL");
        brandSub.setStyle("-fx-text-fill: #6366f1; -fx-font-size: 9px; -fx-font-weight: bold; -fx-font-family: System;");
        VBox brandMeta = new VBox(1, brandTitle, brandSub);

        Label liveBadge = new Label("● Store Live");
        liveBadge.setStyle("-fx-background-color: #ecfdf5; -fx-text-fill: #10b981; -fx-font-size: 10px; -fx-font-weight: bold; -fx-padding: 3px 8px; -fx-background-radius: 12px; -fx-font-family: System;");

        BorderPane logoRow = new BorderPane();
        logoRow.setLeft(brandMeta);
        logoRow.setRight(liveBadge);

        Label activeLabel = new Label("ACTIVE STORE");
        activeLabel.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 9px; -fx-font-weight: bold; -fx-font-family: System;");
        Label branchLabel = new Label("Fresh Basket (Baner)");
        branchLabel.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        VBox storeCard = new VBox(2, activeLabel, branchLabel);
        storeCard.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 12px;");

        Button btnDashboard = new Button("⊞  Dashboard");
        btnDashboard.setMaxWidth(Double.MAX_VALUE);
        btnDashboard.setAlignment(Pos.CENTER_LEFT);
        btnDashboard.setStyle(activeStyle);

        Button btnOrders = new Button("📄  Orders");
        btnOrders.setMaxWidth(Double.MAX_VALUE);
        btnOrders.setAlignment(Pos.CENTER_LEFT);
        btnOrders.setStyle(inactiveStyle);

        Button btnProducts = new Button("📦  Products");
        btnProducts.setMaxWidth(Double.MAX_VALUE);
        btnProducts.setAlignment(Pos.CENTER_LEFT);
        btnProducts.setStyle(inactiveStyle);

        Button btnOffers = new Button("🏷  Offers");
        btnOffers.setMaxWidth(Double.MAX_VALUE);
        btnOffers.setAlignment(Pos.CENTER_LEFT);
        btnOffers.setStyle(inactiveStyle);

        Button btnStoreProfile = new Button("🏪  Store Profile");
        btnStoreProfile.setMaxWidth(Double.MAX_VALUE);
        btnStoreProfile.setAlignment(Pos.CENTER_LEFT);
        btnStoreProfile.setStyle(inactiveStyle);

        Button btnReviews = new Button("☆  Reviews");
        btnReviews.setMaxWidth(Double.MAX_VALUE);
        btnReviews.setAlignment(Pos.CENTER_LEFT);
        btnReviews.setStyle(inactiveStyle);

        Button btnEarnings = new Button("₹  Earnings");
        btnEarnings.setMaxWidth(Double.MAX_VALUE);
        btnEarnings.setAlignment(Pos.CENTER_LEFT);
        btnEarnings.setStyle(inactiveStyle);

        btnDashboard.setOnAction(e -> {
            btnDashboard.setStyle(activeStyle);
            btnProducts.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnOffers.setStyle(inactiveStyle);
            btnStoreProfile.setStyle(inactiveStyle);
            btnEarnings.setStyle(inactiveStyle);
            btnReviews.setStyle(inactiveStyle);



            ShopDashboard dashboardView = new ShopDashboard();
            root.setCenter(dashboardView.getShopDashboardView());
        });

        btnOrders.setOnAction(e -> {
            btnDashboard.setStyle(inactiveStyle);
            btnProducts.setStyle(inactiveStyle);
            btnOrders.setStyle(activeStyle);
            btnOffers.setStyle(inactiveStyle);
            btnStoreProfile.setStyle(inactiveStyle);
            btnEarnings.setStyle(inactiveStyle);
            btnReviews.setStyle(inactiveStyle);


            ShopOrdersPage ordersPage = new ShopOrdersPage();
            root.setCenter(ordersPage.getShopOrdersView());
        });

        btnProducts.setOnAction(e -> {
            btnProducts.setStyle(activeStyle);
            btnDashboard.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnOffers.setStyle(inactiveStyle);
            btnStoreProfile.setStyle(inactiveStyle);
            btnEarnings.setStyle(inactiveStyle);
            btnReviews.setStyle(inactiveStyle);


            ShopProducts productsView = new ShopProducts();
            root.setCenter(productsView.getShopProductsView());
        });

        btnOffers.setOnAction(e -> {
            btnOffers.setStyle(activeStyle);
            btnDashboard.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnProducts.setStyle(inactiveStyle);
            btnStoreProfile.setStyle(inactiveStyle);
            btnEarnings.setStyle(inactiveStyle);
            btnReviews.setStyle(inactiveStyle);

            ShopOffers offersView = new ShopOffers();
            root.setCenter(offersView.getShopOffersView());
        });

        btnStoreProfile.setOnAction(e -> {
            btnStoreProfile.setStyle(activeStyle);
            btnDashboard.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnProducts.setStyle(inactiveStyle);
            btnOffers.setStyle(inactiveStyle);
            btnReviews.setStyle(inactiveStyle);
            btnEarnings.setStyle(inactiveStyle);

            ShopProfile profileView = new ShopProfile();
            root.setCenter(profileView.getShopProfileView());
        });
        
        btnReviews.setOnAction(e -> {
            btnReviews.setStyle(activeStyle);
            btnDashboard.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnProducts.setStyle(inactiveStyle);
            btnOffers.setStyle(inactiveStyle);
            btnStoreProfile.setStyle(inactiveStyle);
            btnEarnings.setStyle(inactiveStyle);

            ShopReviews reviewsView = new ShopReviews();
            root.setCenter(reviewsView.getShopReviewsView());
        });

        btnEarnings.setOnAction(e -> {
            btnEarnings.setStyle(activeStyle);
            btnDashboard.setStyle(inactiveStyle);
            btnOrders.setStyle(inactiveStyle);
            btnProducts.setStyle(inactiveStyle);
            btnOffers.setStyle(inactiveStyle);
            btnStoreProfile.setStyle(inactiveStyle);
            btnReviews.setStyle(inactiveStyle);

            ShopEarnings earningsView = new ShopEarnings();
            root.setCenter(earningsView.getShopEarningsView());
        });
        VBox navMenu = new VBox(6, btnDashboard, btnOrders, btnProducts, btnOffers, btnStoreProfile, btnReviews, btnEarnings);

        StackPane menuSpacer = new StackPane();
        VBox.setVgrow(menuSpacer, Priority.ALWAYS);

        Label avatar = new Label("V");
        avatar.setStyle("-fx-text-fill: #ffffff; -fx-font-size: 13px; -fx-font-weight: bold;");
        StackPane avatarBox = new StackPane(avatar);
        avatarBox.setPrefSize(32, 32);
        avatarBox.setStyle("-fx-background-color: #6366f1; -fx-background-radius: 16px;");

        Label uName = new Label("Vikram Patil");
        uName.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System;");
        Label uRole = new Label("Owner");
        uRole.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 10px; -fx-font-family: System;");
        VBox uMeta = new VBox(1, uName, uRole);

        HBox userLeft = new HBox(8, avatarBox, uMeta);
        userLeft.setAlignment(Pos.CENTER_LEFT);

        Button logoutBtn = new Button("↳");
        logoutBtn.setStyle("-fx-background-color: transparent; -fx-text-fill: #94a3b8; -fx-font-size: 14px; -fx-cursor: hand;");
        logoutBtn.setOnAction(e -> {
            if (backToSplash != null) backToSplash.run();
        });

        BorderPane profileCard = new BorderPane();
        profileCard.setLeft(userLeft);
        profileCard.setRight(logoutBtn);
        profileCard.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 8px 10px;");

        Label darkLabel = new Label("☾ Dark");
        darkLabel.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");
        Label versionLabel = new Label("v2.4 Desktop");
        versionLabel.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");

        BorderPane footerRow = new BorderPane();
        footerRow.setLeft(darkLabel);
        footerRow.setRight(versionLabel);

        VBox sidebar = new VBox(16, logoRow, storeCard, navMenu, menuSpacer, profileCard, footerRow);
        sidebar.setStyle("-fx-background-color: #ffffff; -fx-border-color: #f1f5f9; -fx-border-width: 0 1px 0 0; -fx-padding: 20px 14px; -fx-min-width: 240px; -fx-pref-width: 240px; -fx-max-width: 240px;");

        // Default to dashboard center
        ShopDashboard defaultDashboard = new ShopDashboard();
        root.setTop(navBar);
        root.setLeft(sidebar);
        root.setCenter(defaultDashboard.getShopDashboardView());

        return new Scene(root, 1550, 850);
    }
}