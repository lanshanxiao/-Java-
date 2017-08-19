public static <T> T copy(Collection<T> dest, Collection<? extends T> src){
	T last = null;
	
	for(T ele : src){
		last = ele;
		dest.add(ele);
	}
	
	return last;
}