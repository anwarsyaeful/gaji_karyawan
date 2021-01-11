/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author saeful
 */
public class DBConnection {
    private Connection koneksi;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil load driver");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Tidak ada driver"+cnfe);
        }
        
        try{
            String url="jdbc:mysql://localhost:3306/gaji_karyawan";
            koneksi=DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil koneksi");
        }catch(SQLException se){
            System.out.println("Gagal koneksi"+se);
            JOptionPane.showMessageDialog(null,"Gagal koneksi Database",
                    "Peringtan",JOptionPane.WARNING_MESSAGE);
        
        }return koneksi;
    }
    
}
