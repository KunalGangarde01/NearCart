package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ShopProfile {

    public ScrollPane getShopProfileView() {

        // ==========================================
        // 1. PAGE HEADER
        // ==========================================
        Label pageHeading = new Label("Store Profile & Settings");
        pageHeading.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");

        Label pageSubHeading = new Label("Configure your store operating hours, local delivery radius, minimum basket, and holiday mode");
        pageSubHeading.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");

        VBox headerBox = new VBox(3, pageHeading, pageSubHeading);

        // ==========================================
        // 2. HOLIDAY / VACATION MODE CARD
        // ==========================================
        Label powerIcon = new Label("⏻");
        powerIcon.setStyle("-fx-text-fill: #059669; -fx-font-size: 14px; -fx-font-weight: bold;");

        Label holidayTitle = new Label("Holiday / Vacation Mode");
        holidayTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 14px; -fx-font-weight: bold; -fx-font-family: System;");

        HBox holidayTitleRow = new HBox(6, powerIcon, holidayTitle);
        holidayTitleRow.setAlignment(Pos.CENTER_LEFT);

        Label holidaySub = new Label("When enabled, your store shows as \"Temporarily Closed\" on customer search and no new orders can be placed.");
        holidaySub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11.5px; -fx-font-family: System;");

        VBox holidayLeft = new VBox(3, holidayTitleRow, holidaySub);

        CheckBox storeActiveCheck = new CheckBox("Store Active");
        storeActiveCheck.setSelected(false);
        storeActiveCheck.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 12px; -fx-font-weight: bold; -fx-font-family: System; -fx-cursor: hand;");

        BorderPane holidayCard = new BorderPane();
        holidayCard.setLeft(holidayLeft);
        holidayCard.setRight(storeActiveCheck);
        holidayCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px 20px;");

        // ==========================================
        // 3. GENERAL BUSINESS INFORMATION CARD
        // ==========================================
        Label generalTitle = new Label("General Business Information");
        generalTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");

        // Store Public Name
        Label nameLabel = new Label("Store Public Name");
        nameLabel.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-weight: 500; -fx-font-family: System;");
        TextField nameField = new TextField("Pune Daily Mart");
        nameField.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 12px; -fx-font-size: 12.5px; -fx-text-fill: #1e293b;");
        VBox nameBox = new VBox(6, nameLabel, nameField);

        // Physical Street Address
        Label addressLabel = new Label("Physical Street Address");
        addressLabel.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-weight: 500; -fx-font-family: System;");
        TextField addressField = new TextField("Shop 14, Commercial Complex, Baner Road, Pune 411045");
        addressField.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 12px; -fx-font-size: 12.5px; -fx-text-fill: #1e293b;");
        VBox addressBox = new VBox(6, addressLabel, addressField);

        // Official Contact Number
        Label contactLabel = new Label("Official Contact Number");
        contactLabel.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-weight: 500; -fx-font-family: System;");
        TextField contactField = new TextField("+91 98765 01234");
        contactField.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 12px; -fx-font-size: 12.5px; -fx-text-fill: #1e293b;");
        VBox contactBox = new VBox(6, contactLabel, contactField);

        VBox generalCard = new VBox(14, generalTitle, nameBox, addressBox, contactBox);
        generalCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 20px;");

        // ==========================================
        // 4. OPERATING PARAMETERS CARD
        // ==========================================
        Label opTitle = new Label("Operating Parameters");
        opTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");

        // Store Timings & Delivery Radius Row
        Label timingsLabel = new Label("Store Timings");
        timingsLabel.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-weight: 500; -fx-font-family: System;");
        TextField timingsField = new TextField("08:00 AM - 10:00 PM");
        timingsField.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 12px; -fx-font-size: 12.5px; -fx-text-fill: #1e293b;");
        VBox timingsBox = new VBox(6, timingsLabel, timingsField);
        HBox.setHgrow(timingsBox, Priority.ALWAYS);

        Label radiusLabel = new Label("Delivery Radius (km)");
        radiusLabel.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-weight: 500; -fx-font-family: System;");
        TextField radiusField = new TextField("5");
        radiusField.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 12px; -fx-font-size: 12.5px; -fx-text-fill: #1e293b;");
        VBox radiusBox = new VBox(6, radiusLabel, radiusField);
        HBox.setHgrow(radiusBox, Priority.ALWAYS);

        HBox timingRadiusRow = new HBox(16, timingsBox, radiusBox);

        // Minimum Order Amount
        Label minOrderLabel = new Label("Minimum Order Amount (₹)");
        minOrderLabel.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-weight: 500; -fx-font-family: System;");
        TextField minOrderField = new TextField("150");
        minOrderField.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 12px; -fx-font-size: 12.5px; -fx-text-fill: #1e293b;");
        VBox minOrderBox = new VBox(6, minOrderLabel, minOrderField);

        // Store Geolocation Pin & Map View
        Label geoLabel = new Label("Store Geolocation Pin");
        geoLabel.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-weight: 500; -fx-font-family: System;");

        // Map Mock Container
        BorderPane mapPane = new BorderPane();
        mapPane.setPrefHeight(180);
        mapPane.setStyle("-fx-background-color: #0f172a; -fx-background-radius: 10px; -fx-padding: 12px;");

        Label mapPlaceholderText = new Label("Map placeholder — integrate Mapbox/Google Maps here");
        mapPlaceholderText.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        BorderPane.setAlignment(mapPlaceholderText, Pos.TOP_RIGHT);
        mapPane.setTop(mapPlaceholderText);

        // Center Pin with Label
        Label mapPin = new Label("📍\nPune Daily Mart");
        mapPin.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 4px 8px; -fx-background-radius: 6px; -fx-alignment: center;");
        StackPane mapCenterBox = new StackPane(mapPin);
        mapPane.setCenter(mapCenterBox);

        // Bottom Left Coordinates Tag
        Label coordLabel = new Label("📍 undefined, undefined");
        coordLabel.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff; -fx-font-size: 10.5px; -fx-padding: 3px 8px; -fx-background-radius: 6px; -fx-font-family: System;");
        BorderPane.setAlignment(coordLabel, Pos.BOTTOM_LEFT);
        mapPane.setBottom(coordLabel);

        VBox mapBox = new VBox(6, geoLabel, mapPane);

        VBox operatingCard = new VBox(14, opTitle, timingRadiusRow, minOrderBox, mapBox);
        operatingCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 20px;");

        // ==========================================
        // 5. BOTTOM SAVE ACTION BUTTON
        // ==========================================
        Button updateBtn = new Button("💾 Update Store Settings");
        updateBtn.setStyle("-fx-background-color: #6366f1; -fx-text-fill: #ffffff; -fx-font-size: 13px; -fx-font-weight: bold; -fx-padding: 10px 20px; -fx-background-radius: 8px; -fx-cursor: hand; -fx-font-family: System;");

        HBox buttonRow = new HBox(updateBtn);
        buttonRow.setAlignment(Pos.CENTER_RIGHT);

        // Assemble Entire Page
        VBox mainContent = new VBox(18, headerBox, holidayCard, generalCard, operatingCard, buttonRow);
        mainContent.setStyle("-fx-background-color: #f8fafc; -fx-padding: 24px;");

        ScrollPane scroll = new ScrollPane(mainContent);
        scroll.setFitToWidth(true);
        scroll.setStyle("-fx-background-color: transparent; -fx-background: #f8fafc; -fx-border-color: transparent;");

        return scroll;
    }
}