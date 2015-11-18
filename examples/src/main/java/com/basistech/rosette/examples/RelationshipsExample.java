package com.basistech.rosette.examples;

import com.basistech.rosette.api.RosetteAPI;
import com.basistech.rosette.apimodel.RelationshipsResponse;

/**
 * Example which demonstrates the entity extraction api.
 */
public final class RelationshipsExample extends ExampleBase {
    public static void main(String[] args) {
        try {
            String text = "Yesterday in Guatemala, the Supreme Court approved the attorney general's request to impeach President Otto Pérez Molina.";

            RosetteAPI rosetteApi = new RosetteAPI(getApiKeyFromSystemProperty());
            Relationships response = rosetteApi.getRelationships(text, null, null);
            System.out.println(responseToJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
