package org.neuedu.hisjava.controller.systemController;


import org.neuedu.hisjava.model.Expenseclass;
import org.neuedu.hisjava.service.systemService.ExpenseclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseclassController {

    @Autowired
    ExpenseclassService expenseclassService;
    @GetMapping("/searchExpenseclass")
    public List<Expenseclass> searchExpenseclass(){
        return expenseclassService.searchExpenseclass();
    }
}
