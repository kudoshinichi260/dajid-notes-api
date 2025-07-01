package com.example.dajidnotesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@SpringBootApplication
public class DajidNotesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DajidNotesApiApplication.class, args);
        /*String jdbcUrl = "jdbc:postgresql://dpg-d1gl14ali9vc73aq4o90-a.oregon-postgres.render.com/postgresql_dajid_notes?sslmode=require";
        String username = "postgresql_dajid_notes_user";
        String password = "DCq3OMyoxfSC69kELUjfOmlwZUTgKMgj";


        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Kết nối thành công!");
            } else {
                System.out.println("Không thể kết nối.");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi kết nối:");
            e.printStackTrace();
        }*/

    }

}
