package com.springdata.springdata.repository;

import com.springdata.springdata.model.Invoice;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
    @Query("SELECT * FROM invoice WHERE invoice_number = :invoice_number")
    Invoice findOneById(Long invoice_number);
}
