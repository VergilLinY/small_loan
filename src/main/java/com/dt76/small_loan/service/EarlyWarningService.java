package com.dt76.small_loan.service;

import com.dt76.small_loan.pojo.EWQualification;
import com.dt76.small_loan.pojo.EarlyWarningInfo;

import java.util.List;

public interface EarlyWarningService {

    List<EarlyWarningInfo> getPageList(int currentPage, int pageSize, EWQualification label);

    EarlyWarningInfo getById(String alertId);

    Integer getCount(EWQualification q);

    Integer addNew(EarlyWarningInfo info);

    Integer modifyInfo(EarlyWarningInfo info);
}
