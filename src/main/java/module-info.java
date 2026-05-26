module com.example.projet_informatique {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projet_informatique to javafx.fxml;
    exports com.example.projet_informatique;
}