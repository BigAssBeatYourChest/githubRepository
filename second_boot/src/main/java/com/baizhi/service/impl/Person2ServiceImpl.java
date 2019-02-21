package com.baizhi.service.impl;
import java.util.List;
import com.baizhi.dao.Person2Dao;
import com.baizhi.entity.Person2;
import com.common.Assist;
import com.baizhi.service.Person2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Person2ServiceImpl implements Person2Service{
    @Autowired
    private Person2Dao person2Dao;
    @Override
    public long getPerson2RowCount(Assist assist){
        return person2Dao.getPerson2RowCount(assist);
    }
    @Override
    public List<Person2> selectPerson2(Assist assist){
        return person2Dao.selectPerson2(assist);
    }
    @Override
    public Person2 selectPerson2ByObj(Person2 obj){
        return person2Dao.selectPerson2ByObj(obj);
    }
    @Override
    public Person2 selectPerson2ById(Integer id){
        return person2Dao.selectPerson2ById(id);
    }
    @Override
    public int insertPerson2(Person2 value){
        return person2Dao.insertPerson2(value);
    }
    @Override
    public int insertNonEmptyPerson2(Person2 value){
        return person2Dao.insertNonEmptyPerson2(value);
    }
    @Override
    public int deletePerson2ById(Integer id){
        return person2Dao.deletePerson2ById(id);
    }
    @Override
    public int deletePerson2(Assist assist){
        return person2Dao.deletePerson2(assist);
    }
    @Override
    public int updatePerson2ById(Person2 enti){
        return person2Dao.updatePerson2ById(enti);
    }
    @Override
    public int updatePerson2(Person2 value, Assist assist){
        return person2Dao.updatePerson2(value,assist);
    }
    @Override
    public int updateNonEmptyPerson2ById(Person2 enti){
        return person2Dao.updateNonEmptyPerson2ById(enti);
    }
    @Override
    public int updateNonEmptyPerson2(Person2 value, Assist assist){
        return person2Dao.updateNonEmptyPerson2(value,assist);
    }

    public Person2Dao getPerson2Dao() {
        return this.person2Dao;
    }

    public void setPerson2Dao(Person2Dao person2Dao) {
        this.person2Dao = person2Dao;
    }

}