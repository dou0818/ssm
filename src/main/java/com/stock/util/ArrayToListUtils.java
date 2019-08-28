package com.stock.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 将数组转化为需要的list<map>
 */
public class ArrayToListUtils {
    /**
     * 销售层数组转化成list
     *
     * @param commodityids
     * @param merchantids
     * @param nums
     * @return
     */
    public static List<Map<String, Object>> saleList(int[] commodityids, int[] merchantids, int[] nums) {
        List<Map<String, Object>> saleList = new ArrayList<>();
        for (int i = 0; i < commodityids.length; i++) {
            Map<String, Object> saleMap = new HashMap<>();
            saleMap.put("commodityid", commodityids[i]);
            saleMap.put("merchantid", merchantids[i]);
            saleMap.put("num", nums[i]);
            saleList.add(saleMap);
        }
        return saleList;
    }

    /**
     * 仓库层
     *
     * @param commodityids
     * @param merchantids
     * @param nums
     * @param warehouseids
     * @return
     */
    public static List<Map<String, Object>> wareList(int[] commodityids, int[] merchantids, int[] nums, int[] warehouseids) {
        List<Map<String, Object>> wareList = new ArrayList<>();
        for (int i = 0; i < commodityids.length; i++) {
            Map<String, Object> wareMap = new HashMap<>();
            wareMap.put("commodityid", commodityids[i]);
            wareMap.put("merchantid", merchantids[i]);
            wareMap.put("num", nums[i]);
            wareMap.put("warehouseid", warehouseids[i]);
            wareList.add(wareMap);
        }
        return wareList;
    }

}
