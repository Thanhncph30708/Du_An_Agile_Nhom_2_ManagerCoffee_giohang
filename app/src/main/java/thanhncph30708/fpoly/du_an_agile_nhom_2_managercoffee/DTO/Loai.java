package thanhncph30708.fpoly.du_an_agile_nhom_2_managercoffee.DTO;

public class Loai {
    private int maLoai;
    private String tenLoai;
    private String anh;

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Loai(int maLoai, String tenLoai, String anh) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.anh = anh;
    }

    public Loai() {
    }
}
