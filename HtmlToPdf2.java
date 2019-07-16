package tableu;
import java.io.FileOutputStream;
import java.io.StringReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

public class HtmlToPdf2 {
	  public static void main(String ... args ) {
		    try {
		      Document document = new Document(PageSize.LETTER);
		      PdfWriter.getInstance(document, new FileOutputStream("/Users/abirami/Desktop/Text.pdf"));
		      document.open();
		      document.addAuthor("Abirami");
		      document.addCreator("Ravishankar");
		      document.addSubject("VNL project");
		      document.addCreationDate();
		      document.addTitle("Open");

		      HTMLWorker htmlWorker = new HTMLWorker(document);
		      String str = "<!DOCTYPE html>\n" + 
		      		"<html lang=\"en\">\n" + 
		      		"<head>\n" + 
		      		"    <!-- The jQuery library is a prerequisite for all jqSuite products -->\n" + 
		      		"    <script type=\"text/ecmascript\" src=\"../../../js/jquery.min.js\"></script> \n" + 
		      		"    <!-- This is the Javascript file of jqGrid -->   \n" + 
		      		"    <script type=\"text/ecmascript\" src=\"../../../js/trirand/jquery.jqGrid.min.js\"></script>\n" + 
		      		"    <!-- This is the localization file of the grid controlling messages, labels, etc.\n" + 
		      		"    <!-- We support more than 40 localizations -->\n" + 
		      		"    <script type=\"text/ecmascript\" src=\"../../../js/trirand/i18n/grid.locale-en.js\"></script>\n" + 
		      		"	<!-- Load pdfmake lib files -->\n" + 
		      		"	<script type=\"text/javascript\" language=\"javascript\" src=\"//cdn.rawgit.com/bpampuch/pdfmake/0.1.26/build/pdfmake.min.js\">	</script>\n" + 
		      		"	<script type=\"text/javascript\" language=\"javascript\" src=\"//cdn.rawgit.com/bpampuch/pdfmake/0.1.26/build/vfs_fonts.js\"></script>\n" + 
		      		"	\n" + 
		      		"    <!-- A link to a jQuery UI ThemeRoller theme, more than 22 built-in and many more custom -->\n" + 
		      		"    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"../../../css/jquery-ui.css\" />\n" + 
		      		"    <!-- The link to the CSS that the grid needs -->\n" + 
		      		"    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"../../../css/trirand/ui.jqgrid.css\" />\n" + 
		      		"    <meta charset=\"utf-8\" />\n" + 
		      		"    <title>jqGrid Export to CSV, PDF, Excel</title>\n" + 
		      		"</head>\n" + 
		      		"<body>\n" + 
		      		"\n" + 
		      		"    <table id=\"jqGrid\"></table>\n" + 
		      		"	<button id=\"export\">Export to PDF</button>\n" + 
		      		"	\n" + 
		      		"\n" + 
		      		"    <script type=\"text/javascript\"> \n" + 
		      		"    \n" + 
		      		"        $(document).ready(function () {\n" + 
		      		"            $(\"#jqGrid\").jqGrid({\n" + 
		      		"                url: 'data.json',\n" + 
		      		"                datatype: \"json\",\n" + 
		      		"                colModel: [\n" + 
		      		"					{ label: 'Category Name', name: 'CategoryName', width: 75 },\n" + 
		      		"					{ label: 'Product Name', name: 'ProductName', width: 90 },\n" + 
		      		"					{ label: 'Country', name: 'Country', width: 100 },\n" + 
		      		"					{ label: 'Price', \n" + 
		      		"						name: 'Price', \n" + 
		      		"						width: 80, \n" + 
		      		"						sorttype: 'number', \n" + 
		      		"						formatter: 'number',\n" + 
		      		"						align: 'right'\n" + 
		      		"					},\n" + 
		      		"					{ label: 'Quantity', name: 'Quantity', width: 80, sorttype: 'integer' }                   \n" + 
		      		"                ],\n" + 
		      		"				loadonce: true,\n" + 
		      		"				viewrecords: true,\n" + 
		      		"                footerrow: true,\n" + 
		      		"                userDataOnFooter: true, // use the userData parameter of the JSON response to display data on footer\n" + 
		      		"                width: 780,\n" + 
		      		"                height: 200,\n" + 
		      		"                rowNum: 150\n" + 
		      		"            });\n" + 
		      		"			\n" + 
		      		"			$(\"#export\").on(\"click\", function(){\n" + 
		      		"				$(\"#jqGrid\").jqGrid(\"exportToPdf\",{\n" + 
		      		"					title: 'jqGrid Export to PDF',\n" + 
		      		"					orientation: 'portrait',\n" + 
		      		"					pageSize: 'A4',\n" + 
		      		"					description: 'description of the exported document',\n" + 
		      		"					customSettings: null,\n" + 
		      		"					download: 'download',\n" + 
		      		"					includeLabels : true,\n" + 
		      		"					includeGroupHeader : true,\n" + 
		      		"					includeFooter: true,\n" + 
		      		"					fileName : \"jqGridExport.pdf\"\n" + 
		      		"				})\n" + 
		      		"			})\n" + 
		      		"        });\n" + 
		      		"\n" + 
		      		"    </script>\n" + 
		      		"\n" + 
		      		"    \n" + 
		      		"</body>\n" + 
		      		"</html>";
				      htmlWorker.parse(new StringReader(str));
				      document.close();
				      System.out.println("Done");
				      }
				    catch (Exception e) {
				      e.printStackTrace();
				    }
				  }
		}