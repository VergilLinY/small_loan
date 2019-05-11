package com.dt76.small_loan.controller;

import com.dt76.small_loan.pojo.SettlementInfo;
import com.dt76.small_loan.pojo.SettlementQualification;
import com.dt76.small_loan.service.SettlementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SettlementController {

    private final SettlementService settlementService;

    public SettlementController(SettlementService settlementService) {
        this.settlementService = settlementService;
    }

    @GetMapping("/loanSettlement")
    public String toSettlementManager(){
        return "pages/afterloan/laonSettlementManager";
    }

    @ResponseBody
    @PostMapping("/loanSettlement/list/{page}/{size}")
    public Map<String, Object> getPageAll(@RequestBody SettlementQualification q, @PathVariable Integer page, @PathVariable Integer size){
        Map<String, Object> map = new HashMap<>();
        map.put("list",settlementService.getPageList(page, size, q));
        return map;
    }
}