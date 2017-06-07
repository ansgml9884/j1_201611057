package com.sd.addressFinal;

import java.util.List;

public interface PersonDao {
    public void insert(PersonV0 p);
    public List<PersonV0> findAll();
    public PersonV0 findById(int id);
    public PersonV0 findByName(String name);
    public void update(PersonV0 p);
    public void delete(PersonV0 p);
    public void delete(int id);
}