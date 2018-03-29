import com.model.SysMenu;
import com.service.SysMenuService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
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

    @Test
    public void selectAllMenus(){
        List<SysMenu> menus = sysMenuService.selectAllMenus();
        Assert.assertNotNull(menus);
    }

    @Test
    public void testInsert(){
        SysMenu sysMenu = new SysMenu();
        sysMenu.setUrl("test3");
        sysMenu.setMenuName("test3");
        sysMenu.setParentId(0);
        sysMenu.setSortNum(1);
        sysMenu.setCreateTime(new Date());
        sysMenuService.insert(sysMenu);
    }

    @Test
    public void testUpdate(){
        SysMenu sysMenu = new SysMenu();
        sysMenu.setId(8);
        sysMenu.setMenuName("aa");
        System.out.println(sysMenuService.update(sysMenu));
    }
}
