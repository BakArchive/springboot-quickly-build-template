/**
 * 代号:隐无为 2017：厚溥
 * 文件名：BaseServiceImpl.java
 * 创建人：柯栋
 * 日期：2017年10月11日
 * 修改人：
 * 描述：
 */
package org.muen.boot.demo.common.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.muen.boot.demo.common.BaseMapper;
import org.muen.boot.demo.common.BaseService;
import org.muen.boot.demo.web.util.WebConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: demo
 * @description: 自制通用Service实现
 * @author: Parasomnia
 * @create: 2018-03-26 21:59
 **/
public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	BaseMapper<T> baseMapper;
	
	@Override
	public PageInfo<T> queryPageList(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<T> list=baseMapper.selectAll();
		// 用PageInfo对结果进行包装
		PageInfo<T> pageInfo = new PageInfo<T>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<T> queryPageList(Integer pageNum) {
		PageHelper.startPage(pageNum, WebConstant.PAGESIZE);
		List<T> list=baseMapper.selectAll();
		// 用PageInfo对结果进行包装
		PageInfo<T> pageInfo = new PageInfo<T>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<T> queryPageListByParam(Integer pageNum, Integer pageSize,T model) {
		PageHelper.startPage(pageNum, pageSize);
		List<T> list=baseMapper.select(model);
		// 用PageInfo对结果进行包装
		PageInfo<T> pageInfo = new PageInfo<T>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<T> queryPageListByParam(Integer pageNum,T model) {
		PageHelper.startPage(pageNum, WebConstant.PAGESIZE);
		List<T> list=baseMapper.select(model);
		// 用PageInfo对结果进行包装
		PageInfo<T> pageInfo = new PageInfo<T>(list);
		return pageInfo;
	}

	@Override
	public List<T> queryAllList() {
		return baseMapper.selectAll();
	}

	@Override
	public List<T> queryParamList(T model) {
		return baseMapper.select(model);
	}

	@Override
	public T queryById(Object id) {
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public T queryByParam(T model) {
		return baseMapper.selectOne(model);
	}

	@Override
	public Integer queryCount(T model) {
		return baseMapper.selectCount(model);
	}

	@Override
	public Integer save(T model) {
		return baseMapper.insert(model);
	}

	@Override
	public Integer saveNoNull(T model) {
		return baseMapper.insertSelective(model);
	}

	@Override
	public Integer deleteByParam(T model) {
		return baseMapper.delete(model);
	}

	@Override
	public Integer delete(Object id) {
		return baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer update(T model) {
		return baseMapper.updateByPrimaryKey(model);
	}

	@Override
	public Integer updateNoNull(T model) {
		return baseMapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public Integer insertList(List<T> list) {
		return baseMapper.insertList(list);
	}

	@Override
	public Integer deleteByIds(String ids) {
		return baseMapper.deleteByIds(ids);
	}

	@Override
	public List<T> queryByIds(String ids) {
		return baseMapper.selectByIds(ids);
	}

	@Override
	@Transactional
	public Integer updateList(List<T> list) {
		for (T t : list) {
			updateNoNull(t);
		}
		return 1;
	}

	@Override
	public Integer updateDelete(T model) {
		return updateNoNull(model);
	}

	

}
