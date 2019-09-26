package com.stock.service;

import com.stock.domain.Saletable;
import java.util.Map;
import java.util.List;
public interface SaletableService{

 /**
     * �̼��¼��޸���Ʒ���¼�����Ϊ�¼�
     * @param skuIds ���¼���������
     * @return
     */
    public int updatesoldOutById(int skuIds[]);

    /**
     * ��ѯ�����ϼ���Ʒ����Ϊ1��������ʾ��ҳ��,��Ϣ������Ʒ����
     * @param skuIds
     * @return
     */
    public List<Map<String,Object>> selectBysoldOut1(int skuIds[]);

 List<Saletable> selSaleByMerchantId(int merchantId);







    /**
     * ������������-�������ۿ��+
     * @param payorder
     * @return
     */
    int payment(List<Map<String,Object>> payorder);

/**
     * ȡ������ �����ۿ��-�������ۿ��+
     * @param cancel
     * @return
     */
    int cancelOrder(List<Map<String,Object>> cancel);

    int addSale(Saletable saletable);

}
