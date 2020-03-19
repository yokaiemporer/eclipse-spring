package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("lap1")
@Lazy
public class Laptop {
		private int id;
		private int ram;
		Laptop()
		{
			System.out.println("\n laptop obj created");
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public void show()
		{
			System.out.print("yah bro inter object communication works ,cheers to autowired");
		}
}
