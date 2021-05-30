public class PptxFileDetails extends FileDetails {

    private int slides;
    private int size;
    public PptxFileDetails(String path, String fileName, int slides, int size){
        super(path,fileName);
        this.slides=slides;
        this.size=size;
    }

    public int getSlides() {
        return slides;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor_Files visitor_files) {
        try {
            visitor_files.visit(this);
        }catch (ClassCastException e) {}
    }

}
