package org.code;

import static org.junit.Assert.assertTrue;

import com.code.StartApplication;
import com.code.entity.Userinfo;
import com.code.mapper.UserinfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class)
public class AppTest {

    @Autowired
    UserinfoMapper userinfoMapper;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {



    }


    @Test
    public void test123() {
        List<Userinfo> userinfoList = userinfoMapper.selectByMap(null);
        for (Userinfo userinfo : userinfoList) {
            System.out.println("userinfo = " + userinfo);
        }

    }
}
