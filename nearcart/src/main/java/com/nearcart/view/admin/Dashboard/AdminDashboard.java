package com.nearcart.view.admin.Dashboard;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class AdminDashboard {
    public ScrollPane getAdminDashboardView() {
        
        //Page Heading
        Label title = new Label("Platform Overview & Metrics");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #17152B;");

        Label subTitle = new Label("Pune Hyperlocal Marketplace Operations");
        subTitle.setStyle("-fx-font-size: 11px; -fx-text-fill: #8588A6;");

        VBox headingText = new VBox(4, title, subTitle);

        Button pendingButton = new Button("Pending Approvals (3)  →");
        pendingButton.setStyle("-fx-background-color: #7900E8; -fx-text-fill: white; -fx-font-size: 11px; -fx-font-weight: bold; -fx-background-radius: 10; -fx-padding: 10 16 10 16; -fx-cursor: hand;");

        HBox heading = new HBox(headingText, pendingButton);
        heading.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(headingText, Priority.ALWAYS);

        //PLATFORM STATUS BAR
        Label statusTitle = new Label("PLATFORM STATUS:");
        statusTitle.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #55597D;");

        Label apiStatus = new Label("● API: Healthy");
        apiStatus.setStyle("-fx-background-color: #E8FFF5; -fx-text-fill: #00A878; -fx-background-radius: 20; -fx-padding: 7 12 7 12; -fx-font-size: 10px; -fx-font-weight: bold;");

        Label paymentStatus = new Label("● Payments: Healthy");
        paymentStatus.setStyle("-fx-background-color: #E8FFF5; -fx-text-fill: #00A878; -fx-background-radius: 20; -fx-padding: 7 12 7 12; -fx-font-size: 10px; -fx-font-weight: bold;");

        Label kycStatus = new Label("● 3 KYC Pending");
        kycStatus.setStyle("-fx-background-color: #FFF8E4; -fx-text-fill: #E99A00; -fx-background-radius: 20; -fx-padding: 7 12 7 12; -fx-font-size: 10px; -fx-font-weight: bold;");

        Label disputeStatus = new Label("● 1 Dispute: Active");
        disputeStatus.setStyle("-fx-background-color: #FFF0F4; -fx-text-fill: #FF386D; -fx-background-radius: 20; -fx-padding: 7 12 7 12; -fx-font-size: 10px; -fx-font-weight: bold;");

        HBox statusBar = new HBox(12,statusTitle, apiStatus, paymentStatus, kycStatus, disputeStatus);
        statusBar.setAlignment(Pos.CENTER_LEFT);
        statusBar.setPadding(new Insets(13, 16, 13, 16));
        statusBar.setStyle("-fx-background-color: white; -fx-background-radius: 18; -fx-border-color: #E1E4F1; -fx-border-radius: 18;");

        //Dashboard Matric Card
        VBox m1Card = createMetricCard(
                "TOTAL GMV (OCT)",
                "₹148 L",
                "↑ +29.8% month over month",
                "₹",
                "#E8FFF5",
                "#00A878"
        );

        VBox m2Card = createMetricCard(
                "MONTHLY ORDERS",
                "4,250",
                "98.4% delivered successfully",
                "▣",
                "#F0EDFF",
                "#7900E8"
        );

        VBox m3Card = createMetricCard(
                "ACTIVE STORES",
                "28",
                "3 awaiting KYC approval",
                "▣",
                "#FFF0F4",
                "#FF386D"
        );

        VBox m4Card = createMetricCard(
                "ACTIVE COURIERS",
                "45",
                "Baner · Aundh · Hinjewadi",
                "♧",
                "#F5EDFF",
                "#7900E8"
        );

        HBox metricCardsRow = new HBox(14,m1Card, m2Card, m3Card, m4Card);
        metricCardsRow.setAlignment(Pos.CENTER);
        HBox.setHgrow(m1Card, Priority.ALWAYS);
        HBox.setHgrow(m2Card, Priority.ALWAYS);
        HBox.setHgrow(m3Card, Priority.ALWAYS);
        HBox.setHgrow(m4Card, Priority.ALWAYS);

        //GMV CHART
        Label gmvTitle = new Label("Gross Merchandise Volume (GMV)");
        gmvTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #17152B;");

        Label gmvBadge = new Label("↑ +29.8% MoM");
        gmvBadge.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #059669; -fx-background-color: #E8FFF5; -fx-background-radius: 15; -fx-padding: 5 9 5 9;");

        HBox gmvTitleRow = new HBox(10, gmvTitle, gmvBadge);
        gmvTitleRow.setAlignment(Pos.CENTER_LEFT);

        Label gmvSubtitle = new Label("Monthly sales vs prior month comparison");
        gmvSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8588A6;");

        VBox gmvHeader = new VBox(5, gmvTitleRow, gmvSubtitle);

        // X Axis
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel(null);
        xAxis.setCategories(
                javafx.collections.FXCollections.observableArrayList(
                        "May", "Jun", "Jul", "Aug", "Sep", "Oct"
                )
        );

        //Y Axis
        NumberAxis yAxis = new NumberAxis(0, 16, 4);
        yAxis.setLabel(null);
        yAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(yAxis) {
            @Override
            public String toString(Number value) {
                return "₹" + value.intValue() + "L";
            }
        });

        //Create Line Chart
        LineChart<String, Number> gmvChart = new LineChart<>(xAxis, yAxis);
        gmvChart.setTitle(null);
        gmvChart.setLegendVisible(false);
        gmvChart.setAnimated(false);
        gmvChart.setCreateSymbols(true);
        gmvChart.setMinHeight(280);
        gmvChart.setPrefHeight(300);
        gmvChart.setStyle("-fx-background-color: transparent;");

        //Main GMV line
        XYChart.Series<String, Number> gmvSeries = new XYChart.Series<>();
        gmvSeries.getData().add(new XYChart.Data<>("May", 4.2));
        gmvSeries.getData().add(new XYChart.Data<>("Jun", 5.8));
        gmvSeries.getData().add(new XYChart.Data<>("Jul", 7.2));
        gmvSeries.getData().add(new XYChart.Data<>("Aug", 9.0));
        gmvSeries.getData().add(new XYChart.Data<>("Sep", 11.4));
        gmvSeries.getData().add(new XYChart.Data<>("Oct", 15.0));

        // Previous month comparison line
        XYChart.Series<String, Number> previousSeries = new XYChart.Series<>();
        previousSeries.getData().add(new XYChart.Data<>("May", 3.2));
        previousSeries.getData().add(new XYChart.Data<>("Jun", 4.0));
        previousSeries.getData().add(new XYChart.Data<>("Jul", 5.5));
        previousSeries.getData().add(new XYChart.Data<>("Aug", 7.0));
        previousSeries.getData().add(new XYChart.Data<>("Sep", 9.0));
        previousSeries.getData().add(new XYChart.Data<>("Oct", 11.5));

        gmvChart.getData().addAll(gmvSeries, previousSeries);

        // Set purple colour for main line
        gmvSeries.nodeProperty().addListener((observable, oldNode, newNode) -> {
            if (newNode != null) {
                Node line = newNode.lookup(".chart-series-line");

                if (line != null) {
                    line.setStyle("-fx-stroke: #7900FF; -fx-stroke-width: 2.5px;");
                }
            }
        });

        //Set green dashed colour for comparison line
        previousSeries.nodeProperty().addListener((observable, oldNode, newNode) -> {
            if (newNode != null) {
                Node line = newNode.lookup(".chart-series-line");

                if (line != null) {
                    line.setStyle("-fx-stroke: #00BFA6; -fx-stroke-width: 1.5px; -fx-stroke-dash-array: 4 4;");
                }
            }
        });

        VBox gmvCard = new VBox(14, gmvHeader, gmvChart);
        gmvCard.setPadding(new Insets(20));
        gmvCard.setPrefWidth(740);
        gmvCard.setMinWidth(0);
        gmvCard.setStyle("-fx-background-color: white; -fx-background-radius: 18; -fx-border-color: #E1E4F1; -fx-border-radius: 18;");

        VBox.setVgrow(gmvChart, Priority.ALWAYS);

        //PENDING APPROVALS
        Label approvalTitle = new Label("Pending Approvals");
        approvalTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #17152B;");

        Label viewAll = new Label("View All  →");
        viewAll.setStyle("-fx-font-size: 10px; -fx-text-fill: #55597D;");

        HBox approvalTitleRow = new HBox(approvalTitle, viewAll);
        approvalTitleRow.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(approvalTitle, Priority.ALWAYS);

        Label approvalSubtitle = new Label("Quick approve / reject KYC requests");
        approvalSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8588A6;");

        VBox approvalHeader = new VBox(5, approvalTitleRow, approvalSubtitle);

        VBox approvalList = new VBox(10,
                createApprovalCard("Green Valley Bakery",
                        "Store KYC · Submitted 10m ago"),
                createApprovalCard("Rahul Verma",
                        "Courier DL upload · 2h ago"),
                createApprovalCard("City Stationery Hub",
                        "Store KYC · Submitted 1d ago")
        );

        VBox pendingApprovalsCard = new VBox(16,approvalHeader, approvalList);
        pendingApprovalsCard.setPadding(new Insets(20));
        pendingApprovalsCard.setPrefWidth(320);
        pendingApprovalsCard.setMinWidth(0);
        pendingApprovalsCard.setStyle("-fx-background-color: white; -fx-background-radius: 18; -fx-border-color: #E1E4F1; -fx-border-radius: 18;");

        // Chart and approvals in one row
        HBox revenueAndApprovals = new HBox(16,gmvCard, pendingApprovalsCard);
        HBox.setHgrow(gmvCard, Priority.ALWAYS);
        HBox.setHgrow(pendingApprovalsCard, Priority.ALWAYS);

        //Real Time Platform Events
        Label eventsTitle = new Label("Real-Time Platform Events");
        eventsTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #17152B;");

        Label eventsSubtitle = new Label("Live stream of merchant & customer actions");
        eventsSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8588A6;");

        VBox eventsHeader = new VBox(5, eventsTitle, eventsSubtitle);

        VBox eventList = new VBox(
                createEventRow("▣",
                        "New store \"Green Valley Bakery\" submitted approval request",
                        "10m ago", "#E8F0FF", "#7900FF"),

                createEventRow("⚖",
                        "Customer raised dispute on Order #ORD-2610-142",
                        "25m ago", "#FFF8D9", "#D99A00"),

                createEventRow("!",
                        "Velocity alert: 4 rapid orders from IP 192.168.1.4",
                        "1h ago", "#FFF0F4", "#FF386D"),

                createEventRow("↗",
                        "Courier Rahul Verma uploaded DL for KYC review",
                        "2h ago", "#E8FFF5", "#059669")
        );

        VBox eventsCard = new VBox(12, eventsHeader, eventList);
        eventsCard.setPadding(new Insets(20));
        eventsCard.setPrefWidth(620);
        eventsCard.setMinWidth(0);
        eventsCard.setStyle("-fx-background-color: white; -fx-background-radius: 18; -fx-border-color: #E1E4F1; -fx-border-radius: 18;");

        //Hyperlocal Cluster
        Label clusterTitle = new Label("Hyperlocal Cluster Status");
        clusterTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #17152B;");

        Label clusterSubtitle = new Label("Pune Zone Operations");
        clusterSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8588A6;");

        VBox clusterHeader = new VBox(5, clusterTitle, clusterSubtitle);

        VBox clusterList = new VBox(16,
                createClusterRow("Baner / Balewadi Cluster",
                        "Operational (99.2%)", "#059669", "#E8FFF5"),

                createClusterRow("Aundh / University Cluster",
                        "Operational (98.8%)", "#059669", "#E8FFF5"),

                createClusterRow("Hinjewadi IT Phase 1-3",
                        "High Courier Demand", "#D97706", "#FFF8E4"),

                createClusterRow("Kothrud Local Zone",
                        "Launching Next Week", "#64748B", "#EEF0F7")
        );

        VBox clusterCard = new VBox(18, clusterHeader, clusterList);
        clusterCard.setPadding(new Insets(20));
        clusterCard.setPrefWidth(360);
        clusterCard.setMinWidth(0);
        clusterCard.setStyle("-fx-background-color: white; -fx-background-radius: 18; -fx-border-color: #E1E4F1; -fx-border-radius: 18;");

        HBox eventsAndCluster = new HBox(16, eventsCard, clusterCard);
        HBox.setHgrow(eventsCard, Priority.ALWAYS);
        HBox.setHgrow(clusterCard, Priority.ALWAYS);

        //Top Performing Stores
        Label storeTitle = new Label("Top Performing Stores");
        storeTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #17152B;");

        Label storeSubtitle = new Label("GMV ranking this month");
        storeSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8588A6;");

        VBox storeHeader = new VBox(5, storeTitle, storeSubtitle);

        VBox storeList = new VBox(16,
                createStoreRow("🥇", "Pune Daily Mart", "₹4.2L", 1.0),
                createStoreRow("🥈", "Fresh Organic Hub", "₹3.8L", 0.90),
                createStoreRow("🥉", "Green Valley Bakery", "₹2.1L", 0.65)
        );

        VBox topStoresCard = new VBox(18, storeHeader, storeList);
        topStoresCard.setPadding(new Insets(20));
        topStoresCard.setStyle("-fx-background-color: white; -fx-background-radius: 18; -fx-border-color: #E1E4F1; -fx-border-radius: 18;");

        //Main Dashboard Layout
        VBox dashboard = new VBox(16, heading,statusBar,metricCardsRow,revenueAndApprovals,eventsAndCluster,topStoresCard);

        dashboard.setPadding(new Insets(18));
        dashboard.setStyle("-fx-background-color: #F7F8FC;");

        //Scroll Pane
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(dashboard);
        scrollPane.setFitToWidth(true);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setStyle("-fx-background: #F7F8FC; -fx-background-color: #F7F8FC; -fx-border-color: transparent;");

        return scrollPane;
    }


    //Metric Card
    private VBox createMetricCard(String titleText, String valueText,String subText, String iconText,String iconBackground, String subColor) {
        Label title = new Label(titleText);
        title.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #64748B;");

        Label icon = new Label(iconText);
        icon.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: " + subColor + ";");

        StackPane iconBox = new StackPane(icon);
        iconBox.setPrefSize(32, 32);
        iconBox.setMinSize(32, 32);
        iconBox.setStyle("-fx-background-color: " + iconBackground + "; -fx-background-radius: 16;");

        BorderPane top = new BorderPane();
        top.setLeft(title);
        top.setRight(iconBox);

        Label value = new Label(valueText);
        value.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label subtitle = new Label(subText);
        subtitle.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: " + subColor + ";");

        VBox card = new VBox(8, top, value, subtitle);
        card.setPadding(new Insets(16));
        card.setMinWidth(0);
        card.setStyle("-fx-background-color: white; -fx-background-radius: 16; -fx-border-color: #E1E4F1; -fx-border-radius: 16;");

        return card;
    }

    //pendingApprovalsCard
    private HBox createApprovalCard(String nameText, String detailsText) {
        Label icon = new Label("▣");
        icon.setStyle("-fx-font-size: 17px; -fx-text-fill: #7900FF; -fx-background-color: #EEF0FF; -fx-background-radius: 10; -fx-padding: 10;");

        Label name = new Label(nameText);
        name.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #1E293B;");

        Label details = new Label(detailsText);
        details.setStyle("-fx-font-size: 9px; -fx-text-fill: #8588A6;");

        VBox applicantInfo = new VBox(4, name, details);

        Button approve = new Button("✓");
        approve.setStyle("-fx-background-color: #E8FFF5; -fx-text-fill: #059669; -fx-border-color: #A7F3D0; -fx-border-radius: 8; -fx-background-radius: 8; -fx-font-weight: bold;");

        Button reject = new Button("×");
        reject.setStyle("-fx-background-color: #FFF0F4; -fx-text-fill: #FF386D; -fx-border-color: #FECDD3; -fx-border-radius: 8; -fx-background-radius: 8; -fx-font-weight: bold;");

        HBox actions = new HBox(5, approve, reject);
        actions.setAlignment(Pos.CENTER_RIGHT);

        HBox card = new HBox(10, icon, applicantInfo, actions);
        card.setAlignment(Pos.CENTER_LEFT);
        card.setPadding(new Insets(12));
        card.setStyle("-fx-background-color: #F8F9FD; -fx-background-radius: 14; -fx-border-color: #E1E4F1; -fx-border-radius: 14;");
        HBox.setHgrow(applicantInfo, Priority.ALWAYS);

        return card;
    }

    //Platform Event Row
    private HBox createEventRow(String iconText, String eventText,String eventTime, String iconBackground, String iconColor) {
        Label icon = new Label(iconText);
        icon.setStyle("-fx-font-size: 14px; -fx-text-fill: " + iconColor + "; -fx-background-color: " + iconBackground + "; -fx-background-radius: 50; -fx-padding: 9;");

        Label description = new Label(eventText);
        description.setWrapText(true);
        description.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");

        Label time = new Label(eventTime);
        time.setStyle("-fx-font-size: 9px; -fx-text-fill: #8588A6;");

        HBox row = new HBox(12, icon, description, time);
        row.setAlignment(Pos.CENTER_LEFT);
        row.setPadding(new Insets(8, 0, 8, 0));
        HBox.setHgrow(description, Priority.ALWAYS);

        return row;
    }

    //Cluster Status Row
    private HBox createClusterRow(String clusterName,String statusText, String statusColor, String statusBackground) {
        Label name = new Label(clusterName);
        name.setStyle("-fx-font-size: 10px; -fx-text-fill: #1E293B;");

        Label status = new Label(statusText);
        status.setStyle("-fx-font-size: 9px; -fx-font-weight: bold; -fx-text-fill: " + statusColor + "; -fx-background-color: " + statusBackground + "; -fx-background-radius: 14; -fx-padding: 6 9 6 9;");

        HBox row = new HBox(8, name, status);
        row.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(name, Priority.ALWAYS);

        return row;
    }

    //Top Performing Store Row
    private HBox createStoreRow(String medal, String storeName, String amount, double progressValue) {

        Label rank = new Label(medal);
        rank.setStyle("-fx-font-size: 14px;");

        Label name = new Label(storeName);
        name.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #1E293B;");

        ProgressBar progress = new ProgressBar(progressValue);
        progress.setMaxWidth(Double.MAX_VALUE);
        progress.setPrefHeight(7);
        progress.setStyle("-fx-accent: #7900FF;");

        VBox storeInfo = new VBox(7, name, progress);

        Label revenue = new Label(amount);
        revenue.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #17152B;");

        HBox row = new HBox(12, rank, storeInfo, revenue);
        row.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(storeInfo, Priority.ALWAYS);

        return row;
    }

}
