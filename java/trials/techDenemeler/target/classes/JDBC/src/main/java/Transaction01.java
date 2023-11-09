import java.sql.*;

/*
transaction: database de en küçük işlem.
 */
public class Transaction01 {
    public static void main(String[] args) throws Exception {
        // database ebağlanma
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");

        // db ye iletim yapmak ve query çalıştırmak için oluşturulur.
        Statement st = con.createStatement();
        con.setAutoCommit(false);

        try {


        // hesap 1234 den 5678 e transfer

        String sql = "update hesaplar set bakiye=bakiye+? where hesap_no=?";

        PreparedStatement prst = con.prepareStatement(sql);

        prst.setDouble(1, -1000);
        prst.setInt(2, 1234);

        prst.executeUpdate();
        if (false) {
            throw new Exception();
        }

        prst.setDouble(1, 1000);
        prst.setInt(2, 5678);

        prst.executeUpdate();

        prst.close();
        con.commit();
        con.close();
    } catch(Exception e){
            con.rollback();// hata olursa işlemleri iptal et en başa dön.

        }





    }

}
