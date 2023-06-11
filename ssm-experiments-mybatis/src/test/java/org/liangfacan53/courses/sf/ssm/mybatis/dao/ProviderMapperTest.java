package org.liangfacan53.courses.sf.ssm.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.liangfacan53.courses.sf.ssm.mybatis.pojo.Provider;
import org.liangfacan53.courses.sf.ssm.mybatis.utils.MyBatisUtils;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProviderMapperTest {

    @Test
    void count() {
        try (SqlSession sqlSession = MyBatisUtils.openSession()) {
            int count = sqlSession.getMapper(ProviderMapper.class).count();
            assertThat(count, is(equalTo(15)));
        }
    }

    @Test
    void getProviders() {
        try (SqlSession sqlSession = MyBatisUtils.openSession()) {
            String proCode = "BJ";
            List<Provider> providerList = sqlSession.getMapper(ProviderMapper.class).getProviders(proCode, null);
            assertThat(providerList.size(), is(equalTo(4)));
            providerList.forEach(System.out::println);
        }
    }

    @Test
    void update() {
        try (SqlSession sqlSession = MyBatisUtils.openSession()) {
            Provider provider = new Provider();
            provider.setId(14);
            provider.setProContact("张扬");
            provider.setProAddress("供应商测试地址修改");
            provider.setModifyBy(1);
            provider.setModifyDate(new Date());
            int affected_rows = sqlSession.getMapper(ProviderMapper.class).update(provider);
            assertThat(affected_rows, is(equalTo(1)));
        }
    }

    @Test
    void deleteById() {
        try (SqlSession sqlSession = MyBatisUtils.openSession()) {
            assertThrows(org.apache.ibatis.exceptions.PersistenceException.class, () -> sqlSession.getMapper(ProviderMapper.class).deleteById(8));
        }
    }
}
