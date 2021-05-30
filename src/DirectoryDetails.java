import java.util.ArrayList;
import java.util.List;

public class DirectoryDetails extends FileDetails {

    private List<FileDetails> files_details = new ArrayList<>();

    public DirectoryDetails(String path, String name){
        super(path,name);
    }

    @Override
    public void accept(Visitor_Files visitor_files) {
        for (FileDetails file :files_details) {file.accept(visitor_files);}
        visitor_files.visit(this);
    }

    public void addFile(FileDetails fileDetails){
        files_details.add(fileDetails);
    }
}