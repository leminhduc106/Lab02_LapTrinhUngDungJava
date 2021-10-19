package MangRangCua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] test = {
				 { 1, 2 },
				 { 3, 4, 5 },
				 { 5, 6 , 7, 8 },
				 { 7, 8 ,9 ,10 }};
		MangRangCua a = new MangRangCua();
		//a.NhapMang();
		
		//int[][] b = a.XoaDongK(2);
		//MangRangCua.XuatMang(b);
		
		String s = "1 2 3/4 5/6/7 8 9 10";
		a = MangRangCua.parseMangRangCua(s);
		a.XuatMang();

		
	}

}
