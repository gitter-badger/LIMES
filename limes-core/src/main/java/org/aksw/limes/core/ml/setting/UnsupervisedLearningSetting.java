package org.aksw.limes.core.ml.setting;

import org.aksw.limes.core.ml.algorithm.MLAlgorithm;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
public class UnsupervisedLearningSetting implements LearningSetting {
	
	public UnsupervisedLearningSetting() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void learn(MLAlgorithm algorithm) {
		// TODO Auto-generated method stub
		// will use the following
		algorithm.learn();
	}

}