package org.chimi.s4t.application.transcode;

import java.io.File;
import java.util.List;

public interface Transcoder {

	List<File> transcode(File multimediaFile, Long jobId);

}