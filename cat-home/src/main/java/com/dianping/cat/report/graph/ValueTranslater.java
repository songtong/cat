package com.dianping.cat.report.graph;

public interface ValueTranslater {
	public double getMaxValue(double[] values);

	public int[] translate(int height, double maxValue, double[] values);
}
