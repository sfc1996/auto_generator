package com.sfc.auto_generator.sysclass.service.impl;

import com.sfc.auto_generator.sysclass.entity.SysClass;
import com.sfc.auto_generator.sysclass.mapper.SysClassMapper;
import com.sfc.auto_generator.sysclass.service.ISysClassService;
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
public class SysClassServiceImpl extends ServiceImpl<SysClassMapper, SysClass> implements ISysClassService {

@Autowired
SysClassMapper sysclassmapper;

 public List<Map<String,Object>> queryMapList(SysClass sysclass){

  QueryWrapper<SysClass> wrapper=new QueryWrapper<>();
  if(sysclass.getClassId()!=null){
  wrapper.eq(true,"class_id",sysclass.getClassId());
  }
  if(sysclass.getClassName()!=null){
  wrapper.eq(true,"class_name",sysclass.getClassName());
  }
  if(sysclass.getClassDesc()!=null){
  wrapper.eq(true,"class_desc",sysclass.getClassDesc());
  }
  if(sysclass.getClassNumber()!=null){
  wrapper.eq(true,"class_number",sysclass.getClassNumber());
  }
  if(sysclass.getClassMaster()!=null){
  wrapper.eq(true,"class_master",sysclass.getClassMaster());
  }
  if(sysclass.getGrade()!=null){
  wrapper.eq(true,"grade",sysclass.getGrade());
  }
  if(sysclass.getClassScore()!=null){
  wrapper.eq(true,"class_score",sysclass.getClassScore());
  }
  if(sysclass.getStartTime()!=null){
  wrapper.eq(true,"start_time",sysclass.getStartTime());
  }
  List<Map<String,Object>> map=listMaps(wrapper);
  return map;
 }

public IPage<SysClass> queryMapPage(Integer pageNumber,Integer pageSize,SysClass sysclass){

    QueryWrapper<SysClass> wrapper=new QueryWrapper<>();
     if(sysclass.getClassId()!=null){
     wrapper.eq(true,"class_id",sysclass.getClassId());
     }
     if(sysclass.getClassName()!=null){
     wrapper.eq(true,"class_name",sysclass.getClassName());
     }
     if(sysclass.getClassDesc()!=null){
     wrapper.eq(true,"class_desc",sysclass.getClassDesc());
     }
     if(sysclass.getClassNumber()!=null){
     wrapper.eq(true,"class_number",sysclass.getClassNumber());
     }
     if(sysclass.getClassMaster()!=null){
     wrapper.eq(true,"class_master",sysclass.getClassMaster());
     }
     if(sysclass.getGrade()!=null){
     wrapper.eq(true,"grade",sysclass.getGrade());
     }
     if(sysclass.getClassScore()!=null){
     wrapper.eq(true,"class_score",sysclass.getClassScore());
     }
     if(sysclass.getStartTime()!=null){
     wrapper.eq(true,"start_time",sysclass.getStartTime());
     }
     IPage<SysClass> iPage=new Page<>();
     int total=sysclassmapper.selectCount(wrapper);
     iPage.setTotal(total);
     if(pageNumber!=null&&pageSize!=null) {
     iPage.setCurrent(pageNumber);
     iPage.setSize(pageSize);
     }
    IPage<SysClass> page=page(iPage,wrapper);
    return page;
    }

public Boolean updateObject(SysClass sysclass1,SysClass sysclass2){

UpdateWrapper<SysClass> wrapper=new UpdateWrapper<>();
 if(sysclass1.getClassId()!=null){
 wrapper.set(true,"class_id",sysclass1.getClassId());
 }
 if(sysclass1.getClassName()!=null){
 wrapper.set(true,"class_name",sysclass1.getClassName());
 }
 if(sysclass1.getClassDesc()!=null){
 wrapper.set(true,"class_desc",sysclass1.getClassDesc());
 }
 if(sysclass1.getClassNumber()!=null){
 wrapper.set(true,"class_number",sysclass1.getClassNumber());
 }
 if(sysclass1.getClassMaster()!=null){
 wrapper.set(true,"class_master",sysclass1.getClassMaster());
 }
 if(sysclass1.getGrade()!=null){
 wrapper.set(true,"grade",sysclass1.getGrade());
 }
 if(sysclass1.getClassScore()!=null){
 wrapper.set(true,"class_score",sysclass1.getClassScore());
 }
 if(sysclass1.getStartTime()!=null){
 wrapper.set(true,"start_time",sysclass1.getStartTime());
 }
 if(sysclass2.getClassId()!=null){
 wrapper.eq(true,"class_id",sysclass2.getClassId());
 }
 if(sysclass2.getClassName()!=null){
 wrapper.eq(true,"class_name",sysclass2.getClassName());
 }
 if(sysclass2.getClassDesc()!=null){
 wrapper.eq(true,"class_desc",sysclass2.getClassDesc());
 }
 if(sysclass2.getClassNumber()!=null){
 wrapper.eq(true,"class_number",sysclass2.getClassNumber());
 }
 if(sysclass2.getClassMaster()!=null){
 wrapper.eq(true,"class_master",sysclass2.getClassMaster());
 }
 if(sysclass2.getGrade()!=null){
 wrapper.eq(true,"grade",sysclass2.getGrade());
 }
 if(sysclass2.getClassScore()!=null){
 wrapper.eq(true,"class_score",sysclass2.getClassScore());
 }
 if(sysclass2.getStartTime()!=null){
 wrapper.eq(true,"start_time",sysclass2.getStartTime());
 }
Boolean isUpdate=update(wrapper);
return isUpdate;
}

public Boolean deleteObject(SysClass sysclass){

QueryWrapper<SysClass> wrapper=new QueryWrapper<>();
 if(sysclass.getClassId()!=null){
 wrapper.eq(true,"class_id",sysclass.getClassId());
 }
 if(sysclass.getClassName()!=null){
 wrapper.eq(true,"class_name",sysclass.getClassName());
 }
 if(sysclass.getClassDesc()!=null){
 wrapper.eq(true,"class_desc",sysclass.getClassDesc());
 }
 if(sysclass.getClassNumber()!=null){
 wrapper.eq(true,"class_number",sysclass.getClassNumber());
 }
 if(sysclass.getClassMaster()!=null){
 wrapper.eq(true,"class_master",sysclass.getClassMaster());
 }
 if(sysclass.getGrade()!=null){
 wrapper.eq(true,"grade",sysclass.getGrade());
 }
 if(sysclass.getClassScore()!=null){
 wrapper.eq(true,"class_score",sysclass.getClassScore());
 }
 if(sysclass.getStartTime()!=null){
 wrapper.eq(true,"start_time",sysclass.getStartTime());
 }
 Boolean isDelete=remove(wrapper);
 return isDelete;
}

}
