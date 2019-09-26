package com.stock.mapper;

import com.stock.domain.Saletable;
import com.stock.domain.SoldoutRecord;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;
public interface SaletableMapper extends Mapper<Saletable> {
    /**
     * �̼��¼��޸���Ʒ���¼�����Ϊ�¼�
     *
     * @param skuIds ��Ʒid����
     * @return
     */
    public int updatesoldOutById(int skuIds[]);

    /**
     * ������Ʒid�����ѯ
     *
     * @param skuIds ��Ʒid����
     * @return
     */
    public List<Saletable> selectByskuIds(int skuIds[]);

    /**
     * ������Ʒidɾ������
     *
     * @param skuIds
     * @return
     */
    public int deleteByskuId(int skuIds[]);

    /**
     * ��ѯ�����ϼ���Ʒ����Ϊ1������
     *
     * @param skuIds
     * @return
     */
    public List<Map<String, Object>> selectBysoldOut1(int skuIds[]);

    int payment(List<Map<String, Object>> payorder);


    int cancelOrder(List<Map<String, Object>> cancel);
}
