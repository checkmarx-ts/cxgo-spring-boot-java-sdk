package com.checkmarx.sdk.dto.od;

import com.fasterxml.jackson.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "items",
        "totalCount"
})
public class OdProjectListData {
    @JsonProperty("items")
    private List<OdProjectListDataItem> items = null;
    @JsonProperty("totalCount")
    private Long totalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("items")
    public List<OdProjectListDataItem> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<OdProjectListDataItem> items) {
        this.items = items;
    }

    @JsonProperty("totalCount")
    public Long getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}