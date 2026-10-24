package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ShopOrdersPage {

    public ScrollPane getShopOrdersView() {

        Label boardHeading = new Label("Incoming Orders Board");
        boardHeading.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");
        Label boardSubHeading = new Label("Manage real-time incoming orders, preparation stages, and dispatch to courier partners");
        boardSubHeading.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");
        VBox boardHeaderBox = new VBox(3, boardHeading, boardSubHeading);

        // Column 1: New Orders
        Label col1Title = new Label("New Orders");
        col1Title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label col1Count = new Label("0");
        col1Count.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 7px; -fx-background-radius: 10px;");
        BorderPane col1Head = new BorderPane();
        col1Head.setLeft(col1Title);
        col1Head.setRight(col1Count);

        VBox col1 = new VBox(12, col1Head);
        col1.setPrefHeight(340);
        col1.setStyle("-fx-background-color: #f1f5f9; -fx-background-radius: 12px; -fx-padding: 14px;");
        HBox.setHgrow(col1, Priority.ALWAYS);

        // Column 2: Accepted
        Label col2Title = new Label("Accepted");
        col2Title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label col2Count = new Label("1");
        col2Count.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 7px; -fx-background-radius: 10px;");
        BorderPane col2Head = new BorderPane();
        col2Head.setLeft(col2Title);
        col2Head.setRight(col2Count);

        // Accepted Order Card
        Label ord1Id = new Label("#ORD-2406-005");
        ord1Id.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label ord1Price = new Label("₹NaN");
        ord1Price.setStyle("-fx-text-fill: #4f46e5; -fx-font-size: 14px; -fx-font-weight: bold; -fx-font-family: System;");
        BorderPane ord1Top = new BorderPane();
        ord1Top.setLeft(ord1Id);
        ord1Top.setRight(ord1Price);

        Label ord1Date = new Label("12 Jun 2024");
        ord1Date.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");

        Label ord1Cust = new Label("Customer: ()");
        ord1Cust.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-family: System;");

        Label ord1Item = new Label("• 3x Maggi Noodles");
        ord1Item.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 11.5px; -fx-font-family: System;");
        VBox ord1ItemsBox = new VBox(ord1Item);
        ord1ItemsBox.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 6px; -fx-padding: 8px 10px;");

        Label ord1Courier = new Label("🚲 Courier pending assignment");
        ord1Courier.setStyle("-fx-text-fill: #6366f1; -fx-font-size: 11px; -fx-font-family: System;");

        Button startPackingBtn = new Button("Start Packing");
        startPackingBtn.setMaxWidth(Double.MAX_VALUE);
        startPackingBtn.setStyle("-fx-background-color: #6366f1; -fx-text-fill: #ffffff; -fx-font-size: 12px; -fx-font-weight: bold; -fx-padding: 8px 0; -fx-background-radius: 8px; -fx-cursor: hand; -fx-font-family: System;");
        HBox.setHgrow(startPackingBtn, Priority.ALWAYS);

        Button viewBtn1 = new Button("👁");
        viewBtn1.setStyle("-fx-background-color: transparent; -fx-text-fill: #94a3b8; -fx-font-size: 12px; -fx-cursor: hand;");

        HBox ord1Actions = new HBox(6, startPackingBtn, viewBtn1);
        ord1Actions.setAlignment(Pos.CENTER_LEFT);

        VBox orderCard1 = new VBox(8, ord1Top, ord1Date, ord1Cust, ord1ItemsBox, ord1Courier, ord1Actions);
        orderCard1.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 10px; -fx-border-color: #e2e8f0; -fx-border-radius: 10px; -fx-padding: 12px;");

        VBox col2 = new VBox(12, col2Head, orderCard1);
        col2.setPrefHeight(340);
        col2.setStyle("-fx-background-color: #f1f5f9; -fx-background-radius: 12px; -fx-padding: 14px;");
        HBox.setHgrow(col2, Priority.ALWAYS);

        // Column 3: Preparing
        Label col3Title = new Label("Preparing");
        col3Title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label col3Count = new Label("0");
        col3Count.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 7px; -fx-background-radius: 10px;");
        BorderPane col3Head = new BorderPane();
        col3Head.setLeft(col3Title);
        col3Head.setRight(col3Count);

        VBox col3 = new VBox(12, col3Head);
        col3.setPrefHeight(340);
        col3.setStyle("-fx-background-color: #f1f5f9; -fx-background-radius: 12px; -fx-padding: 14px;");
        HBox.setHgrow(col3, Priority.ALWAYS);

        // Column 4: Out for Delivery
        Label col4Title = new Label("Out for Delivery");
        col4Title.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label col4Count = new Label("0");
        col4Count.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 7px; -fx-background-radius: 10px;");
        BorderPane col4Head = new BorderPane();
        col4Head.setLeft(col4Title);
        col4Head.setRight(col4Count);

        VBox col4 = new VBox(12, col4Head);
        col4.setPrefHeight(340);
        col4.setStyle("-fx-background-color: #f1f5f9; -fx-background-radius: 12px; -fx-padding: 14px;");
        HBox.setHgrow(col4, Priority.ALWAYS);

        HBox topColumnsRow = new HBox(14, col1, col2, col3, col4);



        Label colCompTitle = new Label("Completed");
        colCompTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label colCompCount = new Label("1");
        colCompCount.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 7px; -fx-background-radius: 10px;");
        BorderPane colCompHead = new BorderPane();
        colCompHead.setLeft(colCompTitle);
        colCompHead.setRight(colCompCount);

        Label compId = new Label("#ORD-2406-001");
        compId.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label compPrice = new Label("₹NaN");
        compPrice.setStyle("-fx-text-fill: #4f46e5; -fx-font-size: 14px; -fx-font-weight: bold; -fx-font-family: System;");
        BorderPane compTop = new BorderPane();
        compTop.setLeft(compId);
        compTop.setRight(compPrice);

        Label compDate = new Label("10 Jun 2024");
        compDate.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");

        Label compCust = new Label("Customer: ()");
        compCust.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-family: System;");

        Label compItem1 = new Label("• 2x Tata Salt");
        compItem1.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 11.5px; -fx-font-family: System;");
        Label compItem2 = new Label("• 1x Aashirvaad Atta");
        compItem2.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 11.5px; -fx-font-family: System;");
        VBox compItemsBox = new VBox(3, compItem1, compItem2);
        compItemsBox.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 6px; -fx-padding: 8px 10px;");

        Label compCourier = new Label("🚲 Courier: Ravi Jadhav");
        compCourier.setStyle("-fx-text-fill: #6366f1; -fx-font-size: 11px; -fx-font-family: System;");

        Label viewIcon = new Label("👁");
        viewIcon.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 12px; -fx-cursor: hand;");

        VBox compCard = new VBox(8, compTop, compDate, compCust, compItemsBox, compCourier, viewIcon);
        compCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 10px; -fx-border-color: #e2e8f0; -fx-border-radius: 10px; -fx-padding: 12px;");

        VBox colCompleted = new VBox(12, colCompHead, compCard);
        colCompleted.setPrefWidth(280);
        colCompleted.setStyle("-fx-background-color: #f1f5f9; -fx-background-radius: 12px; -fx-padding: 14px;");

        HBox bottomSection = new HBox(colCompleted);


        VBox boardContent = new VBox(20, boardHeaderBox, topColumnsRow, bottomSection);
        boardContent.setStyle("-fx-background-color: #f8fafc; -fx-padding: 24px;");

        ScrollPane centerScroll = new ScrollPane(boardContent);
        centerScroll.setFitToWidth(true);
        centerScroll.setStyle("-fx-background-color: transparent; -fx-background: #f8fafc; -fx-border-color: transparent;");

        return centerScroll;
    }
}