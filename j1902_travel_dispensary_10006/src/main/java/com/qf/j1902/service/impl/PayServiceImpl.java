package com.qf.j1902.service.impl;

import com.qf.j1902.alipay.Alipay;
import com.qf.j1902.alipay.AlipayBean;
import com.qf.j1902.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;


@Service
public class PayServiceImpl implements PayService {

	@Autowired
	private Alipay alipay;
	
	@Override
	public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
		return alipay.pay(alipayBean);
	}

}
