package org.neuedu.hisjava.service.registerService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.InvoiceMapper;
import org.neuedu.hisjava.mapper.RegistworkMapper;
import org.neuedu.hisjava.model.Invoice;
import org.neuedu.hisjava.model.Registwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyQueryService {
    @Autowired
    RegistworkMapper registworkMapper;
    @Autowired
    InvoiceMapper invoiceMapper;
    public List<Registwork> searchAllRegistwork(String startTime, String endTime) {
        return registworkMapper.searchAllRegistwork(startTime,endTime);
    }

    public PageInfo searchOwnRegistworkInvoice(String startTime, String endTime,Integer pageSize,Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Invoice> invoices = invoiceMapper.searchOwnRegistworkInvoice(startTime, endTime);
        PageInfo pageInfo = new PageInfo(invoices);
        return pageInfo;
    }
}
