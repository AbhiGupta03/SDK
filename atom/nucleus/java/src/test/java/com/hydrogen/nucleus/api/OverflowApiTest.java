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

import com.hydrogen.nucleus.model.Overflow;
import com.hydrogen.nucleus.model.OverflowSettings;
import com.hydrogen.nucleus.model.OverflowVO;
import com.hydrogen.nucleus.model.PageOverflow;
import com.hydrogen.nucleus.model.PageOverflowSettings;
import com.hydrogen.nucleus.ApiException;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for OverflowApi
 */
@Ignore
public class OverflowApiTest {

    private final OverflowApi api = new OverflowApi();

    
    /**
     * Create a Overflow Settings request
     *
     * Create a new Overflow Settings request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOverflowSettingsUsingPostTest() throws ApiException {
        OverflowSettings overflowSettings = null;
        OverflowSettings response = api.createOverflowSettingsUsingPost(overflowSettings);

        // TODO: test validations
    }
    
    /**
     * Create a Overflow request
     *
     * Create a new Overflow request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOverflowUsingPostTest() throws ApiException {
        OverflowVO overflowVO = null;
        Overflow response = api.createOverflowUsingPost(overflowVO);

        // TODO: test validations
    }
    
    /**
     * Delete a overflow settings
     *
     * Permanently delete a  overflow settings registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOverflowSettingsUsingDeleteTest() throws ApiException {
        UUID overflowSettingsId = null;
        api.deleteOverflowSettingsUsingDelete(overflowSettingsId);

        // TODO: test validations
    }
    
    /**
     * List all overflow objects
     *
     * Get details for all overflow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOverflowAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageOverflow response = api.getOverflowAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all overflow settings
     *
     * Get details for all overflow setting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOverflowSettingsAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageOverflowSettings response = api.getOverflowSettingsAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Overflow Setting
     *
     * Retrieve the information for a Overflow Settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOverflowSettingsUsingGetTest() throws ApiException {
        UUID overflowSettingsId = null;
        OverflowSettings response = api.getOverflowSettingsUsingGet(overflowSettingsId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Overflow object
     *
     * Retrieve the information for a Overflow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOverflowUsingGetTest() throws ApiException {
        UUID overflowId = null;
        Overflow response = api.getOverflowUsingGet(overflowId);

        // TODO: test validations
    }
    
    /**
     * Update a overflow settings
     *
     * Update the information for a overflow setting registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOverflowSettingsUsingPutTest() throws ApiException {
        OverflowSettings overflowSettings = null;
        UUID overflowSettingsId = null;
        OverflowSettings response = api.updateOverflowSettingsUsingPut(overflowSettings, overflowSettingsId);

        // TODO: test validations
    }
    
}
