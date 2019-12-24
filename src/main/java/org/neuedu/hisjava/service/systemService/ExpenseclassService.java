package org.neuedu.hisjava.service.systemService;

import org.neuedu.hisjava.mapper.ExpenseclassMapper;
import org.neuedu.hisjava.model.Expenseclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseclassService {
    @Autowired
    ExpenseclassMapper expenseclassMapper;

    public List<Expenseclass> searchExpenseclass() {
        return expenseclassMapper.searchExpenseclass();
    }
}
