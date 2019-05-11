package com.dt76.small_loan.controller;


import com.dt76.small_loan.pojo.RepaymentInfo;
import com.dt76.small_loan.service.RepaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

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
    @GetMapping("/tryAxios")
    public Map<String, Object> axios(){
        Map<String, Object> map = new HashMap<>();
        List<RepaymentInfo> infos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            infos.add(new RepaymentInfo("100001","老朱","2018101501520005",new Date(),500000,480000,480000,12,"个人信用",1,new Date(),1,1));
        }
        map.put("repaymentInfo",infos);
        map.put("user","good");
        return map;
    }

    @GetMapping("/tryAxios/view/{loanId}")
    public String getRepaymentView(@PathVariable String loanId){
        return "pages/afterloan/repaymentView";
    }

    @GetMapping("/repayment/check/{loanId}")
    public String getRepaymentCheck(@PathVariable String loanId){
        return "pages/afterloan/repaymentCheck";
    }
}
