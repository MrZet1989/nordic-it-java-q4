package com.example;

import java.util.ArrayList;

public class ListNum {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		var a = 0;
		for (var i = 0; i < list.size(); i++) {
			var b = list.get(i);
			a += b;

		}
		System.out.println("Среднееарифмитическое значение чисел = " + (double) a / list.size());

		var min = list.get(0);
		for (var i = 0; i < list.size(); i++) {
			if (min >= list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("Минимальное значение = " + min);

		var max = list.get(0);
		for (var i = 0; i < list.size(); i++) {
			if (max <= list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("Максимальное значение = " + max);
	}

}
