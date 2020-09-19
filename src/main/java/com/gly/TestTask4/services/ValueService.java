package com.gly.TestTask4.services;

import com.gly.TestTask4.dao.ValueDao;
import com.gly.TestTask4.models.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValueService {

    @Autowired
    private ValueDao valueDao = new ValueDao();

    public  ValueService() {
    }

    public void saveValue(Value value) {
        valueDao.save(value);
    }

    public static void createTable() {
        ValueDao.createTable();
    }
}
