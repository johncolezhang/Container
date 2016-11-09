
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFile file1,file2,file3,file4,folder1,folder2,folder3;
		
		folder1 = new Folder("sum data");
		folder2 = new Folder("image data");
		folder3 = new Folder("text data");
		
		file1 = new ImageFile("a.jpg");
		file2 = new TextFile("b.txt");
		file3 = new TextFile("c.doc");
		file4 = new ImageFile("d.png");
		
		folder2.add(file1);
		folder3.add(file2);
		folder3.add(file3);
		folder1.add(folder3);
		folder1.add(folder2);
		folder1.add(file4);
		
		folder1.killVirus();
	}
}
