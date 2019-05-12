package com.dt76.small_loan.mapper;

import com.dt76.small_loan.pojo.EWQualification;
import com.dt76.small_loan.pojo.EarlyWarningInfo;

import java.util.List;

public interface EarlyWarningMapper {

    EarlyWarningInfo getById(String alertId);

    List<EarlyWarningInfo> getPageList(EWQualification label);

    Integer getCount(EWQualification label);

    Integer addNew(EarlyWarningInfo info);

    Integer modify(EarlyWarningInfo info);
}
