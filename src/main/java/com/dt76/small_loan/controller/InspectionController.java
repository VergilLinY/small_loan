package com.dt76.small_loan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class InspectionController {

    @GetMapping("/inspectionManager")
    public String jumpToInspection() {
        return "/pages/afterloan/inspectionManager";
    }

    @GetMapping("/inspection/view/{loanId}")
    public String getRepaymentView(@PathVariable String loanId){
        return "pages/afterloan/prepaymentView";
    }

    @GetMapping("/inspection/check/{loanId}")
    public String getRepaymentCheck(@PathVariable String loanId){
        return "pages/afterloan/prepaymentCheck";
    }

    @GetMapping("/inspection/add")
    public String toInspectionAdd(){
        return "pages/afterloan/inspectionAdd";
    }

    @GetMapping("/inspection/check")
    public String toInspectionCheck(){
        return "pages/afterloan/inspectionCheck";
    }
}
