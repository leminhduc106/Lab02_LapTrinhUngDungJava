package Exercise05;

import Exercise04.PhanSo;

import java.util.Scanner;

/**
 * Exercise05
 * Created by lmduc
 * Date 17/10/2021 - 22:14
 * Description: ...
 */
public class MangPhanSo {
    private PhanSo[] arrPhanSo;

    /**
     * Default constructor
     */
    public MangPhanSo() {
        this.arrPhanSo = null;
    }

    /**
     * Constructor with parameters
     * @param arr Mang Phan So
     */
    public MangPhanSo(PhanSo... arr) {
        this.arrPhanSo = new PhanSo[arr.length];
        for(int i = 0; i < arr.length; i++)
            this.arrPhanSo[i] = new PhanSo(arr[i]);
    }

    /**
     * Copy constructor
     * @param mps
     */
    public MangPhanSo(MangPhanSo mps) {
        this.arrPhanSo = new PhanSo[mps.arrPhanSo.length];
        for(int i = 0; i < mps.arrPhanSo.length; i++)
            this.arrPhanSo[i] = mps.arrPhanSo[i];
    }

    /**
     * Getter Mang Phan So
     * @return PhanSo[]
     */
    public PhanSo[] getArrPhanSo() {
        return this.arrPhanSo;
    }

    public PhanSo get(int index) {
        PhanSo ps = null;
        if (index >= 0 && index < this.arrPhanSo.length) {
            ps = this.arrPhanSo[index];
        }
        return ps;
    }
    /**
     * Setter Mang Phan So
     * @param arrPhanSo PhanSo[]
     */
    public void setArrPhanSo(PhanSo[] arrPhanSo) {
        this.arrPhanSo = arrPhanSo;
    }

    public void set(int index, PhanSo value) {
        if (index >= 0 && index < this.arrPhanSo.length) {
            this.arrPhanSo[index] = value;
        }
    }

    public void NhapMangPS() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scan.nextInt();
        this.arrPhanSo = new PhanSo[n];
        for(int i = 0; i < this.arrPhanSo.length; i++){
            this.arrPhanSo[i] = new PhanSo();
            this.arrPhanSo[i].NhapPhanSo();
        }
    }

    public void XuatMangPS() {
        int n = this.arrPhanSo.length;
        System.out.print("Mang phan so la: ");
        for(int i = 0 ; i < this.arrPhanSo.length; i++){
            this.arrPhanSo[i].XuatPhanSo();
        }
    }

    //Tong cac phan so trong mang
    public PhanSo tong() {
        PhanSo s = this.arrPhanSo[0];
        for (int i = 1; i < this.arrPhanSo.length; i++)
            s = s.cong(this.arrPhanSo[i]);
        return s;
    }



    /**
     * Convert list objects to String
     * @return To String
     */
    @Override
    public String toString() {
        if(this.arrPhanSo == null)
            return "Mang rong";
        else {
            String s = "";
            for(PhanSo pt : this.arrPhanSo) {
                s += pt.toString() + " ";
            }
            return s;
        }
    }

    /**
     * Static function to convert String to Array PhanSo
     * @param str Array PhanSo
     * @return MangPhanSo object
     */
    public static MangPhanSo parseMangPhanSo(String str){
        MangPhanSo arr = new MangPhanSo();
        String[] arrStr = str.split(" ");
        arr.arrPhanSo = new PhanSo[arrStr.length];
        for(int i = 0; i <arrStr.length; i++)
            arr.arrPhanSo[i] = PhanSo.parsePhanSo(arrStr[i]);
        return arr;
    }
}
