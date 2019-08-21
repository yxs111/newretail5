package com.feri.shop.test;

import com.feri.shop.newretail.common.util.EncryptionUtil;
import org.junit.Test;


public class Pass_AES {
    @Test
    public void test1(){
        //生成秘钥
        String key= EncryptionUtil.createAESKEY();
        System.out.println("秘钥："+key);
        //实现加密
        String str="123456";
        String mw=EncryptionUtil.AESEnc(key,str);
        System.out.println("密文:"+mw);
        System.out.println("明文："+EncryptionUtil.AESDec(key,mw));
    }
}
