import main.java.file.*;

String pathToFile = "";
String content = "";
//read
try {
  FileHandler.leggiDaFile(pathToFile);
}
catch(Exception e) {
  System.out.println(e.getMessage());
}
//write
try {
  FileHandler.generaFile(pathToFile, content);
}
catch(Exception e) {
  System.out.println(e.getMessage());
}
