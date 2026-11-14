
package com.nearcart.view.admin.Dashboard;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AdminDispute {

    public ScrollPane getDisputeView() {

        //Heading
        Label disputeHeading = new Label("Customer Dispute Escalation Center");
        disputeHeading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label disputeSubHeading = new Label("Arbitrate and resolve order issues between customers, merchants, and courier partners");
        disputeSubHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #64748B;");

        VBox pageHeader = new VBox(2, disputeHeading, disputeSubHeading);

        //dispute card Heading
        Label disputeTitle = new Label("All Reported Customer Disputes");
        disputeTitle.setStyle("-fx-font-size: 13px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label disputeSubtitle = new Label("Orders with issues reported");
        disputeSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8B91B5;");

        VBox disputeHeader = new VBox(4, disputeTitle, disputeSubtitle);
        disputeHeader.setPadding(new Insets(16, 18, 12, 18));

        //Table Header
        Label ticketHeading = new Label("Ticket ID");
        ticketHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        ticketHeading.setPrefWidth(90);

        Label orderHeading = new Label("Order ID");
        orderHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        orderHeading.setPrefWidth(125);

        Label customerHeading = new Label("Customer");
        customerHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        customerHeading.setPrefWidth(125);

        Label reasonHeading = new Label("Reported Reason");
        reasonHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        reasonHeading.setPrefWidth(390);

        Label dateHeading = new Label("Date Filed");
        dateHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        dateHeading.setPrefWidth(110);

        Label statusHeading = new Label("Status");
        statusHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        statusHeading.setPrefWidth(110);

        Label resolutionHeading = new Label("Resolution");
        resolutionHeading.setStyle("-fx-font-size: 10px; -fx-text-fill: #334155;");
        resolutionHeading.setPrefWidth(150);

        //HBox for all column headings
        HBox tableHeading = new HBox(ticketHeading, orderHeading, customerHeading, reasonHeading, dateHeading, statusHeading, resolutionHeading);

        tableHeading.setPadding(new Insets(12, 14, 12, 14));
        tableHeading.setStyle("-fx-background-color: #F0F1F8;");

        // Sample Dispute Records
        List<Dispute> disputeList = new ArrayList<>();
        disputeList.add(new Dispute(
            "#dis-001",
            "ORD-2406-004",
            "Rahul Sharma",
            "My order was rejected but the money was not refunded to my account.",
            "08 Jun 2024",
            "OPEN"
        ));

        disputeList.add(new Dispute(
            "#dis-002",
            "ORD-2406-007",
            "Priya Patel",
            "I cancelled my order but the refund is not showing.",
            "07 Jun 2024",
            "RESOLVED"
        ));
        
        //Table Body
        VBox tableBody = new VBox();

        for (Dispute dispute : disputeList) {
            HBox disputeRow = createDisputeRow(dispute);
            tableBody.getChildren().add(disputeRow);
        }

        //Main Dispute Card
        VBox disputeCard = new VBox(0, disputeHeader, tableHeading, tableBody);
        disputeCard.setStyle("-fx-background-color: white; -fx-background-radius: 16; -fx-border-color: #E1E5F0; -fx-border-radius: 16;");

        //Main Page Container
        VBox disputePage = new VBox(18, pageHeader, disputeCard);
        disputePage.setPadding(new Insets(10, 0, 10, 0));
        disputePage.setStyle("-fx-background-color: #F7F8FC;");
       
        //Scroll Support
        ScrollPane scrollPane = new ScrollPane(disputePage);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: transparent; -fx-background: #F7F8FC;");
        return scrollPane;
    }


   
    //Method to create dispute Row

    public HBox createDisputeRow(Dispute dispute) {
        // Ticket ID
        Label ticketId = new Label(dispute.getTicketId());
        ticketId.setStyle("-fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #111827;");
        ticketId.setPrefWidth(90);

        // Order ID
        Label orderId = new Label(dispute.getOrderId());
        orderId.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        orderId.setPrefWidth(125);

        // Customer
        Label customer = new Label(dispute.getCustomer());
        customer.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        customer.setPrefWidth(125);

        // Reported Reason
        Label reason = new Label(dispute.getReportedReason());
        reason.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        reason.setPrefWidth(390);
        reason.setMaxWidth(390);
        reason.setWrapText(false);
        reason.setEllipsisString("...");

        // Date
        Label date = new Label(dispute.getDate());
        date.setStyle("-fx-font-size: 10px; -fx-text-fill: #111827;");
        date.setPrefWidth(110);

        // Status
        Label status = new Label(dispute.getStatus());

        if (dispute.getStatus().equalsIgnoreCase("OPEN")) {
            status.setStyle("-fx-background-color: #FFF9E6; -fx-text-fill: #D69E00; -fx-border-color: #FFE7A3; -fx-border-radius: 12; -fx-background-radius: 12; -fx-padding: 4 9 4 9; -fx-font-size: 9px;");
        } else {
            status.setStyle("-fx-background-color: #E6FFF5; -fx-text-fill: #008F68; -fx-border-color: #8EF0CC; -fx-border-radius: 12; -fx-background-radius: 12; -fx-padding: 4 9 4 9; -fx-font-size: 9px;");
        }

        HBox statusBox = new HBox(status);
        statusBox.setPrefWidth(110);
        statusBox.setAlignment(Pos.CENTER_LEFT);

        // Resolution button
        Button arbitrateButton = new Button("🗨️  Arbitrate Ticket");

        arbitrateButton.setStyle("-fx-background-color: white; -fx-border-color: #CBD5E1; -fx-border-radius: 7; -fx-background-radius: 7; -fx-padding: 5 9 5 9; -fx-font-size: 10px; -fx-font-weight: bold; -fx-text-fill: #111827; -fx-cursor: hand;");

        HBox resolutionBox = new HBox(arbitrateButton);
        resolutionBox.setPrefWidth(150);
        resolutionBox.setAlignment(Pos.CENTER_LEFT);

        // Adding all labels and button inside one HBox
        HBox disputeRow = new HBox(ticketId, orderId, customer, reason, date, statusBox, resolutionBox);
        disputeRow.setPadding(new Insets(12, 14, 12, 14));
        disputeRow.setAlignment(Pos.CENTER_LEFT);
        disputeRow.setStyle("-fx-background-color: white; -fx-border-color: transparent transparent #E1E5F0 transparent;-fx-border-width: 0 0 1 0;");
        
        return disputeRow;
    }

    //Dispute Model Class
    public static class Dispute {

        private String ticketId;
        private String orderId;
        private String customer;
        private String reportedReason;
        private String date;
        private String status;

        public Dispute(String ticketId, String orderId, String customer, String reportedReason, String date, String status) {
            this.ticketId = ticketId;
            this.orderId = orderId;
            this.customer = customer;
            this.reportedReason = reportedReason;
            this.date = date;
            this.status = status;
        }

        public String getTicketId() {
            return ticketId;
        }

        public String getOrderId() {
            return orderId;
        }

        public String getCustomer() {
            return customer;
        }

        public String getReportedReason() {
            return reportedReason;
        }

        public String getDate() {
            return date;
        }

        public String getStatus() {
            return status;
        }
    }
}
