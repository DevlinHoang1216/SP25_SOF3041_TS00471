package fpt.lab.Bai2;

import java.util.ArrayList;
import java.util.List;

public class SachService {

    public List<Sach> sachList = new ArrayList<Sach>();

    public String suaSach(Sach sach) throws IllegalAccessException {

        if (sach == null || sachList.isEmpty()){
            throw new IllegalAccessException("Sách không được để trống");
        }
        if (sach.getNamXuatBan() < 0 || sach.getNamXuatBan() > 2025){
            throw new IllegalAccessException("Nam xuat ban khong ton tai");
        }
        if (sach.getGia()<0 || sach.getGia() > 5000.0f){
            throw new IllegalAccessException("Gia tien Khong hơp le");
        }

        sachList.add(sach);
        return "Sửa thành công";
    }


}
