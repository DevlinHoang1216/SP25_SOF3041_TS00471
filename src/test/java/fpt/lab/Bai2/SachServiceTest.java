package fpt.lab.Bai2;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SachServiceTest {

    SachService sachService = new SachService();

    @Test
    public void testSach_Sua() throws IllegalAccessException {
        Sach sach = new Sach("1","HarryPorter","Phan",2015,3000.0f);
        String exp = "Sửa thành công";
        String act = sachService.suaSach(sach);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void testSach_SuaEX() throws IllegalAccessException {
        Sach sach = new Sach("null","null","null",2000,30000.0f);
       Assert.assertThrows(
               IllegalAccessException.class,() ->sachService.suaSach(sach)
       );
    }


    @Test
    public void testSach_Sua_PhanVungTuongDuong_NamXuatBan() throws IllegalAccessException {
        Sach sach = new Sach("2","Ky uc buon","Nam",1999,3000.0f);
        sachService.suaSach(sach);
    }
    @Test
    public void testSach_Sua_PhanVungTuongDuong_NamXuatBanEX1() throws IllegalAccessException {
        Sach sach1 = new Sach("2","Ky uc buon","Nam",-99,3000.0f);
     Assert.assertThrows(
             IllegalAccessException.class,() ->sachService.suaSach(sach1)
     );
    }

    @Test
    public void testSach_Sua_PhanVungTuongDuong_NamXuatBanEX2() throws IllegalAccessException {
        Sach sach2 = new Sach("2","Ky uc buon","Nam",3000,3000.0f);
        Assert.assertThrows(
                IllegalAccessException.class,() ->sachService.suaSach(sach2)
        );
    }



}