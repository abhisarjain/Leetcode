class Solution {
    public boolean checkIfExist(int[] arr) {
     HashSet<Integer> set = new HashSet<Integer>();
//         for(int i=0;i<arr.length;i++)
//         {
//             r.add(arr[i]);
//         }
        
//         for(int x : r)
//         {
//             // r.remove(x);
//             if( r.contains(2*x))
//             {
//                 return true;
//             }
//         }
        for(int a : arr) {
		if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2))) return true;
		set.add(a);
	}
        return false;
    }
}