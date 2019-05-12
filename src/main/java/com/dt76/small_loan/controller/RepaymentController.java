package com.dt76.small_loan.controller;


import com.dt76.small_loan.pojo.RepaymentQualification;
import com.dt76.small_loan.service.RepaymentService;
import com.dt76.small_loan.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RepaymentController {

    private final RepaymentService repaymentService;

    public RepaymentController(RepaymentService repaymentService) {
        this.repaymentService = repaymentService;
    }

    @GetMapping("/repaymentManager")
    public String jumpToRepayment() {
        return "/pages/afterloan/repaymentManager";
    }

    @ResponseBody
    @PostMapping("/repayment/list/{page}/{size}")
    public PageResult getPageList(@RequestBody RepaymentQualification q, @PathVariable Integer page, @PathVariable Integer size){
        System.out.println(q);
        return repaymentService.qryAll(page, size, q);
    }


}
