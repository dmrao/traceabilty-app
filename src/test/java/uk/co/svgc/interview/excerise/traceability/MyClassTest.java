package uk.co.svgc.interview.excerise.traceability;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import uk.co.svgc.interview.excerise.traceability.model.Bug;
import uk.co.svgc.interview.excerise.traceability.model.BugFix;
import uk.co.svgc.interview.excerise.traceability.model.Feature;
import uk.co.svgc.interview.excerise.traceability.model.FeatureScope;

public class MyClassTest {

    @Test
    public void testClassFeatureAnnotation() {
        Feature feature = MyClass.class.getAnnotation(Feature.class);
        assertNotNull(feature);
        assertTrue(feature.description().equals("This class does X towards the new feature"));
        assertTrue(feature.issue().equals("NEW_FEATURE_002"));
        assertTrue(feature.scope() == FeatureScope.CONTRIBUTES_TO);
        assertTrue(feature.seeAlso()[0] == MyClass2.class);
    }

    @Test
    public void testMethodOneBugAnnotation() throws NoSuchMethodException {
        Method method = MyClass.class.getMethod("methodOne");
        Bug bug = method.getAnnotation(Bug.class);
        assertNotNull(bug);
        assertTrue(bug.description().equals("this method is faulty"));
    }

    @Test
    public void testMethodThreeBugFixAnnotation() throws NoSuchMethodException {
        Method method = MyClass.class.getMethod("methodThree");
        BugFix bugFix = method.getAnnotation(BugFix.class);
        assertNotNull(bugFix);
        assertTrue(bugFix.description().equals("This fixes the bug by removing the problem"));
    }
}