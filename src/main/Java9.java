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

package src.main.java;

import static java.lang.System.out;
import src.main.java.SE7.Java7TypeInference;
import src.main.java.SE8.UnderscoreRemoved;
import src.main.java.SE9.*;

public class Java9 {
	//SE7
	private static final Java7TypeInference SE71 = new Java7TypeInference();
	//SE8
	private static final UnderscoreRemoved SE81 = new UnderscoreRemoved();
	//SE9
	private static final DOpAnonClDenotable SE91 = new DOpAnonClDenotable();
	private static final PrivIntfMethImpl SE92 = new PrivIntfMethImpl();
	private static final SafeVarargsDemo SE93 = new SafeVarargsDemo();
	private static final TWREffectivelyFinal SE94 = new TWREffectivelyFinal();

	public static void main(String[] args) {
		//Messages
		var msg7 = "Back in Java 7...";
		var msg8 = "Back in Java 8..."; 
		var msg9 = "And now in Java 9...";

		out.println("----------------------------");
		out.println(msg7);
		out.println("----------------------------");
		SE71.main(null);

		out.println("\n----------------------------");
		out.println(msg8);
		out.println("----------------------------");
		SE81.main(null);

		out.println("\n----------------------------");
		out.println(msg9);
		out.println("----------------------------");
		SE91.main(null);
		SE92.main(null);
		SE93.main(null);
		SE94.main(null);
	}
}