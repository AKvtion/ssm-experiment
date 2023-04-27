package org.liangfacan53.courses.sf.ssm.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.liangfacan53.courses.sf.ssm.mybatis.pojo.Bill;
import org.liangfacan53.courses.sf.ssm.mybatis.utils.MyBatisUtils;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BillMapperTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getBills() {
        try (SqlSession sqlSession = MyBatisUtils.openSession()) {
            List<Bill> billList = sqlSession.getMapper(BillMapper.class).getBills(null, null, 2);
            assertThat(billList.size(), is(equalTo(15)));
            billList.forEach(System.out::println);
        }
    }

    @Test
    void getBillsByProviderIds() {
        try (SqlSession sqlSession = MyBatisUtils.openSession()) {
            BillMapper billMapper = sqlSession.getMapper(BillMapper.class);
            List<Bill> billList = billMapper.getBillsByProviderIds(new Integer[]{1, 14, 100});
            assertThat(billList.size(), is(equalTo(6)));
            billList.forEach(System.out::println);
            billList = billMapper.getBillsByProviderIds(null);
            assertThat(billList.size(), is(equalTo(18)));
            billList.forEach(System.out::println);
        }
    }
}
