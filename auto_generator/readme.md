# 基于MybatisPlus的代码生成器

### 项目说明

* 代码生成器以mybatis-plus-generator作为生成器基础
* 对返回结果、控制器到service层的参数做了封装以及转换
* 自动在控制层生成基本的增删改查的api接口

### 生成器使用

* 修改GeneratorCode类里面的数据库连接以及包名
* 启动test包下的：com.sfc.auto_generator.GeneratorCode
* 输入相应模块名称、表名，生成成功