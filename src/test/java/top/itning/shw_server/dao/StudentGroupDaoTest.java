package top.itning.shw_server.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.yunshu.shw.server.ShwServerApplication;
import top.yunshu.shw.server.dao.StudentGroupDao;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShwServerApplication.class)
public class StudentGroupDaoTest {
    @Autowired
    private StudentGroupDao studentGroupDao;

    @Test
    public void test() {
        studentGroupDao.findAllByStudentNumber("1").forEach(System.out::println);
    }

}
