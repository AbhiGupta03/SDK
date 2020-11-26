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

import com.hydrogen.nucleus.model.RiskProfile;
import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.PageRiskProfile;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for RiskProfileApi
 */
@Ignore
public class RiskProfileApiTest {

    private final RiskProfileApi api = new RiskProfileApi();

    
    /**
     * Create a Risk Profile
     *
     * Create a new Risk Profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRiskProfileUsingPostTest() throws ApiException {
        RiskProfile riskProfile = null;
        RiskProfile response = api.createRiskProfileUsingPost(riskProfile);

        // TODO: test validations
    }
    
    /**
     * Delete a Risk Profile
     *
     * Permanently Delete a Risk Profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRiskProfileUsingDeleteTest() throws ApiException {
        UUID riskProfileId = null;
        api.deleteRiskProfileUsingDelete(riskProfileId);

        // TODO: test validations
    }
    
    /**
     * Get All Risk Profile
     *
     * Get All Risk Profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRiskProfileAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageRiskProfile response = api.getRiskProfileAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Get a Risk Profile
     *
     * Get a Risk Profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRiskProfileUsingGetTest() throws ApiException {
        UUID riskProfileId = null;
        RiskProfile response = api.getRiskProfileUsingGet(riskProfileId);

        // TODO: test validations
    }
    
    /**
     * Update a Risk Profile
     *
     * Update a Risk Profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRiskProfileUsingPutTest() throws ApiException {
        RiskProfile riskProfile = null;
        UUID riskProfileId = null;
        RiskProfile response = api.updateRiskProfileUsingPut(riskProfile, riskProfileId);

        // TODO: test validations
    }
    
}
