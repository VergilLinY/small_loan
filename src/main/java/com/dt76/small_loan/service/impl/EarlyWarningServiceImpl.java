package com.dt76.small_loan.service.impl;

import com.dt76.small_loan.mapper.EarlyWarningMapper;
import com.dt76.small_loan.pojo.EWQualification;
import com.dt76.small_loan.pojo.EarlyWarningInfo;
import com.dt76.small_loan.service.EarlyWarningService;
import com.dt76.small_loan.utils.IdWorker;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EarlyWarningService")
public class EarlyWarningServiceImpl implements EarlyWarningService {

    private final IdWorker idWorker;
    private final EarlyWarningMapper earlyWarningMapper;

    public EarlyWarningServiceImpl(EarlyWarningMapper earlyWarningMapper, IdWorker idWorker) {
        this.earlyWarningMapper = earlyWarningMapper;
        this.idWorker = idWorker;
    }

    @Override
    public List<EarlyWarningInfo> getPageList(int currentPage, int pageSize, EWQualification label) {
        PageHelper.startPage(currentPage,pageSize);
        List<EarlyWarningInfo> elist = earlyWarningMapper.getPageList(label);
        return elist;
    }

    @Override
    public EarlyWarningInfo getById(String alertId) {
        return earlyWarningMapper.getById(alertId);
    }

    @Override
    public Integer getCount(EWQualification q) {
        return earlyWarningMapper.getCount(q);
    }

    @Override
    public Integer addNew(EarlyWarningInfo info) {
        info.setAlertId(Long.toString(idWorker.nextId()));
        System.out.println(info);
        return earlyWarningMapper.addNew(info);
    }


}
