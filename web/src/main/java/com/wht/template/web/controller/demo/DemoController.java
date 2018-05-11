package com.wht.template.web.controller.demo;

import com.wht.template.biz.service.rule.RuleFieldEntityService;
import com.wht.template.core.result.Response;
import com.wht.template.core.tkmybatis.Page;
import com.wht.template.dal.domain.rule.RuleFieldEntity;
import com.wht.template.web.controller.commom.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;


/**
 * TODO demo 可删
 */
@Controller
@RequestMapping("demo")
public class DemoController extends BaseController {
    private final static Logger logger = LoggerFactory.getLogger(DemoController.class);


    @Resource(name="ruleFieldEntityService")
    private RuleFieldEntityService ruleFieldEntityService;

    @Autowired
    private static final String NS = "test";
    private static final String DS = "qiye";


    /**
     * selectEntity
     *
     * @return
     */
    @RequestMapping("selectEntity")
    @ResponseBody
    public Response<RuleFieldEntity> selectEntity() throws Exception{
        String key = "incr_test_key";
        // 或则写在service层用mapper操作
        RuleFieldEntity query = new RuleFieldEntity();
        query.setId(1L);
        List<RuleFieldEntity> list = ruleFieldEntityService.selectEntity(query);
        return Response.success(list.get(0));
    }


    /**
     * selectEntity
     *
     * @return
     */
    @RequestMapping("selectByExample")
    @ResponseBody
    public Response<RuleFieldEntity> selectByExample() {
        // 或则写在service层用mapper操作
        Example example =  new Example(RuleFieldEntity.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name","99b3bed9-3194-11e8-a5dd-fa7270c77500");
        List<RuleFieldEntity> list = ruleFieldEntityService.selectByExample(example);
        return Response.success(list.get(0));
    }


    /**
     * selectEntity
     *
     * @return
     */
    @RequestMapping("selectPageByObject")
    @ResponseBody
    public Response<Page<RuleFieldEntity>> selectPageByObject(@RequestParam(required = false, defaultValue = "1") Integer current,
                                                              @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        // 或则写在service层用mapper操作
        Page<RuleFieldEntity> page = ruleFieldEntityService.selectPageByObject(new RuleFieldEntity(), current, pageSize, "");
        return Response.success(page);
    }



}

    