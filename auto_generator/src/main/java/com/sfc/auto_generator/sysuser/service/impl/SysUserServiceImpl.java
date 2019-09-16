package com.sfc.auto_generator.sysuser.service.impl;

import com.sfc.auto_generator.sysuser.entity.SysUser;
import com.sfc.auto_generator.sysuser.mapper.SysUserMapper;
import com.sfc.auto_generator.sysuser.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sufuchuan
 * @since 2019-09-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

@Autowired
SysUserMapper sysusermapper;

 public List<Map<String,Object>> queryMapList(SysUser sysuser){

  QueryWrapper<SysUser> wrapper=new QueryWrapper<>();
  if(sysuser.getUserId()!=null){
  wrapper.eq(true,"user_id",sysuser.getUserId());
  }
  if(sysuser.getUserName()!=null){
  wrapper.eq(true,"user_name",sysuser.getUserName());
  }
  if(sysuser.getUserDesc()!=null){
  wrapper.eq(true,"user_desc",sysuser.getUserDesc());
  }
  if(sysuser.getUserPwd()!=null){
  wrapper.eq(true,"user_pwd",sysuser.getUserPwd());
  }
  List<Map<String,Object>> map=listMaps(wrapper);
  return map;
 }

public IPage<SysUser> queryMapPage(Integer pageNumber,Integer pageSize,SysUser sysuser){

    QueryWrapper<SysUser> wrapper=new QueryWrapper<>();
     if(sysuser.getUserId()!=null){
     wrapper.eq(true,"user_id",sysuser.getUserId());
     }
     if(sysuser.getUserName()!=null){
     wrapper.eq(true,"user_name",sysuser.getUserName());
     }
     if(sysuser.getUserDesc()!=null){
     wrapper.eq(true,"user_desc",sysuser.getUserDesc());
     }
     if(sysuser.getUserPwd()!=null){
     wrapper.eq(true,"user_pwd",sysuser.getUserPwd());
     }
     IPage<SysUser> iPage=new Page<>();
     int total=sysusermapper.selectCount(wrapper);
     iPage.setTotal(total);
     if(pageNumber!=null&&pageSize!=null) {
     iPage.setCurrent(pageNumber);
     iPage.setSize(pageSize);
     }
    IPage<SysUser> page=page(iPage,wrapper);
    return page;
    }

public Boolean updateObject(SysUser sysuser1,SysUser sysuser2){

UpdateWrapper<SysUser> wrapper=new UpdateWrapper<>();
 if(sysuser1.getUserId()!=null){
 wrapper.set(true,"user_id",sysuser1.getUserId());
 }
 if(sysuser1.getUserName()!=null){
 wrapper.set(true,"user_name",sysuser1.getUserName());
 }
 if(sysuser1.getUserDesc()!=null){
 wrapper.set(true,"user_desc",sysuser1.getUserDesc());
 }
 if(sysuser1.getUserPwd()!=null){
 wrapper.set(true,"user_pwd",sysuser1.getUserPwd());
 }
 if(sysuser2.getUserId()!=null){
 wrapper.eq(true,"user_id",sysuser2.getUserId());
 }
 if(sysuser2.getUserName()!=null){
 wrapper.eq(true,"user_name",sysuser2.getUserName());
 }
 if(sysuser2.getUserDesc()!=null){
 wrapper.eq(true,"user_desc",sysuser2.getUserDesc());
 }
 if(sysuser2.getUserPwd()!=null){
 wrapper.eq(true,"user_pwd",sysuser2.getUserPwd());
 }
Boolean isUpdate=update(wrapper);
return isUpdate;
}

public Boolean deleteObject(SysUser sysuser){

QueryWrapper<SysUser> wrapper=new QueryWrapper<>();
 if(sysuser.getUserId()!=null){
 wrapper.eq(true,"user_id",sysuser.getUserId());
 }
 if(sysuser.getUserName()!=null){
 wrapper.eq(true,"user_name",sysuser.getUserName());
 }
 if(sysuser.getUserDesc()!=null){
 wrapper.eq(true,"user_desc",sysuser.getUserDesc());
 }
 if(sysuser.getUserPwd()!=null){
 wrapper.eq(true,"user_pwd",sysuser.getUserPwd());
 }
 Boolean isDelete=remove(wrapper);
 return isDelete;
}

}
