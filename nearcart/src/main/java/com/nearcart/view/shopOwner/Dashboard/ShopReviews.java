package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ShopReviews {

    public ScrollPane getShopReviewsView() {

        
        // 1. PAGE HEADER
        
        Label pageHeading = new Label("Customer Reviews & Ratings");
        pageHeading.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");

        Label pageSubHeading = new Label("Track customer satisfaction, feedback ratings, and verified buyer delivery comments");
        pageSubHeading.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");

        VBox headerBox = new VBox(3, pageHeading, pageSubHeading);

        
        // 2. RATING SUMMARY CARDS (3 Cards)
        
        // Card 1: Overall Average
        Label c1Title = new Label("AVERAGE RATING");
        c1Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c1Val = new Label("4.8 ★");
        c1Val.setStyle("-fx-text-fill: #d97706; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c1Sub = new Label("Based on 320+ customer ratings");
        c1Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");

        VBox card1 = new VBox(6, c1Title, c1Val, c1Sub);
        card1.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 18px;");
        HBox.setHgrow(card1, Priority.ALWAYS);

        // Card 2: 5-Star Ratio
        Label c2Title = new Label("5-STAR SATISFACTION");
        c2Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c2Val = new Label("92%");
        c2Val.setStyle("-fx-text-fill: #059669; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c2Sub = new Label("Delivered fresh with zero returns");
        c2Sub.setStyle("-fx-text-fill: #059669; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        VBox card2 = new VBox(6, c2Title, c2Val, c2Sub);
        card2.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 18px;");
        HBox.setHgrow(card2, Priority.ALWAYS);

        // Card 3: Quality Compliance
        Label c3Title = new Label("STORE REPUTATION");
        c3Title.setStyle("-fx-text-fill: #64748b; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c3Val = new Label("Top Rated");
        c3Val.setStyle("-fx-text-fill: #4f46e5; -fx-font-size: 26px; -fx-font-weight: bold; -fx-font-family: System;");

        Label c3Sub = new Label("Baner Road cluster benchmark");
        c3Sub.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-family: System;");

        VBox card3 = new VBox(6, c3Title, c3Val, c3Sub);
        card3.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 18px;");
        HBox.setHgrow(card3, Priority.ALWAYS);

        HBox statsRow = new HBox(16, card1, card2, card3);

        
        // 3. REVIEWS LIST CARD
        
        Label reviewsTitle = new Label("Latest Customer Feedback");
        reviewsTitle.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 15px; -fx-font-weight: bold; -fx-font-family: System;");

        Label reviewsSub = new Label("Verified reviews linked to recent deliveries");
        reviewsSub.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");

        VBox reviewsHeaderBox = new VBox(2, reviewsTitle, reviewsSub);

        // Demo Review 1
        VBox r1 = createReviewCard(
                "Priya K.",
                "P",
                "#ec4899",
                "5 ★★★★★",
                "12 Oct 2026",
                "\"Fast delivery, fresh items! Everything was well-packed and reached within 15 minutes of dispatch. Really satisfied with the quality of dairy and bread.\"",
                "Order #ORD-2406-005 • Baner Road"
        );

        // Demo Review 2
        VBox r2 = createReviewCard(
                "Rahul Sharma",
                "R",
                "#3b82f6",
                "5 ★★★★★",
                "10 Oct 2026",
                "\"Original retail prices and genuine groceries. No marked-up rates unlike other apps. The rider brought items properly packed in sealed brown bags.\"",
                "Order #ORD-2406-001 • Aundh Cluster"
        );

        // Demo Review 3
        VBox r3 = createReviewCard(
                "Aniket Deshmukh",
                "A",
                "#10b981",
                "4 ★★★★☆",
                "08 Oct 2026",
                "\"Good experience overall. Sunflower oil and aata packets were in perfect seal condition. Only minor issue was courier took 5 mins extra during peak rain hours.\"",
                "Order #ORD-2405-982 • Balewadi High Street"
        );

        VBox reviewsListBox = new VBox(14, reviewsHeaderBox, r1, r2, r3);
        reviewsListBox.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px; -fx-padding: 20px;");

        // Assemble Entire Page
        VBox mainContent = new VBox(18, headerBox, statsRow, reviewsListBox);
        mainContent.setStyle("-fx-background-color: #f8fafc; -fx-padding: 24px;");

        ScrollPane scroll = new ScrollPane(mainContent);
        scroll.setFitToWidth(true);
        scroll.setStyle("-fx-background-color: transparent; -fx-background: #f8fafc; -fx-border-color: transparent;");

        return scroll;
    }

    // Helper to generate each review block
    private VBox createReviewCard(String customerName, String avatarLetter, String avatarBg, String stars, String date, String comment, String orderTag) {

        // User Avatar
        Label avatar = new Label(avatarLetter);
        avatar.setStyle("-fx-text-fill: #ffffff; -fx-font-size: 12px; -fx-font-weight: bold;");
        StackPane avatarBox = new StackPane(avatar);
        avatarBox.setPrefSize(32, 32);
        avatarBox.setStyle("-fx-background-color: " + avatarBg + "; -fx-background-radius: 16px;");

        // Name & Star Rating
        Label nameLbl = new Label(customerName);
        nameLbl.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 13px; -fx-font-weight: bold; -fx-font-family: System;");

        Label starBadge = new Label(stars);
        starBadge.setStyle("-fx-background-color: #fef3c7; -fx-text-fill: #d97706; -fx-font-size: 10px; -fx-font-weight: bold; -fx-padding: 2px 6px; -fx-background-radius: 4px; -fx-font-family: System;");

        HBox userMeta = new HBox(8, nameLbl, starBadge);
        userMeta.setAlignment(Pos.CENTER_LEFT);

        Label orderDetails = new Label(orderTag);
        orderDetails.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 10.5px; -fx-font-family: System;");

        VBox userBox = new VBox(2, userMeta, orderDetails);

        HBox leftHeader = new HBox(10, avatarBox, userBox);
        leftHeader.setAlignment(Pos.CENTER_LEFT);

        Label dateLbl = new Label(date);
        dateLbl.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 11px; -fx-font-family: System;");

        BorderPane cardHeader = new BorderPane();
        cardHeader.setLeft(leftHeader);
        cardHeader.setRight(dateLbl);

        // Feedback Text
        Label commentLbl = new Label(comment);
        commentLbl.setWrapText(true);
        commentLbl.setStyle("-fx-text-fill: #334155; -fx-font-size: 12px; -fx-font-family: System;");

        VBox reviewCard = new VBox(8, cardHeader, commentLbl);
        reviewCard.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 8px; -fx-border-color: #f1f5f9; -fx-border-radius: 8px; -fx-padding: 14px;");

        return reviewCard;
    }
}