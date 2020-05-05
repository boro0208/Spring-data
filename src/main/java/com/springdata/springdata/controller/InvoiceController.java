package com.springdata.springdata.controller;

import com.springdata.springdata.model.Invoice;
import com.springdata.springdata.services.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class InvoiceController {

    @Autowired
    InvoiceServiceImpl invoiceService;

    @GetMapping("/invoice")
    public Iterable<Invoice> findAll() {
        Iterable<Invoice> invoices = invoiceService.getAllInvoices();
        return invoices;
    }

    @GetMapping("/invoice/{id}")
    public Invoice findInvoiceById(@PathVariable("id") Long id) {
        Invoice invoice = invoiceService.getInvoiceById(id);
        return invoice;
    }


    @PostMapping("/invoice/add")
    public Invoice addInvoice(@RequestBody Invoice inv){
        Invoice invoice = invoiceService.addNewInvoice(inv);
        return invoice;
    }

    @DeleteMapping("/invoice/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        invoiceService.deleteInvoiceById(id);
    }

    @PutMapping("/invoice/edit")
    public void updateInvoice(@RequestBody Invoice inv){
        invoiceService.updateInvoice(inv);
    }

    //testirao anotaciju @Query
    @GetMapping("/{id}")
    public Invoice findById(@PathVariable("id") Long id) {
        Invoice invoice = invoiceService.getById(id);
        return invoice;
    }
}
