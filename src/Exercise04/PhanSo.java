package Exercise04;

import java.util.Scanner;

/**
 * Exercise04
 * Created by lmduc
 * Date 17/10/2021 - 16:54
 * Description: ...
 */

public class PhanSo {
    private int tu;
    private int mau;

    /**
     * Default constructor
     */
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    /**
     * Constructor with parameters
     * @param tu integer
     * @param mau integer
     */
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    /**
     * Constructor copy
     * @param pt Phan so duoc sao chep
     */
    public PhanSo(PhanSo pt) {
        this.tu = pt.tu;
        this.mau = pt.mau;
    }

    //Getter and Setter
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        if(mau != 0)
            this.mau = mau;
    }

    public void NhapPhanSo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tu = scan.nextInt();
        System.out.print("Nhap mau so: ");
        this.mau = scan.nextInt();
    }

    public void XuatPhanSo() {
        System.out.println("Phan so la: " + toString());
    }

    public PhanSo cong(PhanSo ps){
        PhanSo kq = new PhanSo();

        kq.tu = this.tu * ps.mau + this.mau * ps.tu;
        kq.mau = this.mau * ps.mau;
        return kq;
    }

    public PhanSo cong(int k){
        PhanSo kq=new PhanSo();
        kq.tu=this.tu + this.mau * k;
        kq.mau = this.mau;
        return kq;
    }

    public PhanSo tru(PhanSo ps){
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * ps.mau - this.mau * ps.tu;
        kq.mau = this.mau * ps.mau;
        return kq;
    }

    public PhanSo tru(int k){
        PhanSo kq=new PhanSo();
        kq.tu=this.tu - this.mau * k;
        kq.mau = this.mau;
        return kq;
    }

    public static int UocChungLonNhat(int a, int b) {
        if (a % b == 0)
            return b;
        return UocChungLonNhat(b, a % b);
    }

    public void RutGonPhanSo(PhanSo ps) {
        int UocChung = UocChungLonNhat(ps.tu, ps.mau);
        ps.tu = ps.tu / UocChung;
        ps.mau = ps.mau / UocChung;

        if (ps.mau < 0) {
            ps.mau *= -1;
            ps.tu *= -1;
        }
    }

    public PhanSo nhan(PhanSo ps){
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * ps.tu;
        kq.mau = this.mau * ps.mau;
        return kq;
    }

    public PhanSo nhan(int k){
        PhanSo kq=new PhanSo();
        kq.tu=this.tu * k;
        kq.mau = this.mau;
        return kq;
    }

    public PhanSo chia(PhanSo ps){
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * ps.mau;
        kq.mau = this.mau * ps.tu;
        return kq;
    }

    public PhanSo chia(int k){
        PhanSo kq = new PhanSo();
        kq.tu = this.tu ;
        kq.mau = this.mau * k;
        return kq;
    }

    /**
     * Return String format of object
     * @return String
     */
    @Override
    public String toString() {
        if(this.tu == this.mau || this.tu == 0)
            return String.valueOf(this.tu / this.mau);
        return this.tu + "/" + this.mau;
    }

    /**
     * Static function to convert String to PhanSo object
     * @param str String
     * @return PhanSo Object
     */
    public static PhanSo parsePhanSo(String str){
        PhanSo kq = new PhanSo();
        String [] s = str.split("/");
        kq.tu = Integer.parseInt(s[0]);
        kq.mau = Integer.parseInt(s[1]);
        return kq;
    }
}

