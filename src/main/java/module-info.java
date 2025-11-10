module guardx {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens guardx to javafx.fxml;
    exports guardx;
}
