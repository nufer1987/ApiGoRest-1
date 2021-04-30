package databaseWork;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSqlWriteImage{


    public static void main(String[] args) {

    String url = "jdbc:postgresql://localhost:5432/sprintdatabase2";
    String user = "postgres";
    String password = "Ankara06";

    String query = "INSERT INTO books(book_id ,pic_byte) VALUES(15,?)";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query)) {

        File img = new File("C:\\Users\\samet\\Desktop\\fotoX.jpg");

        try (FileInputStream fin = new FileInputStream(img)) {

            pst.setBinaryStream(1, fin, (int) img.length());
            pst.executeUpdate();
        } catch (IOException ex) {
            Logger.getLogger(JavaPostgreSqlWriteImage.class.getName()).log(
                    Level.SEVERE, ex.getMessage(), ex);
        }

    } catch (SQLException ex) {

        Logger lgr = Logger.getLogger(JavaPostgreSqlWriteImage.class.getName());
        lgr.log(Level.SEVERE, ex.getMessage(), ex);
    }
}
}