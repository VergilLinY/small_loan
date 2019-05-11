package com.dt76.small_loan.service;

import com.dt76.small_loan.pojo.SettlementQualification;
import com.dt76.small_loan.utils.PageResult;

public interface SettlementService {

    PageResult getPageList(Integer page, Integer size, SettlementQualification q);

}
