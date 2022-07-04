package java_test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(value=RetentionPolicy.RUNTIME)
public @interface ParentAnn {
    public ChildAnn value();
}
