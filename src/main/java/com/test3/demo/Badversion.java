package com.test3.demo;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class Badversion extends VersionControl {
	int number;

	public Badversion(int number, int firstBadVersion) {
		super(firstBadVersion);
		this.number = number;
	}

	public static void main(String[] args) {
		Badversion s = new Badversion(100, 100);
		System.out.println(s.firstBadVersion());
	}

	public int firstBadVersion() {
		int start = 1;
		int end = number;
//		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (isBadVersion(mid) == true) {
//				res =mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return start;
	}

}

class VersionControl {
	int firstBadVersion;

	public VersionControl(int firstBadVersion) {
		this.firstBadVersion = firstBadVersion;
	}

	public boolean isBadVersion(int number) {
		return number >= firstBadVersion ? true : false;
	}

}