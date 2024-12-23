package uk.co.svgc.interview.excerise.traceability.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.svgc.interview.excerise.traceability.model.TracabilityResponse;
import uk.co.svgc.interview.excerise.traceability.scanner.BugFixTraceabilityScanner;
import uk.co.svgc.interview.excerise.traceability.scanner.BugTraceabilityScanner;

@Service
public class TraceabilityService {


private BugTraceabilityScanner bugTraceabilityScanner;
private BugFixTraceabilityScanner bugFixTraceabilityScanner;
// TODO - implement featureTraceabilityScanner
//private TraceabilityScanner featureTraceabilityScanner;

@Autowired
public TraceabilityService(BugTraceabilityScanner bugTraceabilityScanner, BugFixTraceabilityScanner bugFixTraceabilityScanner) {
    this.bugTraceabilityScanner = bugTraceabilityScanner;
    this.bugFixTraceabilityScanner = bugFixTraceabilityScanner;
}

public TracabilityResponse sacnforImplementations(String id) {
    // scans for occurance of a given bug ID 
    return bugTraceabilityScanner.findImplementations(id);

    /*
     * TODO - Implement featureTraceabilityScanner
     * TODO - Implement bigFixTraceabilityScanner
     * TODO - Implement logic to combine results from all scanners
     */
}

}