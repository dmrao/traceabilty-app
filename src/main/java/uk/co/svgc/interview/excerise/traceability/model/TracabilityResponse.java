package uk.co.svgc.interview.excerise.traceability.model;

import lombok.Data;

@Data
public class TracabilityResponse {

    private String id;

    private String description;

    private String className;

    private String methodName;

    public TracabilityResponse(String id) {
        this.id = id;
    }
}
