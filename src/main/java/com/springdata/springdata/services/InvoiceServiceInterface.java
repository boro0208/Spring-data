package com.springdata.springdata.services;

import com.springdata.springdata.model.Invoice;

import java.util.List;

public interface InvoiceServiceInterface {

    Invoice getInvoiceById(Long id);
    Iterable<Invoice> getAllInvoices();
    Invoice addNewInvoice(Invoice inv);
    void deleteInvoiceById(Long id);
    void updateInvoice(Invoice inv);

}
