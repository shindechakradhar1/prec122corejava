package in.prec.generics.classes;

public class PreGenericObject {
	private Object[] obj;
	
	public void setObj(Object... obj) {
		this.obj=obj;
	}
	
	public Object[] getObj() {
		return obj;
	}
}
