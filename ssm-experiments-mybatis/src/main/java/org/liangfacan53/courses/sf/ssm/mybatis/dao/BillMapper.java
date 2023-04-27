package org.liangfacan53.courses.sf.ssm.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.liangfacan53.courses.sf.ssm.mybatis.pojo.Bill;

import java.util.List;

public interface BillMapper {
    List<Bill> getBills(@Param("productName") String productName, @Param("providerId") Integer providerId, @Param("isPayment") Integer isPayment);

    List<Bill> getBillsByProviderIds(@Param("proIds") Integer[] proIds);

}

