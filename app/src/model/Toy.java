//class toy 

public class Toy {
	private String id;
	private String name;
	private Byte probability;

	public Toy(String id, String name, Byte probability){
		this.id = id;
		this.name = name;
		this.probability = probability;
	}

	public String getId() {
		return this.id;
	}

	public void setId(id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(name) {
		return this.name = name;
	}

	public Byte getProbability() {
        return probability;
    }

    public void setProbability(Byte probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "ID: " + id + ". Name: " + name + ". Probability: " + probability;
    }
}