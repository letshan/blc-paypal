/*
 * #%L
 * BroadleafCommerce PayPal
 * %%
 * Copyright (C) 2009 - 2014 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.vendor.paypal.service.payment.message;

import java.io.Serializable;

/**
 * @author Jeff Fischer
 */
public abstract class PayPalResponse implements Serializable {

    protected String responseToken;
    protected String rawResponse;

    public String getResponseToken() {
        return responseToken;
    }

    public void setResponseToken(String responseToken) {
        this.responseToken = responseToken;
    }

    public String getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PayPalResponse)) return false;

        PayPalResponse that = (PayPalResponse) o;

        if (rawResponse != null ? !rawResponse.equals(that.rawResponse) : that.rawResponse != null)
            return false;
        if (responseToken != null ? !responseToken.equals(that.responseToken) : that.responseToken != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rawResponse != null ? rawResponse.hashCode() : 0;
        result = 31 * result + (responseToken != null ? responseToken.hashCode() : 0);
        return result;
    }
}
