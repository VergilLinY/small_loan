package com.dt76.small_loan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class PrepaymentController {

    @GetMapping("/prepaymentManager")
    public String jumpToRepayment() {
        return "/pages/afterloan/prepaymentManager";
    }

    @GetMapping("/prepayment/view/{loanId}")
    public String getRepaymentView(@PathVariable String loanId){
        return "pages/afterloan/prepaymentView";
    }

    @GetMapping("/prepayment/check/{loanId}")
    public String getRepaymentCheck(@PathVariable String loanId){
        return "pages/afterloan/prepaymentCheck";
    }
}
