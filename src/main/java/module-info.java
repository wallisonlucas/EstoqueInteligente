module com.gerenciamento.estoqueinteligente {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gerenciamento.estoqueinteligente to javafx.fxml;
    exports com.gerenciamento.estoqueinteligente;
    exports com.gerenciamento.estoqueinteligente.infra.javafx.controller to javafx.fxml;
    opens com.gerenciamento.estoqueinteligente.infra.javafx.controller to javafx.fxml;
}