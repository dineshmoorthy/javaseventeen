package interview;

import java.util.Objects;

public class HashCodeIDE {

	public int id;
	public String name;
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeIDE other = (HashCodeIDE) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
