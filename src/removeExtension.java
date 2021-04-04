public class removeExtension{
    
    public static String RemoveExtension(String s) {   
    String filename;
    
    // Remove the path upto the filename.
    int pos = s.lastIndexOf("/") + 1;
    if (pos == -1) {
        filename = s;
    } else {
        filename = s.substring(s.lastIndexOf("/")+1);
    }

    // Remove the extension.
    int extensionIndex = filename.lastIndexOf(".");
    if (extensionIndex == -1)
        return filename;

    return filename.substring(0, extensionIndex);
}
}