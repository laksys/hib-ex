package com.king;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Session session = Hutil.getSessionFactory().openSession();
        /*
        Dept d1 = new Dept();
        d1.setDeptno(10);
        d1.setLoc("Chennai");
        d1.setDname("Finance");

        Emp e1 = new Emp();
        e1.setEmpno(310);
        e1.setName("Guna");
        e1.setDept(d1);

        Emp e2 = new Emp();
        e2.setEmpno(311);
        e2.setName("Babu");
        e2.setDept(d1);

        Transaction transaction = session.beginTransaction();
        session.save(d1);
        session.save(e1);
        session.save(e2);

        transaction.commit();
        */

        Dept dept = (Dept)session.get(Dept.class, 10);

        System.out.println(dept.getDeptno());
        System.out.println( dept.getDname());
        System.out.println( dept.getLoc());

        Set<Emp> emps = dept.getEmps();
        System.out.println("No of employees: " + emps.size());

        session.clear();
        Hutil.shutdown();
    }
}
