package me.xueyao.cxf.service;

import javax.jws.WebMethod;

/**
 * @author XueYao
 * @date 2017-11-06
 */
public interface MobileAddressService {

    @WebMethod
     String getAddressByMobileNo(String mobileNo);
}
