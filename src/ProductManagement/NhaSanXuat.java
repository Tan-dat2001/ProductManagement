package ProductManagement;

public class NhaSanXuat {
    private String tenNSX;
    private String diachi;
    private String dienthoai;

    public NhaSanXuat(String tenNSX, String diachi, String dienthoai) {
        this.tenNSX = tenNSX;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }


}
