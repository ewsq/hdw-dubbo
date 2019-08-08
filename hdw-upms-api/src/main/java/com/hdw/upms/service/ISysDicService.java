package com.hdw.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdw.common.result.SelectTreeNode;
import com.hdw.upms.entity.SysDic;

import java.util.List;
import java.util.Map;

/**
 * 数据字典表
 *
 * @author TuMinglong
 * @date 2018-12-11 11:35:15
 */
public interface ISysDicService extends IService<SysDic> {

    /**
     * 获取变量树表
     *
     * @param par
     * @return
     */
    List<Map<String, Object>> selectTreeGrid(Map<String, Object> par);

    /**
     * 自定义查询
     *
     * @param params
     * @return
     */
    List<SysDic> selectDicList(Map<String, Object> params);

    /**
     * 根据父ID获取变量
     *
     * @param par
     * @return
     */
    List<Map<String, Object>> selectTreeByParentId(Map<String, Object> par);


}

