package com.wht.template.core.tkmybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by caimiao on 2016/6/30.
 */
public interface IMapper<T> extends Mapper<T>, MySqlMapper<T> {


}
