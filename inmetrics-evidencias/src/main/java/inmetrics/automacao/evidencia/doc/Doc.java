package inmetrics.automacao.evidencia.doc;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.TextFormFieldType;

import java.awt.*;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doc {

	private inmetrics.automacao.evidencia.constant.Constant Constant;
	private String pathEvidenceDocs = Constant.FOLDER_DOC_EVIDENCE;
	private String logo;
	private String imagePath;
	private String text;
	private String dateNow;
	private Date date;
	private DateFormat dateFormat;
	private Document doc;
	private DocumentBuilder builder;
	private int verticalPosition = 0;

	public Doc(ArrayList<?> array, ArrayList<?> arrayText, String classe) throws Exception {
		dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		date = new Date();
		dateNow = dateFormat.format(date);
		doc = new Document();
		builder = new DocumentBuilder(doc);  

		logo = "target/logo/logo.jpg";

		builder.insertParagraph();
		builder.insertImage(logo, 70, 35);
		builder.getFont().setSize(20);
		builder.insertTextInput("", TextFormFieldType.REGULAR, "", "\t\t\tREPORTS\t", 0);
		builder.getFont().setSize(11);
		builder.insertParagraph();
		builder.insertTextInput("", TextFormFieldType.REGULAR, "", "execution date: " + dateNow, 0);
		
		for (int i = 0; i < array.size(); i++) {
			imagePath = (String) array.get(i);
			text = (String) arrayText.get(i);
			FileInputStream in = new FileInputStream(imagePath);

			builder.getFont().setColor(Color.black);
			builder.getFont().setEmboss(false);
			builder.getFont().setEngrave(false);
			builder.getFont().setHighlightColor(Color.WHITE);
			builder.getFont().setSize(12);

			builder.insertTextInput("", TextFormFieldType.REGULAR, "", "\n\n" + text, 0);

			builder.insertImage(in, 540, 320);
			verticalPosition = verticalPosition + 400;
		}

		doc.save(pathEvidenceDocs + "Automation_Evid_" + classe + "_" + dateNow  + ".docx");
	}

}
