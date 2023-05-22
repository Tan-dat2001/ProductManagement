package ProductManagement;

public abstract class MatHang {
    private String tenMatHang;
    private float giaNhap;
    NhaSanXuat nhaSanXuat;

    public MatHang(String tenMatHang, float giaNhap, NhaSanXuat nhaSanXuat) {
        this.tenMatHang = tenMatHang;
        this.giaNhap = giaNhap;
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public NhaSanXuat getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public abstract double price();


//    public abstract String listProduct();
}
