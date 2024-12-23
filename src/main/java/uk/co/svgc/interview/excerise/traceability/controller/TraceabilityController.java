package uk.co.svgc.interview.excerise.traceability.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uk.co.svgc.interview.excerise.traceability.model.TracabilityResponse;
import uk.co.svgc.interview.excerise.traceability.service.TraceabilityService;

/**
 * REST Controller to provide traceability information.
 */
@RestController
public class TraceabilityController {

    TraceabilityService traceabilityService;

    @Autowired
    TraceabilityController(TraceabilityService traceabilityService) {
        this.traceabilityService = traceabilityService;
    }

    /**
     * REST API endpoint to fetch traceability information for a given bug/requirement ID.
     *
     * @param bugId The ID of the bug/requirement to trace.
     * @return A {@link TraceabilityResponse} containing trace details.
     */
    @GetMapping("/api/traceability")
    public TracabilityResponse getTraceability(@RequestParam String id) {
        TracabilityResponse response = null;
        try {
            response = traceabilityService.sacnforImplementations(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Response: " + response);
        return response;
    }
}
