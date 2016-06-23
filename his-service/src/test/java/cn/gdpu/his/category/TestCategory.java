package cn.gdpu.his.category;

import cn.gdpu.his.domain.sys.Category;
import cn.gdpu.his.service.sys.ICategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 郭旭辉 on 2016/6/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-service.xml"})
public class TestCategory {

    @Autowired
    private ICategoryService categoryService;

    @Test
    public void testInsertCategory(){
        Category category = new Category();
        category.setName("测试1");
        category.setPriority(1);
        category.setCreator("Nicos");
        category.setCreateDate(System.currentTimeMillis());
        category.setStatus(1);
        categoryService.insert(category);
    }

}
