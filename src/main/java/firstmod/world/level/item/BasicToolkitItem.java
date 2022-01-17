package firstmod.world.level.item;

public class BasicToolkitItem extends ToolkitItem {

	public BasicToolkitItem() {
		super(200);
	}
	
	@Override
	public ToolkitType getToolkitType() {
		return ToolkitType.BASIC;
	}
}
