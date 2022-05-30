/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class model_barang {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi_prakpbo";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;

    
    public model_barang() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
  
    
    public String[][] readBarang(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][4]; 
            
            String query = "SELECT * FROM barang"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = String.valueOf(resultSet.getDouble("massa"));             
                data[jmlData][3] = String.valueOf(resultSet.getDouble("harga"));
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    
    public void insertData(String Nama, double Massa, double Harga){
        int jmlData=0;
        
        try {
           String query = "SELECT * FROM barang WHERE nama='" + Nama+"'";
           statement=koneksi.createStatement();
           System.out.println(Nama + " " + Massa + " " + Harga);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            statement.close();
            if (jmlData==0) {
                query = "INSERT INTO barang(nama,massa,harga) VALUES('"+Nama+"','"+Massa+"','"+Harga+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateData(String id, String Nama, double Massa, double Harga){
        int jmlData=0;
         try {
           String query = "SELECT * FROM barang WHERE id='" + id+"'"; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE barang SET nama='" + Nama + "', massa='" + Massa + "', harga='" + Harga + "' WHERE id='" + id+"'"; 
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "SELECT * FROM barang";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public String[] detailBarang(String id) {
        try{
            String data[] = new String[4];
            String query = "SELECT * FROM barang WHERE id = '"+id+"'";            
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0] = resultSet.getString("id"); //harus sesuai nama kolom di mysql
                data[1] = resultSet.getString("nama");                
                data[2] = Double.toString(resultSet.getDouble("massa"));
                data[3] = Double.toString(resultSet.getDouble("harga"));  
            }
            return data;
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void deleteData (String id) {
        try{
            String query = "DELETE FROM barang WHERE id = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}

