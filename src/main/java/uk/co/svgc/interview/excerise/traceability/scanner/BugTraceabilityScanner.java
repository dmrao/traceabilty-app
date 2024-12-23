package uk.co.svgc.interview.excerise.traceability.scanner;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import uk.co.svgc.interview.excerise.traceability.model.Bug;
import uk.co.svgc.interview.excerise.traceability.model.TracabilityResponse;

@Component
public class BugTraceabilityScanner implements TraceabilityScanner {

    public TracabilityResponse findOccurance(String id) {
        TracabilityResponse response = new TracabilityResponse(id);
        try {
            List<Class<?>> classes = TraceabilityHelper.getAllClasses(BASE_PACKAGE);
            for (Class<?> clazz : classes) {
                for (Method method : clazz.getDeclaredMethods()) {
                    if (method.isAnnotationPresent(Bug.class)) {
                        Bug bug = method.getAnnotation(Bug.class);
                       if (Arrays.asList(bug.issues()).contains(id)) {
                            response.setId(bug.issues()[0]);
                            response.setDescription(bug.description());
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

    public static void main(String[] args) {
        BugTraceabilityScanner scanner = new BugTraceabilityScanner();
        System.out.println(scanner.findImplementations("BUG_001"));
    }
}
