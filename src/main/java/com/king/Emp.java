package com.king;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emp {
    @Id
    private Integer empno;
    private String name;
    @ManyToOne
    @JoinColumn(name="deptno", nullable = false)
    private Dept deptno;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dept getDept() {
        return deptno;
    }

    public void setDept(Dept dept) {
        this.deptno = dept;
    }
}