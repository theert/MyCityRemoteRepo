package com.mycity.merchant.service;

import org.springframework.stereotype.Service;

import com.mycity.shared.merchant.dto.MerchantRegRequest;

@Service
public interface MerchantServiceInterface {

	String registerMerchant(MerchantRegRequest request);

}
