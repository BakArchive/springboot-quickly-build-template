package org.muen.boot.demo.common;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @program: demo
 * @description: 自制通用Mapper
 * @author: Parasomnia
 * @create: 2018-03-26 21:59
 **/
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> ,IdsMapper<T> {
}
