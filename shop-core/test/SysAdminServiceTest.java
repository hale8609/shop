import com.model.SysAdmin;
import com.service.SysAdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml"})
public class SysAdminServiceTest {

    @Autowired
    private SysAdminService sysAdminService;

    @Test
    public void testLogin(){
        String username = "admin";
        String password = "123456";
        SysAdmin sysAdmin = sysAdminService.selectAdminByUsernameAndPwd(username, password);
        Assert.assertNotNull(sysAdmin);
    }
}
