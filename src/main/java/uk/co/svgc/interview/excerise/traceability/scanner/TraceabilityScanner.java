package uk.co.svgc.interview.excerise.traceability.scanner;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import uk.co.svgc.interview.excerise.traceability.model.TracabilityResponse;

public interface TraceabilityScanner {

    final String BASE_PACKAGE = "uk.co.svgc.interview.excerise.traceability";

    TracabilityResponse findOccurances(String id);
}
