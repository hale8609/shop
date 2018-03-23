import com.model.SysMenu;
import com.service.SysMenuService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml"})
public class SysMenuServiceTest {

    @Autowired
    private SysMenuService sysMenuService;

    @Test
    public void testSelectMenusByAdminId(){
        int adminId = 1;
        List<SysMenu> menus = sysMenuService.selectMenusByAdminId(adminId);
        Assert.assertNotNull(menus);
    }
}
