package inmetrics.automacao.evidencia.structure;

import inmetrics.automacao.evidencia.constant.Constant;

public class FolderStructure {

	public static void createFolderStructureEvidence() {
		new java.io.File(Constant.FOLDER_DOC_EVIDENCE).mkdirs();
		new java.io.File(Constant.FOLDER_HTML_EVIDENCE).mkdirs();
		new java.io.File(Constant.FOLDER_PDF_EVIDENCE).mkdirs();
		new java.io.File(Constant.FOLDER_VIDEO).mkdirs(); 
		new java.io.File(Constant.FOLDER_PRINT).mkdirs();
	}
}
