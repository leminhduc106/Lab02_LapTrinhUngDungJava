package Exercise01;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Exercise01
 * Created by lmduc
 * Date 14/10/2021 - 22:20
 * Description: ...
 */
public class MangMotChieu {
    private int[] arr;

    /**
     * Default constructor
     */
    public MangMotChieu() {
        this.arr = null;
    }

    /**
     * Constructor with parameters
     *
     * @param arr
     */
    public MangMotChieu(int... arr) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    /**
     * Copy Constructor
     *
     * @param msn
     */
    public MangMotChieu(MangMotChieu msn) {
        this.arr = new int[msn.arr.length];
        for (int i = 0; i < msn.arr.length; i++) {
            this.arr[i] = msn.arr[i];
        }
    }

    /**
     * Getter
     *
     * @return arr
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * Get value at index
     *
     * @param index
     * @return value
     */
    public Integer get(int index) {
        Integer value = null;
        if (index >= 0 && index < this.arr.length)
            value = this.arr[index];
        return value;
    }

    /**
     * Setter
     *
     * @param arr
     */
    public void setArr(int... arr) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    /**
     * Setter with index and value
     *
     * @param index
     * @param value
     */
    public void set(int index, int value) {
        if (index >= 0 && index < this.arr.length) {
            this.arr[index] = value;
        }
    }

    public void NhapMang() {
        int n_element;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(scan.nextLine());
        arr = new int[n]; //a.Length = n
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = Integer.parseInt(scan.nextLine());
        }
    }

    public void XuatMang() {
        for (int pt : arr) {
            System.out.print(pt + " ");
        }
        System.out.println("\n");
    }

    public void SapXepTangDan() {
        Arrays.sort(arr);
    }

    public void SapXepGiamDan() {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //Tính tổng các phần tử trong mảng
    public int Tong() {
        int S = 0;
        for (int pt : arr)
            S += pt;
        return S;
    }

    //Tính tổng 2 mảng một chiều
    public int Tong(MangMotChieu msn){
        int s1 = this.Tong();
        int s2 = msn.Tong();
        int kq = s1 + s2;
        return kq;
    }

    //Tính tích các phần tử trong mảng
    public long Tich() {
        int P = 1;
        for (int pt : arr)
            P *= pt;
        return P;
    }

    //Tính tích 2 mảng một chiều
    public long Tich(MangMotChieu msn) {
        long p1 = this.Tich();
        long p2 = msn.Tich();
        long kq = p1 * p2;
        return kq;
    }

    public int SoNguyenLonNhat() {
        SapXepTangDan();
        return this.arr[arr.length - 1];
    }

    public boolean KiemTraToanDuong() {
        boolean flag = true;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] < 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean KiemTraToanAm() {
        boolean flag = true;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] > 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public int SoNguyenDuongNhoNhat() {
        int min = -1;
        if (KiemTraToanAm() == true)
            throw new ArithmeticException("Khong tim thay so nguyen duong nho nhat do mang toan so am!");

        for (int i = 0; i < arr.length; i++) {
            if ((min == -1 || min > arr[i]) && arr[i] > 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public int SoNguyenAmLonNhat() {
        int max = -1;
        SapXepGiamDan();
        if (KiemTraToanDuong() == true)
            throw new ArithmeticException("Khong tim thay so nguyen am lon nhat do mang toan so duong!");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                max = arr[i];
                break;
            }
        }
        return max;
    }

    //Thêm 1 phần tử vào đầu mảng
    public int[] ChenDauMang(int val) {
        int arrIndex = this.arr.length - 1;
        int[] tempArr = new int [this.arr.length + 1];
        boolean inserted = false;

        for (int i = this.arr.length; i >= 0; i--) {
            if (arrIndex > -1)
                tempArr[i] = this.arr[arrIndex--];
            else {
                if (!inserted) {
                    tempArr[i] = val;
                    inserted = true;
                } else tempArr[i] = this.arr[arrIndex--];
            }
        }
        return tempArr;
    }

    //Thêm 1 phần tử vào cuối mảng
    public int[] ChenCuoiMang(int val) {
        int[] tempArr = new int [this.arr.length + 1];
        for(int i = 0; i < tempArr.length - 1; i++)
            tempArr[i] = this.arr[i];
        tempArr[tempArr.length - 1] = val;
        return tempArr;
    }

    //Thêm 1 phần tử vào vị trí thứ k
    public int[] ChenVaoViTriK(int k, int val) {
        int arrIndex = this.arr.length - 1;
        int[] tempArr = new int [this.arr.length + 1];
        boolean inserted = false;

        if(k == this.arr.length) tempArr = ChenCuoiMang(val);
        for (int i = this.arr.length; i >= 0; i--) {
            if (arrIndex >= k)
                tempArr[i] = this.arr[arrIndex--];
            else {
                if (!inserted) {
                    tempArr[i] = val;
                    inserted = true;
                } else tempArr[i] = this.arr[arrIndex--];
            }
        }
        return tempArr;
    }

    //Xoá phần tử tại vị trí k
    public int[] XoaTaiViTrik(int k) {
        if (this.arr == null || k < 0 || k >= this.arr.length)
            System.out.println("Vi tri muon xoa khong hop le!");

        int[] tmpArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < this.arr.length; i++) {
            if (i == k)
                continue;
            tmpArray[j++] = arr[i];
        }
        return tmpArray;
    }

    //Xoá các phần tử có giá trị x
    public int[] XoaCacPhanTuX(int x) {
        int index = 0;
        for (int i = 0; i < this.arr.length; i++)
            if (this.arr[i] != x)
                this.arr[index++] = this.arr[i];

        return Arrays.copyOf(this.arr, index);
    }

    //Cập nhật phần tử tại vị trí k
    public int[] CapNhatPhanTuTaiViTriK(int k, int val) {
        this.arr[k] = val;
        return this.arr;
    }

    //Cập nhật phần tử có giá trị x thành y (val)
    public int[] CapNhatPhanTuX(int x, int val) {
        boolean found = false;
        for (int i = 0; i < this.arr.length; i++) {
            if(this.arr[i] == x) {
                this.arr[i] = val;
                found = true;
            }
        }
        if(!found) System.out.println("Khong tim thay gia tri x trong mang!");
        return this.arr;
    }

    public static MangMotChieu parseMangMotChieu(String str) {
        MangMotChieu msn = new MangMotChieu();
        String[] s = str.split(" ");
        msn.arr = new int[s.length];
        for(int i = 0; i < s.length; i++)
            msn.arr[i] = Integer.parseInt(s[i].trim());

        return msn;
    }

    public static void XuatMang(int[] a) {
        for (int pt : a) {
            System.out.print(pt + " ");
        }
        System.out.println("\n");
    }

}

