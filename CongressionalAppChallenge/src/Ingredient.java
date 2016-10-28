
public class Ingredient {
	private String name, unit;
	private Integer quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Ingredient(String name, String unit, Integer quantity) {
		this.name = name;
		this.unit = unit;
		this.quantity = quantity;
	}
	
	
}
