public class Mp3FileDetails extends FileDetails {
    private int lengthSec;
    private int size;

    public Mp3FileDetails(String path, String fileName, int lengthSec, int size){
        super(path,fileName);
        this.lengthSec=lengthSec;
        this.size=size;
    }

    public int getLengthSec() {
        return lengthSec;
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
