package uk.co.svgc.interview.excerise.traceability.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to document and trace bug fixes in the codebase.
 * <p>
 * This annotation can be used to provide additional details about bugs 
 * that have been resolved, including a description and a list of issue IDs.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface BugFix {

    /**
     * Provides a detailed description of the bug fix.
     *
     * @return the description of the bug
     */
    String description();

    /**
     * A list of issue IDs associated with the bug fix.
     *
     * @return an array of issue IDs
     */
    String[] issues();
}
