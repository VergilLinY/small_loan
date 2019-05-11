package com.dt76.small_loan.controller;


import com.dt76.small_loan.pojo.EWQualification;
import com.dt76.small_loan.pojo.EarlyWarningInfo;
import com.dt76.small_loan.service.EarlyWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class EarlyWarningController {

    private final EarlyWarningService earlyWarningService;

    public EarlyWarningController(EarlyWarningService earlyWarningService) {
        this.earlyWarningService = earlyWarningService;
    }

    @GetMapping("/earlyWarning")
    public String jumpToEarlyManager() {
        return "/pages/afterloan/earlyWarningManager";
    }

    @GetMapping("/earlyWarning/add")
    public String jumpToEarlyAdd() {
        return "/pages/afterloan/earlyWarningAdd";
    }

    @GetMapping("/earlyWarning/edit/{alertId}")
    public String jumpToEarlyEdit(@PathVariable String alertId) {
        System.out.println(alertId);
        return "/pages/afterloan/earlyWarningEdit";
    }

    @GetMapping("/earlyWarning/check/{alertId}")
    public String jumpToEarlyCheck(@PathVariable String alertId) {
        System.out.println(alertId);
        return "/pages/afterloan/earlyWarningCheck";
    }

    //获取分页的预警信息
    @PostMapping("/earlyWarning/list/{currentPage}/{pageSize}")
    @ResponseBody
    public Map<String,Object> getPageEWList(@RequestBody EWQualification q, @PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        Map<String, Object> map = new HashMap<>();
        List<EarlyWarningInfo> lists = earlyWarningService.getPageList(currentPage, pageSize, q);
        map.put("list",lists);
        map.put("total",earlyWarningService.getCount(q));
        return map;
    }

    @GetMapping("/earlyWarning/getId/{id}")
    @ResponseBody
    public Map<String, Object> getById(@PathVariable String id){
        Map<String,Object> map = new HashMap<>();
        map.put("ew",earlyWarningService.getById(id));
        return map;
    }

    @PostMapping("/earlyWarning/add")
    @ResponseBody
    public Map<String, Object> addEW(@RequestBody EarlyWarningInfo form){
        Map<String,Object> map = new HashMap<>();
        Integer res = earlyWarningService.addNew(form);
        map.put("res",res);
        return map;
    }

}
