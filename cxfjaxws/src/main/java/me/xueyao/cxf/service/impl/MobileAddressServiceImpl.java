package me.xueyao.cxf.service.impl;

import me.xueyao.cxf.service.MobileAddressService;

/**
 * SEI的实现：服务端用来接收数据和处理数据对象
 * @author XueYao
 * @date 2017-11-06
 */
public class MobileAddressServiceImpl implements MobileAddressService {
    @Override
    public String getAddressByMobileNo(String mobileNo) {
        //根据手机号码查询服务端自己数据
        return  mobileNo + "的归属地是上海";
    }
}
