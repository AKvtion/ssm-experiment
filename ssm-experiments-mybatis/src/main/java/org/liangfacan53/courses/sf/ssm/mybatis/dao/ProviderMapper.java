package org.liangfacan53.courses.sf.ssm.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.liangfacan53.courses.sf.ssm.mybatis.pojo.Provider;

import java.util.List;

public interface ProviderMapper {
    int count();

    List<Provider> getProviders(@Param("proCode") String proCode, @Param("proName") String proName);

    int add(Provider provider);

    int update(Provider provider);

    int deleteById(@Param("id") Integer id);

}
