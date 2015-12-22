package com.basistech.rosette.examples;

import com.basistech.rosette.api.RosetteAPI;
import com.basistech.rosette.apimodel.LinkedEntitiesResponse;

/**
 * Example which demonstrates the entity linking api.
 */
public final class EntitiesLinkedExample extends ExampleBase {
    public static void main(String[] args) {
        try {
            String text = "Last month director Paul Feig announced the movie will have an all-star female cast including Kristen Wiig, Melissa McCarthy, Leslie Jones and Kate McKinnon.";

            RosetteAPI rosetteApi = new RosetteAPI(getApiKeyFromSystemProperty());
            LinkedEntitiesResponse response = rosetteApi.getLinkedEntities(text, null, null);
            System.out.println(responseToJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
