/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import koneksi.DBConnection;
import model.Gaji;

/**
 *
 * @author saeful
 */
public class GajiDao {
    public List<Gaji> getAll(){
        java.sql.Connection conn = new DBConnection ().connect();
        List<Gaji> gj = null;
        try{
            gj = new ArrayList<>();
            String sql = "SELECT * FROM gaji";
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rslt = stmt.executeQuery(sql);
            while (rslt.next()){
                Gaji g = new Gaji();
                g.setNrp(rslt.getString("nrp"));
                g.setNama(rslt.getString("nama"));
                g.setJabatan(rslt.getString("jabatan"));
                g.setGapok(rslt.getInt("gapok"));
                g.setTunjangan(rslt.getInt("tunjangan"));
                g.setTransport(rslt.getInt("transport"));
                g.setMasuk(rslt.getInt("masuk"));
                g.setGaji(rslt.getInt("gaji"));
                gj.add(g);
            }
        }catch (SQLException ex) {
            System.out.println("Error"+ex);
        }return gj;
    }
    
    public Gaji save(Gaji gaji){
        java.sql.Connection conn = new DBConnection().connect();
        try{
           String sql = "insert into gaji(nrp,nama,jabatan,gapok,tunjangan,transport,masuk,gaji) values (?,?,?,?,?,?,?,?)";
           java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
           try{
               stmt.setString(1, gaji.getNrp());
               stmt.setString(2, gaji.getNama());
               stmt.setString(3, gaji.getJabatan());
               stmt.setInt(4, gaji.getGapok());
               stmt.setInt(5, gaji.getTunjangan());
               stmt.setInt(6, gaji.getTransport());
               stmt.setInt(7, gaji.getMasuk());
               stmt.setInt(8, gaji.getGaji());
               
               stmt.executeUpdate();
               JOptionPane.showMessageDialog(null, "data berhasil disimpan");     
        } catch (SQLException se){
               System.out.println("Error = " + se);
               JOptionPane.showMessageDialog(null, "data gagal disimpan");
        } 
        stmt.close();
    }catch (Exception e){
            System.out.println("Error = " + e);
    }
        return gaji;
    }
    
    public Gaji update(Gaji gaji){
        java.sql.Connection conn = new DBConnection().connect();
        try{
           String sql = "update gaji set nama=?,jabatan=?,gapok=?,tunjangan=?,transport=?,masuk=?,gaji=? where nrp=?";
           java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
           try{
               stmt.setString(1, gaji.getNama());
               stmt.setString(2, gaji.getJabatan());
               stmt.setInt(3, gaji.getGapok());
               stmt.setInt(4, gaji.getTunjangan());
               stmt.setInt(5, gaji.getTransport());
               stmt.setInt(6, gaji.getMasuk());
               stmt.setInt(7, gaji.getGaji());
               stmt.setString(8, gaji.getNrp());
               
               stmt.executeUpdate();
               JOptionPane.showMessageDialog(null, "data berhasil diubah");     
        } catch (SQLException se){
               System.out.println("Error = " + se);
               JOptionPane.showMessageDialog(null, "data gagal diubah");
        } 
        stmt.close();
    }catch (Exception e){
    }
        return gaji;
    }
    
    public Gaji getID(Gaji g){
        java.sql.Connection conn = new DBConnection().connect();
        try{
           String sql = "select * from gaji where nrp='"+g.getNrp()+"'";
           java.sql.Statement stmt = conn.createStatement();
           java.sql.ResultSet rslt = stmt.executeQuery(sql);
           while (rslt.next()){
                g = new Gaji();
                g.setNrp(rslt.getString("nrp"));
                g.setNama(rslt.getString("nama"));
                g.setJabatan(rslt.getString("jabatan"));
                g.setGapok(rslt.getInt("gapok"));
                g.setTunjangan(rslt.getInt("tunjangan"));
                g.setTransport(rslt.getInt("transport"));
                g.setMasuk(rslt.getInt("masuk"));
                g.setGaji(rslt.getInt("gaji"));
           }
        } catch (SQLException ex){
               System.out.println("Error = " + ex);
        } 
        return g;
    }
    
    public Gaji delete(Gaji gaji){
        java.sql.Connection conn = new DBConnection().connect();
        try{
            String sql = "delete from gaji where nrp=?";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            try{
                stmt.setString(1, gaji.getNrp());
                
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            }catch(SQLException se){
                System.out.println("Error ="+se);
                JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            }
            stmt.close();
        }catch (Exception e){
        }
        return gaji;
    }
    
    public List<Gaji> searching(String teks){
        java.sql.Connection conn = new DBConnection ().connect();
        List<Gaji> gj = null;
        try{
            gj = new ArrayList<>();
            String sql = "SELECT * FROM gaji where nrp like ? OR nama like ?";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + teks + "%");
            stmt.setString(2, "%" + teks + "%");
            java.sql.ResultSet rslt = stmt.executeQuery();
            while (rslt.next()){
                Gaji g = new Gaji();
                g.setNrp(rslt.getString("nrp"));
                g.setNama(rslt.getString("nama"));
                g.setJabatan(rslt.getString("jabatan"));
                g.setGapok(rslt.getInt("gapok"));
                g.setTunjangan(rslt.getInt("tunjangan"));
                g.setTransport(rslt.getInt("transport"));
                g.setMasuk(rslt.getInt("masuk"));
                g.setGaji(rslt.getInt("gaji"));
                gj.add(g);
            }
        }catch (SQLException ex) {
            System.out.println("Error"+ex);
        }return gj;
    }
      
}
