import java.text.DecimalFormat;

public class Stat implements Visitor_Files{

    DecimalFormat decimalFormat = new DecimalFormat("0.000000");

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file " + htmlFileDetails.name + " contains " + htmlFileDetails.getLines() + " lines.");
    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        double average=(double)docxFileDetails.getWords()/docxFileDetails.getPages();
        System.out.println("The file " + docxFileDetails.name + " has an average of " + decimalFormat.format(average)
                + " words per page.");
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        double average = (double)pptxFileDetails.getSize()/pptxFileDetails.getSlides();
        System.out.println("The average slide size in Presentation " + pptxFileDetails.name
                + " is " + decimalFormat.format(average) +  ".");
    }


    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        double average=(double)jpgFileDetails.getSize()/(jpgFileDetails.getHeight() * jpgFileDetails.getWidth());
        System.out.println("The picture " + jpgFileDetails.name + " has an average of "
                + decimalFormat.format(average)
                + " bits per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        double average=(double)mp3FileDetails.getSize()/ mp3FileDetails.getLengthSec();
        System.out.println("The bitrate of " + mp3FileDetails.name + " is "
                + decimalFormat.format(average)
                + " bytes per second.");
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        Count counter = new Count();
        directoryDetails.accept(counter);
        System.out.println("Directory "+ directoryDetails.name+" has "+counter.count+" files.");
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println("The file " + txtFileDetails.name + " contains " + txtFileDetails.getWords() + " words.");
    }
}