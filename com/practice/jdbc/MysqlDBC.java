package com.practice.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlDBC {

    public static void main(String[] args) {
        try{
            //load n reg driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection obj
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
            "jprep","root","Sabin2003");
            Statement stmt=conn.createStatement();//create stmt obj
            PreparedStatement pstmt=conn.prepareStatement("insert into r8a(name,mark)values(?,?)");
            pstmt.setString(1,"Sami");
            pstmt.setFloat(2, 476.67f);//hardcoding pstmt
            pstmt.executeUpdate();
            //exec query
            PreparedStatement ps=conn.prepareStatement("select * from r8a");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
            }
            rs.close();
            stmt.close();
            pstmt.close();
            conn.close();

            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}