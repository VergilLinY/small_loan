package com.dt76.small_loan.service.impl;

import com.dt76.small_loan.mapper.SettlementMapper;
import com.dt76.small_loan.pojo.SettlementInfo;
import com.dt76.small_loan.pojo.SettlementQualification;
import com.dt76.small_loan.service.SettlementService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("settlementService")
public class SettlementServiceImpl implements SettlementService {

    private final SettlementMapper settlementMapper;

    public SettlementServiceImpl(SettlementMapper settlementMapper) {
        this.settlementMapper = settlementMapper;
    }


    @Override
    public List<SettlementInfo> getPageList(Integer page, Integer size, SettlementQualification q) {
        PageHelper.startPage(page, size);
        List<SettlementInfo> list = settlementMapper.getPageList(q);
        return list;
    }
}
