package MangHaiChieu;

import java.util.Arrays;
import java.util.Scanner;

import MangMotChieu.MangMotChieu;

public class MangHaiChieu {
	private int[][] arr;
	
	public MangHaiChieu() {
		this.arr = null;
	}
	
	public MangHaiChieu(int[][] a) {
		this.arr = new int[a.length][a[0].length];
		for (int i = 0; i < this.arr.length; i++) {
			 for (int j = 0; j < this.arr[i].length; j++) {
				 this.arr[i][j] = a[i][j];
			 }
		}
	}
	
	public MangHaiChieu(MangHaiChieu mhc) {
		this.arr = new int[mhc.arr.length][mhc.arr[0].length];
		for (int i = 0; i < this.arr.length; i++) {
			 for (int j = 0; j < this.arr[i].length; j++) {
				 this.arr[i][j] = mhc.arr[i][j];
			 }
		}
	}

	public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = new int[arr.length][arr[0].length];
		for (int i = 0; i < this.arr.length; i++) {
			 for (int j = 0; j < this.arr[i].length; j++) {
				 this.arr[i][j] = arr[i][j];
			 }
		}
	}
	
	public void NhapMang() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhap so dong: ");
		int sodong = scan.nextInt();
		System.out.print("Nhap so cot: ");
		int socot = scan.nextInt();;
		this.arr = new int[sodong][socot];
		
		for (int i = 0; i < this.arr.length; i++){
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
	
	public void transpose() {
		int temp;
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr[0].length; j++) {
	        	temp = arr[i][j];
	    		arr[i][j] = arr[j][i];
	    		arr[j][i] = temp;
	        }
	    }
	}
	
	public void SapXepGiamDanTheoCot() {
		transpose();
		for (int i = 0; i < this.arr.length; i++){
			MangMotChieu.SapXepGiamDan(arr[i]);
		}
		transpose();
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
	
	public int Tong(MangHaiChieu mhc){
        int s1 = this.Tong();
        int s2 = mhc.Tong();
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
	
	 public long Tich(MangHaiChieu mhc) {
	        long p1 = this.Tich();
	        long p2 = mhc.Tich();
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
	    	for (int i = 0; i < arr[0].length; i++) {
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
	    
	    public int TongMotCot(int cot_n) {
	    	int s = 0;
	    	for (int i = 0; i < arr.length; i++) {
	    		s += arr[i][cot_n];
	    	}
	    	return s;
	    }
	    
	    public int CotCoTongLonNhat() {
	    	int index_max = 0, max;
	    	max = TongMotCot(0);
	    	
	    	for (int i = 1; i < arr[0].length; i++) {
	    		int t = TongMotCot(i);
	    		if(t > max) {
	    			max = t;
	    			index_max = i;
	    		}
	    	}
	    	return index_max;
	    }
	    
	    public int[][] ThemVaoDauDong() {
	    	Scanner scan = new Scanner(System.in);
	    	int[][] tempArr = new int [this.arr.length + 1][this.arr[0].length];
	    	for(int i = tempArr.length - 1; i > 0; i--)
	    		for(int j = 0; j < tempArr[0].length; j++)
	    			tempArr[i][j] = arr[i-1][j];

	    	for(int j = 0; j < tempArr[0].length;j++) {
	    		System.out.print("a[0]["+j+"] = ");
	            tempArr[0][j] = scan.nextInt();
	            }
	       
	        return tempArr;
	    }
	    
	    public int[][] ThemVaoCuoiDong() {
	    	Scanner scan = new Scanner(System.in);
	    	int[][] tempArr = new int [this.arr.length + 1][this.arr[0].length];
	    	for(int i = 0; i < arr.length; i++)
	    		for(int j = 0; j < arr[0].length; j++)
	    			tempArr[i][j] = arr[i][j];

	    	for(int j = 0; j < tempArr[0].length;j++) {
	    		System.out.print("a["+(tempArr.length - 1)+"]["+j+"] = ");
	            tempArr[tempArr.length - 1][j] = scan.nextInt();
	            }
	       
	        return tempArr;
	    }
	    
	    public int[][] ThemVaoDongK(int k) {
	    	Scanner scan = new Scanner(System.in);
	    	int[][] tempArr = new int [this.arr.length + 1][this.arr[0].length];
	    	
	    	for(int i = 0; i < arr.length; i++) {
	    		for(int j = 0; j < arr[0].length; j++)
	    			tempArr[i][j] = this.arr[i][j];
	    	}
	    	
	        for (int i = this.arr.length; i > k; i--) {
	        		for(int j = 0; j < tempArr[0].length; j++)
	        			tempArr[i][j] = tempArr[i - 1][j];
	        	}
	        
	        for(int j = 0; j < tempArr[0].length; j++) {
	        	System.out.print("a["+k+"]["+j+"] = ");
	            tempArr[k][j] = scan.nextInt();
	        }
	                
	        return tempArr;
	    }
	    
	    public int[][] XoaDongK(int k) {
	        if (this.arr == null || k < 0 || k >= this.arr.length)
	            System.out.println("Dong muon xoa khong hop le!");

	        int tmpArray[][]= new int [arr.length-1][arr[0].length];
	        int p = 0;
	        for( int i = 0; i < arr.length; ++i) {
	            if ( i == k)
	                continue;
	            int q = 0;
	            for( int j = 0; j < arr[0].length; ++j) {
	            	tmpArray[p][q] = arr[i][j];
	                ++q;
	            }
	            ++p;
	        }
	        return tmpArray;
	    }
	    
	    public int[][] XoaCotK(int k) {
	        if (this.arr == null || k < 0 || k >= this.arr[0].length)
	            System.out.println("Cot muon xoa khong hop le!");

	        int tmpArray[][]= new int [arr.length][arr[0].length - 1];
	        int p = 0;
	        for( int i = 0; i < arr.length; ++i) {
	            int q = 0;
	            for( int j = 0; j < arr[0].length; ++j) {
	            	if(j == k)
	            		continue;
	            	tmpArray[p][q] = arr[i][j];
	                ++q;
	            }
	            ++p;
	        }
	        return tmpArray;
	    }
	    
	    public static MangHaiChieu parseMangHaiChieu(String str) {
	        MangHaiChieu mhc = new MangHaiChieu();
	        String[] n_row = str.split("/");
	        String[] n_col = n_row[0].split(" ");	        
	        mhc.arr = new int[n_row.length][n_col.length];
	        
	        for(int i = 0; i < mhc.arr.length; i++) {
	        	String[] col = n_row[i].split(" ");
		        for(int j = 0; j < mhc.arr[0].length; j++) 
		        	mhc.arr[i][j] = Integer.parseInt(col[j].trim());
	        }
	        return mhc;
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
