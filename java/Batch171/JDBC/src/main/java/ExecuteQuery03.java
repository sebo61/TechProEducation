import java.sql.*;

public class ExecuteQuery03 {
    public static void main(String[] args) throws SQLException {
        // 1. adım : database bağlanma
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","dev_user","password");
        // 2. adım: Statement oluşturma

        Statement st=con.createStatement(); // db ye iletim yapmak ve query calistirmak için oluşturulur.
        // System.out.println("Connection succes");

        //ÖRNEK1:bolumler tablosunda taban puanı en yüksek 2. bölümün ismini ve puanını yazdırınız.
        String sql1="\n" +
                "SELECT bolum,taban_puani\n" +
                "FROM bolumler\n" +
                "ORDER BY taban_puani DESC\n" +
                "OFFSET 1\n" +
                "LIMIT 1;";
        ResultSet resultSet= st.executeQuery(sql1);

        while (resultSet.next()){

            System.out.println(resultSet.getString("bolum")+ "--"+resultSet.getInt("taban_puani"));

        }
        System.out.println("-----------------------------------");
        //ÖRNEK2:Bölüm isimlerini, kampüslerini ve
//her bölümde okuyan öğrencilerin en yüksek puanlarını listeleyiniz.

        String sql2="select bolum, kampus, (select max(puan) from ogrenciler where ogrenciler.bolum= bolumler.bolum) max_puan from bolumler ";
        ResultSet rs2= st.executeQuery(sql2);
        while (rs2.next()){
            System.out.println(rs2.getString("bolum")+"--"+rs2.getString("kampus")+"--"+rs2.getInt("max_puan"));

        }



        st.close();
        con.close();
    }
}
