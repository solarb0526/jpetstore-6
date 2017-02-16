package org.mybatis.jpetstore.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017-02-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/test/java/config/mapperTestContext.xml"})
public class ItemMapperTest {

    @Autowired CategoryMapper categoryMapper;

    @Test
    public void testGetItem() throws Exception {
        System.out.println(categoryMapper.getCategoryList());
    }
}