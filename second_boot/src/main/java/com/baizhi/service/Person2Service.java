package com.baizhi.service;
import java.util.List;
import com.baizhi.entity.Person2;
import com.common.Assist;
public interface Person2Service{
	/**
	 * 获得Person2数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getPerson2RowCount(Assist assist);
	/**
	 * 获得Person2数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Person2> selectPerson2(Assist assist);
	/**
	 * 获得一个Person2对象,以参数Person2对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Person2 selectPerson2ByObj(Person2 obj);
	/**
	 * 通过Person2的id获得Person2对象
	 * @param id
	 * @return
	 */
    Person2 selectPerson2ById(Integer id);
	/**
	 * 插入Person2到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPerson2(Person2 value);
	/**
	 * 插入Person2中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyPerson2(Person2 value);
	/**
	 * 通过Person2的id删除Person2
	 * @param id
	 * @return
	 */
    int deletePerson2ById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Person2
	 * @param assist
	 * @return
	 */
    int deletePerson2(Assist assist);
	/**
	 * 通过Person2的id更新Person2中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updatePerson2ById(Person2 enti);
 	/**
	 * 通过辅助工具Assist的条件更新Person2中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updatePerson2(Person2 value,  Assist assist);
	/**
	 * 通过Person2的id更新Person2中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyPerson2ById(Person2 enti);
 	/**
	 * 通过辅助工具Assist的条件更新Person2中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyPerson2(Person2 value, Assist assist);
}