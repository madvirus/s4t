package org.chimi.s4t.domain.job;

public enum Container {

	MP4(VideoCodec.H264, AudioCodec.AAC, "mp4"), AVI(VideoCodec.MPEG4,
			AudioCodec.MP3, "avi");

	private VideoCodec defaultVideoCodec;
	private AudioCodec defaultAudioCodec;
	private String fileExtension;

	private Container(VideoCodec defaultVideoCodec,
			AudioCodec defaultAudioCodec, String fileExtenstion) {
		this.defaultVideoCodec = defaultVideoCodec;
		this.defaultAudioCodec = defaultAudioCodec;
		this.fileExtension = fileExtenstion;
	}

	public VideoCodec getDefaultVideoCodec() {
		return defaultVideoCodec;
	}

	public AudioCodec getDefaultAudioCodec() {
		return defaultAudioCodec;
	}

	public String getFileExtension() {
		return fileExtension;
	}

}
