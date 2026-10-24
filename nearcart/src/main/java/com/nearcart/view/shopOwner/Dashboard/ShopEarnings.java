package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ShopEarnings {

    public ScrollPane getShopEarningsView() {

        // ==========================================
        // 1. PAGE HEADER
        // ==========================================
        Label pageHeading = new Label("Earnings & Customer Feedback");
        pageHeading.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");

        Label pageSubHeading = new Label("Monitor your weekly merchant settlement deposits and customer satisfaction ratings");
        pageSubHeading.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");

        VBox headerBox = new VBox(3, pageHeading, pageSubHeading);

        // ==========================================
        // 2. TABS SECTION
        // ==========================================
        // Tab 1: Payouts & Earnings (Active)
        Label tab1Label = new Label("💲 Payouts & Earnings");
        tab1Label.setStyle("-fx-text-fill: #4f46e5; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");

        VBox tab1 = new VBox(tab1Label);
        tab1.setStyle("-fx-border-color: #4f46e5; -fx-border-width: 0 0 2px 0; -fx-padding: 0 10px 8px 10px; -fx-cursor: hand;");

        // Tab 2: Customer Reviews
        Label tab2Label = new Label("☆ Customer Reviews (4.8 ★)");
        tab2Label.setStyle("-fx-text-fill: #64748b; -fx-font-size: 13px; -fx-font-weight: 500; -fx-font-family: System;");

        VBox tab2 = new VBox(tab2Label);
        tab2.setStyle("-fx-padding: 0 10px 8px 10px; -fx-cursor: hand;");

        HBox tabsRow = new HBox(16, tab1, tab2);
        tabsRow.setAlignment(Pos.CENTER_LEFT);
        tabsRow.setStyle("-fx-border-color: #e2e8f0; -fx-border-width: 0 0 1px 0;");

        // ==========================================
        // 3. STATS CARDS ROW (3 Cards)
        // ==========================================
        // Card 1: Next Settlement
        Label c1Title = new Label("NEXT SETTLEMENT (DUE MONDAY)");
        c1Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c1Val = new Label("₹24,850");
        c1Val.setStyle("-fx-text-fill: #4f46e5; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c1Sub = new Label("Bank: HDFC Bank A/C ending in 4102");
        c1Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");

        VBox card1 = new VBox(6, c1Title, c1Val, c1Sub);
        card1.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 18px;");
        HBox.setHgrow(card1, Priority.ALWAYS);

        // Card 2: Lifetime Net Payouts
        Label c2Title = new Label("LIFETIME NET PAYOUTS");
        c2Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c2Val = new Label("₹3,84,200");
        c2Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c2Sub = new Label("100% on-time settlement");
        c2Sub.setStyle("-fx-text-fill: #059669; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        VBox card2 = new VBox(6, c2Title, c2Val, c2Sub);
        card2.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 18px;");
        HBox.setHgrow(card2, Priority.ALWAYS);

        // Card 3: Platform Commission Rate
        Label c3Title = new Label("PLATFORM COMMISSION RATE");
        c3Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c3Val = new Label("5.0%");
        c3Val.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c3Sub = new Label("Hyperlocal merchant tier");
        c3Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");

        VBox card3 = new VBox(6, c3Title, c3Val, c3Sub);
        card3.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 18px;");
        HBox.setHgrow(card3, Priority.ALWAYS);

        HBox statsRow = new HBox(16, card1, card2, card3);

        // ==========================================
        // 4. SETTLEMENT HISTORY TABLE
        // ==========================================
        Label historyTitle = new Label("Settlement History");
        historyTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");

        Label historySub = new Label("Direct bank deposits processed weekly");
        historySub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");

        VBox historyHeaderBox = new VBox(2, historyTitle, historySub);

        // Table Column Headers
        Label thPayoutId = createHeaderLabel("Payout ID", 150);
        Label thPeriod = createHeaderLabel("Settlement Period", 200);
        Label thOrders = createHeaderLabel("Total Orders", 150);
        Label thVolume = createHeaderLabel("Gross Volume", 150);
        Label thFee = createHeaderLabel("Fee (5%)", 130);
        Label thNet = createHeaderLabel("Net Deposited", 150);
        Label thStatus = createHeaderLabel("Status", 120);

        HBox tableHeader = new HBox(10, thPayoutId, thPeriod, thOrders, thVolume, thFee, thNet, thStatus);
        tableHeader.setAlignment(Pos.CENTER_LEFT);
        tableHeader.setStyle("-fx-padding: 12px 16px; -fx-border-color: #f1f5f9; -fx-border-width: 0 0 1px 0;");

        // Table Data Rows
        VBox tableRows = new VBox(
                createHistoryRow("#PAY-8921", "10 Oct - 16 Oct 2026", "184 orders", "₹64,200", "-₹3,210", "₹60,990", "DEPOSITED"),
                createHistoryRow("#PAY-8804", "03 Oct - 09 Oct 2026", "162 orders", "₹55,800", "-₹2,790", "₹53,010", "DEPOSITED"),
                createHistoryRow("#PAY-8711", "26 Sep - 02 Oct 2026", "175 orders", "₹61,400", "-₹3,070", "₹58,330", "DEPOSITED")
        );

        VBox historyCard = new VBox(14, historyHeaderBox, tableHeader, tableRows);
        historyCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 18px;");

        // Assemble Page
        VBox mainContent = new VBox(18, headerBox, tabsRow, statsRow, historyCard);
        mainContent.setStyle("-fx-background-color: #f8fafc; -fx-padding: 24px;");

        ScrollPane scroll = new ScrollPane(mainContent);
        scroll.setFitToWidth(true);
        scroll.setStyle("-fx-background-color: transparent; -fx-background: #f8fafc; -fx-border-color: transparent;");

        return scroll;
    }

    // Helper for Table Headers
    private Label createHeaderLabel(String text, double width) {
        Label lbl = new Label(text);
        lbl.setPrefWidth(width);
        lbl.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");
        return lbl;
    }

    // Helper for Table Rows
    private HBox createHistoryRow(String payoutId, String period, String orders, String volume, String fee, String net, String status) {

        Label lblPayoutId = new Label(payoutId);
        lblPayoutId.setPrefWidth(150);
        lblPayoutId.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 12.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label lblPeriod = new Label(period);
        lblPeriod.setPrefWidth(200);
        lblPeriod.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-family: System;");

        Label lblOrders = new Label(orders);
        lblOrders.setPrefWidth(150);
        lblOrders.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-family: System;");

        Label lblVolume = new Label(volume);
        lblVolume.setPrefWidth(150);
        lblVolume.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-family: System;");

        Label lblFee = new Label(fee);
        lblFee.setPrefWidth(130);
        lblFee.setStyle("-fx-text-fill: #ef4444; -fx-font-size: 12px; -fx-font-family: System;");

        Label lblNet = new Label(net);
        lblNet.setPrefWidth(150);
        lblNet.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 12.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label statusBadge = new Label(status);
        statusBadge.setStyle("-fx-background-color: #ecfdf5; -fx-text-fill: #059669; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-padding: 3px 10px; -fx-background-radius: 12px; -fx-border-color: #a7f3d0; -fx-border-radius: 12px; -fx-font-family: System;");

        HBox statusCol = new HBox(statusBadge);
        statusCol.setAlignment(Pos.CENTER_LEFT);
        statusCol.setPrefWidth(120);

        HBox row = new HBox(10, lblPayoutId, lblPeriod, lblOrders, lblVolume, lblFee, lblNet, statusCol);
        row.setAlignment(Pos.CENTER_LEFT);
        row.setStyle("-fx-padding: 12px 16px; -fx-border-color: #f1f5f9; -fx-border-width: 0 0 1px 0; -fx-background-color: #ffffff;");
        return row;
    }
}