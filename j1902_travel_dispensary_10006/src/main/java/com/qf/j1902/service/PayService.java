package com.qf.j1902.service;

import com.alipay.api.AlipayApiException;
import com.qf.j1902.alipay.AlipayBean;


/**
 * 支付服务
 * @author Louis
 * @date Dec 12, 2018
 */
public interface PayService {

	/**
	 * 支付宝支付接口
	 * @param alipayBean
	 * @return
	 * @throws AlipayApiException
	 */
	String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
