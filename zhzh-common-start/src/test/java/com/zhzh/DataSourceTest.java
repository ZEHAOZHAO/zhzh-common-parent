package com.zhzh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * ${Author}: jason.zhao
 * 2018/7/28 17:13
 **/
@SpringBootTest(classes = CommonApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DataSourceTest {
    @Resource
    private DataSource dataSource;

    @Test
    public void getSource() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
