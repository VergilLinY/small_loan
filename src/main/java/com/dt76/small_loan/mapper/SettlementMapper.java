package com.dt76.small_loan.mapper;

import com.dt76.small_loan.pojo.SettlementInfo;
import com.dt76.small_loan.pojo.SettlementQualification;

import java.util.List;

public interface SettlementMapper {

    List<SettlementInfo> getPageList(SettlementQualification qualification);

}
