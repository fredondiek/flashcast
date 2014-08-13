/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.i2m.converge.plugins.actions.flashcast;

import java.util.logging.Logger;

/**
 *
 * @author fred
 */
public class FlashCastServicesClient {
    private static final Logger LOG = Logger.getLogger(FlashCastServicesClient.class.getName());
    private String hostname;
    private String endpoint;
    private Integer connectionTimeout = 30000;
    private Integer socketTimeout = 30000;
    private String websiteUrl;
    private String username;
    private String password;
    private Integer replyTimeOut=60000;
    
     public FlashCastServicesClient() {
        this("", "", "", "");
    }
     public FlashCastServicesClient(String websiteUrl, String username, String password) {
        this.websiteUrl = websiteUrl;
        this.username = username;
        this.password = password;
    }
     
     public FlashCastServicesClient(String websiteUrl, String username, String password,String connectionTimeout) {
        this.websiteUrl = websiteUrl;
        this.username = username;
        this.password = password;
        this.connectionTimeout=Integer.parseInt(connectionTimeout);
    }
    
}
