package inmetrics.automacao.evidencia.video;

import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class EvidenceVideo {
	ScreenRecorder screenRecorder;
	private inmetrics.automacao.evidencia.constant.Constant Constant;
	String targetFolder = Constant.FOLDER_VIDEO;

	/**
	 * Construtor da classe ReportVideo
	 */
	public EvidenceVideo() throws IOException, AWTException {
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration();
		new java.io.File(targetFolder).mkdirs();
		screenRecorder = new ScreenRecorder(gc, gc.getBounds(),
				new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
						Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
				null, new File(targetFolder));

	}

	/**
	 * Construtor da classe ReportVideo
	 */
	public EvidenceVideo(String path) throws IOException, AWTException {
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration();

		screenRecorder = new ScreenRecorder(gc, gc.getBounds(),
				new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
						Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
				null, new File(path.concat("Videos")));

	}

	/**
	 * Método para iniciar a gravação do video.
	 * 
	 * @return void
	 */

	public void start() throws IOException, AWTException {
		screenRecorder.start();
	}

	/**
	 * Método para parar a gravação do video.
	 * 
	 * @return void
	 */
	public void stop() throws IOException {
		screenRecorder.stop();
	}

}
