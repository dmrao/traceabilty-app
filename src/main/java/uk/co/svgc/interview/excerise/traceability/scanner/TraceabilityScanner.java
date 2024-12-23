package uk.co.svgc.interview.excerise.traceability.scanner;
import uk.co.svgc.interview.excerise.traceability.model.TracabilityResponse;

public interface TraceabilityScanner {

    final String BASE_PACKAGE = "uk.co.svgc.interview.excerise.traceability";

    TracabilityResponse findOccurances(String id);
}
