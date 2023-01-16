/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.databend.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

import static com.google.common.base.MoreObjects.toStringHelper;

// "schema":[{"name":"column1","type":"UInt8"}]
// "schema":[{"name":"column2","type":"Nullable(UInt8)"}]
public class QuerySchema {
    private final List<QueryRowField> fields;

    @JsonCreator
    public QuerySchema(
            @JsonProperty() List<QueryRowField> fields) {
        this.fields = fields;
    }

    // add builder

    @JsonProperty
    public List<QueryRowField> getFields() {
        return fields;
    }


    @Override
    public String toString() {
        return toStringHelper(this)
                .add("", fields)
                .toString();
    }
}
