module org.example.playlistmaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens org.example.playlistmaker to javafx.fxml;
    exports org.example.playlistmaker;
}