package com.dt76.small_loan.service;

import com.dt76.small_loan.pojo.SettlementInfo;
import com.dt76.small_loan.pojo.SettlementQualification;

import java.util.List;

public interface SettlementService {

    List<SettlementInfo> getPageList(Integer page, Integer size, SettlementQualification q);
}
