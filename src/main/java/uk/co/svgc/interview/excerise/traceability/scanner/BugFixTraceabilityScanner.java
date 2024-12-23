package uk.co.svgc.interview.excerise.traceability.scanner;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import uk.co.svgc.interview.excerise.traceability.model.BugFix;
import uk.co.svgc.interview.excerise.traceability.model.TracabilityResponse;

@Component
public class BugFixTraceabilityScanner implements TraceabilityScanner {

    public TracabilityResponse findOccurances(String id) {
        TracabilityResponse response = new TracabilityResponse(id);
        try {
            List<Class<?>> classes = TraceabilityHelper.getAllClasses(BASE_PACKAGE);
            for (Class<?> clazz : classes) {
                for (Method method : clazz.getDeclaredMethods()) {
                    if (method.isAnnotationPresent(BugFix.class)) {
                        BugFix bugFix = method.getAnnotation(BugFix.class);
                       if (Arrays.asList(bugFix.issues()).contains(id)) {
                            response.setId(bugFix.issues()[0]);
                            response.setDescription(bugFix.description());
                            response.setClassName(clazz.getName());
                            response.setMethodName(method.getName());
                            return response;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
