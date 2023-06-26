package sherry.project114.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sherry.project114.model.hosp.HospitalSet;
import sherry.project114.service.HospitalSetService;

import java.util.List;

/**
 * @Description:
 * @Author: SHERRY
 * @email: <a href="mailto:SherryTh743779@gmail.com">TianHai</a>
 * @Date: 2023/6/26 18:30
 */
//医院设置接口
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;
    //查询所有医院设置
    @GetMapping("findAll")
    public List<HospitalSet> findAll() {
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }
}