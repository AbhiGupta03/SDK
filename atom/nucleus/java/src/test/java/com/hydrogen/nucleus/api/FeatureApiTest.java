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

import com.hydrogen.nucleus.model.Feature;
import com.hydrogen.nucleus.model.FeatureTrack;
import com.hydrogen.nucleus.model.PageFeature;
import com.hydrogen.nucleus.model.PageFeatureTrack;
import com.hydrogen.nucleus.ApiException;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for FeatureApi
 */
@Ignore
public class FeatureApiTest {

    private final FeatureApi api = new FeatureApi();

    
    /**
     * Create a Feature Track
     *
     * Create a new feature track.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeatureTrackUsingPostTest() throws ApiException {
        FeatureTrack featureTrack = null;
        FeatureTrack response = api.createFeatureTrackUsingPost(featureTrack);

        // TODO: test validations
    }
    
    /**
     * Create a  Feature
     *
     * Create a new feature.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeatureUsingPostTest() throws ApiException {
        Feature feature = null;
        Feature response = api.createFeatureUsingPost(feature);

        // TODO: test validations
    }
    
    /**
     * Delete a Feature Track
     *
     * Permanently delete a feature track registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFeatureTrackUsingDeleteTest() throws ApiException {
        UUID featureTrackId = null;
        api.deleteFeatureTrackUsingDelete(featureTrackId);

        // TODO: test validations
    }
    
    /**
     * Delete a Feature
     *
     * Permanently delete a  feature registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFeatureUsingDeleteTest() throws ApiException {
        UUID featureId = null;
        api.deleteFeatureUsingDelete(featureId);

        // TODO: test validations
    }
    
    /**
     * List all Feature
     *
     * Get details for all features.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageFeature response = api.getFeatureAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all Feature track
     *
     * Get details for all feature track.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureTrackAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageFeatureTrack response = api.getFeatureTrackAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Feature track
     *
     * Retrieve the information for a Feature track.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureTrackUsingGetTest() throws ApiException {
        UUID featureTrackId = null;
        FeatureTrack response = api.getFeatureTrackUsingGet(featureTrackId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Feature
     *
     * Retrieve the information for a Feature.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureUsingGetTest() throws ApiException {
        UUID featureId = null;
        Feature response = api.getFeatureUsingGet(featureId);

        // TODO: test validations
    }
    
    /**
     * Update a Feature Track
     *
     * Update the information for a Feature track registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFeatureTrackUsingPutTest() throws ApiException {
        FeatureTrack featureTrack = null;
        UUID featureTrackId = null;
        FeatureTrack response = api.updateFeatureTrackUsingPut(featureTrack, featureTrackId);

        // TODO: test validations
    }
    
    /**
     * Update a Feature
     *
     * Update the information for a Feature registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFeatureUsingPutTest() throws ApiException {
        Feature feature = null;
        UUID featureId = null;
        Feature response = api.updateFeatureUsingPut(feature, featureId);

        // TODO: test validations
    }
    
}
