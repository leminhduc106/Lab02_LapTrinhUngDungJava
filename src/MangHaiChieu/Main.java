package MangHaiChieu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 },
				{ 7, 8 }};

		String s = "1 2 3/4 5 6";
		MangHaiChieu a = new MangHaiChieu();
		a = MangHaiChieu.parseMangHaiChieu(s);
		a.XuatMang();
		
		/*System.out.println("Chen dong: ");
		int[][] b = a.ThemVaoDongK(0);
		MangHaiChieu.XuatMang(b);*/
		
		
	}
}
