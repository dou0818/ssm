package com.stock.mapper;

import com.stock.domain.Warehouse;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface WarehouseMapper extends Mapper<Warehouse> {
    /**
     * 用户退货后进行的操作,锁定+2，出库-2
     *
     * @param salesList
     * @return boolean
     */
    boolean salesReturn(List<Map<String, Object>> salesList);

    /**
     * 进货入库，未发布库存增加
     *
     * @param list
     * @return
     */
    int updateWareHouse(@Param("list") List<Map<String, Object>> list);

    /**
     * 根据商品id和商家id修改发布与未发布库存数量
     * @param list
     * @return
     */
    public int updateInventorynumByWarehouse(List<Map<String,Object>> list);

    /**
     * 查询所有商家所有商品库存
     * @return
     */
    List<Map<String,Object>> stockSearch();


}