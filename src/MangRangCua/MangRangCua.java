package MangRangCua;

import java.util.Arrays;
import java.util.Scanner;

import MangHaiChieu.MangHaiChieu;

public class MangRangCua {
private int[][] arr;
	
	public MangRangCua() {
		this.arr = null;
	}
	
	public MangRangCua(int[][] a) {
		this.arr = new int[a.length][];
		for (int i = 0; i < this.arr.length; i++) {
			this.arr[i] = new int[a[i].length];
			 for (int j = 0; j < a[i].length; j++) {
				 this.arr[i][j] = a[i][j];
			 }
		}
	}
	
	public MangRangCua(MangRangCua mrc) {
		this.arr = new int[mrc.arr.length][];
		for (int i = 0; i < this.arr.length; i++) {
			this.arr[i] = new int[mrc.arr[i].length];
			 for (int j = 0; j < mrc.arr[i].length; j++) {
				 this.arr[i][j] = mrc.arr[i][j];
			 }
		}
	}

	public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = new int[arr.length][];
		for (int i = 0; i < this.arr.length; i++) {
			this.arr[i] = new int[arr[i].length];
			 for (int j = 0; j < arr[i].length; j++) {
				 this.arr[i][j] = arr[i][j];
			 }
		}
	}
	
	public void NhapMang() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhap so dong: ");
		int sodong = scan.nextInt();
		this.arr = new int[sodong][];

		for (int i = 0; i < this.arr.length; i++){
			System.out.print("Nhap so cot cua dong " +i+": ");
			int socot = scan.nextInt();
			this.arr[i] = new int[socot];
			for (int j = 0; j < this.arr[i].length; j++){
				System.out.print("a["+i+"]["+j+"] = ");
				this.arr[i][j] = scan.nextInt();
			}
		}
	}
	
	public void XuatMang() {
		System.out.println("Mang la: ");
		for (int i = 0; i < this.arr.length; i++){
			for (int j = 0; j < this.arr[i].length; j++) {
				System.out.print(this.arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void SapXepTangDanTheoDong() {
		for (int i = 0; i < this.arr.length; i++){
			 Arrays.sort(arr[i]);
		}
	}
	
	public int Tong() {
		int s = 0;
		for (int i = 0; i < arr.length; i++){
		 for (int j = 0; j < arr[i].length; j++){
			 s += arr[i][j];
		 }
		}
		return s;
	}
	
	public int Tong(MangRangCua mrc){
        int s1 = this.Tong();
        int s2 = mrc.Tong();
        int kq = s1 + s2;
        return kq;
    }
	
	public long Tich() {
		int p = 1;
		for (int i = 0; i < arr.length; i++){
		 for (int j = 0; j < arr[i].length; j++){
			 p *= arr[i][j];
		 }
		}
		return p;
	}
	
	 public long Tich(MangRangCua mrc) {
	        long p1 = this.Tich();
	        long p2 = mrc.Tich();
	        long kq = p1 * p2;
	        return kq;
	    }
	 
	 public int SoNguyenLonNhat() {
	        int max = arr[0][0];
	        for (int i = 0; i < arr.length; i++){
	   		 for (int j = 0; j < arr[i].length; j++){
	   			 if(arr[i][j] > max) max = arr[i][j];
	   		 }
	   		}
	        return max;
	    }
	
	 public boolean KiemTraToanDuong() {
	        boolean flag = true;
	        for (int i = 0; i < arr.length; i++){
		   		 for (int j = 0; j < arr[i].length; j++){
		   			 if (this.arr[i][j] < 0) {
		   				 flag = false;
		   				 break;
		   			 }
		   		 }
	        }
	        return flag;
	    }

	    public boolean KiemTraToanAm() {
	    	boolean flag = true;
	        for (int i = 0; i < arr.length; i++){
		   		 for (int j = 0; j < arr[i].length; j++){
		   			 if (this.arr[i][j] > 0) {
		   				 flag = false;
		   				 break;
		   			 }
		   		 }
	        }
	        return flag;
	    }

	    public int SoNguyenDuongNhoNhat() {
	        int min = -1;
	        if (KiemTraToanAm() == true)
	            throw new ArithmeticException("Khong tim thay so nguyen duong nho nhat do mang toan so am!");

	        for (int i = 0; i < arr.length; i++){
		   		 for (int j = 0; j < arr[i].length; j++){
		   			 if ((min == -1 || min > arr[i][j]) && arr[i][j] > 0) {
		   				 min = arr[i][j];
		   			 }
	            }
	        }
	        return min;
	    }

	    public int SoNguyenAmLonNhat() {
	        int max = 0;
	        if (KiemTraToanDuong() == true)
	            throw new ArithmeticException("Khong tim thay so nguyen am lon nhat do mang toan so duong!");

	        for (int i = 0; i < arr.length; i++){
		   		 for (int j = 0; j < arr[i].length; j++){
		   			 if(arr[i][j] < 0) {
		   				 max = arr[i][j];
		   				 break;
		   			 }
		   		 }
	        }
	        
	        for (int i = 0; i < arr.length; i++){
		   		 for (int j = 0; j < arr[i].length; j++){
		   			 if(arr[i][j] < 0 && arr[i][j] > max)
		   				 max = arr[i][j];
		   				 
		   		 }
	        }
	        return max;
	    }
	    
	    public int TongMotDong(int dong_n) {
	    	int s = 0;
	    	for (int i = 0; i < arr[dong_n].length; i++) {
	    		s += arr[dong_n][i];
	    	}
	    	return s;
	    }
	    
	    public int DongCoTongLonNhat() {
	    	int index_max = 0, max;
	    	max = TongMotDong(0);
	    	
	    	for (int i = 1; i < arr.length; i++) {
	    		int t = TongMotDong(i);
	    		if(t > max) {
	    			max = t;
	    			index_max = i;
	    		}
	    	}
	    	return index_max;
	    }
	    
	    public int[][] ThemVaoDauDong() {
	    	Scanner scan = new Scanner(System.in);
	    	int[][] tempArr = new int [this.arr.length + 1][];
	    	for(int i = tempArr.length - 1; i > 0; i--) {
	    		tempArr[i] = new int[this.arr[i - 1].length];
	    		for(int j = 0; j < tempArr[i].length; j++)
	    			tempArr[i][j] = arr[i-1][j];
	    	}

	    	System.out.print("Nhap so cot muon them vao dau dong: ");
	    	int socot = scan.nextInt();
	    	tempArr[0] = new int[socot];
	    	for(int j = 0; j < socot; j++) {
	    		System.out.print("a[0]["+j+"] = ");
	            tempArr[0][j] = scan.nextInt();
	            }
	       
	        return tempArr;
	    }
	    
	    public int[][] ThemVaoCuoiDong() {
	    	Scanner scan = new Scanner(System.in);
	    	int[][] tempArr = new int [this.arr.length + 1][];
	    	for(int i = 0; i < arr.length; i++) {
	    		tempArr[i] = new int[this.arr[i].length];
	    		for(int j = 0; j < arr[i].length; j++)
	    			tempArr[i][j] = arr[i][j];
	    	}

	    	System.out.print("Nhap so cot muon them vao cuoi dong: ");
	    	int socot = scan.nextInt();
	    	tempArr[tempArr.length - 1] = new int[socot];
	    	for(int j = 0; j < socot; j++) {
	    		System.out.print("a["+(tempArr.length - 1)+"]["+j+"] = ");
	            tempArr[tempArr.length - 1][j] = scan.nextInt();
	            }
	       
	        return tempArr;
	    }
	    
	    public int[][] ThemVaoDongK(int k) {
	    	Scanner scan = new Scanner(System.in);
	    	int[][] tempArr = new int [this.arr.length + 1][];
	    	
	    	for(int i = 0; i < arr.length; i++) {
	    		tempArr[i] = new int[this.arr[i].length];
	    		for(int j = 0; j < arr[i].length; j++)
	    			tempArr[i][j] = this.arr[i][j];
	    	}
	    	
	        for (int i = this.arr.length; i > k; i--) {
	    		tempArr[i] = new int[this.arr[i - 1].length];
	        	for(int j = 0; j < tempArr[i].length; j++)
	        		tempArr[i][j] = tempArr[i - 1][j];
	        }
	        
	        System.out.print("Nhap so cot muon them vao dong k: ");
	    	int socot = scan.nextInt();
	    	tempArr[k] = new int[socot];
	        for(int j = 0; j < socot; j++) {
	        	System.out.print("a["+k+"]["+j+"] = ");
	            tempArr[k][j] = scan.nextInt();
	        }
	                
	        return tempArr;
	    }
	    
	    public int[][] XoaDongK(int k) {
	        if (this.arr == null || k < 0 || k >= this.arr.length)
	            System.out.println("Dong muon xoa khong hop le!");
	        
	        boolean flag = false;
	        int tmpArray[][]= new int [arr.length-1][];
	        for( int i = 0; i < arr.length; ++i) {
	            if (i == k) {
	            	flag = true;
	                continue;
	            }
	           
	            int q = 0;
	            if(flag == true) {
	            	tmpArray[i - 1] = new int[this.arr[i].length];
	            	for( int j = 0; j < arr[i].length; ++j) {
		            	tmpArray[i - 1][q] = arr[i][j];
		                ++q;
		            }
	            }else {
	            	tmpArray[i] = new int[this.arr[i].length];
	            	for( int j = 0; j < arr[i].length; ++j) {
	            	tmpArray[i][q] = arr[i][j];
	                ++q;
	            	}
	            }
	        }
	        return tmpArray;
	    }
	    
	    public static MangRangCua parseMangRangCua(String str) {
	        MangRangCua mrc = new MangRangCua();
	        String[] n_row = str.split("/");
	        mrc.arr = new int[n_row.length][];
	        
	        for(int i = 0; i < mrc.arr.length; i++) {
	        	String[] col = n_row[i].split(" ");
	        	mrc.arr[i] = new int[col.length];
		        for(int j = 0; j < mrc.arr[i].length; j++) 
		        	mrc.arr[i][j] = Integer.parseInt(col[j].trim());
	        }
	        return mrc;
	    }
	    
	    public static void XuatMang(int[][] a) {
			System.out.println("Mang la: ");
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
}
