package Exercise04;

import java.util.Scanner;

/**
 * Exercise04
 * Created by lnvu
 * Date 17/10/2021 - 16:56
 * Description: ...
 */
public class Main {
    public static void main(String[] arvg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("EXERCISE 04: PHÂN SỐ");
        int choice;
        System.out.println("1. Các phương thức khởi tạo, nhập, xuất");
        System.out.println("2. Các phương thức cộng, trừ, nhân, chia, rút gọn");
        System.out.println("3. Phương thức mức lớp (static)");
        System.out.println("0. Thoát chương trình (Exit)");
        do {
            System.out.print("Nhap lua chon: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("1. Các phương thức khởi tạo, nhập, xuất");
                    System.out.print("Khoi tao co tham so: ");
                    PhanSo ps = new PhanSo(3, 4);
                    ps.XuatPhanSo();
                    System.out.print("Khoi tao sao chep: ");
                    PhanSo ps1 = new PhanSo(ps);
                    ps1.XuatPhanSo();

                    PhanSo ps2 = new PhanSo();
                    ps2.NhapPhanSo();
                    ps2.XuatPhanSo();
                    break;
                }
                case 2: {
                    System.out.println("2. Các phương thức cộng, trừ, nhân, chia, rút gọn");
                    PhanSo ps = new PhanSo();
                    System.out.println("Phan so thu 1:");
                    ps.NhapPhanSo();
                    PhanSo ps1 = new PhanSo();
                    System.out.println("Phan so thu 2:");
                    ps1.NhapPhanSo();

                    System.out.print("Cong 2 phan so: ");
                    PhanSo cong = ps.cong(ps1);
                    cong.XuatPhanSo();

                    System.out.print("Tru 2 phan so: ");
                    PhanSo tru = ps.tru(ps1);
                    tru.XuatPhanSo();

                    System.out.print("Nhan 2 phan so: ");
                    PhanSo nhan = ps.nhan(ps1);
                    nhan.XuatPhanSo();

                    System.out.print("Chia 2 phan so: ");
                    PhanSo chia = ps.chia(ps1);
                    chia.XuatPhanSo();

                    System.out.println("Rut gon phan so:");
                    PhanSo rutgon = new PhanSo();
                    rutgon.NhapPhanSo();
                    rutgon.RutGonPhanSo(rutgon);
                    System.out.print("Sau khi rut gon: ");
                    rutgon.XuatPhanSo();
                    break;
                }
                case 3: {
                    System.out.println("3. Phương thức mức lớp (static)");
                    System.out.println("Parse phan so:");

                    PhanSo ps1 = PhanSo.parsePhanSo("2/3");
                    ps1.XuatPhanSo();
                    PhanSo ps2 = PhanSo.parsePhanSo("3/4");
                    ps2.XuatPhanSo();
                    break;
                }

            }
        }while(choice != 0);

    }
}
