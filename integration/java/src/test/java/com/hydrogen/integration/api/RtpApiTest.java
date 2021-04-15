/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.api;

import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.model.RtpBankLinkRequestCO;
import com.hydrogen.integration.model.RtpBankLinkResponseVO;
import com.hydrogen.integration.model.RtpTransferRequestCO;
import com.hydrogen.integration.model.RtpTransferResponseVO;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for RtpApi
 */
@Ignore
public class RtpApiTest {

    private final RtpApi api = new RtpApi();

    
    /**
     * Cancel the RTP transfer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelRtpTransferUsingDeleteTest() throws ApiException {
        UUID nucleusFundingId = null;
        RtpTransferResponseVO response = api.cancelRtpTransferUsingDelete(nucleusFundingId);

        // TODO: test validations
    }
    
    /**
     * Create bank link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBankLinkUsingPost2Test() throws ApiException {
        RtpBankLinkRequestCO request = null;
        RtpBankLinkResponseVO response = api.createBankLinkUsingPost2(request);

        // TODO: test validations
    }
    
    /**
     * Delete bank link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBankLinkUsingDelete2Test() throws ApiException {
        UUID nucleusBankLinkId = null;
        RtpBankLinkResponseVO response = api.deleteBankLinkUsingDelete2(nucleusBankLinkId);

        // TODO: test validations
    }
    
    /**
     * Get bank link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBankLinkUsingGet2Test() throws ApiException {
        UUID nucleusBankLinkId = null;
        RtpBankLinkResponseVO response = api.getBankLinkUsingGet2(nucleusBankLinkId);

        // TODO: test validations
    }
    
    /**
     * Get client bank links
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClientBankLinksUsingGet1Test() throws ApiException {
        UUID nucleusClientId = null;
        List<RtpBankLinkResponseVO> response = api.getClientBankLinksUsingGet1(nucleusClientId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Rtp transfers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListOfRtpTransfersUsingGetTest() throws ApiException {
        UUID nucleusClientId = null;
        List<RtpTransferResponseVO> response = api.getListOfRtpTransfersUsingGet(nucleusClientId);

        // TODO: test validations
    }
    
    /**
     * Get the RTP transfer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRtpTransferUsingGetTest() throws ApiException {
        UUID nucleusFundingId = null;
        RtpTransferResponseVO response = api.getRtpTransferUsingGet(nucleusFundingId);

        // TODO: test validations
    }
    
    /**
     * Submit a RTP transfer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitRtpTransferUsingPostTest() throws ApiException {
        RtpTransferRequestCO transferRequest = null;
        RtpTransferResponseVO response = api.submitRtpTransferUsingPost(transferRequest);

        // TODO: test validations
    }
    
    /**
     * Update bank link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBankLinkUsingPut2Test() throws ApiException {
        UUID nucleusBankLinkId = null;
        RtpBankLinkResponseVO response = api.updateBankLinkUsingPut2(nucleusBankLinkId);

        // TODO: test validations
    }
    
}