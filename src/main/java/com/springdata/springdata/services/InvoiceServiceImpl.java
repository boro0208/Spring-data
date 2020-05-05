package com.springdata.springdata.services;

import com.springdata.springdata.model.Invoice;
import com.springdata.springdata.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepository invoiceRepository;


    @Override
    public Invoice getInvoiceById(Long id) {
        Invoice invoice = invoiceRepository.findById(id).get();
        return invoice;
    }

    @Override
    public Iterable<Invoice> getAllInvoices() {
        Iterable<Invoice> invoices = invoiceRepository.findAll();
        return invoices;
    }

    @Override
    public Invoice addNewInvoice(Invoice inv) {
        Invoice invoice =  invoiceRepository.save(inv);
        return invoice;
    }

    @Override
    public void deleteInvoiceById(Long id) {
        invoiceRepository.deleteById(id);
    }

    @Override
    public void updateInvoice(Invoice inv) {
        invoiceRepository.save(inv);
    }

    public Invoice getById(Long id) {
        Invoice invoice = invoiceRepository.findOneById(id);
        return invoice;
    }
}
