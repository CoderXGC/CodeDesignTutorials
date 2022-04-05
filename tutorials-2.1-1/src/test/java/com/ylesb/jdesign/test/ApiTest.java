package com.ylesb.jdesign.test;

import com.ylesb.jdesign.IVideoUserService;
import com.ylesb.jdesign.impl.GuestVideoUserService;
import com.ylesb.jdesign.impl.OrdinaryVideoUserService;
import com.ylesb.jdesign.impl.VipVideoUserService;

public class ApiTest {

    public static void main(String[] args) {
        IVideoUserService guest1 = new GuestVideoUserService();
        guest1.advertisement();
        guest1.definition();
        // 其他两个，自己补充
        IVideoUserService guest2 = new OrdinaryVideoUserService();
        guest2.advertisement();
        guest2.definition();
        IVideoUserService guest3 = new VipVideoUserService();
        guest3.advertisement();
        guest3.definition();
    }

}
