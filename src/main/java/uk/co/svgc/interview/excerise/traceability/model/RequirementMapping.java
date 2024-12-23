package uk.co.svgc.interview.excerise.traceability.model;

public @interface RequirementMapping {
    RequirementLink[] links() default {};
}
