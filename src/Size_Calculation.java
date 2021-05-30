public class Size_Calculation implements  Visitor_Files{

    public int size_calculation = 0;

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        size_calculation += docxFileDetails.getSize();
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        size_calculation += htmlFileDetails.getSize();
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        size_calculation += jpgFileDetails.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        size_calculation += mp3FileDetails.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        size_calculation += pptxFileDetails.getSize();
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        size_calculation += txtFileDetails.getSize();
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {

    }

}
