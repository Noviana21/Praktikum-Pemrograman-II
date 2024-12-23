package praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> table = new TableView<>();

        TableColumn<Mahasiswa, Integer> idColumn = new TableColumn<>("ID");
        TableColumn<Mahasiswa, String> namaColumn = new TableColumn<>("Nama");
        TableColumn<Mahasiswa, String> nimColumn = new TableColumn<>("NIM");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));

        table.getColumns().addAll(namaColumn, nimColumn);
        
        table.getItems().addAll(
            new Mahasiswa(1, "Noviana Nur Aisyah", "2310817120005"),
            new Mahasiswa(2, "Muhammad Akbar", "2110817110001"),
            new Mahasiswa(3, "Sheila Sabina", "2310817220028"),
            new Mahasiswa(4, "Dina Izzati Elfadheya", "2310817120001"),
            new Mahasiswa(5, "Zahra Nabila", "2310817320007"),
            new Mahasiswa(6, "Raudatul Sholehah", "2310817220002"),
            new Mahasiswa(7, "Aliya Raffa Naura Ayu", "2310817120014"),
            new Mahasiswa(8, "Muhammad Rizky", "2310817310011"),
            new Mahasiswa(9, "Randy Febrian", "2310817110013"),
            new Mahasiswa(10, "Jovan Gilbert Natamasindah", "2310817310002"),
            new Mahasiswa(11, "Ghani Mudzakir", "2310817110011"),
            new Mahasiswa(12, "Mohammad Zaki Firmansah", "2210817110006")
        );

        VBox box = new VBox(table);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}