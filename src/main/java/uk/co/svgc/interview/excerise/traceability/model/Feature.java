package uk.co.svgc.interview.excerise.traceability.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to document and trace features in the codebase.
 * <p>
 * This annotation is used to associate specific features or functionalities 
 * with their respective scope, issue, and related classes for better traceability.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Feature {

    /**
     * Provides a detailed description of the feature.
     *
     * @return the description of the feature
     */
    String description();

    /**
     * The ID of the issue associated with this feature.
     *
     * @return the issue ID
     */
    String issue();

    /**
     * Specifies the scope of the feature.
     *
     * @return the feature scope
     */
    FeatureScope scope();

    /**
     * Optionally links related classes or features for better traceability.
     *
     * @return an array of related classes
     */
    Class<?>[] seeAlso() default {};
}
