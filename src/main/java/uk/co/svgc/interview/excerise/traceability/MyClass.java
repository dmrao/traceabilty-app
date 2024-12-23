package uk.co.svgc.interview.excerise.traceability;

import uk.co.svgc.interview.excerise.traceability.model.Bug;
import uk.co.svgc.interview.excerise.traceability.model.BugFix;
import uk.co.svgc.interview.excerise.traceability.model.Feature;
import uk.co.svgc.interview.excerise.traceability.model.FeatureScope;
import uk.co.svgc.interview.excerise.traceability.model.RequirementLink;
import uk.co.svgc.interview.excerise.traceability.model.RequirementMapping;
import uk.co.svgc.interview.excerise.traceability.model.RequirementScope;

@Feature(
        description = "This class does X towards the new feature",
        issue = "NEW_FEATURE_002",
        scope = FeatureScope.CONTRIBUTES_TO,
        seeAlso = {
                MyClass2.class
        }
)
public class MyClass {

    @Bug(description = "this method is faulty", issues = {"BUG_001"})
    public void methodOne() {
    }

    @RequirementMapping(
            links = {
                    @RequirementLink(scope = RequirementScope.MEETS, id = "RQT1")
            }
    )
    public void methodTwo() {

    }

    @BugFix(description = "This fixes the bug by removing the problem", issues = {"BUG_001"})
    public void methodThree() {

    }

}
