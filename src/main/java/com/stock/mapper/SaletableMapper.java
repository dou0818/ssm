package com.stock.mapper;

import com.stock.domain.Saletable;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface SaletableMapper extends Mapper<Saletable> {
    /**
     * 商家下架修改商品上下架属性为下架
     * @param skuIds 商品id数组
     * @return
     */
    public int updatesoldOutById(int skuIds[]);

    /**
     * 根据商品id数组查询
     * @param skuIds 商品id数组
     * @return
     */
    public List<Saletable> selectByskuIds(int skuIds[]);

    /**
     * 根据商品id删除数据
     * @param skuIds
     * @return
     */
    public int deleteByskuId(int skuIds[]);

    /**
     * 查询所有上架商品属性为1的数据
     * @param skuIds
     * @return
     */
    public List<Map<String,Object>> selectBysoldOut1(int skuIds[]);
}