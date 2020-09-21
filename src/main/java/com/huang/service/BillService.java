package com.huang.service;

import com.huang.pojo.Bill;
import com.huang.pojo.Provider;
import com.huang.tools.Page;

import java.util.List;
import java.util.Map;

public interface BillService {

    Page<Bill> findBillByPage(Map<String, Object> map);

    Integer delectBill(Integer id);

    Integer addBill(Bill bill);

    Integer updateBill(Bill bill);

    Bill findBillByid(Integer id);

    List<Provider> showProviderinfo();
}
