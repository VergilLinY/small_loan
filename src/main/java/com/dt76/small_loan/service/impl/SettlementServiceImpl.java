package com.dt76.small_loan.service.impl;

import com.dt76.small_loan.mapper.SettlementMapper;
import com.dt76.small_loan.pojo.SettlementCommitInfo;
import com.dt76.small_loan.pojo.SettlementInfo;
import com.dt76.small_loan.pojo.SettlementQualification;
import com.dt76.small_loan.service.SettlementService;
import com.dt76.small_loan.utils.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("settlementService")
public class SettlementServiceImpl implements SettlementService {

    private final SettlementMapper settlementMapper;

    public SettlementServiceImpl(SettlementMapper settlementMapper) {
        this.settlementMapper = settlementMapper;
    }


    @Override
    public PageResult<SettlementInfo> getPageList(Integer page, Integer size, SettlementQualification q) {
        Page page1 =  PageHelper.startPage(page, size);
        List<SettlementInfo> list = settlementMapper.getPageList(q);
        PageInfo info = new PageInfo<>(page1.getResult());
        return new PageResult<>(info.getTotal(),list);
    }

    @Override
    public Integer modifyCommit(Integer loanId, SettlementCommitInfo q) {
        q.setLoanId(loanId);
        return settlementMapper.modifyCommit(q);
    }
}
