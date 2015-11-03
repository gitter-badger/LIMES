package org.aksw.limes.core.measures.measure;

import org.aksw.limes.core.data.Instance;

public interface Measure {
    public double getSimilarity(Object a, Object b);    
    public double getSimilarity(Instance a, Instance b, String property1, String property2);
    public double getRuntimeApproximation(double mappingSize);
}
