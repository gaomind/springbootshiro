package com.mind;

import com.mind.dao.SysPermissionMapper;
import com.mind.dao.SysRoleMapper;
import com.mind.dao.SysRolePermissionMapper;
import com.mind.dao.SysUserRoleMapper;
import com.mind.pojo.SysPermission;
import com.mind.pojo.SysRole;
import com.mind.pojo.SysRolePermission;
import com.mind.pojo.SysUserRole;
import com.mind.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootshiroApplicationTests {



	@Resource
	private SysUserRoleMapper sysUserRoleMapper;

	@Resource
	private SysRoleMapper sysRoleMapper;

	@Resource
	private SysRolePermissionMapper sysRolePermissionMapper;

	@Resource
	private SysPermissionMapper sysPermissionMapper;

	@Autowired
	UserInfoService userInfoService;

	@Test
	public void contextLoads() {
		//System.out.println(userInfoService.findByUsername("admin"));


		List<SysUserRole> sysUserRoles=sysUserRoleMapper.selectByUserId(1L);

		//List<SysRole> sysRoles=new ArrayList<>();
		for(SysUserRole sysUserRole:sysUserRoles){
			SysRole sysRole=sysRoleMapper.selectSysRoleByRoleId(sysUserRole.getRoleId());
            System.out.println(sysRole);
            List<SysRolePermission> sysRolePermissions=sysRolePermissionMapper.selectByRoleId(sysRole.getId());
            System.out.println(sysRolePermissions.size()+"*************");
            for (SysRolePermission sysRolePermission:sysRolePermissions){
                System.out.println("+++++++++++++"+sysRolePermission.getPermissionId());
                SysPermission sysPermission=sysPermissionMapper.selectByPrimaryKey(sysRolePermission.getPermissionId());
                System.out.println(sysPermission);
            }
		}
	}
    @Test
    public void contextLoada() {
        //System.out.println(userInfoService.findByUsername("admin"));
        System.out.println(sysUserRoleMapper.selectByUserId(2L).get(0));
       // System.out.println(sysRoleMapper.selectSysRoleByRoleId(1L));

    }

}
