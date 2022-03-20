package com.bl.birdsentuarysystem;
import java.util.Objects;

public abstract class Birds {
	
	    enum Color{RED, GREEN, WHITE, BLACK_WHITE, BLUE}
	    
	    String id;
		String name;
		Color color;

        @Override
		public String toString() {
			return "Birds [id=" + id + ", name=" + name + ", color=" + color + "]";
        }
		
		
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Birds other = (Birds) obj;
			return Objects.equals(id, other.id);
		}

		void eat() {
			System.out.println(getClass().getSimpleName() + " eat");
		}
		
		void fly() {
			System.out.println(getClass().getSimpleName() + "can fly");
		}
		
		void swim() {
			System.out.println(getClass().getSimpleName() + " can swim");
		}
}