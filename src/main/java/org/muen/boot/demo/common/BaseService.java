/**
 * 代号:隐无为 2017：厚溥
 * 文件名：BaseService.java
 * 创建人：柯栋
 * 日期：2017年10月11日
 * 修改人：
 * 描述：
 */
package org.muen.boot.demo.common;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description: 自制通用Service接口
 * @author: Parasomnia
 * @create: 2018-03-26 21:59
 **/
public interface BaseService<T> {

	/**
	 * 查询所有并根据要求分页
	 * @param pageNum 分页页码
	 * @param pageSize 分页大小
	 * @return 分页对象
	 */
	public PageInfo<T> queryPageList(Integer pageNum, Integer pageSize);

	/**
	 * 查询所有并根据要求分页(默认页码)
	 * @param pageNum 分页页码
	 * @return 分页对象
	 */
	public PageInfo<T> queryPageList(Integer pageNum);

	/**
	 * 根据条件进行分页查询
	 * @param pageNum
	 * @param pageSize
	 * @param model
	 * @return 分页对象
	 */
	public PageInfo<T> queryPageListByParam(Integer pageNum, Integer pageSize, T model);

	/**
	 * 根据条件进行分页查询(默认页码)
	 * @param pageNum
	 * @param model
	 * @return 分页对象
	 */
	public PageInfo<T> queryPageListByParam(Integer pageNum, T model);

	/**
	 * 查询所有内容列表
	 * @return 装有数据的集合
	 */
	public List<T> queryAllList();

	/**
	 * 根据条件查询内容列表
	 * @param model
	 * @return 装有数据的集合
	 */
	public List<T> queryParamList(T model);

	/**
	 * 根据id查询单个实体类
	 * @param id 实体类id
	 * @return 实体类对象
	 */
	public T queryById(Object id);

	/**
	 * 根据条件单个查询实体类对象
	 * @param model 查询条件
	 * @return 实体类对象
	 */
	public T queryByParam(T model);

	/**
	 * 查询符合条件的实体类个数
	 * @param model 查询条件
	 * @return 符合条件的个数
	 */
	public Integer queryCount(T model);

	/**
	 * 将数据持久化
	 * @param model 需要保存的对象
	 * @return 影响的行数
	 */
	public Integer save(T model);

	/**
	 * 保存一个实体，null的属性不会保存，会使用数据库默认值
	 * @param model 保存的实体类
	 * @return 影响的行数
	 */
	public Integer saveNoNull(T model);

	/**
	 * 根据条件删除
	 * @param model 删除条件
	 * @return 影响的行数
	 */
	public Integer deleteByParam(T model);

	/**
	 * 根据主键字段进行删除
	 * @param id 需要删除列的主键id
	 * @return 影响行数
	 */
	public Integer delete(Object id);

	/**
	 * 根据主键更新实体全部字段，null值会被更新
	 * @param model 需要更新的对象
	 * @return 影响的行数
	 */
	public Integer update(T model);

	/**
	 * 根据主键更新实体对象，null值不会被更新
	 * @param model 需要更新的对象
	 * @return 影响的行数
	 */
	public Integer updateNoNull(T model);

	///////////////////////////////////////////////////////
	//
	// 批量
	//
	///////////////////////////////////////////////////////

	/**
	 * 批量添加
	 * @param list 需要批量添加的列表
	 * @return 影响的行数
	 */
	public Integer insertList(List<T> list);

	/**
	 * 根据id进行多行删除
	 * @param ids id组成的字符串
	 * @return
	 */
	public Integer deleteByIds(String ids);

	/**
	 * ids批量查询，类中只有存在一个带有@Id注解的字段
	 * @param ids id组成的字符串
	 * @return
	 */
	public List<T> queryByIds(String ids);

	/**
	 * 批量更新
	 * @param list 需要更新的对象集合
	 * @return 影响的行数
	 */
	public Integer updateList(List<T> list);

	///////////////////////////////////////////////////////
	//
	// 扩展
	//
	///////////////////////////////////////////////////////

	/**
	 * 逻辑删除
	 * @param model 需要逻辑删除的对象
	 * @return 影响的行数
	 */
	public Integer updateDelete(T model);



}
