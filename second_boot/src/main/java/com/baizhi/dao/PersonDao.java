package com.baizhi.dao;
import com.baizhi.entity.Person;
import java.util.List;
import com.baizhi.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao{
	/**
	 * 获得Person数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getPersonRowCount(Assist assist);
	/**
	 * 获得Person数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Person> selectPerson(Assist assist);
	/**
	 * 获得一个Person对象,以参数Person对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Person selectPersonByObj(Person obj);
	/**
	 * 通过Person的id获得Person对象
	 * @param id
	 * @return
	 */
    Person selectPersonById(Integer id);
	/**
	 * 插入Person到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPerson(Person value);
	/**
	 * 插入Person中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyPerson(Person value);
	/**
	 * 通过Person的id删除Person
	 * @param id
	 * @return
	 */
    int deletePersonById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Person
	 * @param assist
	 * @return
	 */
    int deletePerson(Assist assist);
	/**
	 * 通过Person的id更新Person中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updatePersonById(Person enti);
 	/**
	 * 通过辅助工具Assist的条件更新Person中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updatePerson(@Param("enti") Person value, @Param("assist") Assist assist);
	/**
	 * 通过Person的id更新Person中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyPersonById(Person enti);
 	/**
	 * 通过辅助工具Assist的条件更新Person中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyPerson(@Param("enti") Person value, @Param("assist") Assist assist);
}