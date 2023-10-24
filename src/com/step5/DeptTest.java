package com.step5;


public class DeptVO {
    private int deptno;
    private String dname;
    private String loc;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public DeptVO() {
    }

    public DeptVO(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
}

public class DeptTest {
    public static void main(String[] args) {
        DeptVO dVOs[] = new DeptVO[3];
        System.out.println(dVOs[0] + ", " + dVOs[1] + ", " + dVOs[2]);
        System.out.println("");

        DeptVO dVO1 = new DeptVO(10, "영어부", "대전");
        dVOs[0] = dVO1;
        System.out.println(dVOs[0]);

        DeptVO dVO2 = new DeptVO(20, "개발부", "서울");
        dVOs[1] = dVO2;
        System.out.println(dVOs[1]);

        DeptVO dVO3 = new DeptVO(30, "마케팅부", "대구");
        dVOs[2] = dVO3;
        System.out.println(dVOs[2]);

        System.out.println("");

        for (int i = 0; i < dVOs.length; i++) {
            System.out.println((i + 1) + "회 : " + dVOs[i].getDeptno() + ", " + dVOs[i].getDname() + ", " + dVOs[i].getLoc() + "/ 주소 : " + dVOs);
        }

        System.out.println("");

        for (int i = 0; i < dVOs.length; i++) {
            dVOs[i] = new DeptVO();
            System.out.println((i + 1) + "회 : " + dVOs[i].getDeptno() + ", " + dVOs[i].getDname() + ", " + dVOs[i].getLoc() + "/ 주소 : " + dVOs);
        }

        System.out.println("");

        for (int i = 0; i < dVOs.length; i++) {
            dVOs[i] = new DeptVO(10, "영업부", "대전");
            System.out.println((i + 1) + "회 : " + dVOs[i].getDeptno() + ", " + dVOs[i].getDname() + ", " + dVOs[i].getLoc() + "/ 주소 : " + dVOs);
        }
    }
}
