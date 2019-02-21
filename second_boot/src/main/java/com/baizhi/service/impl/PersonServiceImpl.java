package com.baizhi.service.impl;
import java.util.List;
import com.baizhi.dao.PersonDao;
import com.baizhi.entity.Person;
import com.baizhi.common.Assist;
import com.baizhi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonDao personDao;
    @Override
    public long getPersonRowCount(Assist assist){
        return personDao.getPersonRowCount(assist);
    }
    @Override
    public List<Person> selectPerson(Assist assist){
        return personDao.selectPerson(assist);
    }
    @Override
    public Person selectPersonByObj(Person obj){
        return personDao.selectPersonByObj(obj);
    }
    @Override
    public Person selectPersonById(Integer id){
        return personDao.selectPersonById(id);
    }
    @Override
    public int insertPerson(Person value){
        return personDao.insertPerson(value);
    }
    @Override
    public int insertNonEmptyPerson(Person value){
        return personDao.insertNonEmptyPerson(value);
    }
    @Override
    public int deletePersonById(Integer id){
        return personDao.deletePersonById(id);
    }
    @Override
    public int deletePerson(Assist assist){
        return personDao.deletePerson(assist);
    }
    @Override
    public int updatePersonById(Person enti){
        return personDao.updatePersonById(enti);
    }
    @Override
    public int updatePerson(Person value, Assist assist){
        return personDao.updatePerson(value,assist);
    }
    @Override
    public int updateNonEmptyPersonById(Person enti){
        return personDao.updateNonEmptyPersonById(enti);
    }
    @Override
    public int updateNonEmptyPerson(Person value, Assist assist){
        return personDao.updateNonEmptyPerson(value,assist);
    }

    public PersonDao getPersonDao() {
        return this.personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

}