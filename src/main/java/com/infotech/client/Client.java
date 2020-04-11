package com.infotech.client;

import com.infotech.util.HibernateUtil;
import org.hibernate.Session;

public class Client {
    public static void main(String[] args) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String SQL ="SELECT VERSION()";
            String result = (String) session.createNativeQuery(SQL).getSingleResult();
            System.out.println("MYSQL Version is :: ");
            System.out.println(result);
            System.out.println("THis is initial commits");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
