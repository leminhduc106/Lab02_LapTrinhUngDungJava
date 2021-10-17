package Exercise01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise01
 * Created by lmduc
 * Date 15/10/2021 - 20:48
 * Description: ...
 */
public class Main {
    public static void main(String[] arvg) {

        Scanner scan = new Scanner(System.in);

        //Khoi tao mac dinh
        MangMotChieu msn1= new MangMotChieu();
        //Khoi tao co tham so
        MangMotChieu msn2=new MangMotChieu(4, 9, 1, 5);
        //Khoi tao sao chep
        MangMotChieu msn3=new MangMotChieu(msn2);

        MangMotChieu a = new MangMotChieu();
        a.NhapMang();
        System.out.print("Xuat mang: ");
        a.XuatMang();

        /*System.out.println("Sap xep mang tang dan: ");
        a.SapXepTangDan();
        System.out.print("Mang sau khi sap xep tang dan: ");
        a.XuatMang();

        System.out.println("Sap xep mang giam dan: ");
        a.SapXepGiamDan();
        System.out.print("Mang sau khi sap xep giam dan: ");
        a.XuatMang();

        System.out.println("Tong cac phan tu trong mang la: " + a.TongPhanTu());
        System.out.println("Tich cac phan tu trong mang la: " + a.TichPhanTu());
        System.out.println("So nguyen lon nhat trong mang la: " + a.SoNguyenLonNhat());
        System.out.println("So nguyen duong nho nhat trong mang la: " + a.SoNguyenDuongNhoNhat());
        System.out.println("So nguyen am lon nhat trong mang la: " + a.SoNguyenAmLonNhat());*/

        //System.out.println("Chen 1 phan tu vao dau mang va cuoi mang:");
        //System.out.print("Nhap gia tri phan tu muon chen: ");
        //int val = scan.nextInt();
        /*int[] b = a.ChenDauMang(val);
        System.out.print("Mang sau khi chen: ");
        MangMotChieu.XuatMang(b);

        int[] c = a.ChenCuoiMang(val);
        System.out.print("Mang sau khi chen: ");
        MangMotChieu.XuatMang(c);*/

        /*System.out.println("Them 1 phan tu vao vi tri k: ");
        System.out.print("Nhap vi tri muon chen: ");
        int pos = scan.nextInt();
        int[] d = a.ChenVaoViTriK(pos, val);
        System.out.print("Mang sau khi chen: ");
        MangMotChieu.XuatMang(d);*/

        System.out.println("Xoa phan tu tai vi tri k:");
        System.out.print("Nhap vi tri muon xoa: ");
        int k = scan.nextInt();
        int[] b = a.XoaTaiViTrik(k);
        //System.out.println("After deleted: " + Arrays.toString(b));
        MangMotChieu.XuatMang(b);

        /*System.out.println("Cap nhat phan tu tai vi tri k: ");
        System.out.print("Nhap vi tri muon cap nhat: ");
        int pos_update = scan.nextInt();
        System.out.print("Nhap gia tri cap nhat: ");
        int val2 = scan.nextInt();

        a.CapNhatPhanTuTaiViTriK(pos_update, val2);
        System.out.print("Mang sau khi cap nhat: ");
        a.XuatMang();*/

        /*System.out.println("Cap nhat phan tu co gia tri x thanh y: ");
        System.out.print("Nhap gia tri x: ");
        int x = scan.nextInt();
        System.out.print("Nhap gia tri cap nhat (Nhap y): ");
        int val = scan.nextInt();

        a.CapNhatPhanTuX(x, val);
        System.out.print("Mang sau khi cap nhat: ");
        a.XuatMang();*/

        /*int s2 = a.Tong(msn2);
        System.out.println("Tổng mảng số nguyên 1&2: "+ s2);*/
    }
}
