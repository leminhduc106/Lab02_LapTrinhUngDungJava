package MangHaiChieu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	                	int arr[][] = {{ 1, 2 },
	            				{ 3, 4 },
	            				{ 5, 6 }};
	                	System.out.println("Khoi tao co tham so: ");
	                	MangHaiChieu a = new MangHaiChieu(arr);
	                	a.XuatMang();
	                	
	                	MangHaiChieu b = new MangHaiChieu();
	                	b.NhapMang();
	                	b.XuatMang();
	                	
	                	System.out.println("Khoi tao sao chep: ");
	                	MangHaiChieu c = new MangHaiChieu(b);
	                	c.XuatMang();
	                }
	            }
	        }while(choice != 0);
	        
	        
	        
	
		String s = "1 2 3/4 5 6";
		
		/*System.out.println("Chen dong: ");
		int[][] b = a.ThemVaoDongK(0);
		MangHaiChieu.XuatMang(b);*/
		
		
	}
}
