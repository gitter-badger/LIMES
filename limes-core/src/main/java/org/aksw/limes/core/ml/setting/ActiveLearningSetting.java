package org.aksw.limes.core.ml.setting;

import org.aksw.limes.core.ml.algorithm.MLAlgorithm;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
public class ActiveLearningSetting implements LearningSetting {
	
	public ActiveLearningSetting() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void learn(MLAlgorithm algorithm) {
		// TODO Auto-generated method stub
		// will use the following
		algorithm.learn();
	}

}