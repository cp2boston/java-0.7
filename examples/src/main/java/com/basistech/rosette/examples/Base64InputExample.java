package com.basistech.rosette.examples;

import com.basistech.rosette.api.RosetteAPI;
import com.basistech.rosette.apimodel.EntitiesResponse;
import org.apache.commons.codec.binary.Base64;

/**
 * Example which demonstrates the entity extraction api taking a base 64-encoded input.
 */
public final class EntitiesExample extends ExampleBase {
    public static void main(String[] args) {
        try {
            byte[] encodedExample = Base64.encodeBase64("Bill Murray will appear in new Ghostbusters film: Dr. Peter Venkman was spotted filming a cameo in Boston this… http://dlvr.it/BnsFfS ".);
            String text = new String(encodedExample);

            RosetteAPI rosetteApi = new RosetteAPI(getApiKeyFromSystemProperty());
            EntitiesResponse response = rosetteApi.getEntities(text, null, null);
            System.out.println(responseToJson(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
