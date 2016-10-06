package Monster;

abstract public class Monster {
	protected String name;
	
	public Monster(){
		this.name = "Djordje";
	}
	
	public Monster(String name){
		this.name = name;
	}
	
	abstract public String attack();
	
}
