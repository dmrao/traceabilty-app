package uk.co.svgc.interview.excerise.traceability.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to document and trace bugs in the codebase.
 * <p>
 * This annotation is used to provide detailed information about bugs 
 * that are associated with specific code elements, such as classes or methods.
 * It allows for better traceability and documentation of known issues.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Bug  {

    /**
     * Provides a detailed description of the bug.
     * This should include the nature of the bug and the context in which it occurs.
     *
     * @return the description of the bug
     */
    String description();

    /**
     * A list of issue identifiers associated with this bug.
     * These could be references to tickets, tasks, or other issue tracking records.
     *
     * @return an array of issue IDs
     */
    String[] issues();
}
