package com.basics.design_patterns;

public class PrimeChannel extends Video {

	public PrimeChannel(ProcessingQuality quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("play video");
		quality.processVideo();
	}

}
