import java.util.ArrayList;

//组合模式
public class Container {}

abstract class AbstractFile{
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}

class ImageFile extends AbstractFile{
	private String name;
	
	public ImageFile(String name){
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("sorry not support adding");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("sorry not support removing");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("sorry not support getting child");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("kill image "+name+"'s virus");
	}
}

class TextFile extends AbstractFile{
	private String name;
	
	public TextFile(String name){
		this.name = name;
	}
	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("not support adding");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("not support removing");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("not support getting child");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("kill text "+name+"'s virus");
	}
}

class Folder extends AbstractFile{
	private String name;
	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	
	public Folder(String name){
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return (AbstractFile)fileList.get(i);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("kill folder "+name+"'s virus");
		for(Object obj : fileList){
			((AbstractFile)obj).killVirus();
		}
	}
}

