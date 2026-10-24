package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ShopDashboard {

    public ScrollPane getShopDashboardView() {

        Label pageHeading = new Label("Store Manager Dashboard");
        pageHeading.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");
        Label pageSubHeading = new Label("Pune Daily Mart • Baner Road Branch");
        pageSubHeading.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");
        VBox dashTitleBox = new VBox(2, pageHeading, pageSubHeading);

        Button incomingBtn = new Button("📥 Incoming Orders (1)");
        incomingBtn.setStyle("-fx-background-color: #4f46e5; -fx-text-fill: #ffffff; -fx-font-size: 12px; -fx-font-weight: bold; -fx-padding: 8px 14px; -fx-background-radius: 8px; -fx-cursor: hand; -fx-font-family: System;");

        Button manageBtn = new Button("📦 Manage Catalog");
        manageBtn.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #1e293b; -fx-font-size: 12px; -fx-font-weight: bold; -fx-padding: 8px 14px; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-cursor: hand; -fx-font-family: System;");

        HBox dashActionBtns = new HBox(10, incomingBtn, manageBtn);
        dashActionBtns.setAlignment(Pos.CENTER_RIGHT);

        BorderPane dashHeader = new BorderPane();
        dashHeader.setLeft(dashTitleBox);
        dashHeader.setRight(dashActionBtns);


        // Metric 1: Gross Sales
        Label m1Title = new Label("TODAY'S GROSS SALES");
        m1Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m1Icon = new Label("$");
        m1Icon.setStyle("-fx-text-fill: #059669; -fx-font-size: 13px; -fx-font-weight: bold;");
        StackPane m1IconBox = new StackPane(m1Icon);
        m1IconBox.setPrefSize(28, 28);
        m1IconBox.setStyle("-fx-background-color: #ecfdf5; -fx-background-radius: 14px;");
        BorderPane m1Top = new BorderPane();
        m1Top.setLeft(m1Title);
        m1Top.setRight(m1IconBox);

        Label m1Val = new Label("₹14,520");
        m1Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m1Sub = new Label("↑ +18% vs yesterday");
        m1Sub.setStyle("-fx-text-fill: #10b981; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        HBox m1Bars = new HBox(4);
        m1Bars.setAlignment(Pos.BOTTOM_LEFT);
        double[] b1Heights = {8, 12, 10, 14, 22, 18};
        for (double h : b1Heights) {
            StackPane bar = new StackPane();
            bar.setPrefSize(34, h);
            bar.setStyle("-fx-background-color: #34d399; -fx-background-radius: 3px;");
            m1Bars.getChildren().add(bar);
        }
        VBox m1Card = new VBox(6, m1Top, m1Val, m1Sub, m1Bars);
        m1Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");
        HBox.setHgrow(m1Card, Priority.ALWAYS);

        // Metric 2: Orders Today
        Label m2Title = new Label("ORDERS TODAY");
        m2Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m2Icon = new Label("🛍");
        m2Icon.setStyle("-fx-text-fill: #2563eb; -fx-font-size: 12px;");
        StackPane m2IconBox = new StackPane(m2Icon);
        m2IconBox.setPrefSize(28, 28);
        m2IconBox.setStyle("-fx-background-color: #eff6ff; -fx-background-radius: 14px;");
        BorderPane m2Top = new BorderPane();
        m2Top.setLeft(m2Title);
        m2Top.setRight(m2IconBox);

        Label m2Val = new Label("48 Orders");
        m2Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m2Sub = new Label("98% Fulfillment Rate");
        m2Sub.setStyle("-fx-text-fill: #3b82f6; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        HBox m2Bars = new HBox(4);
        m2Bars.setAlignment(Pos.BOTTOM_LEFT);
        double[] b2Heights = {6, 10, 8, 14, 20, 16};
        for (double h : b2Heights) {
            StackPane bar = new StackPane();
            bar.setPrefSize(34, h);
            bar.setStyle("-fx-background-color: #60a5fa; -fx-background-radius: 3px;");
            m2Bars.getChildren().add(bar);
        }
        VBox m2Card = new VBox(6, m2Top, m2Val, m2Sub, m2Bars);
        m2Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");
        HBox.setHgrow(m2Card, Priority.ALWAYS);

        // Metric 3: Pending Action
        Label m3Title = new Label("PENDING ACTION");
        m3Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m3Icon = new Label("🕒");
        m3Icon.setStyle("-fx-text-fill: #d97706; -fx-font-size: 12px;");
        StackPane m3IconBox = new StackPane(m3Icon);
        m3IconBox.setPrefSize(28, 28);
        m3IconBox.setStyle("-fx-background-color: #fffbeb; -fx-background-radius: 14px;");
        BorderPane m3Top = new BorderPane();
        m3Top.setLeft(m3Title);
        m3Top.setRight(m3IconBox);

        Label m3Val = new Label("1 New");
        m3Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m3Sub = new Label("Awaiting packing");
        m3Sub.setStyle("-fx-text-fill: #f59e0b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        HBox m3Bars = new HBox(4);
        m3Bars.setAlignment(Pos.BOTTOM_LEFT);
        double[] b3Heights = {4, 6, 8, 12, 10, 16};
        for (double h : b3Heights) {
            StackPane bar = new StackPane();
            bar.setPrefSize(34, h);
            bar.setStyle("-fx-background-color: #fbbf24; -fx-background-radius: 3px;");
            m3Bars.getChildren().add(bar);
        }
        VBox m3Card = new VBox(6, m3Top, m3Val, m3Sub, m3Bars);
        m3Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");
        HBox.setHgrow(m3Card, Priority.ALWAYS);

        // Metric 4: Low Stock Warnings
        Label m4Title = new Label("LOW STOCK WARNINGS");
        m4Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m4Icon = new Label("⚠");
        m4Icon.setStyle("-fx-text-fill: #dc2626; -fx-font-size: 12px;");
        StackPane m4IconBox = new StackPane(m4Icon);
        m4IconBox.setPrefSize(28, 28);
        m4IconBox.setStyle("-fx-background-color: #fef2f2; -fx-background-radius: 14px;");
        BorderPane m4Top = new BorderPane();
        m4Top.setLeft(m4Title);
        m4Top.setRight(m4IconBox);

        Label m4Val = new Label("1 Items");
        m4Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");
        Label m4Sub = new Label("Requires restocking");
        m4Sub.setStyle("-fx-text-fill: #ef4444; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        HBox m4Bars = new HBox(4);
        m4Bars.setAlignment(Pos.BOTTOM_LEFT);
        double[] b4Heights = {14, 16, 12, 10, 6, 4};
        for (double h : b4Heights) {
            StackPane bar = new StackPane();
            bar.setPrefSize(34, h);
            bar.setStyle("-fx-background-color: #f87171; -fx-background-radius: 3px;");
            m4Bars.getChildren().add(bar);
        }
        VBox m4Card = new VBox(6, m4Top, m4Val, m4Sub, m4Bars);
        m4Card.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");
        HBox.setHgrow(m4Card, Priority.ALWAYS);

        HBox metricCardsRow = new HBox(16, m1Card, m2Card, m3Card, m4Card);

        // 3. MIDDLE ROW (Chart + Kanban)
        Label revTitle = new Label("Weekly Sales Revenue (₹)");
        revTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");
        Label revBadge = new Label("↑ +₹2,100 vs last week");
        revBadge.setStyle("-fx-background-color: #ecfdf5; -fx-text-fill: #059669; -fx-font-size: 10px; -fx-font-weight: bold; -fx-padding: 2px 8px; -fx-background-radius: 10px; -fx-font-family: System;");
        HBox revTopLeft = new HBox(8, revTitle, revBadge);
        revTopLeft.setAlignment(Pos.CENTER_LEFT);

        Label revSub = new Label("Daily localized customer demand — Baner cluster");
        revSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");
        VBox revHeader = new VBox(2, revTopLeft, revSub);

        StackPane chartPlaceholder = new StackPane(new Label("📈 Weekly Revenue Curve View"));
        chartPlaceholder.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 8px; -fx-border-color: #f1f5f9; -fx-border-radius: 8px;");
        VBox.setVgrow(chartPlaceholder, Priority.ALWAYS);

        VBox weeklySalesCard = new VBox(12, revHeader, chartPlaceholder);
        weeklySalesCard.setPrefHeight(270);
        weeklySalesCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");
        HBox.setHgrow(weeklySalesCard, Priority.ALWAYS);

        Label kTitle = new Label("Orders Kanban");
        kTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 14px; -fx-font-weight: bold; -fx-font-family: System;");
        Label kSub = new Label("Live board snapshot");
        kSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");
        VBox kHeader = new VBox(2, kTitle, kSub);

        Button fullBoardBtn = new Button("Full Board >");
        fullBoardBtn.setStyle("-fx-background-color: #eff6ff; -fx-text-fill: #3b82f6; -fx-font-size: 11px; -fx-font-weight: bold; -fx-background-radius: 6px; -fx-padding: 4px 8px; -fx-cursor: hand; -fx-font-family: System;");

        BorderPane kTop = new BorderPane();
        kTop.setLeft(kHeader);
        kTop.setRight(fullBoardBtn);

        Label kb1Status = new Label("0  PLACED");
        kb1Status.setStyle("-fx-text-fill: #3b82f6; -fx-font-size: 10px; -fx-font-weight: bold; -fx-font-family: System;");
        Label kb1Val = new Label("None");
        kb1Val.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        VBox kb1 = new VBox(4, kb1Status, kb1Val);
        kb1.setPrefWidth(140);
        kb1.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 8px; -fx-border-color: #f1f5f9; -fx-border-radius: 8px; -fx-padding: 10px;");

        Label kb2Status = new Label("1  ACCEPTED");
        kb2Status.setStyle("-fx-text-fill: #d97706; -fx-font-size: 10px; -fx-font-weight: bold; -fx-font-family: System;");
        Label kb2Val = new Label("#-005 • ₹214");
        kb2Val.setStyle("-fx-text-fill: #1e293b; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        VBox kb2 = new VBox(4, kb2Status, kb2Val);
        kb2.setPrefWidth(140);
        kb2.setStyle("-fx-background-color: #fffbeb; -fx-background-radius: 8px; -fx-border-color: #fef3c7; -fx-border-radius: 8px; -fx-padding: 10px;");

        Label kb3Status = new Label("0  PACKING");
        kb3Status.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10px; -fx-font-weight: bold; -fx-font-family: System;");
        Label kb3Val = new Label("None");
        kb3Val.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        VBox kb3 = new VBox(4, kb3Status, kb3Val);
        kb3.setPrefWidth(140);
        kb3.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 8px; -fx-border-color: #f1f5f9; -fx-border-radius: 8px; -fx-padding: 10px;");

        Label kb4Status = new Label("0  READY");
        kb4Status.setStyle("-fx-text-fill: #059669; -fx-font-size: 10px; -fx-font-weight: bold; -fx-font-family: System;");
        Label kb4Val = new Label("None");
        kb4Val.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        VBox kb4 = new VBox(4, kb4Status, kb4Val);
        kb4.setPrefWidth(140);
        kb4.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 8px; -fx-border-color: #f1f5f9; -fx-border-radius: 8px; -fx-padding: 10px;");

        GridPane kanbanGrid = new GridPane();
        kanbanGrid.setHgap(8);
        kanbanGrid.setVgap(8);
        kanbanGrid.add(kb1, 0, 0);
        kanbanGrid.add(kb2, 1, 0);
        kanbanGrid.add(kb3, 0, 1);
        kanbanGrid.add(kb4, 1, 1);

        VBox kanbanCard = new VBox(14, kTop, kanbanGrid);
        kanbanCard.setPrefWidth(320);
        kanbanCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");

        HBox middleRow = new HBox(16, weeklySalesCard, kanbanCard);

        // ==========================================
        // 4. BOTTOM SECTION: LEFT COLUMN
        // ==========================================
        Label prodTitle = new Label("Top Performing Products");
        prodTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");
        Label prodSub = new Label("Units sold this week");
        prodSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");
        VBox prodHeader = new VBox(2, prodTitle, prodSub);

        Label p1Name = new Label("Amul Taaza Milk\n500ml");
        p1Name.setStyle("-fx-text-fill: #475569; -fx-font-size: 11px; -fx-font-family: System;");
        p1Name.setPrefWidth(120);
        StackPane p1Bar = new StackPane();
        p1Bar.setPrefSize(380, 24);
        p1Bar.setStyle("-fx-background-color: #f43f5e; -fx-background-radius: 4px;");
        HBox p1Row = new HBox(10, p1Name, p1Bar);
        p1Row.setAlignment(Pos.CENTER_LEFT);

        Label p2Name = new Label("Aashirvaad Chakki\nAtta 5kg");
        p2Name.setStyle("-fx-text-fill: #475569; -fx-font-size: 11px; -fx-font-family: System;");
        p2Name.setPrefWidth(120);
        StackPane p2Bar = new StackPane();
        p2Bar.setPrefSize(220, 24);
        p2Bar.setStyle("-fx-background-color: #f43f5e; -fx-background-radius: 4px;");
        HBox p2Row = new HBox(10, p2Name, p2Bar);
        p2Row.setAlignment(Pos.CENTER_LEFT);

        Label p3Name = new Label("Tata Salt Vaccum\nEvaporated 1kg");
        p3Name.setStyle("-fx-text-fill: #475569; -fx-font-size: 11px; -fx-font-family: System;");
        p3Name.setPrefWidth(120);
        StackPane p3Bar = new StackPane();
        p3Bar.setPrefSize(280, 24);
        p3Bar.setStyle("-fx-background-color: #f43f5e; -fx-background-radius: 4px;");
        HBox p3Row = new HBox(10, p3Name, p3Bar);
        p3Row.setAlignment(Pos.CENTER_LEFT);

        Label p4Name = new Label("Fortune Sunflower\nOil 1L");
        p4Name.setStyle("-fx-text-fill: #475569; -fx-font-size: 11px; -fx-font-family: System;");
        p4Name.setPrefWidth(120);
        StackPane p4Bar = new StackPane();
        p4Bar.setPrefSize(180, 24);
        p4Bar.setStyle("-fx-background-color: #f43f5e; -fx-background-radius: 4px;");
        HBox p4Row = new HBox(10, p4Name, p4Bar);
        p4Row.setAlignment(Pos.CENTER_LEFT);

        VBox productBarsBox = new VBox(10, p1Row, p2Row, p3Row, p4Row);
        VBox productsCard = new VBox(14, prodHeader, productBarsBox);
        productsCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");

        // Inventory Restock Alerts
        Label restockTitle = new Label("Inventory Restock Alerts");
        restockTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 14px; -fx-font-weight: bold; -fx-font-family: System;");
        Label restockSub = new Label("Products with 5 or fewer items remaining");
        restockSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");
        VBox restockHead = new VBox(2, restockTitle, restockSub);

        Label viewAllBtn = new Label("View All →");
        viewAllBtn.setStyle("-fx-text-fill: #475569; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-cursor: hand; -fx-font-family: System;");

        BorderPane restockTop = new BorderPane();
        restockTop.setLeft(restockHead);
        restockTop.setRight(viewAllBtn);

        Label itemTitle = new Label("Fortune Sunflower Oil");
        itemTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");
        Label itemDesc = new Label("Fortune • 1 L");
        itemDesc.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        VBox itemMeta = new VBox(2, itemTitle, itemDesc);

        Label stockPill = new Label("Stock: 0 left");
        stockPill.setStyle("-fx-background-color: #fef2f2; -fx-text-fill: #dc2626; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 3px 10px; -fx-background-radius: 12px; -fx-font-family: System;");

        Label itemPrice = new Label("₹142");
        itemPrice.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");

        HBox itemRight = new HBox(12, stockPill, itemPrice);
        itemRight.setAlignment(Pos.CENTER_RIGHT);

        BorderPane restockRow = new BorderPane();
        restockRow.setLeft(itemMeta);
        restockRow.setRight(itemRight);
        restockRow.setStyle("-fx-padding: 6px 0;");

        VBox restockCard = new VBox(12, restockTop, restockRow);
        restockCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");

        VBox leftBottomCol = new VBox(16, productsCard, restockCard);
        HBox.setHgrow(leftBottomCol, Priority.ALWAYS);

        // ==========================================
        // 5. BOTTOM SECTION: RIGHT COLUMN
        // ==========================================
        Label actionTitle = new Label("Action Center");
        actionTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 14px; -fx-font-weight: bold; -fx-font-family: System;");
        Label actionSub = new Label("Items needing your attention");
        actionSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");
        VBox actionHead = new VBox(2, actionTitle, actionSub);

        Label a1Icon = new Label("⚠");
        a1Icon.setStyle("-fx-text-fill: #ef4444; -fx-font-size: 13px;");
        Label a1Title = new Label("1 orders unacknowledged");
        a1Title.setStyle("-fx-text-fill: #991b1b; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label a1Sub = new Label("Some pending >10 min — review now");
        a1Sub.setStyle("-fx-text-fill: #b91c1c; -fx-font-size: 10px; -fx-font-family: System;");
        VBox a1TextBox = new VBox(1, a1Title, a1Sub);
        HBox a1Left = new HBox(8, a1Icon, a1TextBox);
        a1Left.setAlignment(Pos.CENTER_LEFT);

        Button a1Btn = new Button("Accept");
        a1Btn.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #3b82f6; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 4px 10px; -fx-background-radius: 6px; -fx-border-color: #e2e8f0; -fx-border-radius: 6px; -fx-cursor: hand; -fx-font-family: System;");

        BorderPane action1 = new BorderPane();
        action1.setLeft(a1Left);
        action1.setRight(a1Btn);
        action1.setStyle("-fx-background-color: #fef2f2; -fx-border-color: #fecaca; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 10px;");

        Label a2Icon = new Label("📦");
        a2Icon.setStyle("-fx-text-fill: #d97706; -fx-font-size: 13px;");
        Label a2Title = new Label("Fortune Sunflower Oil");
        a2Title.setStyle("-fx-text-fill: #92400e; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label a2Sub = new Label("0 units left — restock soon");
        a2Sub.setStyle("-fx-text-fill: #b45309; -fx-font-size: 10px; -fx-font-family: System;");
        VBox a2TextBox = new VBox(1, a2Title, a2Sub);
        HBox a2Left = new HBox(8, a2Icon, a2TextBox);
        a2Left.setAlignment(Pos.CENTER_LEFT);

        Button a2Btn = new Button("Restock");
        a2Btn.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #3b82f6; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 4px 10px; -fx-background-radius: 6px; -fx-border-color: #e2e8f0; -fx-border-radius: 6px; -fx-cursor: hand; -fx-font-family: System;");

        BorderPane action2 = new BorderPane();
        action2.setLeft(a2Left);
        action2.setRight(a2Btn);
        action2.setStyle("-fx-background-color: #fffbeb; -fx-border-color: #fef3c7; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 10px;");

        Label a3Icon = new Label("☆");
        a3Icon.setStyle("-fx-text-fill: #16a34a; -fx-font-size: 13px;");
        Label a3Title = new Label("New 5★ review received");
        a3Title.setStyle("-fx-text-fill: #166534; -fx-font-size: 11.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label a3Sub = new Label("\"Fast delivery, fresh items!\" — Priya K.");
        a3Sub.setStyle("-fx-text-fill: #15803d; -fx-font-size: 10px; -fx-font-family: System;");
        VBox a3TextBox = new VBox(1, a3Title, a3Sub);
        HBox a3Left = new HBox(8, a3Icon, a3TextBox);
        a3Left.setAlignment(Pos.CENTER_LEFT);

        Button a3Btn = new Button("View");
        a3Btn.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #3b82f6; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 4px 10px; -fx-background-radius: 6px; -fx-border-color: #e2e8f0; -fx-border-radius: 6px; -fx-cursor: hand; -fx-font-family: System;");

        BorderPane action3 = new BorderPane();
        action3.setLeft(a3Left);
        action3.setRight(a3Btn);
        action3.setStyle("-fx-background-color: #f0fdf4; -fx-border-color: #bbf7d0; -fx-border-radius: 8px; -fx-background-radius: 8px; -fx-padding: 8px 10px;");

        VBox actionCard = new VBox(10, actionHead, action1, action2, action3);
        actionCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");

        // Store Health Score
        Label healthTitle = new Label("Store Health Score");
        healthTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 14px; -fx-font-weight: bold; -fx-font-family: System;");
        Label healthSub = new Label("Based on rating, speed & stock");
        healthSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");
        VBox healthHead = new VBox(2, healthTitle, healthSub);

        Label scoreVal = new Label("87");
        scoreVal.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");
        Label scoreSub = new Label("/100");
        scoreSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 10px; -fx-font-family: System;");
        VBox scoreCenter = new VBox(scoreVal, scoreSub);
        scoreCenter.setAlignment(Pos.CENTER);

        StackPane circleGauge = new StackPane(scoreCenter);
        circleGauge.setPrefSize(84, 84);
        circleGauge.setMaxSize(84, 84);
        circleGauge.setStyle("-fx-border-color: #059669; -fx-border-width: 5px; -fx-border-radius: 42px; -fx-background-color: #ffffff;");

        Label healthScoreLbl = new Label("Store Health Score");
        healthScoreLbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        VBox circleBox = new VBox(4, circleGauge, healthScoreLbl);
        circleBox.setAlignment(Pos.CENTER);

        Label hr1Lbl = new Label("Avg Rating");
        hr1Lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        StackPane hr1Bar = new StackPane();
        hr1Bar.setPrefSize(85, 6);
        hr1Bar.setStyle("-fx-background-color: #059669; -fx-background-radius: 4px;");
        Label hr1Val = new Label("92%");
        hr1Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");
        HBox hr1Right = new HBox(8, hr1Bar, hr1Val);
        hr1Right.setAlignment(Pos.CENTER_RIGHT);
        BorderPane hr1 = new BorderPane();
        hr1.setLeft(hr1Lbl);
        hr1.setRight(hr1Right);

        Label hr2Lbl = new Label("Accept Rate");
        hr2Lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        StackPane hr2Bar = new StackPane();
        hr2Bar.setPrefSize(85, 6);
        hr2Bar.setStyle("-fx-background-color: #059669; -fx-background-radius: 4px;");
        Label hr2Val = new Label("97%");
        hr2Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");
        HBox hr2Right = new HBox(8, hr2Bar, hr2Val);
        hr2Right.setAlignment(Pos.CENTER_RIGHT);
        BorderPane hr2 = new BorderPane();
        hr2.setLeft(hr2Lbl);
        hr2.setRight(hr2Right);

        Label hr3Lbl = new Label("Response Time");
        hr3Lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        StackPane hr3Bar = new StackPane();
        hr3Bar.setPrefSize(85, 6);
        hr3Bar.setStyle("-fx-background-color: #059669; -fx-background-radius: 4px;");
        Label hr3Val = new Label("85%");
        hr3Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");
        HBox hr3Right = new HBox(8, hr3Bar, hr3Val);
        hr3Right.setAlignment(Pos.CENTER_RIGHT);
        BorderPane hr3 = new BorderPane();
        hr3.setLeft(hr3Lbl);
        hr3.setRight(hr3Right);

        Label hr4Lbl = new Label("Stock Coverage");
        hr4Lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");
        StackPane hr4Bar = new StackPane();
        hr4Bar.setPrefSize(85, 6);
        hr4Bar.setStyle("-fx-background-color: #059669; -fx-background-radius: 4px;");
        Label hr4Val = new Label("74%");
        hr4Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");
        HBox hr4Right = new HBox(8, hr4Bar, hr4Val);
        hr4Right.setAlignment(Pos.CENTER_RIGHT);
        BorderPane hr4 = new BorderPane();
        hr4.setLeft(hr4Lbl);
        hr4.setRight(hr4Right);

        VBox healthCard = new VBox(10, healthHead, circleBox, hr1, hr2, hr3, hr4);
        healthCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 16px;");

        VBox rightBottomCol = new VBox(16, actionCard, healthCard);
        rightBottomCol.setPrefWidth(320);

        HBox bottomRow = new HBox(16, leftBottomCol, rightBottomCol);

        VBox dashContent = new VBox(20, dashHeader, metricCardsRow, middleRow, bottomRow);
        dashContent.setStyle("-fx-background-color: #f8fafc; -fx-padding: 24px;");

        ScrollPane centerScroll = new ScrollPane(dashContent);
        centerScroll.setFitToWidth(true);
        centerScroll.setStyle("-fx-background-color: transparent; -fx-background: #f8fafc; -fx-border-color: transparent;");

        return centerScroll;
    }
}