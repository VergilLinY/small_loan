package com.dt76.small_loan.controller;

import com.dt76.small_loan.pojo.SettlementCommitInfo;
import com.dt76.small_loan.pojo.SettlementQualification;
import com.dt76.small_loan.service.SettlementService;
import com.dt76.small_loan.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SettlementController {

    private final SettlementService settlementService;

    public SettlementController(SettlementService settlementService) {
        this.settlementService = settlementService;
    }

    @GetMapping("/loanSettlement")
    public String toSettlementManager() {
        return "pages/afterloan/laonSettlementManager";
    }

    @ResponseBody
    @PostMapping("/loanSettlement/list/{page}/{size}")
    public PageResult getPageAll(@RequestBody SettlementQualification q, @PathVariable Integer page, @PathVariable Integer size) {
        return settlementService.getPageList(page, size, q);
    }

    @ResponseBody
    @PostMapping("/loanSettlement/commit/{loanId}")
    public Integer getCommitInfo(@RequestBody SettlementCommitInfo q, @PathVariable Integer loanId) {
        return settlementService.modifyCommit(loanId, q);
    }


}
