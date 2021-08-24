/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.Invoice;
import com.hydrogen.nucleus.model.InvoicePayment;
import com.hydrogen.nucleus.model.PageInvoice;
import com.hydrogen.nucleus.model.PageInvoicePayment;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceApi
 */
@Ignore
public class InvoiceApiTest {

    private final InvoiceApi api = new InvoiceApi();

    
    /**
     * Create a invoicePayment
     *
     * Create a new invoicePayment, for tracking invoice status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInvoicePaymentUsingPostTest() throws ApiException {
        InvoicePayment invoicePayment = null;
        InvoicePayment response = api.createInvoicePaymentUsingPost(invoicePayment);

        // TODO: test validations
    }
    
    /**
     * Create a invoice
     *
     * Create a new invoice, with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInvoiceUsingPostTest() throws ApiException {
        Invoice invoice = null;
        Invoice response = api.createInvoiceUsingPost(invoice);

        // TODO: test validations
    }
    
    /**
     * Delete a invoicePayment
     *
     * Delete a invoicePayment. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoicePaymentUsingDeleteTest() throws ApiException {
        UUID invoicePaymentId = null;
        api.deleteInvoicePaymentUsingDelete(invoicePaymentId);

        // TODO: test validations
    }
    
    /**
     * Delete a invoice
     *
     * Delete a invoice. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceUsingDeleteTest() throws ApiException {
        UUID invoiceId = null;
        api.deleteInvoiceUsingDelete(invoiceId);

        // TODO: test validations
    }
    
    /**
     * List all invoices
     *
     * List all invoice. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageInvoice response = api.getInvoiceAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all invoice payments
     *
     * List all invoicePayment. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoicePaymentAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageInvoicePayment response = api.getInvoicePaymentAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a invoicePayment
     *
     * Retrieve a invoicePayment. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoicePaymentUsingGetTest() throws ApiException {
        UUID invoicePaymentId = null;
        String currencyConversion = null;
        InvoicePayment response = api.getInvoicePaymentUsingGet(invoicePaymentId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * Retrieve a invoice
     *
     * Retrieve a invoice. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceUsingGetTest() throws ApiException {
        UUID invoiceId = null;
        String currencyConversion = null;
        Invoice response = api.getInvoiceUsingGet(invoiceId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * Update a invoicePayment
     *
     * Update a invoicePayment. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInvoicePaymentUsingPutTest() throws ApiException {
        Object invoicePayment = null;
        UUID invoicePaymentId = null;
        InvoicePayment response = api.updateInvoicePaymentUsingPut(invoicePayment, invoicePaymentId);

        // TODO: test validations
    }
    
    /**
     * Update a invoice
     *
     * Update a invoice. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceUsingPutTest() throws ApiException {
        Object invoice = null;
        UUID invoiceId = null;
        Invoice response = api.updateInvoiceUsingPut(invoice, invoiceId);

        // TODO: test validations
    }
    
}
