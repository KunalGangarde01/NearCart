package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ShopOffers {

    public ScrollPane getShopOffersView() {

        
        // 1. HEADER SECTION
        Label pageHeading = new Label("Promotional Offers & Discounts");
        pageHeading.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");

        Label pageSubHeading = new Label("Drive local store sales by publishing percentage discounts, coupons, and BOGO deals");
        pageSubHeading.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");

        VBox titleBox = new VBox(2, pageHeading, pageSubHeading);

        Button createPromoBtn = new Button("+ Create Promo Offer");
        createPromoBtn.setStyle("-fx-background-color: #4f46e5; -fx-text-fill: #ffffff; -fx-font-size: 12px; -fx-font-weight: bold; -fx-padding: 8px 16px; -fx-background-radius: 8px; -fx-cursor: hand; -fx-font-family: System;");

        BorderPane headerRow = new BorderPane();
        headerRow.setLeft(titleBox);
        headerRow.setRight(createPromoBtn);

        // 2. TABS SECTION
        // Tab 1: Active Promotions (Active state)
        Label tab1Text = new Label("Active Promotions");
        tab1Text.setStyle("-fx-text-fill: #4f46e5; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");

        Label tab1Count = new Label("0");
        tab1Count.setStyle("-fx-background-color: #eef2ff; -fx-text-fill: #4f46e5; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 7px; -fx-background-radius: 10px; -fx-font-family: System;");

        HBox tab1Content = new HBox(6, tab1Text, tab1Count);
        tab1Content.setAlignment(Pos.CENTER_LEFT);

        VBox tabActivePromotions = new VBox(6, tab1Content);
        tabActivePromotions.setStyle("-fx-border-color: #4f46e5; -fx-border-width: 0 0 2px 0; -fx-padding: 0 8px 8px 8px; -fx-cursor: hand;");

        // Tab 2: Expired / Archived
        Label tab2Text = new Label("Expired / Archived");
        tab2Text.setStyle("-fx-text-fill: #64748b; -fx-font-size: 13px; -fx-font-weight: 500; -fx-font-family: System;");

        Label tab2Count = new Label("0");
        tab2Count.setStyle("-fx-background-color: #f1f5f9; -fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 7px; -fx-background-radius: 10px; -fx-font-family: System;");

        HBox tab2Content = new HBox(6, tab2Text, tab2Count);
        tab2Content.setAlignment(Pos.CENTER_LEFT);

        VBox tabExpired = new VBox(6, tab2Content);
        tabExpired.setStyle("-fx-padding: 0 8px 8px 8px; -fx-cursor: hand;");

        HBox tabsRow = new HBox(20, tabActivePromotions, tabExpired);
        tabsRow.setAlignment(Pos.CENTER_LEFT);
        tabsRow.setStyle("-fx-border-color: #e2e8f0; -fx-border-width: 0 0 1px 0;");

        // 3. EMPTY BODY AREA
        Pane emptyContent = new Pane();
        VBox.setVgrow(emptyContent, Priority.ALWAYS);

        // Assemble Page
        VBox mainContent = new VBox(16, headerRow, tabsRow, emptyContent);
        mainContent.setStyle("-fx-background-color: #f8fafc; -fx-padding: 24px;");

        ScrollPane scroll = new ScrollPane(mainContent);
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);
        scroll.setStyle("-fx-background-color: transparent; -fx-background: #f8fafc; -fx-border-color: transparent;");

        return scroll;
    }
}