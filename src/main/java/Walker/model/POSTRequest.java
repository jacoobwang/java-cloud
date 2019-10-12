/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package Walker.model;

import com.jdcloud.sdk.service.JdcloudRequest;
import com.jdcloud.sdk.annotation.*;
import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;
import java.io.IOException;
import javax.xml.bind.annotation.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * POSTRequest
 */
@XmlRootElement(name = "pOST_request")
@XmlAccessorType(XmlAccessType.FIELD)

public class POSTRequest extends JdcloudRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "jdcloudRequestBody")
    @SerializedName("jdcloudRequestBody")
    @BodyParameter
    private Object jdcloudRequestBody = null;

    public POSTRequest jdcloudRequestBody(Object jdcloudRequestBody) {
        this.jdcloudRequestBody = jdcloudRequestBody;
        return this;
    }

    /**
     * Get jdcloudRequestBody
     * @return jdcloudRequestBody
     **/

    public Object getJdcloudRequestBody() {
        return jdcloudRequestBody;
    }

    public void setJdcloudRequestBody(Object jdcloudRequestBody) {
        this.jdcloudRequestBody = jdcloudRequestBody;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        POSTRequest pOSTRequest = (POSTRequest) o;
        return Objects.equals(this.jdcloudRequestBody, pOSTRequest.jdcloudRequestBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jdcloudRequestBody);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class POSTRequest {\n");

        sb.append("    jdcloudRequestBody: ").append(toIndentedString(jdcloudRequestBody)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
