package com.nearcart.view.admin.Dashboard;

import java.util.ArrayList;
import java.util.List;

import com.nearcart.view.admin.Dashboard.UsersPage.User;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AdminApproval {
    public ScrollPane getApprovalView() {

        //Page heading
        Label pageHeading = new Label("Merchant & Partner Approvals Queue");
        pageHeading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label pageSubHeading = new Label("Review business credentials, FSSAI certificates, and driver licenses before activating onto the platform");
        pageSubHeading.setStyle("-fx-font-size: 11px; -fx-text-fill: #64748B;");

        VBox pageHeader = new VBox(4, pageHeading, pageSubHeading);

        //Approval tabs
        Button storeTab = new Button("Store Registrations");
        storeTab.setStyle("-fx-background-color: #F0EAFE; -fx-text-fill: #7000F5; -fx-font-weight: bold; -fx-background-radius: 8; -fx-padding: 10 14; -fx-cursor: hand;");

        Button courierTab = new Button("Delivery Courier KYC");
        courierTab.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-background-radius: 8; -fx-padding: 10 14; -fx-cursor: hand;");

        HBox tabSection = new HBox(12, storeTab, courierTab);
        tabSection.setPadding(new Insets(8, 0, 8, 0));

        //Pending Store Applications card
        Label storeTitle = new Label("Pending Store Applications");
        storeTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label storeSubtitle = new Label("Awaiting administrative review");
        storeSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8B91B5;");

        VBox storeCard = new VBox(4, storeTitle, storeSubtitle);
        storeCard.setStyle("-fx-background-color: white; -fx-border-radius: 16; -fx-background-radius: 16;");
        storeCard.setPadding(new Insets(16));


        //Store Table Header
        Label storeNameHeading = new Label("Store Name");
        storeNameHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        storeNameHeading.setPrefWidth(190);

        Label categoryHeading = new Label("Category");
        categoryHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        categoryHeading.setPrefWidth(130);

        Label addressHeading = new Label("Address / Area");
        addressHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        addressHeading.setPrefWidth(230);

        Label documentsHeading = new Label("Submitted Documents");
        documentsHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        documentsHeading.setPrefWidth(235);

        Label storeActionHeading = new Label("Actions");
        storeActionHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        storeActionHeading.setPrefWidth(240);


        //Combine Store Table Headings
        HBox storeTableHeading = new HBox(storeNameHeading,categoryHeading,addressHeading,documentsHeading,storeActionHeading);
        storeTableHeading.setPadding(new Insets(12, 14, 12, 14));
        storeTableHeading.setStyle("-fx-background-color: #F0F1F8;");

        //Sample Store Data
        List<Store> storeList = new ArrayList<>();
        storeList.add(new Store(
                "Gourmet Kitchen",
                "#s14",
                "grocery",
                "Kothrud, Pune 411038"
        ));


        //Store Table Body
        VBox storeTableBody = new VBox();
        for (Store store : storeList) {
            HBox storeRow = createStoreRow(store);
            storeTableBody.getChildren().add(storeRow);
        }

        //Store Table
        VBox storeTableCard = new VBox(0, storeTableHeading, storeTableBody);
        storeTableCard.setStyle("-fx-background-color: white; -fx-background-radius: 16; -fx-border-color: #E1E5F0; -fx-border-radius: 16;");

        //Complete Store Section
        VBox storeSection = new VBox(0, storeCard, storeTableCard);

        //Pending Delivery Applications card
        Label courierTitle = new Label("Pending Delivery Courier Approvals");
        courierTitle.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label courierSubtitle = new Label("Driver license and vehicle documentation");
        courierSubtitle.setStyle("-fx-font-size: 10px; -fx-text-fill: #8B91B5;");

        VBox courierCard = new VBox(4, courierTitle, courierSubtitle);
        courierCard.setStyle("-fx-background-color: white; -fx-border-radius:16; -fx-background-radius:16");
        courierCard.setPadding(new Insets(16));

        //Courier Table
        Label nameHeading = new Label("Partner Name");
        nameHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155");
        nameHeading.setPrefWidth(190);

        Label contactHeading = new Label("Contact");
        contactHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        contactHeading.setPrefWidth(130);

        Label vehicleHeading=new Label("Vehicle Details");
        vehicleHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        vehicleHeading.setPrefWidth(230);

        Label licenseNoHeading=new Label("License No.");
        licenseNoHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        licenseNoHeading.setPrefWidth(235);

        Label actionHeading=new Label("Actions");
        actionHeading.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #334155;");
        actionHeading.setPrefWidth(240);

        HBox deliveryTableHeading = new HBox(nameHeading,contactHeading,vehicleHeading,licenseNoHeading,actionHeading);
        deliveryTableHeading.setPadding(new Insets(12,14, 12, 14));
        deliveryTableHeading.setStyle("-fx-background-color: #F0F1F8");

        //Sample Data
         List<Courier> courierList = new ArrayList<>();
        courierList.add(new Courier(
            "Priya Sharma", 
            "9873428728",
            "Honda Shine (MH 12 CD 4921)", 
            "DL-MH12-20210084"
        ));

        //tableBody
        VBox courierTableBody = new VBox();
        for(Courier courier:courierList){
            HBox courierRow= createCourierRow(courier);
            courierTableBody.getChildren().add(courierRow);
        }

        //Main User Card
        VBox courierTable = new VBox(0, deliveryTableHeading, courierTableBody);
        courierTable.setStyle("-fx-background-color: white; -fx-background-radius: 16; -fx-border-color: #E1E5F0; -fx-border-radius: 16;");

        VBox courierSection = new VBox(0, courierCard, courierTable);

        //hiding sections
        storeSection.setVisible(true);
        storeSection.setManaged(true);
        //Initially hide Courier section
        courierSection.setVisible(false);
        courierSection.setManaged(false);

        //Store Tab Action
        storeTab.setOnAction(e -> {
            storeSection.setVisible(true);
            storeSection.setManaged(true);


            courierSection.setVisible(false);
            courierSection.setManaged(false);

            storeTab.setStyle("-fx-background-color: #F0EAFE; -fx-text-fill: #7000F5; -fx-font-weight: bold; -fx-background-radius: 8; -fx-padding: 10 14;");
            courierTab.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-background-radius: 8; -fx-padding: 10 14;");
        });


        //Courier Tab Action
        courierTab.setOnAction(e -> {
            storeSection.setVisible(false);
            storeSection.setManaged(false);

            courierSection.setVisible(true);
            courierSection.setManaged(true);

            courierTab.setStyle("-fx-background-color: #F0EAFE; -fx-text-fill: #7000F5; -fx-font-weight: bold; -fx-background-radius: 8; -fx-padding: 10 14;");
            storeTab.setStyle("-fx-background-color: transparent; -fx-text-fill: #475569; -fx-background-radius: 8; -fx-padding: 10 14;");
        });

        //Main page container
        VBox approvalPage = new VBox(15,pageHeader,tabSection,storeSection,courierSection);
        approvalPage.setPadding(new Insets(20));
        approvalPage.setStyle("-fx-background-color: #F7F8FC;");


        //Scroll support
        ScrollPane scrollPane = new ScrollPane(approvalPage);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background-color: transparent; -fx-background: #F7F8FC;");

        return scrollPane;


       
    }

    //Courier Row
    private HBox createCourierRow(Courier courier) {
        
        //name
        Label name=new Label(courier.getName());
        name.setStyle("-fx-font-size:11px; -fx-font-weight: bold; -fx-text-fill: #111827; ");
        name.setPrefWidth(190);

        //Contact
        Label contact = new Label(courier.getContact());
        contact.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        contact.setPrefWidth(130);

        //Vehicle Details
        Label vehicleDetails = new Label(courier.getVehicleDetails());
        vehicleDetails.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        vehicleDetails.setPrefWidth(230);

        //licenseDetails
        Label licenseDetails = new Label(courier.getLicenseDetails());
        licenseDetails.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        licenseDetails.setPrefWidth(235);


        //Approve Button
        Button approveButton = new Button("✓ Approve");
        approveButton.setStyle("-fx-background-color: #8000E8; -fx-text-fill: white; -fx-background-radius: 8; -fx-padding: 7 13 7 13; -fx-font-size: 10px; -fx-font-weight: bold; -fx-cursor: hand;");

        //Reject Button
        Button rejectButton = new Button("× Reject");
        rejectButton.setStyle("-fx-background-color: #FFF1F2; -fx-text-fill: #E11D48; -fx-border-color: #FECDD3; -fx-border-radius: 8; -fx-background-radius: 8; -fx-padding: 7 13 7 13; -fx-font-size: 10px; -fx-cursor: hand;");

        //Combine Action Buttons
        HBox actionBox = new HBox(8, approveButton, rejectButton);
        actionBox.setPrefWidth(240);
        actionBox.setAlignment(Pos.CENTER_LEFT);

        HBox approvalRow= new HBox(name,contact,vehicleDetails,licenseDetails,actionBox);
        approvalRow.setStyle("-fx-background-color:white; -fx-border-color: transparent transparent #E1E5F0 transparent; -fx-border-width: 0 0 1 0;");
        approvalRow.setAlignment(Pos.CENTER_LEFT);        
        approvalRow.setPadding(new Insets(12, 14, 12, 14));

        return approvalRow;
    }

    
    //Store  Row
    private HBox createStoreRow(Store store) {

        //Store Name and ID
        Label name = new Label(store.getName());
        name.setStyle("-fx-font-size: 11px; -fx-font-weight: bold; -fx-text-fill: #111827;");

        Label storeId = new Label("ID: " + store.getStoreId());
        storeId.setStyle("-fx-font-size: 10px; -fx-text-fill: #8B91B5;");

        VBox storeDetails = new VBox(3, name, storeId);
        storeDetails.setPrefWidth(190);
        storeDetails.setAlignment(Pos.CENTER_LEFT);

        //Category
        Label category = new Label(store.getCategory());
        category.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        category.setPrefWidth(130);

        //Address
        Label address = new Label(store.getAddress());
        address.setStyle("-fx-font-size: 11px; -fx-text-fill: #111827;");
        address.setPrefWidth(230);

        //View Documents Button
        Button documentsButton = new Button("⊙ View Docs");
        documentsButton.setStyle("-fx-background-color: white; -fx-border-color: #CBD5E1; -fx-border-radius: 7; -fx-background-radius: 7; -fx-font-size: 10px; -fx-padding: 6 10 6 10; -fx-cursor: hand;");

        HBox documentsBox = new HBox(documentsButton);
        documentsBox.setPrefWidth(235);
        documentsBox.setAlignment(Pos.CENTER_LEFT);

        //Approve Button
        Button approveButton = new Button("✓ Approve");
        approveButton.setStyle("-fx-background-color: #8000E8; -fx-text-fill: white; -fx-background-radius: 8; -fx-padding: 7 13 7 13; -fx-font-size: 10px; -fx-font-weight: bold; -fx-cursor: hand;");

        //Reject Button
        Button rejectButton = new Button("× Reject");
        rejectButton.setStyle("-fx-background-color: #FFF1F2; -fx-text-fill: #E11D48; -fx-border-color: #FECDD3; -fx-border-radius: 8; -fx-background-radius: 8; -fx-padding: 7 13 7 13; -fx-font-size: 10px; -fx-cursor: hand;");

        //Combine Action Buttons
        HBox actionBox = new HBox(8, approveButton, rejectButton);
        actionBox.setPrefWidth(240);
        actionBox.setAlignment(Pos.CENTER_LEFT);

        //Complete Store Row
        HBox storeRow = new HBox(storeDetails, category, address, documentsBox, actionBox);

        storeRow.setStyle("-fx-background-color: white; -fx-border-color: transparent transparent #E1E5F0 transparent; -fx-border-width: 0 0 1 0;");
        storeRow.setAlignment(Pos.CENTER_LEFT);
        storeRow.setPadding(new Insets(12, 14, 12, 14));

        return storeRow;
    }


    //Courie Data
    public static class Courier{
        private String name;
        private String contact;
        private String vehicleDetails;
        private String licenseDetails;
    
        public Courier(String name, String contact, String vehicleDetails, String licenseDetails){
            this.name=name;
            this.contact=contact;
            this.vehicleDetails=vehicleDetails;
            this.licenseDetails=licenseDetails;
        }

        public String getName(){
            return name;
        }

        public String getContact(){
            return contact;
        }

        public String getVehicleDetails(){
            return vehicleDetails;
        }

        public String getLicenseDetails(){
            return licenseDetails;
        }
    }

    //Store Data
    public static class Store {

    private String name;
    private String storeId;
    private String category;
    private String address;

    public Store(String name, String storeId, String category, String address) {

        this.name = name;
        this.storeId = storeId;
        this.category = category;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getCategory() {
        return category;
    }

    public String getAddress() {
        return address;
    }
}
}


