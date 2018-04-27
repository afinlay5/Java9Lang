/*
Copyright (C) 2018 Adrian D. Finlay. All rights reserved.

Licensed under the MIT License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://opensource.org/licenses/MIT

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER INCLUDING AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
==============================================================================
**/

package src.main.java.SE7;

/*Class file compiled against Java 7.*/
public class Java7TypeInference {
	public static void main (String [] args) {
		Tool<String> officeTool = new Tool<>();
		officeTool.setType("a Stapler");
		officeTool.describe();

		Tool<Double> number = new Tool<Double>();
		number.setType(3.14);
		number.describe();

		Tool<Boolean> state = new Tool<Boolean>();
		state.setType(false);
		state.describe();
	}
}

//In the interest of brevity, we will include both classes in the same source.
class Tool <Type> {
	/*Property, generic type*/
	private Type type;

	/*Property getter,setter*/
	public Type getType() {	return type; };
	public void setType(Type type) { this.type = type; };

	public void describe() {
		System.out.println("It's " + type + ".");
	}
}