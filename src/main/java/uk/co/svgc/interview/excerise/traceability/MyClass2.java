package uk.co.svgc.interview.excerise.traceability;

import uk.co.svgc.interview.excerise.traceability.model.Feature;
import uk.co.svgc.interview.excerise.traceability.model.FeatureScope;

@Feature(
        description = "",
        issue = "NEW_FEATURE_002",
        scope = FeatureScope.CONTRIBUTES_TO,
        seeAlso = {
                MyClass.class
        }
)
public class MyClass2 {
}
