package com.basics.design_patterns;

public abstract class Video {
	
	protected ProcessingQuality quality;
	public Video(ProcessingQuality quality) {
		this.quality=quality;
	}
	
	public abstract void playVideo();
}
