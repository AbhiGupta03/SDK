/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.model.FinancialStatement;
import com.hydrogen.nucleus.model.PageFinancialStatement;
import com.hydrogen.nucleus.ApiException;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for FinancialStatementApi
 */
@Ignore
public class FinancialStatementApiTest {

    private final FinancialStatementApi api = new FinancialStatementApi();

    
    /**
     * Create an financialStatement
     *
     * Store stats pulled from financialStatement vendors.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFinancialStatementUsingPostTest() throws ApiException {
        FinancialStatement financialStatement = null;
        FinancialStatement response = api.createFinancialStatementUsingPost(financialStatement);

        // TODO: test validations
    }
    
    /**
     * Delete an financialStatement
     *
     * Permanently delete an financialStatement.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFinancialStatementUsingDeleteTest() throws ApiException {
        UUID financialStatementId = null;
        api.deleteFinancialStatementUsingDelete(financialStatementId);

        // TODO: test validations
    }
    
    /**
     * List all financialStatement
     *
     * Get information for all financialStatement for all clients defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFinancialStatementAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageFinancialStatement response = api.getFinancialStatementAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an financialStatement
     *
     * Retrieve the information for a specific financialStatement associated with a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFinancialStatementUsingGetTest() throws ApiException {
        UUID financialStatementId = null;
        String currencyConversion = null;
        FinancialStatement response = api.getFinancialStatementUsingGet(financialStatementId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * Update an financialStatement
     *
     * Update the information for an financialStatement.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFinancialStatementUsingPutTest() throws ApiException {
        FinancialStatement financialStatement = null;
        UUID financialStatementId = null;
        FinancialStatement response = api.updateFinancialStatementUsingPut(financialStatement, financialStatementId);

        // TODO: test validations
    }
    
}
