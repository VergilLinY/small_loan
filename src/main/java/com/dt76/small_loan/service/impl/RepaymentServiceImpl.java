package com.dt76.small_loan.service.impl;

import com.dt76.small_loan.mapper.RepaymentMapper;
import com.dt76.small_loan.pojo.CommonLoanInfo;
import com.dt76.small_loan.pojo.RepaymentInfo;
import com.dt76.small_loan.pojo.RepaymentQualification;
import com.dt76.small_loan.pojo.SettlementInfo;
import com.dt76.small_loan.service.RepaymentService;
import com.dt76.small_loan.utils.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("RepaymentService")
public class RepaymentServiceImpl implements RepaymentService {

    private final RepaymentMapper repaymentMapper;

    public RepaymentServiceImpl(RepaymentMapper repaymentMapper) {
        this.repaymentMapper = repaymentMapper;
    }

    @Override
    public PageResult qryAll(Integer cuPage, Integer size, RepaymentQualification q) {
        Page page =  PageHelper.startPage(cuPage, size);
        List<CommonLoanInfo> list = repaymentMapper.getPageList(q);
        PageInfo info = new PageInfo<>(page.getResult());
        return new PageResult(info.getTotal(), list);
    }
}
