package com.nearcart.view.shopOwner.Dashboard;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ShopProducts {

    public ScrollPane getShopProductsView() {

        // 1. HEADER SECTION
        Label pageHeading = new Label("Product Catalog & Inventory");
        pageHeading.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 24px; -fx-font-weight: bold; -fx-font-family: System;");

        Label pageSubHeading = new Label("Manage stock, listings, pricing, and exact size variants for your store");
        pageSubHeading.setStyle("-fx-text-fill: #64748b; -fx-font-size: 12px; -fx-font-family: System;");

        VBox titleBox = new VBox(2, pageHeading, pageSubHeading);

        Button addProductBtn = new Button("+ Add New Product");
        addProductBtn.setStyle("-fx-background-color: #4f46e5; -fx-text-fill: #ffffff; -fx-font-size: 12px; -fx-font-weight: bold; -fx-padding: 8px 16px; -fx-background-radius: 8px; -fx-cursor: hand; -fx-font-family: System;");
       

        BorderPane headerRow = new BorderPane();
        headerRow.setLeft(titleBox);
        headerRow.setRight(addProductBtn);

        // 2. SEARCH & FILTER ROW
        Label searchIcon = new Label("🔍");
        searchIcon.setStyle("-fx-text-fill: #94a3b8;");

        TextField searchField = new TextField();
        searchField.setPromptText("Search by product name, brand, or size...");
        searchField.setStyle("-fx-background-color: transparent; -fx-text-fill: #1e293b; -fx-font-size: 12.5px; -fx-font-family: System;");
        HBox.setHgrow(searchField, Priority.ALWAYS);

        HBox searchBar = new HBox(8, searchIcon, searchField);
        searchBar.setAlignment(Pos.CENTER_LEFT);
        searchBar.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-padding: 6px 14px;");
        HBox.setHgrow(searchBar, Priority.ALWAYS);

        Button categoryFilter = new Button("All Categories  ▾");
        categoryFilter.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #1e293b; -fx-font-size: 12.5px; -fx-padding: 7px 14px; -fx-background-radius: 8px; -fx-border-color: #e2e8f0; -fx-border-radius: 8px; -fx-cursor: hand; -fx-font-family: System;");

        HBox filterRow = new HBox(14, searchBar, categoryFilter);
        filterRow.setAlignment(Pos.CENTER_LEFT);

        // 3. TABLE HEADER ROW
        Label thProduct = new Label("Product");
        thProduct.setPrefWidth(240);
        thProduct.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        Label thCategory = new Label("Category");
        thCategory.setPrefWidth(140);
        thCategory.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        Label thVariant = new Label("Size / Variant");
        thVariant.setPrefWidth(180);
        thVariant.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        Label thPrice = new Label("Price / MRP");
        thPrice.setPrefWidth(130);
        thPrice.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        Label thStock = new Label("Stock Quantity");
        thStock.setPrefWidth(140);
        thStock.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        Label thStatus = new Label("Listing Status");
        thStatus.setPrefWidth(130);
        thStatus.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        Label thActions = new Label("Actions");
        thActions.setPrefWidth(100);
        thActions.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11px; -fx-font-weight: bold; -fx-font-family: System;");

        HBox tableHeader = new HBox(10, thProduct, thCategory, thVariant, thPrice, thStock, thStatus, thActions);
        tableHeader.setAlignment(Pos.CENTER_LEFT);
        tableHeader.setStyle("-fx-padding: 10px 16px; -fx-border-color: #f1f5f9; -fx-border-width: 0 0 1px 0;");

        // 4. TABLE ROWS
        VBox tableRows = new VBox(
                createProductRow("Tata Salt", "TATA", "grocery", "1kg", "(Iodised)", "₹24", "₹26", "50", false, "Active"),
                createProductRow("Tata Salt", "TATA", "grocery", "1kg", "(Rock Salt)", "₹35", "₹38", "30", false, "Active"),
                createProductRow("Aashirvaad Atta", "AASHIRVAAD", "grocery", "5 kg", "(Whole Wheat)", "₹245", "₹265", "25", false, "Active"),
                createProductRow("Fortune Sunflower Oil", "FORTUNE", "grocery", "1L", "(Sunflower)", "₹142", "₹155", "0", true, "Active"),
                createProductRow("Maggi Noodles", "MAGGI", "grocery", "70 g (Pack of 4)", "(Masala)", "₹58", "₹60", "100", false, "Active"),
                createProductRow("Amul Paneer", "AMUL", "dairy", "200 g", "(Fresh)", "₹78", "₹80", "20", false, "Active"),
                createProductRow("Tata Tea Gold", "TATA TEA", "grocery", "250 g", "(Gold)", "₹105", "₹115", "40", false, "Active"),
                createProductRow("Surf Excel Easy Wash", "SURF EXCEL", "grocery", "1 kg", "(Easy Wash)", "₹115", "₹130", "30", false, "Active"),
                createProductRow("Dove Beauty Bar", "DOVE", "grocery", "100 g (Pack of 3)", "(Original)", "₹159", "₹175", "25", false, "Active"),
                createProductRow("Haldirams Bhujia", "HALDIRAMS", "grocery", "400 g", "(Aloo Bhujia)", "₹99", "₹110", "35", false, "Active")
        );

        VBox tableCard = new VBox(tableHeader, tableRows);
        tableCard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 12px; -fx-border-color: #f1f5f9; -fx-border-radius: 12px;");

        // Assemble Page
        VBox mainContent = new VBox(18, headerRow, filterRow, tableCard);
        mainContent.setStyle("-fx-background-color: #f8fafc; -fx-padding: 24px;");

        ScrollPane scroll = new ScrollPane(mainContent);
        scroll.setFitToWidth(true);
        scroll.setStyle("-fx-background-color: transparent; -fx-background: #f8fafc; -fx-border-color: transparent;");

        return scroll;
    }

    // Helper for table row
    private HBox createProductRow(String name, String brand, String category, String badge, String variant, String price, String mrp, String stock, boolean isWarning, String status) {

        // Product Name & Brand
        Label iconPlaceholder = new Label("📦");
        StackPane iconBox = new StackPane(iconPlaceholder);
        iconBox.setPrefSize(32, 32);
        iconBox.setStyle("-fx-background-color: #f8fafc; -fx-background-radius: 6px; -fx-border-color: #e2e8f0; -fx-border-radius: 6px;");

        Label lblName = new Label(name);
        lblName.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 12.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label lblBrand = new Label(brand);
        lblBrand.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 10px; -fx-font-weight: bold; -fx-font-family: System;");
        VBox metaBox = new VBox(1, lblName, lblBrand);

        HBox productCol = new HBox(10, iconBox, metaBox);
        productCol.setAlignment(Pos.CENTER_LEFT);
        productCol.setPrefWidth(240);

        // Category
        Label lblCategory = new Label(category);
        lblCategory.setPrefWidth(140);
        lblCategory.setStyle("-fx-text-fill: #475569; -fx-font-size: 12px; -fx-font-family: System;");

        // Variant
        Label badgeLabel = new Label(badge);
        badgeLabel.setStyle("-fx-background-color: #f1f5f9; -fx-text-fill: #475569; -fx-font-size: 10.5px; -fx-font-weight: bold; -fx-padding: 2px 6px; -fx-background-radius: 4px; -fx-font-family: System;");
        Label variantLabel = new Label(variant);
        variantLabel.setStyle("-fx-text-fill: #64748b; -fx-font-size: 11.5px; -fx-font-family: System;");
        HBox variantCol = new HBox(6, badgeLabel, variantLabel);
        variantCol.setAlignment(Pos.CENTER_LEFT);
        variantCol.setPrefWidth(180);

        // Price
        Label lblPrice = new Label(price);
        lblPrice.setStyle("-fx-text-fill: #0f172a; -fx-font-size: 12.5px; -fx-font-weight: bold; -fx-font-family: System;");
        Label lblMrp = new Label(mrp);
        lblMrp.setStyle("-fx-text-fill: #94a3b8; -fx-font-size: 10.5px; -fx-strikethrough: true; -fx-font-family: System;");
        VBox priceCol = new VBox(1, lblPrice, lblMrp);
        priceCol.setPrefWidth(130);

        // Stock
        TextField stockField = new TextField(stock);
        stockField.setPrefWidth(55);
        stockField.setStyle("-fx-background-color: #ffffff; -fx-border-color: #e2e8f0; -fx-border-radius: 6px; -fx-padding: 3px 6px; -fx-font-size: 12px; -fx-text-fill: #1e293b;");

        HBox stockCol = new HBox(6, stockField);
        stockCol.setAlignment(Pos.CENTER_LEFT);
        stockCol.setPrefWidth(140);
        if (isWarning) {
            Label warnIcon = new Label("⚠");
            warnIcon.setStyle("-fx-text-fill: #f59e0b; -fx-font-size: 13px;");
            stockCol.getChildren().add(warnIcon);
        }

        // Status
        Label statusBadge = new Label(status);
        statusBadge.setStyle("-fx-background-color: #ecfdf5; -fx-text-fill: #059669; -fx-font-size: 11px; -fx-font-weight: bold; -fx-padding: 2px 10px; -fx-background-radius: 12px; -fx-border-color: #a7f3d0; -fx-border-radius: 12px; -fx-font-family: System;");
        HBox statusCol = new HBox(statusBadge);
        statusCol.setAlignment(Pos.CENTER_LEFT);
        statusCol.setPrefWidth(130);

        // Actions
        Button editBtn = new Button("✎");
        editBtn.setStyle("-fx-background-color: transparent; -fx-text-fill: #64748b; -fx-font-size: 13px; -fx-cursor: hand;");
        Button deleteBtn = new Button("✕");
        deleteBtn.setStyle("-fx-background-color: transparent; -fx-text-fill: #ef4444; -fx-font-size: 12px; -fx-cursor: hand;");
        HBox actionsCol = new HBox(4, editBtn, deleteBtn);
        actionsCol.setAlignment(Pos.CENTER_LEFT);
        actionsCol.setPrefWidth(100);

        HBox row = new HBox(10, productCol, lblCategory, variantCol, priceCol, stockCol, statusCol, actionsCol);
        row.setAlignment(Pos.CENTER_LEFT);
        row.setStyle("-fx-padding: 10px 16px; -fx-border-color: #f1f5f9; -fx-border-width: 0 0 1px 0; -fx-background-color: #ffffff;");
        return row;
    }
}