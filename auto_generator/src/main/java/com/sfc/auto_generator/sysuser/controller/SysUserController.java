package com.sfc.auto_generator.sysuser.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.sfc.auto_generator.sysuser.entity.SysUser;
import com.sfc.auto_generator.sysuser.service.impl.SysUserServiceImpl;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;
import com.sfc.auto_generator.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sufuchuan
 * @since 2019-09-15
 */
@RestController
@RequestMapping("/sysuser/sys-user")
public class SysUserController extends BaseController {

@Autowired
SysUserServiceImpl sysuserserviceimpl;

@RequestMapping("queryMapList")
public Map<String,Object> queryMapList(SysUser sysuser){

List<Map<String,Object>> list=sysuserserviceimpl.queryMapList(sysuser);
return getReturnSuccessMap(list);
}

@RequestMapping("queryMapPage")
public Map<String,Object> queryMapPage(Integer pageNumber,Integer pageSize,SysUser sysuser){
IPage<SysUser> page=sysuserserviceimpl.queryMapPage(pageNumber,pageSize,sysuser);
return getReturnSuccessMap(page);
}

@RequestMapping("save")
public Map<String,Object> save(SysUser sysuser){
if(sysuserserviceimpl.save(sysuser)) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
}
}

@RequestMapping("update")
public Map<String,Object> update(SysUser sysuser){
SysUser sysuser1=new SysUser();
sysuser1.setUserId(sysuser.getUserId());
if(sysuserserviceimpl.updateObject(sysuser,sysuser1)) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
  }
 }

@RequestMapping("delete")
public Map<String,Object> delete(SysUser sysuser){
if(sysuserserviceimpl.deleteObject(sysuser)) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
}
}
}
