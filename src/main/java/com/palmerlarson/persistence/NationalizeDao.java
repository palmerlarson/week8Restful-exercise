package com.palmerlarson.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nationalize.NameFinder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * The type Nationalizedao.
 */
public class NationalizeDao {

    private String userName;

    /**
     * Set name.
     *
     * @param name the name
     */
    public void setName(String name){
        this.userName = name;
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
        return userName;
    }

    /**
     * The Uri name.
     */
    public String uriName;

    /**
     * Instantiates a new Nationalizedao.
     */
    public NationalizeDao() {

    }

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Gets nation.
     *
     * @return the nation
     */
    NameFinder getNation() {
        uriName = "https://api.nationalize.io?name=" + getName();
        Client client = ClientBuilder.newClient();
        NameFinder name = null;
        WebTarget target =
                client.target(uriName);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            name = mapper.readValue(response, NameFinder.class);
        } catch (JsonProcessingException e) {
            logger.error(e);
        }
    return name;
    }

}
