package com.sfc.auto_generator.sysclass.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.sfc.auto_generator.sysclass.entity.SysClass;
import com.sfc.auto_generator.sysclass.service.impl.SysClassServiceImpl;
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
@RequestMapping("/sysclass/sys-class")
public class SysClassController extends BaseController {

@Autowired
SysClassServiceImpl sysclassserviceimpl;

@RequestMapping("queryMapList")
public Map<String,Object> queryMapList(SysClass sysclass){

List<Map<String,Object>> list=sysclassserviceimpl.queryMapList(sysclass);
return getReturnSuccessMap(list);
}

@RequestMapping("queryMapPage")
public Map<String,Object> queryMapPage(Integer pageNumber,Integer pageSize,SysClass sysclass){
IPage<SysClass> page=sysclassserviceimpl.queryMapPage(pageNumber,pageSize,sysclass);
return getReturnSuccessMap(page);
}

@RequestMapping("save")
public Map<String,Object> save(SysClass sysclass){
if(sysclassserviceimpl.save(sysclass)) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
}
}

@RequestMapping("update")
public Map<String,Object> update(SysClass sysclass){
SysClass sysclass1=new SysClass();
sysclass1.setClassId(sysclass.getClassId());
if(sysclassserviceimpl.updateObject(sysclass,sysclass1)) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
  }
 }

@RequestMapping("delete")
public Map<String,Object> delete(SysClass sysclass){
if(sysclassserviceimpl.deleteObject(sysclass)) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
}
}
}
