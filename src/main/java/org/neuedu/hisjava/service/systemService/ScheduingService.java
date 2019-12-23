package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.SchedulingMapper;
import org.neuedu.hisjava.model.Scheduling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ScheduingService {
    @Autowired
    SchedulingMapper schedulingMapper;
    public PageInfo searchScheduing(String startDate, String endDate, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Scheduling> schedulings = schedulingMapper.searchScheduing(startDate,endDate);
        for (Scheduling scheduling : schedulings) {
            System.out.println(scheduling);
        }
        PageInfo pageInfo = new PageInfo(schedulings);
        return pageInfo;




    }
}
