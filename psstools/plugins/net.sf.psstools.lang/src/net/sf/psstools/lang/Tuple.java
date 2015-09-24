/****************************************************************************
 * Copyright 2015 Mentor Graphics Corporation
 * All Rights Reserved Worldwide
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See
 * the License for the specific language governing
 * permissions and limitations under the License.
 *
 ****************************************************************************/


package net.sf.psstools.lang;

public class Tuple<T1, T2> {
	
	private T1				first;
	private T2				second;
	
	public Tuple(T1 it1, T2 it2) {
		first = it1;
		second = it2;
	}
	
	public T1 first() {
		return first;
	}
	
	public void first(T1 first) {
		this.first = first;
	}
	
	public void setFirst(T1 f) {
		first = f;
	}
	
	public T2 second() {
		return second;
	}
	
	public void second(T2 second) {
		this.second = second;
	}
	
	public void setSecond(T2 s) {
		second = s;
	}
	
	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if (obj instanceof Tuple) {
			Tuple<T1, T2> t = (Tuple<T1, T2>)obj;
			boolean eq = true;
			
			if (t.first == null || first == null) {
				eq &= (t.first == first);
			} else {
				eq &= t.first.equals(first);
			}
			if (t.second == null || second == null) {
				eq &= (t.second == second);
			} else {
				eq &= t.second.equals(second);
			}
			return eq;
		} else {
			return super.equals(obj);
		}
	}

	@Override
	public int hashCode() {
		int hash = 0;
	
		if (first != null) {
			hash += first.hashCode();
		}
		
		if (second != null) {
			hash += second.hashCode();
		}
		
		return hash;
	}
	
}
